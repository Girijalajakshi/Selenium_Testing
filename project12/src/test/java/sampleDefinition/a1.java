package sampleDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class a1 {
	WebDriver d;
	

@Given("user is in newtours page")
public void user_is_in_newtours_page() {
	System.setProperty("webdriver.chrome.drver","D://chromedriver.exe");
	d= new ChromeDriver();
	d.get("https://demo.guru99.com/test/newtours/");
	d.manage().window().maximize();
}



@When("^user enters (.*) and (.*)$")
public void user_enters_uname_and_password(String uname,String password) throws InterruptedException {
	Thread.sleep(2000);
d.findElement(By.name("userName")).sendKeys(uname);
d.findElement(By.name("password")).sendKeys(password);
}

@Then("user clicks login button")
public void user_clicks_login_button() throws InterruptedException {
	Thread.sleep(2000);
    d.findElement(By.name("submit")).click();
}

@And("user back to home page")
public void user_back_to_home_page() {
	System.out.println("navigated to home page");
   d.close();
}


}
