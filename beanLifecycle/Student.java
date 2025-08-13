package beanLifecycle;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.sql.Connection;

// create jdbc connection 
public class Student {

	// we need following things to create an connection

	private String url;
	private String username;
	private String pass;
	private Connection con;

	public void setUrl(String url) {
		System.out.println("intitalise url");
		this.url = url;
	}

	public void setUsername(String username) {
		System.out.println("intitalise username");
		this.username = username;
	}

	public void setPass(String pass) {
		System.out.println("intitalise pass");
		this.pass = pass;
	}

	// The PostConstruct annotation is used on a method that needs to be executed
	// after dependency injection is done to perform any initialization

	
	@PostConstruct
	public void init() throws SQLException {
		getconnection();
	}

	public void getconnection() throws SQLException {
		System.out.println("get called after dependcy injection");
		con = DriverManager.getConnection(url, username, pass);

	}

	public void selectallrows() throws SQLException {
		// load drivers
		// make connection
		System.out.println("calling after post construct after dependcy injection");
		Statement st = con.createStatement();
		ResultSet res = st.executeQuery("select*from employee");

		while (res.next()) {

			int id = res.getInt(1);
			String name = res.getString(2);
			int salary = res.getInt(3);
			String add = res.getString(4);

			System.out.println(id + " " + name + " " + salary + " " + " " + add);

		}

	}

	public void deleterows() throws SQLException {
		Statement st = con.createStatement();
		int sr = st.executeUpdate("delete from employee where emp_id=78");
		System.out.println("deleted successfully" + sr);

	}

	public void close() throws SQLException {
		con.close();
	}
	
	
	@PreDestroy
	public void destroy() throws SQLException {
		// standard way of denoting
		System.out.println("before bean destroyed this method will be called");
		close();
	}

}
