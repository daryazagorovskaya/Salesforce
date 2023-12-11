package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage {

    final String CONTACT_URL = "https://tms41-dev-ed.lightning.force.com/lightning/o/Contact/list?filterName=Recent";
    private final By SAVE_NEW = By.xpath("//*[@name='SaveAndNew']");


    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public void openContact () {
        driver.get(CONTACT_URL);
    }

    public void newContact () {
        driver.get("https://tms41-dev-ed.lightning.force.com/lightning/o/Contact/" +
                "new?count=3&nooverride=1&useRecordTypeCheck=1&navigationLocation=LIST_VIEW&uid=170214575917387449");
    }

    public void saveNew () {
        driver.findElement(SAVE_NEW).click();
    }
}
