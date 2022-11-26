package testng;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void opening_browser(){
	  System.out.println("application successfully opening");
  }
  @Test(priority=3)
  public void product_details() {
	  System.out.println("product details sucessfully updated");
	  
  }
  @Test(priority=2)
  public void customer_details() {
	  System.out.println("customer details sucessfully updated");
	  
  }
  @Test(priority=1)
  public void paymeny_details() {
	  System.out.println("cash on delivery,payment successfully received from customer");
	  
  }
  @Test(priority=4)
  public void deliveryprocess() {
	  System.out.println("deliver to right address");
	  
  }
  @Test(priority=5)
  public void feedbackprocess() {
	  System.out.println("feedback sucessfully collected from customer");
  }
  @Test
  public void logoff(){
	  System.out.println("close");
	  
  }
}
