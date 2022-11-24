package sampleDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class droplist {
WebDriver d;

@Given("user open newtoursnpage")
public void user_open_newtoursnpage() {
	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://demo.guru99.com/test/newtours/register.php");
	d.manage().window().maximize();
	
}

@When("user needs to click on dropdown")
public void user_needs_to_click_on_dropdown() {
   d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]")).click();
   WebElement drop=d.findElement(By.name("country"));
	List<WebElement>b=a.
  
   
}

@Then("user needs to get country names from dropdown list")
public void user_needs_to_get_country_names_from_dropdown_list() {
	FileInputStream f=newFileInputStream("D://");
	
	
}

@And("user navigate to home page")
public void user_navigate_to_home_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
