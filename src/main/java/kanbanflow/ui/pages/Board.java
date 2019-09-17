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

import java.util.Map;

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
    @FindBy(css = ".addTaskDialog-descriptionButton")
    private WebElement buttonDescriptionTask;
    @FindBy(css = ".taskDetails-textEditorInput")
    private WebElement descriptionBox;
    @FindBy(css = ".addTaskDialog-iconButton:nth-child(1)")
    private WebElement buttonMemberAdd;
    @FindBy(css = ".selectUserDialog-searchInput")
    private WebElement textInputUserSearch;
    @FindBy(css = ".selectUserDialog-item-checkboxIcon")
    private WebElement buttonCheckBoxUserDialog;
    @FindBy(className = "headerMembers-add")
    private WebElement addMember;
    @FindBy(className = "chipsInput-input")
    private WebElement addEmail;
    @FindBy(xpath = "//button[contains(@class, 'inviteBoardMemberDialog-invite button button--success')]")
    private WebElement sendInvite;
    @FindBy(xpath = "//div[contains(@class, 'modalBox-body scroll scroll--rounded')]")
    private WebElement catchMessage;
    @FindBy(xpath = "//button[contains(@title, 'All members')]")
    private WebElement allMember;
    @FindBy(xpath = "//input[contains(@class, 'boardMembersDialog-searchInput')]")
    private WebElement searchMemberInvite;
    @FindBy(xpath = "//div[contains(@class, 'boardMembersDialog-memberName truncate')]")
    private WebElement memberFound;
    @FindBy(xpath = "//div[contains(@class, 'profileDialog-isPendingMember')]")
    private WebElement pendingInvitation;
    @FindBy(xpath = "//button[contains(@class, 'profileDialog-removeFromBoard profileDialog-action button')]")
    private WebElement memberDelete;
    @FindBy(xpath = "//button[contains(@class, 'modalBox-button button button--danger')]")
    private WebElement buttonMemberDelete;
    @FindBy(xpath = "//img[contains(@id, 'menuLinks-avatar')]")
    private WebElement settingMenu;
    @FindBy(xpath = "//a[contains(@class, 'menuLinks-logout userMenu-item userMenu-link')]")
    private WebElement logOutButton;
    @FindBy(xpath = "//button[contains(@class, 'addTaskDialog-close')]")
    private WebElement taskModalCloseButton;
    @FindBy(xpath = "//span[contains(@class,'task-name')]")
    private WebElement isInBoard;
    @FindBy(xpath = "//div[contains(@class,'task task-yellow')]")
    private WebElement taskInBoard;
    @FindBy(xpath = "//button[contains(@class,'taskDetails-sidebar-deleteButton taskDetails-sidebarButton')]")
    private WebElement trashTask;
    @FindBy(xpath = "//button[contains(@class,'modalBox-button button button--danger')]")
    private WebElement buttonOkTrash;
    @FindBy(xpath = "//table[@id='board-table']/tbody/tr/td/div/div[2]/div/span")
    private WebElement taskCath;
    @FindBy(xpath = "//table[@id='board-table']/tbody/tr/td[2]/div/div[2]")
    private WebElement taskDropToday;
    @FindBy(xpath = "//table[@id='board-table']/tbody/tr/td[3]/div/div[2]")
    private WebElement taskDropInProgress;
    @FindBy(xpath = "//table[@id='board-table']/tbody/tr/td[4]/div/div[2]")
    private WebElement taskDropDone;
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
    @FindBy(xpath = "//body[contains(@class,'body-board body-board--loaded')]")
    private WebElement stateNameBoard;
    @FindBy(xpath = "//div[contains(@class, 'modalBox-body scroll scroll--rounded')]")
    private WebElement messageIfexist;

    /**
     * Method to let a send a description to the task.
     *
     * @param inputContent this is the descriptions to the task.
     */
    public void setAddNewToDo(Map<String, String> inputContent) {
        addTaskButton.click();
        addTaskName.sendKeys(inputContent.get("Name"));
        buttonDescriptionTask.click();
        descriptionBox.sendKeys(inputContent.get("Description"));
        buttonMemberAdd.click();
        textInputUserSearch.sendKeys(inputContent.get("Subject"));
        buttonCheckBoxUserDialog.click();
        driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
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
     * Method remove the invitation of a member.
     */
    public void removeInvitationMember() {
        memberDelete.click();
        buttonMemberDelete.click();
    }

    /**
     * Method go out of login page kanban.
     */
    public void goOutPage() {
        settingMenu.click();
        logOutButton.click();
    }

    /**
     * Method close modal windows.
     */
    public void modalTaskClose() {
        taskModalCloseButton.click();
    }

    /**
     * Method compare if the description found in the board.
     *
     * @param description parameter.
     * @return boolean value.
     */
    public boolean isTaskInBoard(String description) {
        return isInBoard.getText().equals(description);
    }

    /**
     * Method delete task that was create.
     */
    public void deletetask() {
        taskInBoard.click();
        trashTask.click();
        buttonOkTrash.click();
    }

    /**
     * Method compare if member is already.
     *
     * @return boolean value.
     */
    public boolean isAlreadyMemberExist() {
        return messageIfexist.getText().equals(" is already a member of the board");
    }

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

    /**
     * Method let create a new board.
     *
     * @param nameBoard type string.
     */
    public void newBoard(String nameBoard) {
        buttonBoardMenu.click();
        createBoardButton.click();
        boardName.sendKeys(nameBoard);
        buttonNext.click();
        buttonNext.click();
        buttonNext.click();
        buttonCreateBoard.click();
    }

    /**
     * Method let verify if name is create in the board.
     * @return boolean value.
     */
    public boolean isCreateBoard() {
        return stateNameBoard.isDisplayed();
    }

    /**
     * Method let create a new board with the name.
     *
     * @param nameBoard type string.
     */
    public void newBoardWithLimitWorks(String nameBoard) {
        buttonBoardMenu.click();
        createBoardButton.click();
        boardName.sendKeys("nameBoard");
        buttonNext.click();
        buttonNext.click();
    }

    /**
     * Method let create a new board with LimitWorks.
     */
    public void fillFieldBoardLimitWorks() {
        buttonBoardMenu.click();
        createBoardButton.click();
        boardName.sendKeys("nameBoard");
        buttonNext.click();
        buttonNext.click();
    }
}
