package captchareading;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RotateIP {
  public static void main(String[] args) {
    Proxy proxy = new Proxy();
    proxy.setHttpProxy("1.2.3.4:2000");
    ChromeOptions options = new ChromeOptions();
    options.setCapability("proxy", proxy);
    WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("http://www.find-ip.net");
    
    //driver.quit();
  }
}