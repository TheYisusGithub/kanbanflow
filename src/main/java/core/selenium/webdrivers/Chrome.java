package core.selenium.webdrivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class to return the ChromeDriver for Chrome browser.
 */
public class Chrome implements Browser{
    /**
     * Get the Chrome org.fundacionjala.core.ui.driver.
     *
     * @return the ChromeDriver.
     */
    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}