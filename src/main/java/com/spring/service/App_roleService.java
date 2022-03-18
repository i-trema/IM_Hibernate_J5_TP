package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.App_role;
import com.spring.repository.App_roleRepo;

@Service
public class App_roleService {
	@Autowired
	App_roleRepo app_roleRepo;
	
	public App_role createRole(App_role r) {
		return app_roleRepo.save(r);
	}
	
	public List<App_role> readRoles(){
		return app_roleRepo.findAll();
	}
	
	public Optional<App_role> readByRole_name(String role_name ){
		return app_roleRepo.findById(role_name);
	}
	
	public void deleteRole(String role_name){
		app_roleRepo.deleteById(role_name);
	}
}
