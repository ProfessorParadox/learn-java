package aa.servlets.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
//		System.out.println("In the console, result = " + k);
		
//		PrintWriter out = res.getWriter();
//		out.println("On webpage, result = " + k);
//		k = k*k;
		
		//for passing data to sq servlet
//		req.setAttribute("k", k);
		
		//calling sq servlet using req disp - 
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		//calling sq servlet using send redirect - 
//		res.sendRedirect("sq");
//		res.sendRedirect("sq?k=" + k);
		//this technique comes under session management, URL rewriting
		//using sq?k= we can send client/browser this query in URL
		//from there it will fetch value for k and run square func
		
		//next technique is using httpsession interface
		//a session is available throughout application
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);		
//		res.sendRedirect("sq");
		
		//next technique is using cookies of session
		//cookie is a class and passing key,value pair in const()
		//value should be string so append empty string to integer
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		//now response will be sent to client with cookies
		//client will again request for square servlet 
		//and then also cookies will be sent to servlet
		//but then request object will be used to get cookies
		
				
	}
}
