package com.springbeansscope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRun {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Vehicle v1 = (Vehicle) context.getBean("vehicle");

		Vehicle v2 = (Vehicle) context.getBean("vehicle");

		System.out.println(v1 + "" + v2);
		
		if(v1==v2) {
			System.out.println("is singleton bean");
		}else {
			System.out.println("is prototype bean scope");
		}

	}

}
