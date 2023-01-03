package mixhubbprograms;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmailSendMultiple {

	public static WebDriver driver;

	public static void text(String locater, String value) {
		driver.findElement(By.xpath(locater)).sendKeys(value);

	}

	public static void link_btn(String locater) {
		driver.findElement(By.xpath(locater)).click();

	}

	public String baseUrl = "https://staging-app.mixhubb.com/registration";

	@BeforeTest
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);

	}

	@Test
	public void login() throws Exception {

		// Logger logger=Logger.getLogger("LogDemo");
		// PropertyConfigurator.configure("Log4j.properties");
		text("//input[@name='email']", "shailendra@mixhubb.com");
		// logger.info("Enter Email");
		link_btn("//button[@type='submit']");
		Thread.sleep(5000);
		text("//input[@name='password']", "Testing1@3");
		link_btn("//button[@type='submit']");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (driver.findElement(By.xpath("//div[@class='col-md-12']//div[1]//div[2]//div[1]//div[1]//div[2]//a[1]"))
				.isDisplayed()) {
			driver.findElement(By.xpath("//div[@class='col-md-12']//div[1]//div[2]//div[1]//div[1]//div[2]//a[1]"))
					.click();
			System.out.println("clicked");

			link_btn("//span[contains(text(),'Email Template')]");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			Thread.sleep(5000);

			for (int i = 0; i <= 5; i++) {
				/*
				 * link_btn("//tbody/tr/td[4]/div[1]"); String myWindowHandle =
				 * driver.getWindowHandle(); driver.switchTo().window(myWindowHandle);
				 */
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				// String text=driver.findElement(By.xpath("//h4[contains(text(),'Please confirm
				// if you want to send an email to spe')]")).getText();
				// System.out.println(text);
				Actions act =  new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("//tbody/tr[4]/td[5]/div[2]/span[1]/button[1]/span[1]//*[name()='svg']//*[name()='g' and @id='push_icon']//*[name()='g' and @id='noun-button-click-691746']"))).click().perform();
				
				/*
				 * try { driver.findElement(By.
				 * xpath("//tbody/tr[4]/td[5]/div[2]/span[1]/button[1]/span[1]//*[name()='svg']//*[name()='g' and @id='push_icon']//*[name()='g' and @id='noun-button-click-691746']"
				 * )).click(); } catch (Exception e) { JavascriptExecutor executor =
				 * (JavascriptExecutor) driver; executor.executeScript("arguments[1].click();",
				 * driver.findElement(By.
				 * xpath("//tbody/tr[4]/td[5]/div[2]/span[1]/button[1]/span[1]//*[name()='svg']//*[name()='g' and @id='push_icon']//*[name()='g' and @id='noun-button-click-691746']"
				 * ))); }
				 */

				/*
				 * WebElement ele = driver.findElement(By.xpath(
				 * "//tbody/tr[4]/td[5]/div[2]/span[1]/button[1]/span[1]//*[name()='svg']//*[name()='g' and @id='push_icon']//*[name()='g' and @id='noun-button-click-691746']"
				 * )); ele.click(); Thread.sleep(5000);
				 */
					 
			}

		} else {
			link_btn("//*[@id=\"kt_header\"]/div/div[4]/div[1]/button/span[1]");
			Thread.sleep(3000);
			text("//*[@type=\"text\"]", "mixhubb testing boat for captcha");
			Thread.sleep(3000);
			text("//*[@id=\"mh_add_event_pane_1\"]/div[2]/div[2]/div[1]", "Description for captcha test by boating");
			Thread.sleep(3000);
			link_btn("//*[@id=\"mh_add_event_pane_1\"]/div[3]/div/div/button");
			Thread.sleep(3000);
			link_btn("//*[@id=\"kt_login_signin_submit\"]");
			Thread.sleep(3000);
			link_btn("//*[@id=\"mh_add_event_pane_3\"]/div[3]/div/button");

			Thread.sleep(3000);
			link_btn("//*[@id=\"mh_add_event_pane_4\"]/div/div/div/div[3]/div/div/button");
		}
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}