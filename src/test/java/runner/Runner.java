package runner;


import core.selenium.WebDriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-pretty",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},
        glue = {"steps"},
        features = {"src/test/resources/features/"},
        monochrome = true)
public class Runner extends AbstractTestNGCucumberTests {
@AfterSuite
public void closeBrowser(){
    WebDriverManager.getInstance().getDriver().close();
}
    /**
     * The method afterExecution executes the project and generate it report.
     */
    @AfterTest
    public void afterExecution() {
        ReportGenerator.generateReport();
    }
}
