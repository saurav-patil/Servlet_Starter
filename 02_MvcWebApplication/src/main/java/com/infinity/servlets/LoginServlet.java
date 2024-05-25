package com.infinity.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  user = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(user.equalsIgnoreCase("admin") && password.equals("admin1234")) {
			response.sendRedirect("Home.jsp");
		}else {
			response.sendRedirect("Error.jsp");
		}
	}

}
