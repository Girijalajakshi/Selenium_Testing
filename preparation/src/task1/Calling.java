package task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Calling {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		keywords k1=new keywords();
		FileInputStream f=new FileInputStream("C:\\Users\\ychan\\Downloads\\keys.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		Iterator<Row> row= ws.iterator();
		while(row.hasNext())
		{
			r=row.next();
			String action =r.getCell(2).getStringCellValue();
			if(action.equals("Opening_Browser"))
			{
				k1.Opening_Browser();
			}
			else if(action.equals("Navite"))
				k1.Navite();
			else if(action.equals("User_Name"))
			k1.User_Name();
			else if(action.equals("Password"))
				k1.Password();
			else if(action.equals("Click"))
			k1.Click();
			else
			k1.Close();
			
		}
		

	}

}
