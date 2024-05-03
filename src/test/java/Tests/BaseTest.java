package Tests;

import Steps.steps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public static void startWorkDriver() {
        steps.startWorkOfBrowser();
        steps.clearCookies();
    }

    @AfterTest
    public static void finishWorkDriver() {
        steps.quitBrowser();
    }
}
