package dependency.obj.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

/*      internally it spring create following like this 
		
		Address a1= new Address();
		Student s1= new Student();
		
		s1.setid(2);
		s1.setadd(a1);
		s1.displayname();
		
 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		// System.out.println("loaded successfully");
		Student stu=context.getBean("s1", Student.class);
		stu.displayaddress();
	    Student1 stu1=	context.getBean("s2",Student1.class);
	    stu1.display();
	    
		
		
		

	}

}
