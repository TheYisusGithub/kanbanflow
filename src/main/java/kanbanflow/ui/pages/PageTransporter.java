package kanbanflow.ui.pages;

import core.util.ReadProperties;
import kanbanflow.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageTransporter extends BasePage {
    @FindBy(css = "[href='/login']")
    private WebElement loginButton;

    public PageTransporter() {
        System.out.println(ReadProperties.getInstance().getUrl());
        driver.get(ReadProperties.getInstance().getUrl());
    }

    public LoginPage goToLoginPage() {
        loginButton.click();
        return new LoginPage();
    }
}
