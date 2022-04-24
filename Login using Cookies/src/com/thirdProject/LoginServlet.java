package com.thirdProject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		if(password.equals("Admin123")) {
			req.getRequestDispatcher("link.html").include(req,res);
			pw.print("<br><br>You are successfully Logged in<br>");
			pw.print("Welcome "+name);
			
			Cookie ck = new Cookie("name",name);
			res.addCookie(ck);
		}else {
			pw.print("Username or Password Error!");
			req.getRequestDispatcher("login.html").include(req,res);
			
			
		}
		pw.close();
	}

}
