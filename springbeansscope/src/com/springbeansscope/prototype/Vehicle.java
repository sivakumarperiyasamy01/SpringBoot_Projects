package com.springbeansscope.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Vehicle {

	public void speed() {
		System.out.println("vehicle speed at 200km/hr");
	}
}
