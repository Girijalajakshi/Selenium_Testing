package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
ChromeDriver d=new ChromeDriver();

	d.get("https://itera-qa.azurewebsites.net/home/automation");
	d.manage().window().maximize();
	d.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[1]/a")).click();
	d.findElement(By.id("FirstName")).sendKeys("girija");
	d.findElement(By.id("Surname")).sendKeys("yendluri");
	d.findElement(By.id("E_post")).sendKeys("ygirija");
	d.findElement(By.id("Mobile")).sendKeys("123456778");
	d.findElement(By.id("Username")).sendKeys("girijalajakshi");
	d.findElement(By.id("Password")).sendKeys("1232345");
	d.findElement(By.id("ConfirmPassword")).sendKeys("1232345");
	d.findElement(By.id("submit")).click();
	

	}

}
