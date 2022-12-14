package captchareading;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IAMNOTROBOT { 

public static void main(String[] args) { 

	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();

ChromeOptions options = new ChromeOptions();

options.addArguments("start-maximized");

options.addArguments("disable-infobars");

options.addArguments("--disable-extensions"); 

 driver = new ChromeDriver(options);

driver.get("https://recaptcha-demo.appspot.com/recaptcha-v2-checkbox.php"); 

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));

/*
 * new WebDriverWait(driver,
 * 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(
 * "//*[@id=\"rc-anchor-container\"]")));
 * 
 * new WebDriverWait(driver,
 * 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(
 * "div.recaptcha-checkbox-checkmark"))).click();
 */

String framename=driver.findElement(By.tagName("iframe")).getAttribute("name");
driver.switchTo().frame(framename);
driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
} 

}