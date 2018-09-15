package com.capgemini.employeeapp.model;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private String employeeDepartment;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double d) {
		this.employeeSalary = d;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	public Employee(int employeeId, String employeeName, double empSalary, String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = empSalary;
		this.employeeDepartment = employeeDepartment;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}
