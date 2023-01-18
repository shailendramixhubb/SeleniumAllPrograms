package mixhubbprograms;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.ITestResult;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;


import io.github.bonigarcia.wdm.WebDriverManager;

public class EmailSend {
	
	public static WebDriver driver;
	
	public static void text(String locater, String value) {
		driver.findElement(By.xpath(locater)).sendKeys(value);

	}

	public static void link_btn(String locater) {
		driver.findElement(By.xpath(locater)).click();

	}
	
	
	@Test
	
	public void mixhubb() throws Exception{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.mixhubb.com/registration");
		text("//input[@name='email']", "shailendra@mixhubb.com");
		link_btn("//button[@type='submit']");
		Thread.sleep(5000);
		text("//input[@name='password']", "Testing1@3");
		link_btn("//button[@type='submit']");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//div[@class='col-md-12']//div[1]//div[2]//div[1]//div[1]//div[2]//a[1]")).isDisplayed()){     
	        driver.findElement(By.xpath("//div[@class='col-md-12']//div[1]//div[2]//div[1]//div[1]//div[2]//a[1]")).click();   
	        System.out.println("clicked");
	        
	        link_btn("//span[normalize-space()='Speakers']");
	    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       
	        
	        Thread.sleep(5000);
	        
	        
	        for(int i=0;i<=100;i++) {
	        	 link_btn("//tbody/tr/td[4]/div[1]");
	    	String myWindowHandle = driver.getWindowHandle();
			driver.switchTo().window(myWindowHandle);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//String text=driver.findElement(By.xpath("//h4[contains(text(),'Please confirm if you want to send an email to spe')]")).getText();
			//System.out.println(i+"  "+text);
			WebElement ele=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text btn CommonGtBtn p-2 pl-10 pr-10']"));
			ele.click();
			
			String toaster=driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[1]/div[1]/div[1]")).getText();
			System.out.println(i+" "+"Toaster message is  "+" "+toaster);
			Thread.sleep(5000);
	        }
		}
		
		
		
		
	}
	
	@AfterMethod//AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result){
	
		
		if(ITestResult.FAILURE==result.getStatus()){
			System.out.println("here 1");
			try{
				System.out.println("here 2");
				TakesScreenshot screenshot=(TakesScreenshot)driver;
				System.out.println("here 3");
				@SuppressWarnings("unused")
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				
				
				
				File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				System.out.println("here 4");
				FileUtils.copyFile(file, new File("D:\\Headless\\headless_screenshot.png"));
				System.out.println("Successfully captured a screenshot");
			
				EmailAttachment attachment = new EmailAttachment();
				  attachment.setPath("D:\\Headless\\headless_screenshot.png");
				  attachment.setDisposition(EmailAttachment.ATTACHMENT);
				  attachment.setDescription("Error");
				  attachment.setName("ErrorImage");
				  attachment.getURL();
			
				  // Create the email message
				  MultiPartEmail email = new MultiPartEmail();
				  email.setHostName("smtp.gmail.com");
					email.setSmtpPort(465);
					email.setAuthenticator(new DefaultAuthenticator("shailendra@mixhubb.com", "Testing1@3"));
					email.setSSLOnConnect(true);
					email.setFrom("shailendra@mixhubb.com");
					email.setSubject("Error in Sites");
					email.setMsg("Website Error");
					email.addTo("shailendra@mixhubb.com");
				  email.attach(attachment);
				  email.send();
				 System.out.println("Mail sent succesfully");
			}
			
			catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
	}
		driver.quit();
	}
	/*
	 * @AfterMethod public static void captureScreenMethod() throws Exception{
	 * 
	 * 
	 * 
	 * System.out.println("=====================Test Started==================");
	 * 
	 * Email email = new SimpleEmail(); email.setHostName("smtp.googlemail.com");
	 * email.setSmtpPort(465);
	 * 
	 * email.setAuthenticator(new DefaultAuthenticator("shailendra@mixhubb.com",
	 * "Testing1@3")); email.setSSLOnConnect(true);
	 * email.setFrom("shailendra@mixhubb.com"); email.setSubject("TestMail");
	 * email.setMsg("This is a test mail ... :-)");
	 * email.addTo("shailendra@mixhubb.com"); email.send();
	 * 
	 * System.out.println("=====================Email Send=================="); }
	 */
}
