package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class service {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("http://www.amazon.com");
	d.manage().window().maximize();
	d.findElement(By.name("nav-search-submit-button")).sendKeys("books");
	}

}
