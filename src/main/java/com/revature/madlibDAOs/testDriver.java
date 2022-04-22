package com.revature.madlibDAOs;

import java.util.ArrayList;

public class testDriver
{
	static CompletedDAO cdao = new CompletedDAO();
	static CompletedModel cm = new CompletedModel();
	
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
		sto = cdao.getCompletedMadlib(cm.userName);
		for(int i = 0;i < sto.size();i++)
		{
			System.out.println(sto.get(i));
		}
}}