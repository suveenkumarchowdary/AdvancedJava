package com.httpstm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Form3 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String uQualification = request.getParameter("uQualification");
		String uExperience = request.getParameter("uExperience");

		HttpSession s = request.getSession(false);
		s.setAttribute("uQualification", uQualification);
		s.setAttribute("uExperience", uExperience);

		out.println("<html><body>");
		out.println("<form action='./Display' method='post'>");
		out.println("Mobile : <input type='text' name='uMobile'>");
		out.println("Email : <input type='email' name='uEmail'>");
		out.println("<input type='submit' value='submit' />");
		out.println("</form>");
		out.println("</html></body>");
	}

}
