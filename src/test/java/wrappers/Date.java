package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Date {

    final private By DATE_PICKER = By.xpath("//*[text()='SLA Expiration Date']/ancestor::lightning-input//input");

    WebDriver driver;
    String label;

    public Date(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format("//*[text()='%s']/ancestor::lightning-input//input", label))).click();
        driver.findElement(By.xpath(String.format("//*[text()='%s']/ancestor::lightning-input//input", label))).sendKeys(text);
    }
}

