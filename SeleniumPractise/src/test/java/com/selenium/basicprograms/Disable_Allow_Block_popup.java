package com.selenium.basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Disable_Allow_Block_popup {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
	      //disable notification parameter
	      op.addArguments("--disable-notifications");
		driver=new ChromeDriver(op);
		
		
	     
	      
	      
	      
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("himanshu@mixhubb.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(5000);
		
		 
		
		
		

		Thread.sleep(5000);
	//	driver.close();

	}

}
