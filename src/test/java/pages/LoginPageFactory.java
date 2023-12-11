package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory extends BasePage {


   @FindBy(id="username")
   WebElement userNameInput;

    @FindBy(id="password")
    WebElement passwordInput;

    @FindBy(id="Login")
    WebElement loginButton;

   LoginPageFactory(WebDriver driver){
       super(driver);
       PageFactory.initElements(driver, this);
   }

   public LoginPageFactory open() {
       driver.get("https://tms41-dev-ed.my.salesforce.com/");
       return this;

   }

   public MainPage login (String user, String pass) {
       userNameInput.sendKeys(user);
       passwordInput.sendKeys(pass);
       loginButton.click();
       return new MainPage(driver);


   }
}
