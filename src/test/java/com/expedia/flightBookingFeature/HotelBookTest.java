package com.expedia.flightBookingFeature;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class HotelBookTest 
{
	WebDriver driver;
	ExpediaHomePage expObj;
	Hotel hobj;
  @Test
  public void tobookHotelTest() 
  {
	  hobj.setGointo("New Delhi");
	  hobj.setCheckinDate("09/02/2020");
	  hobj.setCheckOutDate("10/02/2020");
	  hobj.setNoofTravAdults(2);
	  hobj.setNoofTravchildren(1);
	  
	  expObj.launchURL("https://www.expedia.co.in/");
	  expObj.searchHotel(hobj);
  }
  @BeforeClass
  public void beforeClass() 
  {
	  driver=new FirefoxDriver();
	  expObj=new ExpediaHomePage(driver);
	  hobj=new Hotel();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
