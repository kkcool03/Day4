package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AcceptDetailsServlet")
public class AcceptDetailsServlet extends HttpServlet {
	private PrintWriter printWriter;
	private String number1;
	private String number2;
	private int result;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		number1 = request.getParameter("txtnumber1");
		number2 = request.getParameter("txtnumber2");
		result = Integer.parseInt(number1) + Integer.parseInt(number2);
		printWriter = response.getWriter();
		printWriter.println("Addition of " + number1 + " & " + number2 + " is " + result);
	}

}
