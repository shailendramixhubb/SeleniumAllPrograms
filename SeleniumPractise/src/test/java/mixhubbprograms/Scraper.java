package mixhubbprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class Scraper {
    public static void main(String[] args) {
        
    	WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

        
        driver.get("https://www.nagolfgroup.com/nagg-registration/");

        // Find the country drop-down menu and select an option
        WebElement countrySelect = driver.findElement(By.xpath("//select[@id='nagg_select_country']"));
        countrySelect.findElement(By.xpath("//*[@id=\"nagg_select_country\"]/option[229]")).click();
        
        System.out.println("Selected country: " + countrySelect.getAttribute("value"));

        // Find the state drop-down menu and select an option
        WebElement stateSelect = driver.findElement(By.xpath("//select[@id='nagg_select_state']"));
        stateSelect.findElement(By.xpath("//*[@id=\"nagg_select_state\"]/option[6]")).click();
        
     

        // Find the city drop-down menu and select an option
        WebElement citySelect = driver.findElement(By.xpath("//select[@id='nagg_select_city']"));
        citySelect.findElement(By.xpath("//option[contains(text(),'Los Angeles')]")).click();

        // Print the selected options
      
        System.out.println("Selected state: " + stateSelect.getAttribute("value"));
        System.out.println("Selected city: " + citySelect.getAttribute("value"));

        // Close the browser
        driver.quit();
    }
}
