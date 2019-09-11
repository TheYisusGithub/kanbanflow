/*
 * @(#) BoardHooks.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */
package kanbanflow.hooks;

import core.selenium.WebDriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import kanbanflow.ui.entities.Context;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * Class let drive the behavior and element the page kanban flow .
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public class BoardHooks {
    private Context context;
    WebDriver webDriver;

    /**
     * Constructor.
     * @param context class.
     */
    public BoardHooks(Context context) {
        this.context = context;
        webDriver = WebDriverManager.getInstance().getDriver();
    }

    /**
     * Method delete the invitations.
     */
    @After("@DeleteInvitation")
    public void DeleteContact() {
        context.getBoardEntities().getBoard().removeInvitationMember();
    }

    /**
     * Method to let delete task.
     */
    @After("@DeleteTask")
    public void Deletetask() {
        context.getBoardEntities().getBoard().Deletetask();
    }

    /**
     * Methot to let me create a screen shot to web browser
     * @param scenario failure.
     */
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
        }
    }
}
