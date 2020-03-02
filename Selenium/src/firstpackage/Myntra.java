package firstpackage;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
				d.get("https://www.myntra.com/");
        d.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("women jeans");
			d.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")).click();
			WebElement m=d.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[6]/a/div[1]/div"));
			Actions action = new Actions(d);
			//moving to the main menu and then sub menu and clicking on it using object of the Actions class
			action.moveToElement(m).moveToElement(d.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[6]/div[3]/span[1]/span"))).click().build().perform();
        d.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[6]/div[4]/div[2]/button[2]")).click();
        d.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[2]/span[1]")).click();

}
	}
