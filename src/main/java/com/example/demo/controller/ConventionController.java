package com.example.demo.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Convention;
import com.example.demo.model.TypeConvention;
import com.example.demo.repository.ConventionRepository;



@RestController
@CrossOrigin(origins = "*")
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
	 
	 
	 @DeleteMapping("/delconv/{id}")
	 public List<Convention> deleteConvention(@PathVariable(value = "id") Long id) {
		  conventionrepository.deleteById(id);
		  return getAllConvention();
	    }
	 
	  @PostMapping("/addconv")
	    public Boolean createNote(@RequestBody Convention conv) {
	         conventionrepository.save(conv);
	         return true;
	    }
	  
	  @GetMapping("/gettype")
		 public List<String> getType() {
			 return TypeConvention.getTypes();
		       
		    }
	 
}
