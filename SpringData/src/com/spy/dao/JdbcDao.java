package com.spy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.derby.client.am.SqlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spy.model.Circle;

@Component
public class JdbcDao 

{
    @Autowired
	private DataSource datasource;
	
	
	public DataSource getDatasource() 
	{
		return datasource;
	}


	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}


	public Circle getcircle(int id)
	{
		
		
		
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		Circle circle=null;
		
		try 
		{
			
			
			/*Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			
			con=DriverManager.getConnection("jdbc:derby://localhost:1527/db");
			*/
			
			
			con=datasource.getConnection();
			
			ps=con.prepareStatement("select *from circle where id=?");
			
			ps.setInt(1, id);
			rs=ps.executeQuery();
			
			
			circle = null;
			if(rs.next())
			
			{

				circle=new Circle(id,rs.getString("name"));
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
		
		finally 
		{
		
			try {
				con.close();
				ps.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
	  return circle;	
	  
	}
}
