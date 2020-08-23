package com.stayandshop.service.interfaces;

import java.util.List;

import com.stayandshop.data.UserData;
import com.stayandshop.entity.User;

public interface MultiPlexUserService {
	public void addUser(UserData userData);
	public List<User> getUsers();
	public User getUserByUserName(String userName);
	public User getUserByEmail(String email);
	public void deleteUser(String email);
	public void updateFirstNameByLastName(String firstName, String lastName);
}
