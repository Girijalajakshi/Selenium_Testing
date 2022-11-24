package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class p {

	public static void main(String[] args)throws InterruptedException {
						// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
				ChromeDriver d=new ChromeDriver();
				d.get("http://www.google.com");
				d.manage().window().maximize();
				System.out.println(d.getTitle());
				System.out.println(d.getCurrentUrl());
				Thread.sleep(2000);
				d.close();

	}

}
