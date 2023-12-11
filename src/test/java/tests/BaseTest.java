package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.AccountPage;
import pages.ContactPage;
import pages.LoginPage;
import wrappers.Input;

import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {
    WebDriver driver;
    AccountPage accountPage;
    LoginPage loginPage;
    ContactPage contactPage;

    @Parameters({"browser"})
    @BeforeMethod(description = "Browser settings")
    public void setup(@Optional("chrome") String browser, ITestContext testContext) {
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            //options.addArguments("headless");
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
        } else if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--start-maximized");
            driver = new FirefoxDriver();
        }
        testContext.setAttribute("driver", driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        accountPage = new AccountPage(driver);
        contactPage = new ContactPage(driver);
        loginPage = new LoginPage(driver);

    }

    @AfterMethod(alwaysRun = true, description = "Closing the browser")
    public void tearDown(){
        driver.quit();
    }
}


