package com.revature.madlibDAOs;

public class CompletedModel 
{
	public String story;
	public String userName;
	public String noun;
	public String verb;
	public String adj;
	public String adverb;
	
	public CompletedModel(String story, String user, String noun, String verb, String adj, String adverb)
	{
		story = this.story;
		user = userName;
		noun = this.noun;
		verb = this.verb;
		adj = this.adj;
		adverb = this.adverb;
	}

	@Override
	public String toString() 
	{
		return "CompletedModel [story=" + story + ", userName=" + userName + ", noun=" + noun + ", verb=" + verb
				+ ", adj=" + adj + ", adverb=" + adverb + "]";
	}
	
	public CompletedModel() {}
}
