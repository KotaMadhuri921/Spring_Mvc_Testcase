package com.example.demo.sevices;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.demo.model.User;
import com.example.demo.repo.UserImpl;

class UserServicesTest {

	@Test
	void testUserServices() {
		
		UserImpl repo = Mockito.mock(UserImpl.class);
		when(repo.findByName(101)).thenReturn(new User(101, "Ravi", "hyd"));
		UserServices service= new UserServices(repo);
		User u = service.getService(101);
		assertEquals("Ravi", u.getName());
	}

	
	
	@Test
	void testGetService_CheckNameAndPlace() {
	    // Mock repo
	    UserImpl repo = Mockito.mock(UserImpl.class);

	    // Mock output
	    when(repo.findByName(101))
	            .thenReturn(new User(101, "Ravi", "Hyd"));

	    // Inject into service
	    UserServices service = new UserServices(repo);

	    // Call method
	    User result = service.getService(101);

	    // Assertions
	    assertEquals("Ravi", result.getName());
	    assertEquals("Hyd", result.getAddress());
	}
	
	  
	

}