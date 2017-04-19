package com.httpstm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Display extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uMobile = request.getParameter("uMobile");
		String uEmail = request.getParameter("uEmail");
		
		HttpSession s = request.getSession(false);
		
		out.println("<html><body>");
		out.println("<p>Name:"+ s.getAttribute("uName")+"</p>");
		out.println("<p>Password:"+ s.getAttribute("uPassword")+"</p>");
		out.println("<p>Experience:"+ s.getAttribute("uExperience")+"</p>");
		out.println("<p>Qualification:"+ s.getAttribute("uQualification")+"</p>");
		out.println("<p>Mobile:"+uMobile+"</p>");
		out.println("<p>Email:"+uEmail+"</p>");
		
		out.println("</html></body>");	
	}

}
