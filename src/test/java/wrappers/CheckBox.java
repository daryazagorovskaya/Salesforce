package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    WebDriver driver;
    String label;

    public CheckBox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select() {
        driver.findElement(By.xpath(String.format("//*[@name='BVT_check__c']/ancestor::lightning-primitive-input-checkbox//input", label)))
                .click();
    }

}
