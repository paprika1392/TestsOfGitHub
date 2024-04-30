package Tests;

import Steps.StepsForTests;
import org.testng.annotations.Test;

import static Utils.Constants.LOGIN;
import static Utils.Constants.PASSWORD;

public class SignInTest extends BaseTest {

    @Test
    public static void testForLogIn() {
        StepsForTests.clickToSignIn();
        StepsForTests.enterPersonalDates(LOGIN, PASSWORD);
        StepsForTests.enterToPersonalAcc();
        StepsForTests.waitPageIsLoadedAndCheckAccIsVisible();
        StepsForTests.checkCorrectLoadedAccount(LOGIN);
    }
}
