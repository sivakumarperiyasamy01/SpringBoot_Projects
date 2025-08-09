package literalAnnotations;

import org.springframework.beans.factory.annotation.Value;



public class Student {

	// it im using @value annotation before the literal dependecy i dont need seeter method to inject
	
	@Value("${Student.name}")
	private String name;
	@Value("${Student.Hobby}")
	private String interstedCourse;
	@Value("${Student.Hobby}")
	private String Hobby;

	
	/*
	 if i use @value annotation before the setter method it use  the setter method to inejct dpendecy value
	//@Value("sivakumar") - harcode value 
	
	public void setName(String name) {
		this.name = name;

	}
	
	// @Required - it is depricated and if we use this annotation the value should need to give if we not then it will not allow you to create an object
	//@Value("java fullstack")
	@Value("${Student.interstedCourse}") // it dynamically load the properties value
	public void setInterstedCourse(String interstedCourse) {
		this.interstedCourse = interstedCourse;

	}
	
	//@Value("cricket")
	
	public void setHobby(String Hobby) {
		this.Hobby = Hobby;

	}
	
	*/

	public void displaystudentinfo() {
		System.out.println(name + " " + interstedCourse + " " + Hobby);
	}

}
