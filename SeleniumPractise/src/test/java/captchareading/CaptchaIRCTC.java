package captchareading;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CaptchaIRCTC {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		final Logger logger = LoggerFactory.getLogger(Main.class);

		
		ITesseract image=new Tesseract();
		try {
			String str=image.doOCR(new File("D:\\pasted.png"));
			
			// testlogger.info("Testing");
			
			System.out.println("Data from i mage is "+str);
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception "+e.getMessage());
		}
	}

}
