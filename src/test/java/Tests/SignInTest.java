package Tests;

import Steps.Steps;
import org.testng.annotations.Test;

import static Utils.Constants.LOGIN;
import static Utils.Constants.PASSWORD;

public class SignInTest extends BaseTest {

    @Test
    public static void testForLogIn() {
        Steps.clickSignInButton();
        Steps.logIn(LOGIN, PASSWORD);
        Steps.waitUntilHomePageIsLoaded();
        Steps.checkAccountIsAvailable();
        Steps.checkAccountNameIsCorrect(LOGIN);
    }
}
