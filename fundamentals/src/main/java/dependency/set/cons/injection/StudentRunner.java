package dependency.set.cons.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentRunner {

	public static void main(String[] args) {

		// Student s1 = new Student();
		// s1.sname="sivakumar"; it is private i counld access from this class

		// use setter method to set dependency values
		// s1.setter("siva");

		// s1.displayname();

		ApplicationContext context = new ClassPathXmlApplicationContext("beans01.xml");

		// object created using spring ioc contanier with setter dependency injection
		// object created and take out using id
		Student st = context.getBean("std1", Student.class);

		st.displayname();

		// another object created by spring and take out using id
		Student s2 = context.getBean("s2", Student.class);

		s2.displayname();

	}

}
