package GitHubPages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage {

    private static By loginField = By.xpath("//input[@id='login_field']");
    private static By passwordField = By.xpath("//input[@id='password']");
    private static By signInWithYourCreeds = By.xpath("//input[@value='Sign in']");

    public void enterLogin(String login) {
        driver.findElement(loginField).click();
        driver.findElement(loginField).sendKeys(login);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).click();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void logInToAccount() {
        driver.findElement(signInWithYourCreeds).click();
    }

}
