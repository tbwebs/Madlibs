package com.revature.madlibDAOs;

public class UserModel {
	
	String username, password;
	
	public UserModel(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return this.username;
	}

	@Override
	public String toString() {
		return "UserModel [username=" + username + ", password=" + password + "]";
	}

}
