package testng;

import org.testng.annotations.Test;

public class class2 {
	 @Test(priority=4)
	  public void perform(){
		  System.out.println("performed");
	  }
	 @Test(priority=5)
	  public void process () {
		  System.out.println("process");
	  }
}
