package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.domain.Employee;

@WebServlet("/Employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Employee> users = new ArrayList<>();

	public EmployeeServlet() {
		super();

	}

	@Override
	public void init() throws ServletException {
		users.add(new Employee(11, "Shubham", 8_00_000, "Java Cloud"));
		users.add(new Employee(12, "Naveena", 7_00_000, "SAP ABAB"));
		users.add(new Employee(13, "Sri", 6_00_000, "SAP FI"));
		users.add(new Employee(14, "Teju", 5_00_000, "IMS Network"));
		users.add(new Employee(15, "Neeraj", 4_00_000, "Training"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
int flag = 0;
		PrintWriter out = response.getWriter();
		String employeeNumber = request.getParameter("employeeID");

			for (Employee emp : users) {
				if (emp.getEmployeeId() == Integer.parseInt(employeeNumber)) {
					out.println("<head>"
							+ "<style>"
							+ "table, th, td {  border: 5px solid black; border-collapse:collapse;}"
							+ " th,td{ padding:10px; }"
							+ "</style></head>"
							+ "<body bgcolor = 'cyan'><table><tr><th>Employee Id</th><th>Employee Name</th><th>Employee Department</th><th>Employee Salary</th></tr>");
					out.println("<tr><td>" + emp.getEmployeeId() + "</td><td>" + emp.getEmployeeName() + "</td><td>"
							+ emp.getEmployeeDepartment() + "</td><td>" + emp.getEmployeeSalary() + "</td></tr></table></body>");
					flag=1;
					break;
				}
			}
	 if(flag == 0) {
			out.println("<h3>Invalid UserName. Please enter the correct ID</h3>");
		}
	}

}
