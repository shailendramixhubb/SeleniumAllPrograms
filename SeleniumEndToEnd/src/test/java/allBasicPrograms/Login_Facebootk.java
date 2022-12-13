package allBasicPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Facebootk {
	
	
	public static void text(String locators,String value)
	{
		driver.findElement(By.xpath(locators)).sendKeys(value);
	}
	public static void link_btn(String locators)
	{
		driver.findElement(By.xpath(locators)).click();
	}
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		text("//input[@name='email']", "himanshu@mixhubb.com");
		text("//input[@name='pass']", "Password@123");
		link_btn("//button[@name='login']");
		
		

		Thread.sleep(10000);
		driver.close();

	}

}
