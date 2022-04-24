package com.thirdProject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");  
        PrintWriter out=res.getWriter();  
          
        req.getRequestDispatcher("link.html").include(req, res);  
          
        Cookie ck[]=req.getCookies();  
        if(ck!=null){  
         String name=ck[0].getValue();  
        if(!name.equals("")||name!=null){  
            out.print("<b>Welcome to Profile</b>");  
            out.print("<br>Welcome, "+name);  
        }  
        }else{  
            out.print("Please login first");  
            req.getRequestDispatcher("login.html").include(req, res);  
        }  
        out.close();  
	}

}
