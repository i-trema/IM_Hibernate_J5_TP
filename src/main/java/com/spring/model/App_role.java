package com.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class App_role {
	@Id 
	private String role_name;
	
	@ManyToMany(mappedBy = "roles")
	private Set<App_user> users = new HashSet<App_user>();
	
	
	
	@Override
	public String toString() {
		return "App_role [role_name=" + role_name + "]";
	}
	public App_role(String role_name, Set<App_user> users) {
		super();
		this.role_name = role_name;
		this.users = users;
	}
	public App_role() {
		super();
	}
	public Set<App_user> getUsers() {
		return users;
	}
	public void setUsers(Set<App_user> users) {
		this.users = users;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	
}
