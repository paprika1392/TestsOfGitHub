package GitHubPages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By signInButton = By.xpath("//div[@class='flex-1']/a[@href='/login']");

    public void clickToSignInButton() {
        driver.findElement(signInButton).click();
    }


}
