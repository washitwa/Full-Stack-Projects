package com.thirdProject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		RequestDispatcher rd = req.getRequestDispatcher("Index2.html");
		rd.include(req,res);
		
		Cookie ck = new Cookie("name",null);
		ck.setMaxAge(0); 			//Non-persistent
		res.addCookie(ck);
		
		pw.print("<br>You are successfully Logged out");
	}

}
