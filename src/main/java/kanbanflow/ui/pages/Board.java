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

import kanbanflow.ui.BasePage;
import org.openqa.selenium.WebElement;
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


    /**
     * Method to let a send a description to the task.
     *
     * @param description this is the descriptions to the task.
     */
    public void setAddNewToDo(String description) {
        addTaskButton.click();
        addTaskName.sendKeys(description);
        sendSave.click();
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
    private WebElement MemberFound;

    @FindBy(xpath = "//div[contains(@class, 'profileDialog-isPendingMember')]")
    private WebElement pendingInvitation;
    public void findUserInvitation(String email){
        allMember.click();
//        searchMemberInvite.sendKeys(email);
//        MemberFound.click();
    }
    public boolean isPendingInvitations(){
        return pendingInvitation.getText().equals("Pending invitation");
    }
}
