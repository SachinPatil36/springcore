package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome!" );
        
        System.out.println("Adding Manually!!");
        System.out.println("----------------");
        List<String> list=new ArrayList<String>();
        list.add("86563214");
        list.add("8694741");
        list.add("6363214");
        
        Set<String> set=new HashSet<String>();
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Tamil");
        
        Map<String, String> map=new HashMap<String, String>();
        map.put("java", "1month");
        map.put("python", "2month");
        map.put(".net", "3month");
        
        Student s=new Student("Sachin", list, set, map);
        System.out.println(s);
        
        
        System.out.println("Using Container!!");
        System.out.println("----------------");
        
        
        ApplicationContext context=new ClassPathXmlApplicationContext("container.xml");
        
		Object student1 = context.getBean("stdent1");
		
		System.out.println(student1 );
        	
    }
}
