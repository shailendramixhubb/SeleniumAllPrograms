package captchareading;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class EcommerceCaptcha {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, TesseractException, Exception {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://202.157.76.21:4304/web/contact");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[@aria-label='Click here to Login in application']")).click();
		
		Thread.sleep(5000);
		File src= driver.findElement(By.xpath("//img[@title='Update Code']")).getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+"/screenshot/captcha.png";
		FileHandler.copy(src, new File(path));
		
		ITesseract image= new Tesseract();
	String imagetext=	image.doOCR(new File(path));
		
		System.out.println(imagetext);
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
