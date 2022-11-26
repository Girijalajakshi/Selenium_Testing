package testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class program2 {
  @BeforeMethod
  public void login(){
	  System.out.println("login successfully");
	  
  }
  @Test
  public void operation(){
	  System.out.println("performed sucessfully");
  }
  @Test
  public void  close() {
	  System.out.println("closed successfully");
  }
}
