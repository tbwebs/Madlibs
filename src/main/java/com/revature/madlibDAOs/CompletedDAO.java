package com.revature.madlibDAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.madlibsInterfaces.CompletedMadlibs;

public class CompletedDAO implements CompletedMadlibs
{

	public ArrayList<String> getCompletedMadlib(String user) 
	{
		try
		{
			ArrayList<String> sList = new ArrayList<String>();
			
			Connection cMan = ConnectionManager.getConnect();
			
			String query = "SELECT * FROM comp_libs WHERE user_name = ?";
			
			//creates a prepared statement
			PreparedStatement pstmt = cMan.prepareStatement(query);
			pstmt.setString(1, user);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				String uName = rs.getString("user_name");
				String uStory;
				if(uName.equals(user))
				{
					uStory = rs.getString("story");
					sList.add(uStory);
				}
			}
			
			return sList;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
		
	}

	public void addCompletedMadlib(CompletedModel comp) 
	{
		try
		{
			Connection cMan = ConnectionManager.getConnect();
			
			//query to be executed
			String query = "INSERT into comp_libs(user_name, story, noun, verb, adj, adverb)" + " values (?,?,?,?,?,?)";
			
			//creates a prepared statement
			PreparedStatement pstmt = cMan.prepareStatement(query);
			
			pstmt.setString(1, comp.userName);
			pstmt.setString(2, comp.story);
			pstmt.setString(3, comp.noun);
			pstmt.setString(4, comp.verb);
			pstmt.setString(5, comp.adj);
			pstmt.setString(6, comp.adverb);
			
			pstmt.execute();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
