package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private PrintWriter printWriter;
	private String login;
	private String pwd;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		login = request.getParameter("txtlogin");
		pwd = request.getParameter("txtpwd");
		printWriter = response.getWriter();
//		if(login = "kkcool" && pwd = "kkcool@03") bcoz of string  
		if(login.equals("kkcool") && pwd.equals("kkcool@03")) {
			printWriter.println("you have successfully login");
		}
		else {
			printWriter.println("Invalid Id or Password!!");
			
		}
	}

}
