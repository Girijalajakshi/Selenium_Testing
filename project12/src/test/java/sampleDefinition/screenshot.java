package sampleDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class screenshot {
	WebDriver d;

@Given("user capture all the links and use navigate back method")
public void user_capture_all_the_links_and_use_navigate_back_method() {
	System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://www.amazon.com/");
	d.manage().window().maximize();
	
    
}

@When("user get the title and url of the page")
public void user_get_the_title_and_url_of_the_page() {
WebElement a=d.findElement(By.id("nav-main"));
List<WebElement>b1=a.findElements(By.tagName("a"));
System.out.println(b1.size());
for(int i=0;i<b1.size();i++)
{
	System.out.println(b1.get(i).getText());
	b1.get(i).click();
	
	d.findElement(By.id("nav-main"));
	b1=a.findElements(By.tagName("a"));
}
System.out.println(d.getTitle());
System.out.println(d.getCurrentUrl());

    
}

@Then("user needs to store them in excel and capture screenshot")
public void user_needs_to_store_them_in_excel_and_capture_screenshot() throws IOException {
	FileInputStream f=new FileInputStream("");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("sheet1");
	Row r=null;
	Cell c=null;
	r=ws.createRow(i);
    
}


@And("close the browser")
public void close_the_browser() {
  
}

}
