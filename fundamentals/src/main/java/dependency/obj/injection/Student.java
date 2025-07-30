package dependency.obj.injection;

public class Student {

	private int id;
	private Address add;

	

	public void setId(int id) {
		this.id = id;
	}



	public void setAdd(Address add) {
		this.add = add;
	}



	public void displayaddress() {
		add.printaddress();
	}

}
