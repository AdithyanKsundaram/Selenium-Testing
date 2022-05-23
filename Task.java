package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {
	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adith\\eclipse-workspace\\Testing\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Get Web site
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		//Actions class
		
		Actions a= new Actions(driver);
		
		//To select source web element
		
		WebElement bank = driver.findElement(By.xpath("//div[@id='products']//li[@class='block14 ui-draggable']/a[@class='button button-orange']"));
		
		WebElement sales = driver.findElement(By.xpath("//div[@id='products']//li[@class='block15 ui-draggable']/a[@class='button button-orange']"));
		
		WebElement fivek= driver.findElement(By.xpath("/html//li[@id='fourth']/a[@class='button button-orange']"));
		
		WebElement fiveK = driver.findElement(By.xpath("//div[@id='products']//ul/li[4]/a[@class='button button-orange']"));
		
		// To select target web element
		
		WebElement debAcc = driver.findElement(By.xpath("//ol[@id='bank']/li[@class='placeholder']"));
		
		WebElement debAmt = driver.findElement(By.xpath("/html//main[@id='g-mainbar']/div[@class='g-grid']/div[@class='g-block size-100']//div[@class='item-page']/table/tbody/tr/td[1]/table//tr/td[2]/div[@class='shoppingCart']//ol[@class='field13 ui-droppable ui-sortable']/li[@class='placeholder']"));
		
		WebElement creAcc = driver.findElement(By.xpath("//ol[@id='loan']/li[@class='placeholder']"));
		
		WebElement creAmt = driver.findElement(By.xpath("/html//main[@id='g-mainbar']/div[@class='g-grid']/div[@class='g-block size-100']//div[@class='item-page']/table/tbody/tr/td[2]/table//tr/td[2]/div[@class='shoppingCart']//ol[@class='field13 ui-droppable ui-sortable']/li[@class='placeholder']"));
		
		
	    // Drag and Drop method
		
		a.dragAndDrop(bank, debAcc).perform();
		
		a.dragAndDrop(sales, creAcc).perform();
		
		a.dragAndDrop(fiveK, debAmt).perform();
		
		a.dragAndDrop(fivek, creAmt).perform();
	
	}

}


	