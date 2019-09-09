package core.selenium;

import core.selenium.webdrivers.BrowserFactory;
import core.selenium.webdrivers.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    private static int timeOutInSeconds = 0;
    private static WebDriverManager ourInstance = new WebDriverManager();
    private WebDriver driver;
    private WebDriverWait wait;

    public static WebDriverManager getInstance() {

        return ourInstance;
    }

    private WebDriverManager() {

        String webBrowser = WebDriverConfig.getInstance().getWebBrowser().toUpperCase();
        BrowserType browserType = BrowserType.valueOf(webBrowser);
        driver= BrowserFactory.getBrowser(browserType).getDriver();
        timeOutInSeconds=Integer.parseInt(WebDriverConfig.getInstance().getExplicit());
        wait = new WebDriverWait(driver, timeOutInSeconds);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(WebDriverConfig.getInstance().getImplicit()), TimeUnit.SECONDS) ;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
