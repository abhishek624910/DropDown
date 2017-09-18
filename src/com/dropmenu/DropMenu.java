package com.dropmenu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropMenu 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in");
		
	    WebElement loyalityPrgm=driver.findElement(By.xpath("//a[@id='irctc_sbi_co_brand']"));
	    
	    Actions act=new Actions(driver);
	    act.moveToElement(loyalityPrgm).perform();

	}
	    

}
