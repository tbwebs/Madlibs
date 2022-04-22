package com.revature.madlibDAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}
