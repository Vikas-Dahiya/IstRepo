package com.company.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.company.security.models.UserModels;

@Service
public class UserServices {
	List<UserModels> list = new ArrayList<>();

	public UserServices() {
		// Add a sample user
		list.add(new UserModels("abc", "abc123", "abc@gmail.com"));
		list.add(new UserModels("xyz", "xyz123", "xyz@gmail.com"));
		
	}
	public List<UserModels> getallUsers() {
		return this.list;
	}
}
