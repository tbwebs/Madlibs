package com.revature.madlibDAOs;

import java.util.Scanner;

public class Driver {
	
	//helper
	private static UserModel createUser(String username, String password) {
		
		UserModel user = new UserModel(username, password);
		
		return user;
	}
	
	public static void main(String[] args) {
		
		//DAO instance
		UserDAO userDAO = new UserDAO();
		WordsDAO wordsDAO = new WordsDAO();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome please enter your selection:");
		System.out.println("1 : log in"
				+ "2 : register");
		
		int input = sc.nextInt();
		
		
		if (input == 1) {
			
			System.out.println("Username: ");
			String username = sc.next();
			System.out.println("Password: ");
			String password = sc.next();
			
			
			
		} else {
			
			System.out.println("Create your username : ");
			String username = sc.next();
			System.out.println("Create your password : ");
			String password = sc.next();
			
			UserModel currentUser = createUser(username, password);
			
			userDAO.addUser(currentUser);
			
		}
		
		
		
	}
}
