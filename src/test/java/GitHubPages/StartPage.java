package GitHubPages;

import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StartPage extends BasePage {

    private final By signInButton = By.xpath("//a[contains(@class,'HeaderMenu-link') and @href='/login']");

    public void clickToSignInButton() {
        Browser.getWebdriverWait().until(ExpectedConditions.elementToBeClickable(signInButton));
        driver.findElement(signInButton).click();
    }


}
