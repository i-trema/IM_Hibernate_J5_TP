package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.App_user;
import com.spring.repository.App_userRepo;

@Service
public class App_userService {
	@Autowired
	App_userRepo app_userRepo;
	
	public App_user createUser(App_user u) {
		return app_userRepo.save(u);
	}
	
	public List<App_user> readUsers(){
		return app_userRepo.findAll();
	}
	
	public Optional<App_user> readByUsername(String username ){
		return app_userRepo.findById(username);
	}
	
	public void deleteUser(String username){
		app_userRepo.deleteById(username);
	}
}
