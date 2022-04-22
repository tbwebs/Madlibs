package com.revature.madlibDAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.madlibsInterfaces.WordsInterface;

public class WordsDAO implements WordsInterface
{
	
	public void createMadlibs(String nstory) 
	{
		try
		{
			Connection cMan = ConnectionManager.getConnect();
			
			//query to be executed
			String query = "INSERT into mad_libs(libs)" + " Values (?)";
			
			//creates a prepared statement
			PreparedStatement pstmt = cMan.prepareStatement(query);
			
			//story format
			// noun likes fishing even when
			pstmt.setString(1, nstory);
			
			pstmt.execute();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	public String getStory(int row) 
	{
		try
		{
			String sto = "";
			Connection cMan = ConnectionManager.getConnect();
			
			String query = "SELECT * FROM mad_libs WHERE id = ? ";
			
			//creates a prepared statement
			PreparedStatement pstmt = cMan.prepareStatement(query);
			pstmt.setInt(1, row);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				sto = rs.getString("libs");
			}
			
			
			return sto;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public void combine(String noun, String verb, String adj, String Adv)
	{
		String sto = getStory(2);
		ArrayList<String> p = new ArrayList<String>();
		String part;
		
		String[] s = sto.split("noun", 2);
		p.add(s[0] + noun);
		part = s[1];
		
		s = part.split("verb", 2);
		p.add(s[0] + verb);
		part = s[1];
		
		s= part.split("adj", 2);
		p.add(s[0] + adj);
		part = s[1];
		
		s= part.split("adverb", 2);
		p.add(s[0] + Adv);
		part = "";
		
		for(int i = 0;i < p.size();i++)
		{
			part += p.get(i);
		}
		
		System.out.println(part);
	}
}
