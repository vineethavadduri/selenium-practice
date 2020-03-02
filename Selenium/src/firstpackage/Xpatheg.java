package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpatheg {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.className("desktop-searchBar")).sendKeys("women jeans");
		driver.findElement(By.xpath(".//*[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		//driver.findElement(By.xpath(".\\*[@href='jeans/high-star/high-star-women-black-slim-fit-high-rise-clean-look-stretchable-jeans/7289168/buy']")).click();
		driver.findElement(By.xpath(".//a[@href='jeans/high-star/high-star-women-black-slim-fit-high-rise-clean-look-stretchable-jeans/7289168/buy']")).click();
		
		
			
	
	}
}
