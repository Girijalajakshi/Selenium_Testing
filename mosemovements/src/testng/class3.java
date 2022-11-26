package testng;

import org.testng.annotations.Test;

public class class3 {
  @Test(priority=6)
  public void feedbackprocess(){
	  System.out.println("feedback successfully collected from customer");
  }
	  @Test(priority=7)
	  public void close() {
		  System.out.println("window closed");
	  }
  }

