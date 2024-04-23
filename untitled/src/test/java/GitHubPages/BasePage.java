package GitHubPages;

import Utils.Browser;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;                    //singleton

    public BasePage() {                         //singleton
        driver = Browser.getDriver();
    }
}
