package web;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Selenium {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://demo.guru99.com/test/newtours/register.php");
			d.manage().window().maximize();
			System.out.println(d.getTitle());
			System.out.println(d.getCurrentUrl());
			d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		    WebElement a=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
		    List<WebElement>b=a.findElements(By.tagName("a"));
		    System.out.println(b.size());
			for(int i=0;i<b.size();i++)
			{
				System.out.println(b.get(i).getText());
			}
		}
		

	}


