package com.selenium.basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alert {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		ChromeOptions op = new ChromeOptions();
	      //disable notification parameter
	      op.addArguments("--disable-notifications");
	      // configure options parameter to Chrome driver
	      WebDriver driver = new ChromeDriver(op);
	      
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("himanshu@mixhubb.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
