package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;
//Model
//Business Layer Interface Implementor
@Service //service is used with the model
public class UserServiceImpl implements UserService {
	//Business logic method implementation
	//@Override
	public boolean isValid(User user) {
		// TODO Auto-generated method stub
		//business logic
		if(user != null && user.getUsername().equals("Shibani") && user.getPassword().equals("Welcome")) {
			return true;
		}
		return false;
	}

}
