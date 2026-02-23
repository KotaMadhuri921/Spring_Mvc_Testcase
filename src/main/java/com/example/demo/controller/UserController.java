package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.User;
import com.example.demo.sevices.UserServices;
@RequestMapping("/api")
@Controller
public class UserController {
	
	@Autowired
	UserServices userService;
	@GetMapping("/users/{id}")
	@ResponseBody
	public User getControllerService(@PathVariable int id) {
		
		return userService.getService(id);
		
	}

}
