/**
 * 
 */
package com.selenium.basicprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Shailendra
 *
 */
public class GetAllLinks {
public static  WebDriver driver;
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.mixhubb.com/dashboard");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shailendra@mixhubb.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"kt_login_signin_form\"]/div[1]/input")).sendKeys("Testing1@3");
		driver.findElement(By.xpath("//body/div[@id='root']/div[@class='d-flex flex-column flex-root']/div[@class='d-flex flex-column flex-row-fluid position-relative p-7 overflow-hidden']/div[@class='flex-column-fluid flex-center mt-30 mt-lg-0']/div[@class='RegisteruserPt']/div[@class='row']/div[1]/div[1]/form[1]/div[2]")).click();
		
		
		Thread.sleep(5000);
		List<WebElement>alllinks=driver.findElements(By.tagName("a"));
		for(WebElement lenks:alllinks) {
			
			System.out.println(lenks.getText()+" "+lenks.getAttribute("href"));
		}
		
		
		
	}
}
