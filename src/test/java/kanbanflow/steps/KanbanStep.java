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
package kanbanflow.steps;

import core.util.ReadProperties;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import kanbanflow.ui.entities.Context;
import kanbanflow.ui.pages.LoginPage;
import org.testng.Assert;

import java.util.Map;

/**
 * Class drive the step that let to interact with the web page and features.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public class KanbanStep {
    private Context context;
    private LoginPage loginPage;


    /**
     * Class constructor.
     * A class constructor instantiates a very shiny and beautiful KanbanSteps object.
     * Under normal conditions, a step definition class shouldn't have a constructor method,
     * but for Dependency injection purposes, we are defining a constructor that ultimately is to be
     * scanned and set up by our DI library, i.e. picocontainer.
     * <p>
     * If there's the need for a more specific comment here, please refer to the documentation on
     * dependency injection and specifically about the picocontainer library.
     *
     * @param context An object Task that is going to be instantiated by the DI library.
     */
    public KanbanStep(Context context) {
        this.context = context;
    }

    /**
     * Method to let me got to the page kanban flow.
     */
    @Given("The user go to the page kanbanflow")
    public void goLoginPage() {
        loginPage = context.getBoardEntities().getPageTransporter().goToLoginPage();
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
        context.getBoardEntities().getBoard().addNewInviteUser();
    }

    /**
     * Method to let logs int the page kanban flow.
     */
    @Given("The user logs in to the kanbanflow page")
    public void logsintothepage() {
        loginPage = context.getBoardEntities().getPageTransporter().goToLoginPage();
        loginPage.signIn(ReadProperties.getInstance().getUserName(), ReadProperties.getInstance().getPassword());
    }

    /**
     * Method to let send a invitations members.
     *
     * @param email type string.
     */
    @When("The user adds a new member with this email (.*)")
    public void addsNewMember(String email) {
        context.getBoardEntities().getBoard().setAddMember(email);
    }

    /**
     * Method let find invitations email.
     *
     * @param email user.
     */
    @Then("The user clicking should show the (.*) with the pending invitations")
    public void findInvitationPending(String email) {
        context.getBoardEntities().getBoard().findUserInvitation(email);
        Assert.assertEquals(true, context.getBoardEntities().getBoard().isPendingInvitations());
    }

    /**
     * Method let add new task in the board.
     *
     * @param inputContent type map.
     */
    @When("The user adds new to-do task with the following information name task,descriptions, subject")
    public void addNewTask(Map<String, String> inputContent) {
        context.getBoardEntities().getBoard().setAddNewToDo(inputContent);
    }

    /**
     * Find if task was created in the board.
     */
    @And("show the task description in the board")
    public void findTaskBoard() {

    }

    /**
     * Method find the email if exist.
     *
     * @param email type string.
     */
    @Then("The page show message, the email (.*) exist")
    public void compareMessage(String email) {
        context.getBoardEntities().getBoard().setAddMember(email);
    }

    /**
     * Method verify if the logs to kanban was successfully.
     */
    @Then("The access is successfuly")
    public void isSuccessfuly() {
        Assert.assertEquals(context.getBoardEntities().getBoard().isBoardPage(), true);
    }

    /**
     * Method to let me got out page.
     */
    @And("Log out to the web page")
    public void logOutToTheWebPage() {
        context.getBoardEntities().getBoard().goOutPage();
    }

    /**
     * Method to let the modal windows.
     */
    @And("The user close modal windows")
    public void theUserCloseModalWindows() {
        context.getBoardEntities().getBoard().modalTaskClose();
    }

    /**
     * Method to let description in the board.
     *
     * @param description for the board.
     */
    @Then("show the task description (.*) in the board")
    public void showDescriptionBoard(String description) {
        context.getBoardEntities().getBoard().isTaskInBoard(description);
    }

    /**
     * Method let move thought the field.
     */
    @When("The user moves task through board")
    public void moveTaskBoard() {
        context.getBoardEntities().getBoard().moveTask();
    }

    /**
     * Method let found the task.
     */
    @Then("The user found the task int the field done")
    public void theUserFoundTheTaskIntTheFieldDone() {
        Assert.assertTrue(context.getBoardEntities().getBoard().isInDoneTask());
    }

    /**
     * Method let create a new board.
     * @param nameBoard type string.
     */
    @When("The user create a new board with the name (.*)")
    public void createNewBoard(String nameBoard) {
        context.getBoardEntities().getBoard().newBoard(nameBoard);
    }

    /**
     * Method to let compare if the boar was create.
     */
    @Then("The board was create successfully")
    public void theBoardWasCreateSuccessfully() {
        context.getBoardEntities().getBoard().isCreateBoard();
    }
}
