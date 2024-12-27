package com.company.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.security.models.UserModels;
import com.company.security.service.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserServices userServices;

	// all users
	@GetMapping("/getall")
	public List<UserModels> getallUser() {
		return this.userServices.getallUsers();
	}

}
