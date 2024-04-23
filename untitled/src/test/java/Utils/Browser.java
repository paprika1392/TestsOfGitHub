package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

    private static WebDriver driver;          //singleton

    private Browser() {                       //singleton
    }

    public static WebDriver getDriver() {     //singleton
        if (driver == null) {
            WebDriverManager.chromedriver().setup(); //automatic driver download
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void webDriverStartWork() {
        getDriver();
    }

    public static void customizeBrowserWindow() {
        driver.manage().window().maximize();
    }

    public static void setUrl(String url) {
        driver.get(url);
    }

    public static void clearCookies() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        driver.manage().deleteAllCookies();
        javascriptExecutor.executeScript("window.sessionStorage.clear()");
    }

    public static void quiteBrowser() {
        driver.quit();
    }

    public static WebDriverWait getWebdriverWait() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait;
    }

}
