package com.springbeansscope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {

	public static void main(String[] args) {

		// “Hey Spring, here is the Class object for my Config class.
		// Read its annotations and build the context from it.”

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		// System.out.println("loaded");

		// every time we request a bean it gives the same bean is called singleton 
		Student s1 = (Student) context.getBean("student");
		Student s2 = (Student) context.getBean("student");

		System.out.println(s1 + " " + s2);

		if (s1 == s2) {
			System.out.println("is an singleton class ");

		} else {
			System.out.println("is not singleton class");
		}

	}

}
