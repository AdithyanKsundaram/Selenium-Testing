package com.sample;


import java.io.File;

import org.base.BaseClass;

public class Sample extends BaseClass  {
	public static void main(String[] args) throws InterruptedException {
		
		
	 browseLaunch();
	 LaunchUrl("http://www.adactin.com/HotelApp/");
	 maxWindow();
	 
	 POJO l=new POJO();
	 
	 passTxt(l.getUserName(), "Adithyanslm");
	 passTxt(l.getPassword(), "RKNBM6");
	 clickBtn(l.getLoginButton());
	 
	 sleep();
	 
	dropDownSelectByValue(l.getLocation(), "Sydney");
	dropDownSelectByValue(l.getHotels(), "Hotel Creek");
	dropDownSelectByValue(l.getRoomType(),"Deluxe");
	dropDownSelectByValue(l.getNoOfRooms(), "1 - One");
	clickBtn(l.getSubmit());
	
	clickBtn(l.getRadiobutton_0());
	clickBtn(l.getCntnue());
	 
	 passTxt(l.getFirstName(), "DannY");
	 passTxt(l.getLastName(), "Dan");
	 passTxt(l.getAddress(), "Adelaid");
	 passTxt(l.getCreditCardNo(), "1478523697894561");
	 dropDownSelectByValue(l.getCreditCardType(),"VISA");
	 dropDownSelectByValue(l.getCreditCardEXpMonth(), "August");
	 dropDownSelectByValue(l.getCreditCardEXpYear(), "2022");
	 passTxt(l.getCreditCardCVV(), "123");
	 
	 clickBtn(l.getBookNow());
	 
	 sleep();
	 
	 getText(l.getOrderNo(), "value");
	
	 File f=new File("C:\\Users\\adith\\Desktop");
	 
	 
	 
	}
	
	
	
	
	
	
	
}
