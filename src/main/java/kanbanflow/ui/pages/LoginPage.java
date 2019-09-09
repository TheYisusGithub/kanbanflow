package kanbanflow.ui.pages;

import kanbanflow.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "email")
    private WebElement inputEmail;
    @FindBy(id = "password")
    private WebElement inputPassword;
    @FindBy(className = "form-actionButton")
    private WebElement submitButton;

    public LoginPage() {
    }

    public void signIn(String email, String password) {
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        submitButton.click();
    }

}
