package com.stayandshop.service.Impl;

import java.util.List;

import com.stayandshop.data.UserData;
import com.stayandshop.service.interfaces.MultiPlexUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stayandshop.entity.User;
import com.stayandshop.repository.UserRepository;

@Component
public class MultiPlexUserServiceImpl implements MultiPlexUserService {
	
	@Autowired
	UserRepository userRepo;
	
	@Override
	public void addUser(UserData userData) {
		userRepo.save(userData.getUserEntity());
	}
	
	@Override
	public List<User> getUsers(){
		return (List<User>) userRepo.findAll();
	}
	
	@Override
	public User getUserByUserName(String userName) {
		return userRepo.findByUserName(userName);
	}
	
	@Override
	public User getUserByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	@Override
	public void deleteUser(String email) {
		userRepo.deleteUserByEmail(email);
	}
	
	@Override
	public void updateFirstNameByLastName(String firstName, String lastName) {
		userRepo.updateFirstNameByLastName(firstName, lastName);
	}
	
}