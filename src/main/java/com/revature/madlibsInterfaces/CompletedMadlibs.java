package com.revature.madlibsInterfaces;

import java.util.ArrayList;

import com.revature.madlibDAOs.CompletedModel;

public interface CompletedMadlibs {
	
	ArrayList<String> getCompletedMadlib(String user);
		
	void addCompletedMadlib(CompletedModel comp);

}
