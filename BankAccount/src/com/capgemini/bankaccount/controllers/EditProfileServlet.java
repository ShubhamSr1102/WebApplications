package com.capgemini.bankaccount.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/editProfile")
public class EditProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditProfileServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		HttpSession session = request.getSession(false);

		if (null == session.getAttribute("customer")) {

			request.getRequestDispatcher("error.jsp").include(request, response);
		} else {
			RequestDispatcher requestdispatcher = request.getRequestDispatcher("edit.jsp");
			requestdispatcher.forward(request, response);
		}
	}
}
