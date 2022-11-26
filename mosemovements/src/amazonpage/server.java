package amazonpage;

import org.testng.annotations.AfterTest;

public class server extends page {
  @AfterTest
  public void close(){
	  d.close();
  }
}
