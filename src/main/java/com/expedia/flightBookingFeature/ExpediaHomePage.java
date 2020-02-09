package com.expedia.flightBookingFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpediaHomePage 
{
	private WebDriver driver;
	public ExpediaHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public static WebDriverWait wait;
	public void launchURL(String url)
	{
		driver.get(url);
		wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@id='header-logo']")));
	}
	public void searchHotel(Hotel hotelObj)
	{
		wait=new WebDriverWait(driver, 10);
		By gointo=By.xpath("//input[@id='hotel-destination-hp-hotel']");
		By checkin=By.xpath("//input[@id='hotel-checkin-hp-hotel']");
		By checkout=By.xpath("//input[@id='hotel-checkout-hp-hotel']");
		By noOfTrav=By.xpath("(//button[@data-gcw-component='gcw-traveler-amount-select'])[3]");
		By nofAdults=By.xpath("(//button[@class='uitk-step-input-button uitk-step-input-plus']//span[@data-control='uitk-icon'])[7]");
		By noOfChild=By.xpath("(//button[@class='uitk-step-input-button uitk-step-input-plus']//span[@data-control='uitk-icon'])[8]");
		By search=By.xpath("//button[@data-gcw-change-submit-text='Search']");
		driver.findElement(gointo).sendKeys(hotelObj.getGointo());
		driver.findElement(checkin).sendKeys(hotelObj.getCheckinDate());
		driver.findElement(checkout).sendKeys(hotelObj.getCheckOutDate());
		driver.findElement(noOfTrav).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(nofAdults));
		if(hotelObj.getNoofTravAdults()>2)
		{
			for(int i=0;i<hotelObj.getNoofTravAdults()-2;i++)
			{
				driver.findElement(nofAdults).click();
			}
			
		}
		for(int i=0;i<hotelObj.getNoofTravchildren();i++)
		{
			driver.findElement(noOfChild).click();
		}
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//select[@class='gcw-storeable gcw-toggles-field-by-value gcw-child-age-select'])[1]")));
		Select selchild=new Select(driver.findElement(By.xpath("(//select[@class='gcw-storeable gcw-toggles-field-by-value gcw-child-age-select'])[1]")));
		selchild.selectByVisibleText("5");
		driver.findElement(search).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//span[@class='uitk-button-container'])[7]")));
	}

}
