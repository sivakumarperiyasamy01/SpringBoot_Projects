package loosecoupling;

public class Student {

	private String name;
	private int id;
	private Location add;

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setadd(Location add) {
		this.add= add;
	}
	
	
	

	public void display() {
		add.displayaddresas();
	}

}
