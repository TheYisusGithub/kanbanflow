package kanbanflow.ui.pages;

import kanbanflow.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *Class let add new task in the board.
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
     *Method to let a send a description to the task.
     *
     * @param description this is an argument.
     */
    public void setAddNewToDo(String description) {
        addTaskButton.click();
        addTaskName.sendKeys(description);
        sendSave.click();
    }
    public boolean isBoardPage(){
        return driver.getCurrentUrl().contains("board");
    }
}
