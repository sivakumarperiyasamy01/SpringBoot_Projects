package autowire;


import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	// if i havnt assigned any value for object reference it default take is as null

	// once the created object assigned to this as dependency
	// i could use reference variable to access created object method
	  Heart hr;
	
	
    // autowired type constructor
	// to use @Autowire constructor we have to specifiy the default constructor
	Human(){
		
	}
	  
	  
	  
//	 @Autowired
	 public Human(Heart hr) {
		this.hr = hr;
	}
	
   
	
	  // autowired type using setter method
	  
	 @Autowired
	public void setHr(Heart hr) {
		
		this.hr = hr;
		System.out.println("setter method is called");
	}

	
	
	// handling null pointer exception 
	
	public void Greeting() {
		
		if(hr!=null) {
			hr.life();
		}else {
			System.out.println("object not injected ");
		}
			
	}
	
	

}
