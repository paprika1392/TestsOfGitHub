package Tests;

import Steps.StepsForTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public static void startWorkDriver() {
        StepsForTests.startWorkOfBrowser();
        StepsForTests.clearCookies();
    }

    @AfterTest
    public static void finishWorkDriver() {
        StepsForTests.quitBrowser();
    }
}
