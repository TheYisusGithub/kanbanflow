/*
 * @(#) LoginPage.java Copyright (c) 2019 Jala Foundation.
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

import kanbanflow.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Class let drive the behavior the login to the paga kanban flow.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public class LoginPage extends BasePage {
    @FindBy(id = "email")
    private WebElement inputEmail;
    @FindBy(id = "password")
    private WebElement inputPassword;
    @FindBy(className = "form-actionButton")
    private WebElement submitButton;

    /**
     * Constructor.
     */
    public LoginPage() {
    }

    /**
     * Method to let me login in the page kanban flow.
     *
     * @param email    type string.
     * @param password type string.
     */
    public void signIn(String email, String password) {
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        submitButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
