package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Convention;
import com.example.demo.repository.ConventionRepository;



@RestController
@RequestMapping("/convention")
public class ConventionController {
	
	@Autowired
	ConventionRepository conventionrepository;
	
	@GetMapping("/getconv")
	 public List<Convention> getAllConvention() {
        return conventionrepository.findAll();
    }
	 @GetMapping("/getconvbyid/{id}")
	    public Optional<Convention> getConvnetionById(@PathVariable(value = "id") Long noteId) {
	        return conventionrepository.findById(noteId);
	       
	    }
	
	 @GetMapping("/getconvbytype/{type}")
	 public List<Convention> getConvnetionByType(@PathVariable(value = "type") String type) {
		 return conventionrepository.findBytype(type);
	       
	    }
	 
	 @GetMapping("/getconvbyobj/{obj}")
	 public List<Convention> getConvnetionByobj(@PathVariable(value = "obj") String obj) {
		 return conventionrepository.findByobjet(obj);
	       
	    }
	 
}
