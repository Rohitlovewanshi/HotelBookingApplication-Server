package com.rohit.hotelbookingapp.service;

import java.util.List;

import com.rohit.hotelbookingapp.model.User;

public interface IUserService {
	
	User registerUser(User user);
	
	List<User> getUsers();
	
	void deleteUser(String email);
	
	User getUser(String email);

}
