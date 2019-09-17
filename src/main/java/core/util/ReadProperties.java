/*
 * @(#) ReadProperties.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Class to return the ChromeDriver for Chrome browser.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public final class ReadProperties {

    private String userName;
    private String password;
    private String url;
    private static ReadProperties ourInstance = new ReadProperties();

    /**
     * Method return the instance to read properties.
     *
     * @return instance to type ReadProperties
     */
    public static ReadProperties getInstance() {

        return ourInstance;
    }

    /**
     * Constructor that read the file application properties.
     */
    private ReadProperties() {
        try (InputStream input = new FileInputStream(System.getProperty("user.dir") + "/application.properties")) {
            Properties properties = new Properties();
            properties.load(input);

            userName = properties.getProperty("user_name");
            password = properties.getProperty("password_n");
            url = properties.getProperty("url");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Method let get the userName.
     *
     * @return userName.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Method let get the password.
     *
     * @return password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Method let get the url.
     *
     * @return url.
     */
    public String getUrl() {
        return url;
    }

}
