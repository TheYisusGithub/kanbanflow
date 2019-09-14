/*
 * @(#) Board.java Copyright (c) 2019 Jala Foundation.
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

import core.selenium.WebDriverManager;
import kanbanflow.ui.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Class let drive the behavior and element the page kanban flow .
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public class Board extends BasePage {
    @FindBy(xpath = "//h2[contains(@title, 'To-do')]/parent::div/following-sibling::button")
    private WebElement addTaskButton;
    @FindBy(className = "addTaskDialog-name")
    private WebElement addTaskName;
    @FindBy(className = "addTaskDialog-buttonWrapper")
    private WebElement sendSave;
    @FindBy(className = "addTaskDialog-wrapper")
    private WebElement modal;
    @FindBy(className = "addTaskDialog-close")
    private WebElement closeModalButton;

    /**
     * Method to let a send a description to the task.
     *
     * @param description this is the descriptions to the task.
     */
    public void setAddNewToDo(String description) {
        addTaskButton.click();
        addTaskName.sendKeys(description);
        driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));

    }

    /**
     * Method compare if the element in the url is present.
     *
     * @return a value boolean.
     */
    public boolean isBoardPage() {
        return driver.getCurrentUrl().contains("board");
    }

    @FindBy(className = "headerMembers-add")
    private WebElement addMember;
    @FindBy(className = "chipsInput-input")
    private WebElement addEmail;
    @FindBy(xpath = "//button[contains(@class, 'inviteBoardMemberDialog-invite button button--success')]")
    private WebElement sendInvite;
    @FindBy(xpath = "//div[contains(@class, 'modalBox-body scroll scroll--rounded')]")
    private WebElement catchMessage;

    /**
     * Method to let set a email method.
     *
     * @param email the user to invite.
     */
    public void setAddMember(String email) {
        addMember.click();
        addEmail.sendKeys(email);
        sendInvite.click();
    }

    /**
     * Method to let add new user.
     */
    public void addNewInviteUser() {
        addMember.click();
    }

    /**
     * Method to let write invite user.
     *
     * @param email from user.
     */
    public void writeEmailInvitations(String email) {
        addEmail.sendKeys(email);
    }

    /**
     * Verify when send a invitations if the user exists.
     *
     * @param email the user.
     * @return compare if member exist.
     */
    public boolean verifyIfExist(String email) {
        sendInvite.click();
        System.out.println(email + " is already a member of the board");
        return (email + " is already a member of the board").equals(catchMessage.getText());
    }

    @FindBy(xpath = "//button[contains(@title, 'All members')]")
    private WebElement allMember;

    @FindBy(xpath = "//input[contains(@class, 'boardMembersDialog-searchInput')]")
    private WebElement searchMemberInvite;

    @FindBy(xpath = "//div[contains(@class, 'boardMembersDialog-memberName truncate')]")
    private WebElement memberFound;

    @FindBy(xpath = "//div[contains(@class, 'profileDialog-isPendingMember')]")
    private WebElement pendingInvitation;

    /**
     * Method find member user.
     *
     * @param email member to find.
     */
    public void findUserInvitation(String email) {
        allMember.click();
        searchMemberInvite.sendKeys(email);
        memberFound.click();
    }

    /**
     * Method return the compare pending invitations.
     *
     * @return tru or false acoordig if member are invitation.
     */
    public boolean isPendingInvitations() {
        return pendingInvitation.getText().equals("Pending invitation");

    }

    /**
     * Method remove invitations.
     */
    @FindBy(xpath = "//button[contains(@class, 'profileDialog-removeFromBoard profileDialog-action button')]")
    private WebElement memberDelete;
    @FindBy(xpath = "//button[contains(@class, 'modalBox-button button button--danger')]")
    private WebElement buttonMemberDelete;

    /**
     * Method remove the invitation of a member.
     */
    public void removeInvitationMember() {
        memberDelete.click();
        buttonMemberDelete.click();
    }

    @FindBy(xpath = "//img[contains(@id, 'menuLinks-avatar')]")
    private WebElement settingMenu;
    @FindBy(xpath = "//a[contains(@class, 'menuLinks-logout userMenu-item userMenu-link')]")
    private WebElement logOutButton;

    /**
     * Method go out of login page kanban.
     */
    public void goOutPage() {
        settingMenu.click();
        logOutButton.click();
    }

    @FindBy(xpath = "//button[contains(@class, 'addTaskDialog-close')]")
    private WebElement taskModalCloseButton;

    /**
     * Method close modal windows.
     */
    public void modalTaskClose() {
        taskModalCloseButton.click();
    }

    @FindBy(xpath = "//span[contains(@class,'task-name')]")
    private WebElement isInBoard;

    /**
     * Method compare is task are in the boar.
     */
    public boolean isTaskInBoard(String Description) {
        return isInBoard.getText().equals(Description);
    }

    @FindBy(xpath = "//div[contains(@class,'task task-yellow')]")
    private WebElement taskInBoard;
    @FindBy(xpath = "//button[contains(@class,'taskDetails-sidebar-deleteButton taskDetails-sidebarButton')]")
    private WebElement trashTask;
    @FindBy(xpath = "//button[contains(@class,'modalBox-button button button--danger')]")
    private WebElement buttonOkTrash;

    /**
     * Method delete task that was create.
     */
    public void Deletetask() {
        taskInBoard.click();
        trashTask.click();
        buttonOkTrash.click();
    }

    @FindBy(xpath = "//div[contains(@class, 'modalBox-body scroll scroll--rounded')]")
    private WebElement messageIfexist;

    /**
     * Method compare if member is already.
     */
    public boolean isAlreadyMemberExist() {
        return messageIfexist.getText().equals(" is already a member of the board");
    }

    @FindBy(xpath = "//table[@id='board-table']/tbody/tr/td/div/div[2]/div/span")
    private WebElement taskCath;
    @FindBy(xpath = "//table[@id='board-table']/tbody/tr/td[2]/div/div[2]")
    private WebElement taskDropToday;
    @FindBy(xpath = "//table[@id='board-table']/tbody/tr/td[3]/div/div[2]")
    private WebElement taskDropInProgress;
    @FindBy(xpath = "//table[@id='board-table']/tbody/tr/td[4]/div/div[2]")
    private WebElement taskDropDone;

    /**
     * Let move a task to different fields in the board.
     */
    public void moveTask() {
        Actions builder = new Actions(WebDriverManager.getInstance().getDriver());
        builder.dragAndDrop(taskCath, taskDropToday).perform();
        builder.dragAndDrop(taskCath, taskDropInProgress).perform();
        builder.dragAndDrop(taskCath, taskDropDone).perform();
        builder.build();
    }

    /**
     * Compare if exist a element in the field done.
     *
     * @return boolean value.
     */
    public boolean isInDoneTask() {
        return taskDropDone.isDisplayed();
    }

    @FindBy(xpath = "//div[@id='header']/div/button/i")
    private WebElement buttonBoardMenu;
    @FindBy(xpath = "//a[contains(text(),'Create board')]")
    private WebElement createBoardButton;
    @FindBy(xpath = "//input[@id='createBoard-boardName']")
    private WebElement boardName;
    @FindBy(xpath = "//button[contains(.,'Next')]")
    private WebElement buttonNext;
    @FindBy(xpath = "//button[contains(.,'Create board')]")
    private WebElement buttonCreateBoard;

    /**
     * Method let create a new board.
     */
    public void newBoard(String nameBoard) {
        buttonBoardMenu.click();
        createBoardButton.click();
        boardName.sendKeys("nameBoard");
        buttonNext.click();
        buttonNext.click();
        buttonNext.click();
        buttonCreateBoard.click();
    }

    /**
     * Let create a board.
     */
    @FindBy(xpath = "//body[contains(@class,'body-board body-board--loaded')]")
    private WebElement stateNameBoard;

    public boolean isCreateBoard() {
        return stateNameBoard.isDisplayed();
    }


