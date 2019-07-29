package com.cg.lab1.b;

public class Employee {
	private String employeeName;
	private  SBU businessUnit;
	private double salary;
	private int employeeid;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", businessUnit="
				+ businessUnit + ", salary=" + salary + ", employeeid="
				+ employeeid + "";
	}
}
