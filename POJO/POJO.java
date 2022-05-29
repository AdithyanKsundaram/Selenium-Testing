package com.sample;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POJO extends BaseClass {
	
	public POJO() {
		PageFactory.initElements(driver, this);
		
	}
	//login page
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginButton;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Destination  page
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(xpath="/html//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="/html//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement noOfRooms;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(name="continue")
	private WebElement cntnue;

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getCntnue() {
		return cntnue;
	}
	//Payment Page
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement creditCardNo;
	
	@FindBy(name="cc_type")
	private WebElement creditCardType;
	
	@FindBy(name="cc_exp_month")
	private WebElement creditCardEXpMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement creditCardEXpYear;
	
	@FindBy(name="cc_cvv")
	private WebElement creditCardCVV;
	
	@FindBy(name="book_now")
	private WebElement bookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getCreditCardEXpMonth() {
		return creditCardEXpMonth;
	}

	public WebElement getCreditCardEXpYear() {
		return creditCardEXpYear;
	}

	public WebElement getCreditCardCVV() {
		return creditCardCVV;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
		
	@FindBy(xpath="/html//input[@id='order_no']")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	
		
	}


