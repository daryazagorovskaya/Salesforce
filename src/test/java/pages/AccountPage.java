package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.Input;
import wrappers.InputHelper;

public class AccountPage extends BasePage {

    final String BASE_URL = "https://tms41-dev-ed.my.salesforce.com/";
    final String ACCOUNT_URL = "https://tms41-dev-ed.lightning.force.com/lightning/o/Account/new";

    private final By SAVE_EDIT = By.xpath("//*[@name='SaveEdit']");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void createAccount(String name, String number, String phone) {
        write("Account Name", name);
        write("Account Number", number);
        write("Phone", phone);

        InputHelper.write(driver, "Account Name", name);
        InputHelper.write(driver, "Account Number", number);
        InputHelper.write(driver, "Phone", phone);

        new Input(driver, "Account Name").write(name);
        new Input(driver, "Account Number").write(number);
        new Input(driver, "Phone").write(phone);
    }

    public void open() {
        driver.get(BASE_URL);
    }
    public void openAccount() {
        driver.get(ACCOUNT_URL);
    }

    public void saveEdit () {
        driver.findElement(SAVE_EDIT).click();
    }

}
