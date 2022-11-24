package sampleDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test {
	WebDriver d;
	@Given("user in newtours page")
	public void user_in_newtours_page() {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		
	    
	}

	@When("user needs to enter the username and password")
	public void user_needs_to_enter_the_username_and_password() {
	   d.findElement(By.name("userName")).sendKeys("girija");
	   d.findElement(By.name("password")).sendKeys("12345");
	}

	@Then("user click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {
	    d.findElement(By.name("submit")).click();
	    Thread.sleep(2000);
	}

	@And("user close the application")
	public void user_close_the_application() {
	   d.close();
	}


}
