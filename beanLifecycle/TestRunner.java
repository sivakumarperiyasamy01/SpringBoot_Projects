package beanLifecycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRunner {

	public static void main(String[] args) throws SQLException {

		ApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle.xml");

		Student st1 = context.getBean("s1", Student.class);

		st1.selectallrows();
		
		((ClassPathXmlApplicationContext)context).close();

	}

}


/*
  make connection connection() -> db operations() -> db close()
 */