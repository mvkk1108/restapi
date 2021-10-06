package com.ems.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtils {
	
	public static Connection getCon()
	{
		
		
		
		Connection con = null;
		
		try
		
		
				
		{DBUtils du = new DBUtils();
			
			Properties props = du.getProps();
	    Class.forName(props.getProperty("db_driver"));
			
			con = DriverManager.getConnection(props.getProperty("db_url"), props.getProperty("db_user"), props.getProperty("db_pass"));
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}

	
	
	private Properties getProps() throws IOException
	{
		Properties p = new Properties();
		p.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		return p;
	}
	
	
}
