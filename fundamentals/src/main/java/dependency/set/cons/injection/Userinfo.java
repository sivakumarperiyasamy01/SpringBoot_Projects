package dependency.set.cons.injection;

public class Userinfo {

	private String username;
	private int id;

	
	// single argument constructor
	public Userinfo(int id) {
		this.id = id;
	}

	// multiple argument constructor
	public Userinfo(String username, int id) {

		this.username = username;
		this.id = id;
	}

	public void getinfo() {
		System.out.println("user name is " + username + " and id is " + id);
	}

}
