package com.revature.madlibDAOs;

public class WordsModel 
{
	private String storyLine;
	private String noun;
	private String verb;
	private String adj;
	private String adverb;
	
	public WordsModel(String story, String noun, String verb, String adj, String adverb) 
	{
		storyLine = story;
		this.noun = noun;
		this.verb = verb;
		this.adj = adj;
		this.adverb = adverb;
	}

	@Override
	public String toString() {
		return "WordsModel [storyLine=" + storyLine + ", noun=" + noun + ", verb=" + verb + ", adj=" + adj + ", adverb="
				+ adverb + "]";
	}
	
	public WordsModel(String story)
	{
		storyLine = story;
	}
}
