/*
 * @(#) WebDriverConfig.java Copyright (c) 2019 Jala Foundation.
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

import core.util.Log;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Class read the file gradle.properties.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public final class WebDriverConfig {
    private String webBrowser;
    private String implicitWait;
    private String explicitWait;
    private static WebDriverConfig ourInstance = new WebDriverConfig();

    /**
     * Method let optain a instance.
     * @return WebDriverConfig instance.
     */
    public static WebDriverConfig getInstance() {
        return ourInstance;
    }

    /**
     * Constructor that read the file configuration.
     */
    private WebDriverConfig() {
        try (InputStream input = new FileInputStream(System.getProperty("user.dir") + "/gradle.properties")) {
            Properties properties = new Properties();
            properties.load(input);
            webBrowser = properties.getProperty("browser");
            implicitWait = properties.getProperty("implicit");
            explicitWait = properties.getProperty("explicit");
        } catch (Exception ex) {
            Log.getInstance().getLog().error(ex);
            throw new NullPointerException("File not found" + ex);
        }
    }

    /**
     * Method return web browser name.
     *
     * @return webBrowser.
     */
    public String getWebBrowser() {
        return webBrowser;
    }

    /**
     * Method return the variable implicit.
     *
     * @return implicit.
     */
    public String getImplicitWait() {
        return implicitWait;
    }

    /**
     * Method return the variable explicit.
     *
     * @return explicit.
     */
    public String getExplicitWait() {
        return explicitWait;
    }
}
