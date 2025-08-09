package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import auotwireannotation2.Child;

public class BodyRunner {

	public static void main(String[] args) {

	//	ApplicationContext context = new ClassPathXmlApplicationContext("beansautowire.xml");
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beansautowire.xml");
		

		Child h1 = context.getBean("human1", Child.class);
		
      // Im calling the method inside created object
		
		h1.Greeting();

	}

}
