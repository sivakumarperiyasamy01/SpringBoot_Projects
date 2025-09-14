package com.springbeansscope.beanintialaization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class School {
	
	@Autowired
	private Student stu;
	
	
	public School() {
		System.out.println("School object created");

	}


	public Student getStu() {
		return stu;
	}


	public void setStu(Student stu) {
		this.stu = stu;
	}

}
