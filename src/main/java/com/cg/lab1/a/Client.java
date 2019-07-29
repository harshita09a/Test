package com.cg.lab1.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				ApplicationContext context=new ClassPathXmlApplicationContext("lab1-A.xml");
				Employee d = context.getBean(Employee.class);
				System.out.println("Employee Details");
				System.out.println("--------------------");
				System.out.println("Employee ID: "+d.getEmployeeid());
				System.out.println("Employee Name: "+d.getEmployeeName());
				System.out.println("Employee ID: "+d.getBusinessUnit());
				System.out.println("Employee ID: "+d.getAge());
				System.out.println("Employee ID: "+d.getSalary());
			}

		
	}


