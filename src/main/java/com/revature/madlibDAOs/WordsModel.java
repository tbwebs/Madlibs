package com.revature.madlibDAOs;

public class WordsModel 
{
	private String storyLine;
	private String word1;
	private String word2;
	private String word3;
	private String word4;
	
	public WordsModel() {
		storyLine = "One day, a ______ (singular noun) went to the market to ______ (verb). Noticing the day was ________ (adjective), though, the market closed ______ (adverb).";
	}
	
	//GETTERS
	public String getStoryLine() {return storyLine;}
	public String getWord1() {return word1;}
	public String getWord2() {return word2;}
	public String getWord3() {return word3;}
	public String getWord4() {return word4;}
	
	//SETTERS
	public void setWord1(String word) {word1 = word;}
	public void setWord2(String word) {word2 = word;}
	public void setWord3(String word) {word3 = word;}
	public void setWord4(String word) {word4 = word;}

}
