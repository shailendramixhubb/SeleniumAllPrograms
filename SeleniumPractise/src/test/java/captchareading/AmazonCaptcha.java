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
public class AmazonCaptcha {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		  
    	WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		for(int i=0;i<=1000;i++) {
		driver.get("https://www.walmart.com/");
	
		driver.navigate().refresh();
		Thread.sleep(5000);
		System.out.println(i);
		}
		
		
		
		

	}

}
