package Steps;

import GitHubPages.HomePage;
import GitHubPages.SignInPage;
import GitHubPages.StartPage;
import Utils.Browser;
import org.testng.Assert;

import static Utils.Constants.GITHUB_HOME_PAGE_URL;

public class steps {

    public static StartPage startPage = new StartPage();
    public static SignInPage signInPage = new SignInPage();
    public static HomePage homePage = new HomePage();

    //                      """  Common actions for open browser  """

    public static void startBrowserWork() {
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
        startPage.clickSignInButton();
    }

    public static void logIn(String login, String password) {
        signInPage.enterUserLogin(login);
        signInPage.enterUserPassword(password);
        signInPage.logInToAccount();
    }

    public static void waitPageIsLoaded() {
        homePage.waitUntilHomePageIsLoaded();
    }
    public static void checkAccount() {
        homePage.checkAccountIsVisible();
    }

    public static void checkAccountNameIsCorrect(String login) {
        homePage.clickUserAccountMenu();
        Assert.assertEquals(homePage.checkCorrectLoadedAccount(), login, "Acc name is not correct");
    }

}
