package auotwireannotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import autowire.Heart;

public class Child {
	
	// The @Qualifier annotation in Spring is used to resolve ambiguity when multiple
	//beans of the same type are present in the application context

	
	@Autowired
	@Qualifier("hr2")
	Brain hr;

	
	


	public void Greeting() {

		if (hr != null) {
			hr.life();
		} else {
			System.out.println("object not injected ");
		}

	}

}
