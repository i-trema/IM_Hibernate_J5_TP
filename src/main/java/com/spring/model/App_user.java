package com.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class App_user {
	@Id
	private String username;
	private int active;
	@NotBlank
	private String password;
	
	@ManyToMany(fetch = FetchType.LAZY,
			cascade = {CascadeType.PERSIST,
					CascadeType.MERGE})
	private Set<App_role> roles = new HashSet<App_role>();

	
	
	
	
	@Override
	public String toString() {
		return "App_user [username=" + username + ", active=" + active + ", password=" + password + "]";
	}

	public App_user(String username, int active, @NotBlank String password, Set<App_role> roles) {
		super();
		this.username = username;
		this.active = active;
		this.password = password;
		this.roles = roles;
	}

	public App_user() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<App_role> getRoles() {
		return roles;
	}

	public void setRoles(Set<App_role> roles) {
		this.roles = roles;
	}
	
}
