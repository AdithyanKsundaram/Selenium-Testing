package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public static void browseLaunch() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	// To launch url
	public static void LaunchUrl(String url) {
		driver.get(url);

	}
	//Maximize Windows
	public static void maxWindow() {
		driver.manage().window().maximize();

	}
	//To Pass Text
	public static void passTxt(WebElement targetWebelement, String text) {
		targetWebelement.sendKeys(text);
		
	}
	//To Click
	public static void clickBtn(WebElement ele) {
		ele.click();
		
	}
	//Drop Down Select
	public static void dropDownSelectByValue(WebElement target, String text) {	
		Select s=new Select(target);
		s.selectByIndex(0);
		s.selectByVisibleText(text);	
		
	}
	//Implicit Wait
	public static void sleep() throws InterruptedException {
		Thread.sleep(5000);

	}
	//To Get Attribute Value
	public static void getText(WebElement targetWebelement, String text) {
		String printTxt = targetWebelement.getAttribute(text);
		System.out.println(printTxt);
		
	}
	
	
	}





