//    @FindBy(xpath = "//div[@id='header']/div/button/i")
//    private WebElement buttonBoardMenu;
//    @FindBy(xpath = "//a[contains(text(),'Create board')]")
//    private WebElement createBoardButton;
//    @FindBy(xpath = "//input[@id='createBoard-boardName']")
//    private WebElement boardName;
//    @FindBy(xpath = "//button[contains(.,'Next')]")
//    private WebElement buttonNext;
//    @FindBy(xpath = "//button[contains(.,'Create board')]")
//    private WebElement buttonCreateBoard;

    /**
     * Method let create a new board.
     */
    public void newBoardWithLimitWorks(String nameBoard) {
        buttonBoardMenu.click();
        createBoardButton.click();
        boardName.sendKeys("nameBoard");
        buttonNext.click();
        buttonNext.click();
//        buttonNext.click();
//        buttonCreateBoard.click();
    }



    @FindBy(xpath = "//button[contains(.,'Create board')]")
    private WebElement buttonCreateBoard;

    public void fillFieldBoardLimitWorks() {
        buttonBoardMenu.click();
        createBoardButton.click();
        boardName.sendKeys("nameBoard");
        buttonNext.click();
        buttonNext.click();
//        buttonNext.click();
//        buttonCreateBoard.click();
    }


}
