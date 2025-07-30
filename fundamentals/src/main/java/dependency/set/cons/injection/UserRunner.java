package dependency.set.cons.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserRunner {

	public static void main(String[] args) {
		
		// object created using spring ioc contanier with constructor dependency injection
		// inject dependency values using constructor
		ApplicationContext context = new ClassPathXmlApplicationContext("beans01.xml");
		Userinfo user = context.getBean("u1", Userinfo.class);
		user.getinfo();
		
		
		// get single argument value constructor
		Userinfo s1=context.getBean("u2",Userinfo.class);
		s1.getinfo();
		
		
		

	}

}
