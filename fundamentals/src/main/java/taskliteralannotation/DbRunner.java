package taskliteralannotation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DbRunner {

	public static void main(String[] args) throws SQLException {

		ApplicationContext context = new ClassPathXmlApplicationContext("Taskbean.xml");

		DatabaseConnection jd1 = context.getBean("d1", DatabaseConnection.class);
		
	//	jd1.displayinfo();
		jd1.MakeConnection();

	}

}
