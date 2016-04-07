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

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		//Logic.connect();
		//Logic.print();
		
		Session session = Util.getSessionFactory().openSession(); 
        session.beginTransaction(); 
 
        // Add new Employee object 
        Qwerty emp = new Qwerty(null, null); 
         
        emp.setFirstName("demo"); 
        emp.setLastName("user"); 
 
        session.save(emp); 
 
        session.getTransaction().commit(); 
        Util.shutdown(); 

		
		
		
		
		

		

		

		
		

	}

}
