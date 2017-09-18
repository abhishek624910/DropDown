package com.dd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		WebElement day=driver.findElement(By.id("day"));
		
		Select sc=new Select(day);
		
		//sc.selectByVisibleText("9");
		boolean status=sc.isMultiple();
		if(status==true)
		{
			System.out.println("it is multiple");
		}
		else 
		{
			System.out.println("it is not multiple");
		}
		
		/*WebElement month=driver.findElement(By.id("month"));
		Select sct=new Select(month);
		sct.selectByValue("2");
		
		WebElement year=driver.findElement(By.id("year"));
		Select scte=new Select(year);
		scte.selectByValue("2004");*/
		
		
	}

}
