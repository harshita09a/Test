package com.cg.lab1.a;

public class Employee {
	
		private String employeeName;
		private String businessUnit;
		private double salary;
		private int employeeid;
		private int age;
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getBusinessUnit() {
			return businessUnit;
		}
		public void setBusinessUnit(String businessUnit) {
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Employee [employeeName=" + employeeName + ", businessUnit="
					+ businessUnit + ", salary=" + salary + ", employeeid="
					+ employeeid + ", age=" + age + "]";
		}
		
	
	}

