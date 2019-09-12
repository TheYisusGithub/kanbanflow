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
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Class read the file gradle.properties.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public class WebDriverConfig {
    private String webBrowser;
    private String implicit;
    private String explicit;
    private static WebDriverConfig ourInstance = new WebDriverConfig();

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
            implicit = properties.getProperty("implicit");
            explicit = properties.getProperty("explicit");
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
    public String getImplicit() {
        return implicit;
    }

    /**
     * Method return the variable explicit.
     *
     * @return explicit.
     */
    public String getExplicit() {
        return explicit;
    }
}
