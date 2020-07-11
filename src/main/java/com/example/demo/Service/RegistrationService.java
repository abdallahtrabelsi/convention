package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository repo;
	
	public Users saveUser(Users user) throws Exception {
		String tempEmailId = user.getEmailId();
		if(tempEmailId !=null && !"".equals(tempEmailId))
		{
			Users userObj = fetchUserByEmailId(tempEmailId);
					if (userObj !=null) {
						throw new  Exception ("user with "+tempEmailId+"is already exist" );
						
					}
		}
		return repo.save(user);
	}
	public Users fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}
	
	public List<Users> getAllUsers() {
		return repo.findAll();
	}
	
	public Users login(Users user) throws Exception {
		String email = user.getEmailId();
		String password = user.getPassword();
		Users users = repo.findByEmailIdAndPassword(email,password);
		if (users == null) {
			 throw new  Exception ("il faut s'inscrire "+email+"   and  "+password+"") ;
		} else {
			return users;
			
		}
	}
}
