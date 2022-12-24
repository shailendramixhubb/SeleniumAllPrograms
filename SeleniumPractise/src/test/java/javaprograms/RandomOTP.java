package javaprograms;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RandomOTP {
	static char[] OTP(int len) {
		System.out.println("Generating OTP using random() : ");
		System.out.print("You OTP is : ");

		// Using numeric values
		String numbers = "0123456789";

		// Using random method
		Random rndm_method = new Random();

		char[] otp = new char[len];

		for (int i = 0; i < len; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int

[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
		}
		return otp;
		// return null;
	}

	public static void main(String[] args) throws Exception {
		int length = 6;
		char[] str = OTP(length);

		System.out.println(str);
		// System.out.println(OTP(length).toString());

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.mixhubb.com/registration");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shailendra@mixhubb.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//input[@aria-label='Please enter verification
		// code. Character 1']")).sendKeys(int);
	WebElement el=	driver.findElement(By.xpath("//input[@aria-label='Please enter verification code. Character 1']"));
		StringBuilder sb= new StringBuilder().append("");
		el.sendKeys(String.format("%6d",str));
		
		 new WebDriverWait(driver, 20) .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='Please enter verification code. Character 1']" ))).sendKeys(String.format("%6d",str));
		 
		// driver.findElement(By.xpath("")).sendKeys((""+length));

		/*
		 * JavascriptExecutor jse = ((JavascriptExecutor) driver);
		 * System.out.println(jse); WebElement email = driver.findElement(By.
		 * xpath("//input[@aria-label='Please enter verification code. Character 1']"));
		 * System.out.println(email); System.out.println(str); jse.executeScript("str",
		 * str);
		 */
		
	}
}
