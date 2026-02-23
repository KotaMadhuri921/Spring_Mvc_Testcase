package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;
@Repository  // <-- makes this class a Spring bean
public class UserImpl {

	public User findByName(int id) {
		// TODO Auto-generated method stub
		return new User(101,"ravi", "hyd");
		
	}

}
