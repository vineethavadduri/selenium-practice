package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PLinktexteg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");

//		WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
//		gmailLink.click();

		WebElement gmailLink = driver.findElement(By.partialLinkText("mail"));
		gmailLink.click();

	}
}
				
				

