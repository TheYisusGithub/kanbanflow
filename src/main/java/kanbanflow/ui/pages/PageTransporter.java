/*
 * @(#) PageTransporter.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package kanbanflow.ui.pages;

import core.util.ReadProperties;
import kanbanflow.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Class let me navigate through the different pages.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public class PageTransporter extends BasePage {
    @FindBy(css = "[href='/login']")
    private WebElement loginButton;

    /**
     * Constructor to let set a driver.
     */
    public PageTransporter() {
        System.out.println(ReadProperties.getInstance().getUrl());
        driver.get(ReadProperties.getInstance().getUrl());
    }

    /**
     * Method to let do the step to login.
     *
     * @return object type LoginPage.
     */
    public LoginPage goToLoginPage() {
        loginButton.click();
        return new LoginPage();
    }
}
