package com.example.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "injectingReferenceType!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Object employee = context.getBean("employee");
        System.out.println(employee);
        
    }
}
