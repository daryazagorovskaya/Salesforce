package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Picklist {

    WebDriver driver;
    String label;

       public Picklist(WebDriver driver, String label) {
            this.driver = driver;
            this.label = label;
        }
    public void select(String option) {
            driver.findElement(By.xpath(String.format("//*[text()='%s']/ancestor::lightning-picklist//button", label))).click();
            driver.findElement(By.xpath(String.format("//lightning-base-combobox-item//span[text()='%s']", option))).click();
        }
    }

