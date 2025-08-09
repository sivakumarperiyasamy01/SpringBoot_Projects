package auotwireannotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beansautowire@qualifier.xml");

		Child hr = context.getBean("human", Child.class);
		hr.Greeting();

	}

}
