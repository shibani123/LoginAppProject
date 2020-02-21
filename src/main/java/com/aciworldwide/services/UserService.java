package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;

//Business Layer Interface - Model Interface

public interface UserService {
	//Business Logic methods specification
	boolean isValid(User user);
	
}
