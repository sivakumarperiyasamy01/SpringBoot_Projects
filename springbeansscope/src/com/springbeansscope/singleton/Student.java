package com.springbeansscope.singleton;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON) // or else @Scope("singleton")
public class Student {

	public void display() {
		System.out.println("hello buddy");
	}
}
