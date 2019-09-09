/*
 * @(#) KanbanStep.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */
package steps;

import core.selenium.WebDriverManager;
import core.util.ReadProperties;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import kanbanflow.ui.pages.Board;
import kanbanflow.ui.pages.InviteMember;
import kanbanflow.ui.pages.LoginPage;
import kanbanflow.ui.pages.PageTransporter;
import org.testng.Assert;

/**
 * Class drive the step that let to interact with the web page and features.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public class KanbanStep {
    LoginPage loginPage;
    PageTransporter pageTransporter;
    InviteMember inviteMember;
    Board board= new Board();

    /**
     * Method to compare if the access is successfuly.
     */
    @Then("The access is successfuly")
    public void theAccessIsSuccessfuly() {
        board=new Board();
        Assert.assertEquals(board.isBoardPage(),true);
        WebDriverManager.getInstance().getDriver().close();
    }

    /**
     * Method to let me got to the page kanban flow.
     */
    @Given("The user go to the page kanbanflow")
    public void theUserGoToThePageKanbanflow() {
        pageTransporter = new PageTransporter();
        loginPage = pageTransporter.goToLoginPage();
    }

    /**
     * Method to let login to page kanban flow.
     */
    @When("The user login to kanbanflow")
    public void theUserLoginToKanbanflow() {
        loginPage.signIn(ReadProperties.getInstance().getUserName(), ReadProperties.getInstance().getPassword());
    }

    /**
     * Method to let the user go to the page kanban flow and let login.
     *
     */
    @Given("The user go to the page kanbanflow to login")
    public void theUserGoToThePageKanbanflowToLogin() {
        pageTransporter = new PageTransporter();
        loginPage = pageTransporter.goToLoginPage();
        loginPage.signIn(ReadProperties.getInstance().getUserName(), ReadProperties.getInstance().getPassword());
    }


    /**
     * Method to let add to do task in the page kandan flow.
     */
    @When("The user adds to-do task")
    public void theUserAddsToDoTask() {
//        board = new Board();
        board.setAddNewToDo("Task1");
    }

    /**
     * Method to let me compare if the task was create.
     */
    @Then("The task was create")
    public void theTaskWasCreate() {
        WebDriverManager.getInstance().getDriver().close();
    }


    @Given("The user add email invitations")
    public void theUserAddEmailInvitations() {
        board.addNewInviteUser();
    }

    @Then("The page show message when show warning the user exist")
    public void thePageShowMessageWhenShowWarningTheUserExist() {
        Assert.assertEquals(true,board.verifyIfExist("jesus.menacho@fundacion-jala.org"));
        WebDriverManager.getInstance().getDriver().close();
    }

    @Then("The invite was send successfuly")
    public void theInviteWasSendSuccessfuly() {
      //  WebDriverManager.getInstance().getDriver().close();
    }

    @When("The user sent email invitations")
    public void theUserSentEmailInvitations() {
        board.writeEmailInvitations("jesus.menacho@fundacion-jala.org");
    }

    /**
     * Method add the new user.
     */
    @When("The user add new member")
    public void theUserAddNewMember() {
        board.setAddMember("pepito112@hademail.org");
    }
}
