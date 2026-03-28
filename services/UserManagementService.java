package oop.OnlineStore.services;

import oop.OnlineStore.entity.User;

public interface UserManagementService {

	String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);

}

