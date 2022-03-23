package com.register.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.register.model.User;


public class RegisterUserDao {
	
	User newUser;
	String url = "jdbc:mysql://localhost:3306/msb_clipboard_db" ;
	String sql_get = "select * from users where uname=? and pass=?" ;
	String sql_insert = "insert into users(uname,email,pass) values (?, ?, ?)" ;
	
	
	public boolean check(String uname, String pass) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","toor");
			PreparedStatement st = con.prepareStatement(sql_get);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery(); //sql select runs
			if(rs.next()) {					//only 1 row returned for correct (uname, pass) pair
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;						//incorrect (uname, pass) pair
	}
	
	public boolean registerNewUser(User newUser) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","toor");
			PreparedStatement st = con.prepareStatement(sql_insert);
//			st.setInt(1, newUser.getUid());			//no need as auto increment
			st.setString(1, newUser.getUname());
			st.setString(2, newUser.getEmail());
			st.setString(3, newUser.getPass());
			st.executeUpdate(); 	//sql insert runs
			//check if value inserted
			if(this.check(newUser.getUname(), newUser.getPass())) {
				return true;		//insert successful
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;				//insert failed
		
	}

}
