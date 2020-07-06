package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Convention;

@Controller
public class ConventionController {
	@Autowired
	private ConventionRepository conventionrep;
	//@RequestMapping(value="/convention",method=RequestMethod.GET)
	public String getLoginForm() {
		return "Home";
	}
	@RequestMapping(value="/convention",method=RequestMethod.POST)	
	
	
	
	
	public List<Convention> getConv() {
		List<Convention> cn= new ArrayList<>();
	 conventionrep.findAll().forEach(cn::add);
	 return cn;
	}
}
   