package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// this class just for servlet config and servlet context practice
public class MyServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		out.print("Hi ");
//		
		ServletConfig cg = getServletConfig();  //config good to deal with servlets has different value
		String str = cg.getInitParameter("name");
//		ServletContext ctx = getServletContext();  // context good to deal with servlets has same value
//		String str = ctx.getInitParameter("Phone"); 
		out.println(str);
	}
}
