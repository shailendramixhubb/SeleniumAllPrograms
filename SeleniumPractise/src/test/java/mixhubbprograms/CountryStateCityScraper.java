package mixhubbprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class CountryStateCityScraper {
  public static void main(String[] args) {
    // Set the path to the ChromeDriver executable
	  WebDriverManager.chromedriver().setup();
		

    // Create a new ChromeDriver
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    // Navigate to the page with the drop-down menus
    driver.get("https://www.nagolfgroup.com/nagg-registration/");

    // Find the element for the country drop-down menu
    WebElement countryElement = driver.findElement(By.id("nagg_select_country"));

    // Create a Select object for the country drop-down menu
    Select countrySelect = new Select(countryElement);

    // Get the options available in the country drop-down menu
    List<WebElement> countryOptions = countrySelect.getOptions();

    // Iterate through the options and print their text
    for (WebElement option : countryOptions) {
      System.out.println(option.getText());
    }

    // Select the desired country in the country drop-down menu
    countrySelect.selectByVisibleText("United States");

    // Find the elements for the state and city drop-down menus
    WebElement stateElement = driver.findElement(By.xpath("//select[@id='nagg_select_state']"));
    WebElement cityElement = driver.findElement(By.xpath("//select[@id='nagg_select_city']"));

    // Create Select objects for the state and city drop-down menus
    Select stateSelect = new Select(stateElement);
    Select citySelect = new Select(cityElement);

    // Get the options available in the state and city drop-down menus
    List<WebElement> stateOptions = stateSelect.getOptions();
    List<WebElement> cityOptions = citySelect.getOptions();

    // Iterate through the options and print their text
    for (WebElement option : stateOptions) {
      System.out.println(option.getText());
    }

    for (WebElement option : cityOptions) {
      System.out.println(option.getText());
    }

    // Close the driver
    driver.close();
  }
}
