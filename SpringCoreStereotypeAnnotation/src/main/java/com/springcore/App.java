package com.springcore;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	public static void main( String[] args )
	{
		
		System.out.println("welcome !");

		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		Student student = (Student) context.getBean("student");
		Student Student1 = (Student) context.getBean("student");
		
		System.out.println(student);

		System.out.println(student.hashCode());
		System.out.println(Student1.hashCode());
		System.out.println("-------------------------------");
		
		StudentAddress studentAdress = (StudentAddress) context.getBean("studentAdress");
		
		System.out.println(studentAdress); 
		System.out.println(studentAdress.hashCode());

		
		StudentAddress studentAddress1 = (StudentAddress) context.getBean("studentAdress");
		System.out.println(studentAddress1.hashCode());
  
	}
}
