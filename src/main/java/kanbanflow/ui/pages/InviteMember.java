package kanbanflow.ui.pages;

import kanbanflow.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InviteMember extends BasePage {
    @FindBy(className = "headerMembers-add")
    private WebElement addMember;
    @FindBy(className = "chipsInput-input")
    private WebElement addEmail;
    @FindBy(className = "inviteBoardMemberDialog-invite button button--success")
    private WebElement sendInvite;

    public void setAddMember(String email) {
        addMember.click();
        addEmail.sendKeys(email);
        sendInvite.click();
    }
}
