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

import core.util.ReadProperties;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import kanbanflow.ui.pages.Board;
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
    PageTransporter pageTransporter = new PageTransporter();;
    Board board = new Board();

    /**
     * Method to let me got to the page kanban flow.
     */
    @Given("The user go to the page kanbanflow")
    public void goLoginPage() {

        loginPage = pageTransporter.goToLoginPage();
    }

    /**
     * Method to let login to page kanban flow.
     */
    @When("The user login to kanbanflow")
    public void loginToKanban() {
        loginPage.signIn(ReadProperties.getInstance().getUserName(), ReadProperties.getInstance().getPassword());
    }

    /**
     * Method to let add user.
     */
    @Given("The user add email invitations")
    public void theUserAddEmailInvitations() {
        board.addNewInviteUser();
    }

    /**
     * Method to let logs int the page kanban flow.
     */
    @Given("The user logs in to the kanbanflow page")
    public void LogsInToThePage() {
        pageTransporter = new PageTransporter();
        loginPage = pageTransporter.goToLoginPage();
        loginPage.signIn(ReadProperties.getInstance().getUserName(), ReadProperties.getInstance().getPassword());
    }

    /**
     * Method to let send a invitations members.
     */
    @When("The user adds a new member with this email (.*)")
    public void AddsNewMember(String email) {
        board.setAddMember(email);
    }

    /**
     * Method let find invitations email.
     * @param email user.
     */
    @Then("The user clicking should show the (.*) with the pending invitations")
    public void findInvitationPending(String email) {
        board.findUserInvitation(email);
    //    Assert.assertEquals(false,board.isPendingInvitations());
    }

    /**
     * Method let add new task in the board.
     * @param description the taks.
     */
    @When("The user adds new to-do task with the following descriptions (.*)")
    public void addNewTask(String description) {
        board.setAddNewToDo(description);
    }

    /**
     * Find if task was created in the board.
     */
    @And("show the task description in the board")
    public void findTaskBoard() {

    }

    /**
     * Find the email if exist.
     * @param email
     */
    @Then("The page show message, the email (.*) exist")
    public void compareMessage(String email) {
        Assert.assertEquals(true, board.verifyIfExist(email));
    }

    /**
     * Method verify if the logs to kanban was successfully.
     */
    @Then("The access is successfuly")
    public void IsSuccessfuly() {

    }
}
