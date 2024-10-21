package com.jee_design_patterns.session_facade;

public class UserSessionFacade {

	private UserDAO userDAO;
	public UserSessionFacade() {
		userDAO=new UserDAO();
	}
	public void createUser(String name, String email) {
		User user=new User();
		user.setName(name);
		user.setEmail(email);
		userDAO.createUser(user);
	}
	public User retrieveUser(String id) {
		return userDAO.retrieveUser(id);
	}
}
