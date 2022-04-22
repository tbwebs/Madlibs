package com.revature.madlibDAOs;

import java.util.ArrayList;

public class testDriver
{
	static CompletedDAO cdao = new CompletedDAO();
	static CompletedModel cm = new CompletedModel();
	static WordsDAO wdao = new WordsDAO();
	
	public static void main(String[] args) 
	{
		ArrayList<String> sto;
		cm.story = "This is my story";
		cm.userName = "Disg";
		cm.noun = "Jouhn";
		cm.verb = "ate";
		cm.adj = "red";
		cm.adverb = "slightly";
		
		//cdao.addCompletedMadlib(cm);
		
		//wdao.createMadlibs("This is a very long adj story");
		System.out.println(wdao.getStory(1));
	}
}