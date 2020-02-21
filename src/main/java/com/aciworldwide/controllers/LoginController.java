package com.aciworldwide.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aciworldwide.entities.User;
import com.aciworldwide.services.UserService;
//Controller
//Presentation Layer - Request Processing Component of Spring  Web MVC
@Controller
public class LoginController {
	//used to invoke business layer
	@Autowired
	private UserService userService;
	
	//request processing method
	@RequestMapping("/signin") //HandlerMapping - to map the request url with request processing method of controller
	
	public String validateUser(User user, ModelMap map) {
		
		//invoking business logic method of business layer(service)
		if(userService.isValid(user)){
			map.addAttribute("uname", user.getUsername());
			return "success";
		}
		else {
			map.addAttribute("logonerror", "Invalid Username/Password");
			return "login";
		}
		
	}
	
}
