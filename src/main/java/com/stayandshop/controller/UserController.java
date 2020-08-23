package com.stayandshop.controller;

import java.util.List;

import com.stayandshop.data.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stayandshop.entity.User;
import com.stayandshop.service.interfaces.MultiPlexUserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	public MultiPlexUserService multiPlexUserService;
	
	@GetMapping
	public List<User> getUsers(){
		return multiPlexUserService.getUsers();
	}
	
	@GetMapping("/{email}")
	public User getUserByEmail(@PathVariable(required = true) String email) {
		return multiPlexUserService.getUserByEmail(email);
	}
	
	@PostMapping
	public void saveMovie(@RequestBody UserData userData) {
		System.out.println(userData.getEmail());
		multiPlexUserService.addUser(userData);
	}
}
