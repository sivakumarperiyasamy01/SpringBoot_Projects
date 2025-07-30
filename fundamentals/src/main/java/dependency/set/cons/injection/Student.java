package dependency.set.cons.injection;

public class Student {

	private String sname;
	private int id;

	
	// using setter method to initalise dependency values 
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	public void setid(int id) {
		this.id=id;
	}



	public void displayname() {
		System.out.println(sname+" and my id is "+ id);
	}
}
