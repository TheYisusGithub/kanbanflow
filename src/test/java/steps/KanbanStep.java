package steps;

import core.util.ReadProperties;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import kanbanflow.ui.pages.Board;
import kanbanflow.ui.pages.InviteMember;
import kanbanflow.ui.pages.LoginPage;
import kanbanflow.ui.pages.PageTransporter;
import org.testng.Assert;


public class KanbanStep {
    LoginPage loginPage;
    PageTransporter pageTransporter;
    InviteMember inviteMember;
    Board board;

    @Then("The access is successfuly")
    public void theAccessIsSuccessfuly() {
        board=new Board();
        Assert.assertEquals(board.isBoardPage(),true);
    }

    @Given("The user go to the page kanbanflow")
    public void theUserGoToThePageKanbanflow() {
        pageTransporter = new PageTransporter();
        loginPage = pageTransporter.goToLoginPage();
    }

    @When("The user login to kanbanflow")
    public void theUserLoginToKanbanflow() {
        loginPage.signIn(ReadProperties.getInstance().getUserName(), ReadProperties.getInstance().getPassword());
    }

    @Given("The user go to the page kanbanflow to login")
    public void theUserGoToThePageKanbanflowToLogin() {
        pageTransporter = new PageTransporter();
        loginPage = pageTransporter.goToLoginPage();
        loginPage.signIn(ReadProperties.getInstance().getUserName(), ReadProperties.getInstance().getPassword());
    }

    @When("The user add new member")
    public void theUserAddNewMember() {
        inviteMember = new InviteMember();
        inviteMember.setAddMember("jesus.menacho@fundacion-jala.org");
    }


    @When("The user adds to-do task")
    public void theUserAddsToDoTask() {
        board = new Board();
        board.setAddNewToDo("Task1");
    }

    @Then("The task was create")
    public void theTaskWasCreate() {
    }
}
