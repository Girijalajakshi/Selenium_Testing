package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom {
	WebDriver d;
	By username=By.name("email");
	By password=By.name("password");
	
	pom(WebDriver d)
	{
		this.d=d;
	}
	public void uname() {
		d.findElement(username).sendKeys("YJLCG");
				
	}
	public void pass() {
		d.findElement(password).sendKeys("123456");
	}

}
