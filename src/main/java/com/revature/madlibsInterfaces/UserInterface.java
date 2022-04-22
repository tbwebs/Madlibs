package com.revature.madlibsInterfaces;

import java.util.ArrayList;

import com.revature.madlibDAOs.UserModel;

public interface UserInterface {
	
	//don't really need this since the table is already created
//	void createUser(String username, String password);
	
	void addUser(UserModel newUser);
	
	boolean getUser(String username);

	ArrayList<UserModel> getAllUsers();

}
