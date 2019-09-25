/*
 * @(#) Browser.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;

/**
 * Class interface that let set the behavior with the firm getDriver.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public interface Browser {
    /**
     * Method indicates the behavior that the other classes will have.
     * @return driver form browser.
     */
    WebDriver getDriver();
}
