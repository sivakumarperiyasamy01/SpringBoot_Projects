package inversionofcontrol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
	public static void main(String[] args) {

/*
		 Airtel a1= new Airtel(); 
		 Vodafone v1= new Vodafone();
		 a1.calling(); 
		 a1.data();
		 v1.data(); 
		 v1.calling();
		 
 */

/*
 * 
		  java run time polymorphism
		  Sim s1 = new Vodafone(); 
		  s1.calling(); 
		  s1.data();
		  
 */

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

/*      Airtel air = (Airtel) context.getBean("air");
  
         in getbean method mention the refrence id name
 
		instead of type casting we can do alternate method
		Airtel air1= context.getBean("air",Airtel.class);
		
		
	    using interface
*/
	//	Sim s1 = context.getBean("sim", Sim.class);
		
		Sim s1= (Sim)context.getBean("sim");

		s1.calling();
		s1.data();

	}
}
