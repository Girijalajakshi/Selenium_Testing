package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


	public class process extends operation{
		  @AfterTest
		  public void close()
		  {
			  d.close();
		  }
		  
	
  }

