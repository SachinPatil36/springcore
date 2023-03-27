package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Phone  phone = context.getBean("phone",Phone.class);
        System.out.println(phone);
        System.out.println(phone.getPhoneName().getClass().getName());
        System.out.println(phone.getPasword());

    }
}
