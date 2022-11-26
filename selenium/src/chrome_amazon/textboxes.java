package chrome_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.manage().window().maximize();
		d.findElement(By.id("userName")).sendKeys("freinds ");
		d.findElement(By.id("userEmail")).sendKeys("frndsfver@gmail.com");
		d.findElement(By.id("currentAddress")).sendKeys("hkwh");
		d.findElement(By.id("permanentAddress")).sendKeys("hgcg");
		WebElement d1=d.findElement(By.id("submit"));
		d1.click();
		
		
		String r=d.findElement(By.xpath("//*[@id=\"output\"]/div")).getText();
		System.out.println(r);
		
		
	

	}

}
