package com.capgemini.bankaccount.controllers;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.bankaccount.model.Customer;
import com.capgemini.bankaccount.service.impl.CustomerServiceImpl;

@WebServlet("/UpdatePasswordMethod")
public class UpdatePasswordMethodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Customer customer;
	CustomerServiceImpl customerserviceimpl;
	ServletRequest session;
       
    public UpdatePasswordMethodServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String oldPassword = request.getParameter("oldPassword");
		String newPassword = request.getParameter("newPassword");
		
		customer.setCustomerPassword(oldPassword);
		
		if (customerserviceimpl.updatePassword(customer, oldPassword, newPassword)) {
			RequestDispatcher requestdispatcher = request.getRequestDispatcher("display.jsp");
			requestdispatcher.forward(request, response);
		} else {
			RequestDispatcher requestdispatcher = request.getRequestDispatcher("updateError.jsp");
			requestdispatcher.forward(request, response);
		}
	}

}
