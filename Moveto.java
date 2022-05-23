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
		
		//Get Web address
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		
		//Actions Class
		Actions a= new Actions(driver);
		
		//Move to 1st Target web element
		WebElement courses = driver.findElement(By.xpath("/html//div[@id='main-header-top-greens']//div[@title='Courses']"));
		a.moveToElement(courses).perform();
		
		//Move to 2nd Target web element
		WebElement selenium = driver.findElement(By.xpath("//div[@id='browse_courses-greens']/ul[@class='dropdown-menu-list']//span[.='Software Testing (12)']"));
		a.moveToElement(selenium).perform();
		
		//click 3rd target web element
		WebElement training = driver.findElement(By.xpath("//div[@id='browse_courses-greens']/ul[@class='dropdown-menu-list']/li[7]/div[2]/ul[@class='browse-sub-menu-custom']//span[.='Selenium Certification Training']"));
		training.click();
		
		
	}
	
	
	
	
}
