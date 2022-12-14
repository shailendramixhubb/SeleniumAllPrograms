package captchareading;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I_AM_NOT_ROBOT_Captcha {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://recaptcha-demo.appspot.com/recaptcha-v2-checkbox.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@name=\"ex-a\"]")).sendKeys("Testing");
		driver.findElement(By.xpath("//*[@name=\"ex-b\"]")).sendKeys("Testing");
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();		
		WebElement str=driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]"));
		System.out.println(str);
		str.click();
		
	}

}
