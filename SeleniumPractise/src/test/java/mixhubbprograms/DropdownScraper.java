package mixhubbprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileWriter;
import java.io.IOException;

public class DropdownScraper {
	public static WebDriver driver;
    public static void main(String[] args) throws IOException {
        // Set up Chrome driver
    	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

        // Navigate to page with drop-down menus
        driver.get("https://www.nagolfgroup.com/nagg-registration/");

        // Create a new file to store the data
        FileWriter writer = new FileWriter("D:\\countrystatecityData\\dropdown_data.csv");

        // Write the header row
        writer.append("Dropdown 1,Dropdown 2,Dropdown 3\n");

        // Select elements from each drop-down menu
        Select dropdown1 = new Select(driver.findElement(By.id("nagg_select_country")));
        Select dropdown2 = new Select(driver.findElement(By.id("nagg_select_state")));
        Select dropdown3 = new Select(driver.findElement(By.id("nagg_select_city")));

        // Iterate through each option in each drop-down menu
        for (WebElement option1 : dropdown1.getOptions()) {
            for (WebElement option2 : dropdown2.getOptions()) {
                for (WebElement option3 : dropdown3.getOptions()) {
                    // Select the current option in each drop-down menu
                    dropdown1.selectByVisibleText(option1.getText());
                    dropdown2.selectByVisibleText(option2.getText());
                    dropdown3.selectByVisibleText(option3.getText());

                    // Write the current option values to the file
                    writer.append(option1.getText() + "," + option2.getText() + "," + option3.getText() + "\n");
                }
            }
        }

        // Close the writer and the driver
        writer.close();
        driver.close();
    }
}
