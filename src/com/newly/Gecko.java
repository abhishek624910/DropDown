package com.newly;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gecko 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="../DropDown/Driver/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.className("buttonLargeBlue")).click();
		
		driver.findElement(By.id("i0116")).sendKeys("coolsunabhi@live.com",Keys.ENTER);
		
		driver.findElement(By.id("i0118")).sendKeys("Sbpl_624910",Keys.ENTER);
		Thread.sleep(2000);
		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("document.getElementById('idSIButton9').click", "");
		
	}

}
