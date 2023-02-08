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

public class IRCTC_CaptchaRead {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, TesseractException, Exception {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@aria-label='Click here to Login in application']")).click();
		
		Thread.sleep(5000);
		File src= driver.findElement(By.xpath("//div[@class='captcha_div']")).getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+"/screenshot/captcha.png";
		
		FileHandler.copy(src, new File(path));
		
		System.out.println(path);
		
		ITesseract image= new Tesseract();
	String imagetext=	image.doOCR(new File(path));
		
		System.out.println(imagetext);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
	}

}
