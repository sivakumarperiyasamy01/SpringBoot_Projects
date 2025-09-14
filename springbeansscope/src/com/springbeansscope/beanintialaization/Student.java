package com.springbeansscope.beanintialaization;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Student {

	
	public Student() {
		System.out.println("student object created");
		
	}
}
