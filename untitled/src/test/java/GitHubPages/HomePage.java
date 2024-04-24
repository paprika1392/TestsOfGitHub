package GitHubPages;

import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends BasePage {

    private static By homeTitle = By.xpath("//h2[@data-target='feed-container.feedTitle']");
    private static By userAccountMenu = By.xpath("//button[@aria-label='Open user account menu']");
    private static By userName = By.xpath("//div[@class='Overlay-headerContentWrap']//span[@class='Truncate-text']");

    public void waitUntilHomePageIsLoaded() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(homeTitle));

    }

    public void checkAccIsVisible() {
        WebElement element = driver.findElement(userAccountMenu);
        boolean result = element.isDisplayed();

        Assert.assertTrue(result, "User's account menu is not available");
    }

    public void checkCorrectLogIn(String login) {
        driver.findElement(userAccountMenu).click();
        String user = driver.findElement(userName).getText();
        boolean result = user.contains(login);

        Assert.assertEquals(result, String.format("This login is not correct: '%s'", login));

    }
}
