package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public abstract class BasePage {
        WebDriverWait wait;

        WebDriver driver;

        BasePage(WebDriver driver) {
            this.driver = driver;
            wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        }

        void write(String label, String text) {
            driver.findElement(By.xpath(String.format("//*[text()='%s']/ancestor::lightning-input//input", label)))
                    .sendKeys(text);
        }

        protected void waitForPageLoaded() {
            new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                }
            };
        }
    }


