package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LookUp {

    final private By PARENT_ACCOUNT = By.xpath("//*[text()='Parent Account']/ancestor::lightning-grouped-combobox//input");
    WebDriver driver;
    String label;

    public LookUp(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

         public void write(String text) {
        WebElement parentAccount = driver.findElement(PARENT_ACCOUNT);
        parentAccount.click();
                  new WebDriverWait(driver, Duration.ofSeconds(50)).until(
                       ExpectedConditions.elementToBeClickable(
                               By.xpath(String.format("//lightning-base-combobox//div//input[contains(text(),'%s')]", label))));
                  parentAccount.sendKeys(text);
         }
}
