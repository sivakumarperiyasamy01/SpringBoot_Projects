package com.springbeansscope.beanintialaization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
		
		//context.getBean("student", Student.class); // when i request for a bean that time only prototype scope bean get initalised untill not 
		
		// when singleton scoped bean has dependency as prototype bean then that bean get intialised that time itself 
		
	School s1=context.getBean("school", School.class); 
	System.out.println(s1.getStu());
	System.out.println(s1.getStu());	 
	// when i inject prototype scoped object inside a singleton object 
	//and request a prototype bean using singleton reference it return me same object only every time	
		
		
		
		
	}

}
