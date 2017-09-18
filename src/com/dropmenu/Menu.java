package com.dropmenu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Menu 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver =new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://jqueryui.com/droppable/");
		
		Actions act=new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement src=driver.findElement(By.id("draggable"));
		Thread.sleep(1000);
	    WebElement des=driver.findElement(By.id("droppable"));
	    Thread.sleep(1000);
	    act.dragAndDrop(src, des).perform();
	    driver.switchTo().defaultContent();
		
	}

}
