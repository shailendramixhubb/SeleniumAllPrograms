/**
 * 
 */
package com.selenium.basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Shailendra
 *
 */

public class NavigationCommand {
	public static  WebDriver driver;
	public static void main(String[] args) throws Exception{
		 
	
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		ChromeOptions cp = new ChromeOptions();
	cp.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		driver.manage().window().maximize();
		
		driver.get("https://www.mixhubb.com");
		
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		}

}
