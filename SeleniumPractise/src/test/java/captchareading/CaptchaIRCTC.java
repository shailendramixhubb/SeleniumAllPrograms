package captchareading;

import java.io.File;
import org.openqa.selenium.WebDriver;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class CaptchaIRCTC {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
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
