package com.register.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.register.model.User;


public class RegisterUserDao {
	
	User newUser;
	String url = "jdbc:mysql://localhost:3306/msb_clipboard_db" ;
	String sql_get = "select * from user where uname=? and pass=?" ;
	String sql_insert = "insert into user values ('?', '?', '?', '?')" ;
	
	public boolean check(String uname, String pass) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","toor");
			PreparedStatement st = con.prepareStatement(sql_get);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean registerNewUser(User newUser) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","toor");
			PreparedStatement st = con.prepareStatement(sql_insert);
			st.setString(1, newUser.getUid());
			st.setString(2, newUser.getUname());
			st.setString(3, newUser.getEmail());
			st.setString(4, newUser.getPass());
			st.executeUpdate(); //sql insert runs
			//check if value inserted
			if(this.check(newUser.getUname(), newUser.getPass())) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

}
