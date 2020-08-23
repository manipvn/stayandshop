package com.stayandshop.data;

import com.stayandshop.entity.User;

public class UserData {
	private String userName;
	private String email;
	private String gender;
	private boolean active;
	private String firstName;
	private String lastName;
	private String password;

	public UserData(String firstName, String lastName, String email, String password, boolean active, String gender,
			String userName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.active = active;
		this.email = email;
		this.gender = gender;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUserEntity() {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setPassword(password);
		user.setActive(active);
		user.setUserName(userName);
		user.setEmail(email);
		user.setGender(gender);
		return user;
	}
	

}
