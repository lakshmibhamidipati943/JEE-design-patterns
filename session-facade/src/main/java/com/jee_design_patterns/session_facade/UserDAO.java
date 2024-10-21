package com.jee_design_patterns.session_facade;

public class UserDAO {

	public void createUser(User user) {
		System.out.println("Creating user: "+user.getName());
	}
	public User retrieveUser(String id) {
		System.out.println("Retrieving user with ID: "+id);
		return new User();
	}
}
