package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import wrappers.*;

import java.time.Duration;

public class AccountTest extends BaseTest {

    @Test
    public void createAccount() {
        accountPage.open();
        loginPage.login("drak@tms.sandbox", "Password01!!");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        accountPage.openAccount();
        new Input(driver, "Account Name").write("Dmitry " + System.currentTimeMillis());
        new Picklist(driver, "Rating").select("Hot");
        new Input(driver, "Phone").write("375447651234");
        //new LookUp(driver, "Parent Account").write("TMS");
        new Input(driver, "Fax").write("7576466");
        new Input(driver, "Account Number").write("123467890");
        new Input(driver, "Website").write("https://dictionary.cambridge.org/ru/");
        new Input(driver, "Account Site").write("https://dictionary.cambridge.org/ru/");
        new Input(driver, "Ticker Symbol").write("AAPL");
        new Input(driver, "Employees").write("Engineer");
        new Picklist(driver, "Industry").select("Agriculture");
        new Input(driver, "Annual Revenue").write("100000");
        new Input(driver, "SIC Code").write("6021");
        new TextArea(driver,"Billing Street").write("Savicha 15");
        new TextArea(driver,"Shipping Street").write("Nezavisimosti 95");
        new Input(driver, "Billing City").write("Minsk");
        new Input(driver, "Billing State/Province").write("Minsk district");
        new Input(driver, "Billing Zip/Postal Code").write("225016");
        new Input(driver, "Billing Country").write("Belarus");
        new Input(driver, "Shipping City").write("Pinsk");
        new Input(driver, "Shipping Zip/Postal Code").write("220018");
        new Input(driver, "Shipping State/Province").write("Brest district");
        new Input(driver, "Shipping Country").write("Hungary");
        new Input(driver, "SLA Serial Number").write("65748");
        new Picklist(driver, "Customer Priority").select("Low");
        new Picklist(driver, "SLA").select("Gold");
        new Date(driver, "SLA Expiration Date").write("01/01/2023");
        new Input(driver, "Number of Locations").write("6");
        new Picklist(driver, "Active").select("No");
        new Picklist(driver, "Upsell Opportunity").select("Yes");
        new TextArea(driver,"Description").write("Blablabla");
        new MultiSelect(driver, "Yes").select("Move selection to Chosen");
        new MultiSelect(driver, "Yes").select("Move selection to Available");
        accountPage.saveEdit();
    }

    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title=New]")));
    // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
}
