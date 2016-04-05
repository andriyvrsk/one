package com.logos.study;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Class.forName("com.mysql.jdbc.Driver");
		
		Properties properties = new Properties();

		InputStream is = new Main().getClass().
				getClassLoader().getResourceAsStream("jdbc.properties");
		properties.load(is);
		
		String url = properties.getProperty("url");
		
		Connection conn = DriverManager.getConnection(url, properties);

		Statement statement = conn.createStatement();

		String sql = "select * from CITY";

		ResultSet rs = statement.executeQuery(sql);
		List<City> users = new ArrayList<>();
		
		while (rs.next()) {
			users.add(new City(rs.getInt("id"), rs.getString("name"), rs.getInt("population")));
		}
		
		for (City u : users) {
			System.out.println(u);
		}

	}

}
