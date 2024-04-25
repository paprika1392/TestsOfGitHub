package GitHubPages;

import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StartPage extends BasePage {

    private final By signInButton = By.xpath("//div[contains(@class,'mr-lg-3')]//a[@href='/login']");

    public void clickToSignInButton() {
        Browser.getWebdriverWait().until(ExpectedConditions.elementToBeClickable(signInButton));
        driver.findElement(signInButton).click();
    }


}
