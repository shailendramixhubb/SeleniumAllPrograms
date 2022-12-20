package com.selenium.basicprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement_ANd_FindElement {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box/");
		
		List<WebElement> allinputelement=driver.findElements(By.tagName("input"));
		
		if(allinputelement.size()!=0) {
			
			System.out.println(allinputelement.size()+"Elements found by TagName as input \\n");
			
			for(WebElement inputElement:allinputelement) {
				
				System.out.println(inputElement.getAttribute("Placeholder"));
			}
		}
	}

}
