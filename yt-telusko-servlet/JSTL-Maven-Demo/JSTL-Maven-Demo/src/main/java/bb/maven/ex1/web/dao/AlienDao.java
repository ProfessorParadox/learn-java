package bb.maven.ex1.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import bb.maven.ex1.web.model.Alien;

public class AlienDao {
	
	public Alien getAlien(int aid) {
		
		Alien a = new Alien();
//		//static values for initial test
//		a.setAid(101);
//		a.setAname("erin");
//		a.setTech("php");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teluskodb1","root","toor");
			Statement st = con.createStatement();
			//intf- this is used to run 1 static sql query on db
			ResultSet rs = st.executeQuery("select * from alien where aid=" + aid);
			//intf- this will get 1 table structure object per 1 static sql query on db
			//row traversal in table
			if(rs.next()) {
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return a;
	}

}
