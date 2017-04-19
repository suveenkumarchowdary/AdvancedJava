package com;

import java.sql.*;

public class DBConnection {
	
	Connection con;
	Statement st;
	ResultSet rs;
	String status = " ";
	
	public DBConnection(){
		System.out.println("Constructor Starting");
		
		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/target/filter.db", "sa", "sa");
			
			st = con.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End of Constructor");
	}
	
	public String checkLogin(String uEmail, String uPassword){
		System.out.println("Started checking");
		
		try {
			
			rs=st.executeQuery("select * from loginpractice where email='"+uEmail+"' and password='"+uPassword+"'");
			boolean b = rs.next();
			if(b==true){
				status = "success";
			} else {
				status = "failure";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Done checking");
		return status;
		
	}
	
	public void performRegistration(String uName, String uEmail, String uPassword){
		System.out.println("Started Insertion");
		try {
			st.executeUpdate("INSERT INTO LoginPractice(name, email, password) VALUES('"+uName+"', '"+uEmail+"', '"+uPassword+"');");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
