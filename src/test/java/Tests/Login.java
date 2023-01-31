package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;

public class Login extends BaseClass{
	
	
	LoginPage loginpage = new LoginPage();
	AddToCardPage addtocardpage = new AddToCardPage();
	
	@BeforeMethod
	public void SetupX() {
//		Setup();
//		loginpage.GetElements();
//		addtocardpage.GetElements();
	}
	
	@Test(groups= {"Smoke"})  
	public void Test1() throws InterruptedException, IOException {

		
        //Create an object of File class to open xlsx file
        File file =    new File("C:\\Users\\HP\\Downloads\\Book 1.xlsx");
        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
        //Creating workbook instance that refers to .xls file
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        
        //Creating a Sheet object using the sheet Name
        XSSFSheet sheet=wb.getSheet("Sheet1");
        
        //Create a row object to retrieve row at index 1
        XSSFRow row2=sheet.getRow(1);
        
        //Create a cell object to retreive cell at index 5
        XSSFCell cell=row2.getCell(1);
        
        //Get the address in a variable
        String address= cell.getStringCellValue();
        
        //Printing the address
        System.out.println("Address is :"+ address);
	}
	
}
