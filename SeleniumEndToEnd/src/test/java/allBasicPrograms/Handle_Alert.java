package allBasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Handle_Alert {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("himanshu@mixhubb.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
