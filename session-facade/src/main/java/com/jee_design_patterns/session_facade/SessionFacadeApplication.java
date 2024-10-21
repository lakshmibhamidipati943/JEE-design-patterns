package com.jee_design_patterns.session_facade;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SessionFacadeApplication {

	public static void main(String[] args) throws Exception {
		
		InitialContext context=new InitialContext();
		UserSessionFacade facade=(UserSessionFacade) context.lookup("java:comp/env/UserSessionFacade");
		facade.createUser("John Doe", "john.doe@example.com");
		User user=facade.retrieveUser("12345");
		System.out.println("Retrieved User:"+user.getName());
	}

}
