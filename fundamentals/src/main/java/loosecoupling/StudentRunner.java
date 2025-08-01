package loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentRunner {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");

		System.out.println("loaded sucessfully");
		Student st1 = context.getBean("st1", Student.class);

		st1.display();
	}

}
