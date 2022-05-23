package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Moveto {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adith\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Get Webaddress
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		
		
		//Actions Class
		Actions a= new Actions(driver);
		
		//Move to Target web element
		WebElement spotrs = driver.findElement(By.xpath("/html//div[@class='ffix nav-down']/div[@class='wrapper']/ul/li[7]/a[@href='javascript:void(0);']"));
		a.moveToElement(spotrs).perform();

		WebElement weight = driver.findElement(By.xpath("/html//div[@class='ffix nav-down']/div[@class='wrapper']/ul/li[7]/div[@class='menu_wrap_sub']/div/div[1]/ul[@class='list_blocks']//a[@alt='Home|CT4P2|Sports & M|NA|Diet Nutrition|Weight Gainers|NA|NA|CT@Weight Gainers']"));
		weight.click();
		
		
	}
	
	
	
	
}
