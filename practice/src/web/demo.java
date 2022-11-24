package web;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.jetty.server.Response.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.findElement(By.linkText("REGISTER")).click();
		WebElement drop=d.findElement(By.name("country"));
		List<WebElement> drop1=drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		 for(int i=0;i<drop1.size();i++)
		{
			System.out.println(drop1.get(i).getText());
			
		}
	File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(a1, new File("C://new1.png"));
		

	}

}
