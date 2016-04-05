package com.logos.study;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Logic {
	
	static String sql = "select * from CITY";
	static ResultSet rs;
	
	public static void connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties properties = new Properties();
		InputStream is = new Logic().getClass().
				getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			properties.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = properties.getProperty("url");
		Connection conn;
		try {
			conn = (Connection) DriverManager.getConnection(url, properties);
			Statement statement = (Statement) conn.createStatement();
			rs = statement.executeQuery(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	public static void print(){
		List<City> users = new ArrayList<>();
		
		try {
			while (rs.next()) {
				users.add(new City(rs.getInt("id"), rs.getString("name"), rs.getInt("population")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (City u : users) {
			System.out.println(u);
		}
	}
	
}//end
