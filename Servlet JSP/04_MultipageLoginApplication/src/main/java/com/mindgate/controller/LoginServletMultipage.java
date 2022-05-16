package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServletMultipage")
public class LoginServletMultipage extends HttpServlet {
	private PrintWriter printWriter;
	private String login;
	private String pwd;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		login = request.getParameter("LoginID");
		pwd = request.getParameter("password");
		printWriter = response.getWriter();
//		if(login = "kkcool" && pwd = "kkcool@03") bcoz of string  
		if(login.equals("kkcool") && pwd.equals("kkcool@03")) {
			response.sendRedirect("success.html");
		}
		else {
			response.sendRedirect("failure.html");
		}
	}

}
