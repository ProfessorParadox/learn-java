package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;

//@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
//		PrintWriter out = response.getWriter();
//		out.println("Welcome to Login Servlet");
		
		LoginDao logindao = new LoginDao();
		
		if(logindao.check(uname, pass)) {
			
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			response.sendRedirect("dashboard.jsp");
		}
		else {
			response.sendRedirect("login.jsp");
		}
		
	}
	

}
