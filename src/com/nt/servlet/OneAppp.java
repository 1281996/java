package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OneAppp extends HttpServlet {
 public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
	 PrintWriter pw=null;
	 String name;
	 String age;
	 int tage;
	 res.setContentType("text/html");
	 pw=res.getWriter();
	 name=req.getParameter("p1");
	 age=req.getParameter("p2");
	 tage=Integer.parseInt(age);
	 if(name=="")
	 {
		 pw.println("name is required");
	 }
	 if(age=="")
	 {
		 pw.println("age requried");
		 if(isN)
	 }
	 
	 
	
	 if(tage>21)
	 pw.println("Eligible for marriage"+name);
	 else
		 pw.println("Not Eligible marriage");
	 pw.close();
	 
 }

}
