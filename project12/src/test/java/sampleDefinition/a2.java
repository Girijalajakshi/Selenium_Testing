package sampleDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class a2 {
WebDriver d;


@Given("user is in newtours application")

public void user_is_in_newtours_application() {
	System.setProperty("webdriver.chrome.drver","D://chromedriver.exe");
	d= new ChromeDriver();
	d.get("https://demo.guru99.com/test/newtours/register.php");
	d.manage().window().maximize();
}

@When("user clicks register page")
public void user_clicks_register_page() {
    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
}

@Then("user select india from dropdown")
public void user_select_india_from_dropdown() {
    WebElement drop=d.findElement(By.name("country"));
    drop.sendKeys("india");
}

@And("user close the window")
public void user_close_the_window() {
    d.close();
}

}
