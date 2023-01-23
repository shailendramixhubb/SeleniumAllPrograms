/**
 * 
 */
package captchareading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Shailendra
 *
 */
public class CaptchaCheckbox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://advertisinghelp.walmart.com/s/captcha");
		
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath("//*[@class=\"recaptcha-checkbox-border\"]")).click();
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getClass());
		
	}

}
