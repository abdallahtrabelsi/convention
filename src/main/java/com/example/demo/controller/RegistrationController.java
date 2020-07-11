package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.RegistrationService;
import com.example.demo.model.Users;

@RestController
//@RequestMapping("/api")
public class RegistrationController {
@Autowired
private RegistrationService registrationService ;
@PostMapping("/registeruser")
@CrossOrigin(origins="http://localhost:4200")
public Users registerUser(@RequestBody Users user) throws Exception {
	return registrationService.saveUser(user);
	
}

@GetMapping("/users")
public List<Users> getAllUsers() {
	return registrationService.getAllUsers();
}

/*@GetMapping("/login")
@CrossOrigin(origins="*")
public Users login(@RequestBody Users user ) throws Exception {
	return registrationService.login(user);
}*/

@PostMapping("/login")
@CrossOrigin(origins="http://localhost:4200")
public Users login(@RequestBody Users user  /*@RequestParam (required=false,name="emailId") String emailId, @RequestParam (required=false,name="password") String password*/) throws Exception {
	return  registrationService.login(user);
}

}
