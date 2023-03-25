package com.example.springcoreLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
 
     
    public static void main( String[] args )
    {
        
        
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        context.registerShutdownHook();
//        Object student = context.getBean("student");
//        System.out.println(student);
    
        
       
        
     
//        Object employee = context.getBean("employee");
//        System.out.println(employee);
        
        
        Object person = context.getBean("person");
        
        System.out.println(person);
        
    }
}
