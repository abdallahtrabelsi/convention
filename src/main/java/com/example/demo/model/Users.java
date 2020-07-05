package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Long id;
	  private String firstName;
	  private String lastName;
	  private String password;

	  protected Users() {}

	  public Users(String firstName, String lastName ,String password) {
		  
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.password = password;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%d, firstName='%s', lastName='%s,password='%s']",
	        id, firstName, lastName,password);
	  }

	  public Long getId() {
	    return id;
	  }

	  public String getFirstName() {
	    return firstName;
	  }

	  public String getLastName() {
	    return lastName;
	  }
	  public String getpassword() {
		    return password;
		  }
}
