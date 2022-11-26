package task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class practice {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("D:\\girija\\eclipse-workspace\\mosemovements\\src\\task\\pr.properties");
		Properties p=new Properties();
		p.load(f);
		FileInputStream f1=new FileInputStream("C:\\Users\\ychan\\practise.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		Cell c=null;
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe" );
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.findElement(By.name("userName")).sendKeys(p.getProperty("uname"));
		System.out.println(p.getProperty("uname"));
		d.findElement(By.name("password")).sendKeys(p.getProperty("pwd"));
		System.out.println(p.getProperty("pwd"));

		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		pom P=new pom(d);
		P.uname();
		P.pass();
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\girija\\apo.png"));
		WebElement drop=d.findElement(By.name("country"));
		List<WebElement>drop1=drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++)
		{
			System.out.println(drop1.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(drop1.get(i).getText());
			
		

		FileOutputStream f2=new FileOutputStream("C:\\Users\\ychan\\practise.xlsx");
		wb.write(f2);
		f2.close();

		}
		
	}

}
