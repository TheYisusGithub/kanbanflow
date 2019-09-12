/*
 * @(#) WebDriverManager.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.selenium;

import core.selenium.webdrivers.BrowserFactory;
import core.selenium.webdrivers.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Class let set the driver and let drive method like driver and wait.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public final class WebDriverManager {
    private static int timeOutInSeconds = 0;
    private static WebDriverManager ourInstance = new WebDriverManager();
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * Method return the instance.
     *
     * @return instance type of WebDriverManager.
     */
    public static WebDriverManager getInstance() {

        return ourInstance;
    }

    /**
     * Constructor.
     */
    private WebDriverManager() {

        String webBrowser = WebDriverConfig.getInstance().getWebBrowser().toUpperCase();
        BrowserType browserType = BrowserType.valueOf(webBrowser);
        driver = BrowserFactory.getBrowser(browserType).getDriver();
        timeOutInSeconds = Integer.parseInt(WebDriverConfig.getInstance().getExplicit());
        wait = new WebDriverWait(driver, timeOutInSeconds);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(WebDriverConfig.
                getInstance().getImplicit()), TimeUnit.SECONDS);
    }

    /**
     * Method to let get the driver.
     *
     * @return driver.
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Method to let get a wait.
     *
     * @return wait.
     */
    public WebDriverWait getWait() {
        return wait;
    }
}
