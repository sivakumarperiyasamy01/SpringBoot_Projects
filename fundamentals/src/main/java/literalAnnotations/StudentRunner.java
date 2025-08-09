package literalAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentRunner {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beansliteral.xml");
		
		System.out.println("file config loaded ");
		
		Student std=context.getBean("s1",Student.class);
		
		std.displaystudentinfo();

	}

}
