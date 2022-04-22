package com.revature.madlibDAOs;

import java.util.ArrayList;

public class testDriver
{
	static CompletedDAO cdao = new CompletedDAO();
	static CompletedModel cm = new CompletedModel();
	static WordsDAO wdao = new WordsDAO();
	
	public static void main(String[] args) 
	{
		//wdao.createMadlibs("One day, noun went to the market to verb. Noticing the day was adj, "
		//		+ "though, the market closed adverb.\r\n");
		
		
		wdao.combine("David", "eat", "red", "quickly");
	}
}