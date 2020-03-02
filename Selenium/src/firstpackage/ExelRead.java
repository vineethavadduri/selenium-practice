package firstpackage;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExelRead {
	
	public static void textbox(WebDriver driver, String text)
	{
	WebElement ele1= driver.findElement(By.id("gh-ac"));
	ele1.sendKeys(text);
	}
	
	public static void dropdown(WebDriver driver, String dropdownvalue)
	{
	WebElement ele2= driver.findElement(By.id("gh-cat"));
	Select sel= new Select(ele2);
	sel.selectByVisibleText(dropdownvalue);
	}
	
	public static void click(WebDriver driver)
	{
	WebElement ele3= driver.findElement(By.id("gh-btn"));
	ele3.click();
	}
	
public static void main(String[] args) throws Exception {
	
	XSSFWorkbook wb=new XSSFWorkbook("testData.xlsx");
    XSSFSheet sh=wb.getSheet("Data");
	int rowCount = sh.getPhysicalNumberOfRows();
	for(int i=0; i<rowCount; i++)
	{
	String srchvalue= sh.getRow(i).getCell(0).getStringCellValue();
	String dropdownvalue= sh.getRow(i).getCell(1).getStringCellValue();
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.ebay.com/");
	ExelRead.textbox(driver,srchvalue );
	ExelRead.dropdown(driver, dropdownvalue);
	ExelRead.click(driver);
	driver.close();
		
}	
}
}
