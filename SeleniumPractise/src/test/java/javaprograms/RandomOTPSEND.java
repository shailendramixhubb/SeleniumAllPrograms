package javaprograms;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomOTPSEND {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String userAgent =  (String)js.executeScript("return navigator.userAgent;");
		
		System.out.println(userAgent);



		driver.manage().window().maximize();
		
		driver.get("https://staging-app.mixhubb.com/logout");
		//driver.get("https://app.mixhubb.com/registration");
		//driver.get("http://172.16.20.126:3005");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shailendra@mixhubb.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		for(int i=0;i<=1000;i++) {
			/*
			 * String numbers = "0123456789";
			 */		Random rand = new Random();
		int otp = rand.nextInt(1000000); // Generate a random integer between 0 and 9999
		String otpStr = String.format("%06d", otp); // Convert the integer to a string and pad it with leading zeros
		//System.out.println(otpStr);

		WebElement textBox = driver.findElement(By.xpath("//input[@aria-label='Please enter verification code. Character 1']")); // Locate the text box element
		 // Send the OTP to the text box
		Thread.sleep(2000);
		// Get otp button click
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		// send otp in textbpx
		textBox.sendKeys(otpStr);
		System.out.println(otpStr);
		// Validate button click
		WebElement validate =driver.findElement(By.xpath("//*[@id=\"kt_login_signin_form\"]/div[3]/button"));
		validate.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		
		 		
		}


	}

}
