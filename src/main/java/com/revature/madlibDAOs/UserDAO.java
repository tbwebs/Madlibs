package com.revature.madlibDAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.madlibsInterfaces.UserInterface;

public class UserDAO implements UserInterface {
	
	private Connection conn = ConnectionManager.getConnect();

	public void addUser(UserModel newUser) {
		
		try {
			
			//sql query to run on database
			String query = "INSERT INTO libusers(user_name, npass_word) VALUES (?, ?)";
		
			//sets statement object
			PreparedStatement pstmt = conn.prepareStatement(query);
		
			//sets strings
			pstmt.setString(1, newUser.username);
			pstmt.setString(2, newUser.password);
		
			//executes statement
			pstmt.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}

	public void getuser(String username) {
		
		try {
			
			//sql
			String query = "SELECT * FROM libusers WHERE user_name = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
		
			pstmt.setString(1, username);
			
			pstmt.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
	}



}
