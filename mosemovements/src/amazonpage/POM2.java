package amazonpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM2 {
WebDriver d;
By Fname=By.name("firstName");
By Lname=By.name("lastName");
By Phone=By.name("phone");
By Uname=By.name("userName");
By Cont=By.name("country");
By Submit=By.name("submit");
POM2(WebDriver d){
	this.d=d;
}

public void Fname() {
	d.findElement(Fname).sendKeys("girija");
	

	}
public void Lname() {
	d.findElement(Lname).sendKeys("yendluri");
	

	}
public void Phone() {
	d.findElement(Phone).sendKeys("6303084797");
}
public void Uname() {
	d.findElement(Uname).sendKeys("girija");
	

	}
public void countryname() {
		d.findElement(Cont).sendKeys("india");
		

		}
public void submit() {
	d.findElement(Submit).click();
}


}
