package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keywords {
	WebDriver d;
	public void Opening_Browser() {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d=new ChromeDriver();
		
		
		
	}
	public void Navite() {
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	}
	public void  User_Name()
	{
		d.findElement(By.name("userName")).sendKeys("girija");
	}
	public void Password()
	{
		d.findElement(By.name("password")).sendKeys("12345");
	}
	public void Click() {
		d.findElement(By.name("submit")).click();
		
	}
	public void Close() {
		d.close();
	}

}
