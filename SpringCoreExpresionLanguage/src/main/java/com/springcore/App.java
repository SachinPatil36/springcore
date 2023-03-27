package com.springcore;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;


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
		
		
		
		System.out.println("===============================================================");
		
		Players players = (Players) context.getBean("players");
		System.out.println(players);
  
		SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
		
		Expression parseExpression = spelExpressionParser.parseExpression("20+20");
		
		System.out.println(parseExpression.getValue());
	}
}
