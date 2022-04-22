package com.revature.madlibsInterfaces;

public interface WordsInterface 
{
	void createMadlibs(String story);
	
	String getStory(int row);
	
	void combine(String noun, String verb, String adj, String Adv);
}
