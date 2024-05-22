package GitHubPages;

import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private static By homeTitle = By.xpath("//h2[text()='Home']");
    private static By userAccountMenu = By.xpath("//button[@aria-label='Open user account menu']");
    private static By userName = By.xpath("//div[@class='Overlay-headerContentWrap']//span[@class='Truncate-text']");

    public void waitUntilHomePageIsLoaded() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(homeTitle));
    }

    public void findUserAccountMenuButton() {
        WebElement element = driver.findElement(userAccountMenu);
    //    boolean result = element.isDisplayed();
     //   Assert.assertTrue(result, "User's account menu is not available");
    }

    public void clickUserAccountMenu() {
        driver.findElement(userAccountMenu).click();
    }

    public String getUserName() {
        String user = driver.findElement(userName).getText();
        return user;
    }
}
