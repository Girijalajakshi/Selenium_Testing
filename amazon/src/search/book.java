package search;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class book {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.amazon.com");
		d.manage().window().maximize();
		d.findElement(By.id("nav-search-submit-button")).sendKeys("chips");
		d.findElement(By.id("")).sendKeys("Lays Packet");
		d.findElement(By.id("")).click();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.close();
	}

}
