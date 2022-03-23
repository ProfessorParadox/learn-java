package com.register;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.register.dao.RegisterUserDao;
import com.register.model.User;

//@WebServlet("/Register")
public class Register extends HttpServlet {
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User newUser = new User();
//		newUser.setUid(request.getParameter("uid"));
		newUser.setEmail(request.getParameter("umail")); 
		newUser.setUname(request.getParameter("uname")); 
		newUser.setPass(request.getParameter("pass"));
		
//		String umail = request.getParameter("umail");
//		String uname = request.getParameter("uname");
//		String pass = request.getParameter("pass");
//		PrintWriter out = response.getWriter();
//		out.println("Welcome to Login Servlet");
		
		RegisterUserDao registeruserdao = new RegisterUserDao();
		
		if(registeruserdao.registerNewUser(newUser)) {	//user registered test
			
//			HttpSession session = request.getSession();
//			session.setAttribute("uname", uname);
			response.sendRedirect("login.jsp");			//user registered success
		}
		else {
			response.sendRedirect("register.jsp");		//user registered fail
		}
		
	}

}
