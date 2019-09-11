/*
 * @(#) BasePage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package kanbanflow.ui;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Class abastract this let me drive browser.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public abstract class BasePage {
    protected WebDriver driver;

    /**
     * Constructor.
     */
    public BasePage() {
        driver = WebDriverManager.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }
}
