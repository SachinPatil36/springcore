package com.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springcore.config.EmployeeConfig;
import com.example.springcore.entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
        
        Employee employee = (Employee) context.getBean("employee");
        
        //value injecting throw method 
       employee.getEployeeInformation();
       
       //getting value throw toString 
       System.out.println(employee);
        
    }
}
