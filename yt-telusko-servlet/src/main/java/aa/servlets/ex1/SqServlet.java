package aa.servlets.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
						
		//fetch var from add servlet	
//		int k = (int) req.getAttribute("k");
//		
//		k = k * k;
//		
//		PrintWriter out = res.getWriter();
//		out.println("On webpage, Hello to Square! Result= " + k);
		
		System.out.println("On console, Sq called");
		
		//after using send redirect, how to fetch data 
		//since we use doget request so data comes from URL
		//there if we give sq?k=12 this works
//		int k = Integer.parseInt(req.getParameter("k"));
		
		//using httpsession we can receive k value
//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k");
		
		//using cookies by getcookies() on request object
		//since client can send request to servlet, not response\
		//all cookies sent together so have to use arrays
		//then use for loop to browse through array for "k" cookie
		//getvalue() gives object use parseInt() for int value
		Cookie cookies[] = req.getCookies();
		int k = 0;		//init k
		
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		k = k * k;
		
		PrintWriter out = res.getWriter();
		out.println("On webpage, Hello to Square! Result= " + k);

	}
}
