package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import wrappers.*;

import java.time.Duration;

public class ContactTest extends BaseTest {
    @Test
    public void createAccount() {
        accountPage.open();
        loginPage.login("drak@tms.sandbox", "Password01!!");
        accountPage.openAccount();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        contactPage.newContact();
        new Input(driver, "Phone").write("375447651234");
        new Input(driver, "First Name").write("Darya");
        new Picklist(driver, "Salutation").select("Mr.");
        new Input(driver, "Last Name").write("Zagorovskaya");
        new Input(driver, "Home Phone").write("6466");
        new Input(driver, "Mobile").write("5647389");
        // account name
        new Input(driver, "Title").write("Product");
        new Input(driver, "Other Phone").write("2039847");
        new Input(driver, "Title").write("Product");
        new Input(driver, "Department").write("Technical");
        new Date(driver, "Birthdate").write("05/17/2000");
        new Input(driver, "Email").write("dzagorovskaya@mts.by");
        // lookup Reports To
        new Input(driver, "Assistant").write("Vladislav");
        new Input(driver, "Asst. Phone").write("203498");
        //new Input(driver, "mom's email").write("dzagorovskaya@gmail.com");
        //понимаю, что email падает из-за '%s', пока не нашла как пофиксить
        new CheckBox(driver, "BVT_check__c").select();
        new Picklist(driver, "Lead Source").select("Web");
        // check box
        // lookup lead
        new TextArea(driver, "Mailing Street").write("Chkalova 13");
        new TextArea(driver, "Other Street").write("Brovki 12");
        new Input(driver, "Mailing City").write("Brest");
        new Input(driver, "Mailing State/Province").write("China");
        new Input(driver, "Other City").write("Vena");
        new Input(driver, "Other State/Province").write("Japan");
        new Input(driver, "Mailing Zip/Postal Code").write("223002");
        new Input(driver, "Mailing Country").write("Germany");
        new Input(driver, "Other Zip/Postal Code").write("234006");
        new Input(driver, "Other Zip/Postal Code").write("234006");
        new Input(driver, "Other Country").write("Italy");
        new Input(driver, "Languages").write("Belorussian, English");
        new Picklist(driver, "Level").select("Primary");
        new TextArea(driver, "Description").write("Parapapam");
        new MultiSelect(driver, "No").select("Move selection to Chosen");
        new MultiSelect(driver, "No").select("Move selection to Available");
        contactPage.saveNew();
    }
}
