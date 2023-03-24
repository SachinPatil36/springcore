package com.example.SpringCoreTestingForConformation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "using new keyword!" );
        System.out.println("----------------------");
        Employee emp=new Employee(101,"Virat","Mumbai");
        System.out.println(emp);
        
        System.out.println("==========================");
        
        System.out.println("using Container !");
        System.out.println("----------------------");
       ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
       Object emp1 = context.getBean("emp1");
      
       Object emp2 = context.getBean("emp2");
      
      
        
       System.out.println(emp1);
       System.out.println(emp2);
      
    
    }

}
