package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Users;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getLoginForm() {
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@ModelAttribute(name ="loginForm") Users loginForm,Model model) {
		String username =loginForm.getFirstName();
		System.out.println(username);
		String password =loginForm.getpassword();
		System.out.println(password);
		if(username.equals("admin")&& password.equals("admin")) {
			System.out.println("hello");
			return "Home";
		}
		model.addAttribute("invalid",true);
		return "login";
	}
}
