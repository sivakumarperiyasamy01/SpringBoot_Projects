package taskliteralannotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class DatabaseConnection {

  @Value("${DatabaseConnection.url}")
  private String url;
  @Value(("${DatabaseConnection.uname}"))
  private String uname;
  @Value(("${DatabaseConnection.pass}"))
  private String pass;
  
	
  
  public void displayinfo() {
	  System.out.println(url+" "+uname+" "+pass);
  }
  
  
  public void MakeConnection() throws SQLException {
	  
	  Connection con=DriverManager.getConnection(url,uname,pass);
	  System.out.println("connection established");
  }
  
  
  
  
  
  
  

}
