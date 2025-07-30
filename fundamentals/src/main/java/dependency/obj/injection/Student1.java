package dependency.obj.injection;

public class Student1 {

	private int id;
	private Address add1;

	public void setid(int id) {
		this.id = id;
	}

	public void setadd1(Address add1) {
		this.add1 = add1;
	}

	public void display() {
		add1.printaddress();
	}

}
