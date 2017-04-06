package com.syn.tfs.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class ConnectMYSQL 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connected to DB");
		Statement stmt=(Statement) con.createStatement();
		System.out.println("Statement created");
		ResultSet rs=(ResultSet) stmt.executeQuery("Select * from emp");
		System.out.println("select all query executed");
		while(rs.next())  
		{
			try
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				  
			}catch(Exception e)
			{ 
				System.out.println(e);
			}
		}
		con.close();
	}
}
