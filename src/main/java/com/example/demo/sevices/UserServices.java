package com.example.demo.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserImpl;

@Service
public class UserServices {
	@Autowired
	UserImpl repo;
	
	public UserServices(UserImpl userImpl)
	{
		super();
		this.repo = userImpl;
	}
	
	public User getService(int Id)
	{
		return repo.findByName(Id);
	}

}
