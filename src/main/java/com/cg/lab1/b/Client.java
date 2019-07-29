package com.cg.lab1.b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
				Employee d = context.getBean(Employee.class);
				//SBU s=context.getBean(SBU.class);
				System.out.println("Employee Details");
				System.out.println("--------------------");
				System.out.println(d);
				//System.out.println(s);
			}
}
