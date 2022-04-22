package com.revature.madlibDAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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

	public boolean getUser(String username) {
		
		try {
			
			String query = "SELECT * FROM libusers WHERE user_name = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, username);
			
			ResultSet rs = pstmt.executeQuery(query);
		    
		while (rs.next()) {
		
			String lookupName = rs.getString("user_name");
			
			if (lookupName.equals(username)) {
				
				return true;
				
			} return false;
			
		}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} return false; 
	}
	
	public ArrayList<UserModel> getAllUsers(){
		
		try {
			
			Statement stmt = conn.createStatement();
		
			ResultSet rs = stmt.executeQuery("SELECT * FROM libusers");
		
			ArrayList<UserModel> users = new ArrayList<UserModel>();
			
			while (rs.next()) {
				String username = rs.getString("user_name");
				String password = rs.getString("npass_word");
				
				users.add(new UserModel(username, password));
				
			} return users;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		return null;
		
	}



}
