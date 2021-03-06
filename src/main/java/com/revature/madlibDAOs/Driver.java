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
		CompletedDAO completedDAO = new CompletedDAO();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Madlibs! Please enter your selection:");
		System.out.println("1 : Log In\n2 : Register");
		System.out.print("Input: ");
		
		int input = sc.nextInt();
		
		
		if (input == 1) {
			
			System.out.print("Username: ");
			String username = sc.next();
			System.out.print("Password: ");
			String password = sc.next();
			
			if (userDAO.getUser(username)) {
				
				System.out.println("Enter a Noun: ");
				String noun = sc.next();
				
				System.out.println("Enter a Adjective: ");
				String adjective = sc.next();
				
				System.out.println("Enter a Verb: ");
				String verb = sc.next();
				
				System.out.println("Enter a Adverb: ");
				String adverb = sc.next();
				
				wordsDAO.combine(noun, verb, adjective, adverb);
				
				
			} else {
				
				System.out.println("Looks like you haven't registered. Create a new account?");
			}
			
			
		} else {
			
			System.out.print("Create your username : ");
			String username = sc.next();
			System.out.print("Create your password : ");
			String password = sc.next();
			
			UserModel currentUser = createUser(username, password);
			
			userDAO.addUser(currentUser);
			
			if (userDAO.getUser(currentUser.username)) {
				
				System.out.println("Enter a Noun: ");
				String noun = sc.next();
				
				System.out.println("Enter a Adjective: ");
				String adjective = sc.next();
				
				System.out.println("Enter a Verb: ");
				String verb = sc.next();
				
				System.out.println("Enter a Adverb: ");
				String adverb = sc.next();
				
				wordsDAO.combine(noun, verb, adjective, adverb);
				
				
				
			}
			
		}
		
		
	}
}
