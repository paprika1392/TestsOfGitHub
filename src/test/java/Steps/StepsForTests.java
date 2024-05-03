package Steps;

import GitHubPages.HomePage;
import GitHubPages.SignInPage;
import GitHubPages.StartPage;
import Utils.Browser;

import static Utils.Constants.GITHUB_HOME_PAGE_URL;

public class StepsForTests {

    public static StartPage startPage = new StartPage();
    public static SignInPage signInPage = new SignInPage();
    public static HomePage homePage = new HomePage();

    //                      """  Common actions for open browser  """

    public static void startWorkOfBrowser() {
        Browser.webDriverStartWork();
        Browser.setUrl(GITHUB_HOME_PAGE_URL);
        Browser.customizeBrowserWindow();
    }

    public static void clearCookies() {
        Browser.clearCookies();
    }

    public static void quitBrowser() {
        Browser.quiteBrowser();
    }

    //                    """ Steps for Sign in gitHub test """

    public static void clickToSignIn() {
        startPage.clickToSignInButton();
    }

    public static void enterPersonalDates(String login, String password) {
        signInPage.enterUserLogin(login);
        signInPage.enterUserPassword(password);
    }

    public static void enterToPersonalAcc() {
        signInPage.logInToAccount();
    }

    public static void waitPageIsLoadedAndCheckAccIsVisible() {
        homePage.waitUntilHomePageIsLoaded();
        homePage.checkAccountIsVisible();
    }

    public static void checkCorrectLoadedAccount(String login) {
        homePage.checkCorrectLoadedAccount(login);
    }

}
