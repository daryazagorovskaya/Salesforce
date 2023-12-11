package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultiSelect {

    WebDriver driver;
    String label;

    public MultiSelect(WebDriver driver, String label) {
        this.label = label;
        this.driver = driver;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format("//div[@data-value='%s']/ancestor::li[@class='slds-listbox__item']", label))).click();
        driver.findElement(By.xpath(String.format("//button[@title='%s']/ancestor::lightning-button-icon", option))).click();
    }
}



/*
    final private By MULTI_SELECT = By.xpath("//*[text()='Multiselect']/ancestor::lightning-dual-listbox");
    final private By CHOSEN_BUTTON = By.xpath("//button[@title='Move selection to Chosen']");
    final private By AVAILABLE_BUTTON = By.xpath("//button[@title='Move selection to Available']");
    WebDriver driver;
    String label;

    public MultiSelect(WebDriver driver) {
        this.driver = driver;
    }

    public void addOption() {
        driver.findElement(MULTI_SELECT).click();
        driver.findElement(CHOSEN_BUTTON).click();
    }
    public void deleteOption() {
        driver.findElement(MULTI_SELECT).click();
        driver.findElement(AVAILABLE_BUTTON).click();
    }
}
*/