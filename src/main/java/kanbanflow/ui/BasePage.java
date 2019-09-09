package kanbanflow.ui;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage() {
        driver = WebDriverManager.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }
}
