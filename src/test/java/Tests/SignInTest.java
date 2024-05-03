package Tests;

import Steps.steps;
import org.testng.annotations.Test;

import static Utils.Constants.LOGIN;
import static Utils.Constants.PASSWORD;

public class SignInTest extends BaseTest {

    @Test
    public static void testForLogIn() {
        steps.clickToSignIn();
        steps.logIn(LOGIN, PASSWORD);
        steps.enterToPersonalAcc();
        steps.waitPageIsLoadedAndCheckAccIsVisible();
        steps.checkCorrectLoadedAccount(LOGIN);
    }
}
