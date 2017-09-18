package com.newly;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Prgm1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://facebook.com");
		
		WebElement month=driver.findElement(By.id("month"));
		
		Select sc1=new Select(month);
		
		//boolean status=sc1.isMultiple();
		List<WebElement> months =sc1.getOptions();
		for(int i=0;i<months.size();i++){
			String s=months.get(i).getText();
			for(int j=0;j<months.size();j++){
				String s1=months.get(j).getText();
				if(s.equals(s1))
				{
					System.out.println("It is duplicate");
					break;
				}
				else 
				{
					System.out.println("It is not duplicate");
					break;
				}
				
			}
		}
		
		
		 
		
		
	}

}
