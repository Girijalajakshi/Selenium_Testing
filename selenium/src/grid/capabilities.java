package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class capabilities {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		String nodeurl="http://localhost:4444/wd/hub";
		String baseurl="https://www.google.com";
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		WebDriver d1=new RemoteWebDriver(new URL(nodeurl),cap);
		
	//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	   System.getProperty("webdriver.chrome.driver","D://chromedriver.exe");
	   
		//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	    
		//d1 = new ChromeDriver();
	    d1=new ChromeDriver();
	    
		d1.get(baseurl);
		d1.manage().window().maximize();
		d1.close();
		
		
		

	}

}
