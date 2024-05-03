package Tests;

import Steps.Steps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public static void startWorkDriver() {
        Steps.startBrowserWork();
        Steps.clearCookies();
    }

    @AfterTest
    public static void finishWorkDriver() {
        Steps.quitBrowser();
    }
}
