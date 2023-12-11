package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    final private By PLAYER_ICON = By.xpath("//*[@class='uiImage']/img[@class='icon noicon']");
    MainPage(WebDriver driver) {
        super(driver);
    }

    public void isPageOpened(){
        waitForPageLoaded();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PLAYER_ICON));
    }
}
