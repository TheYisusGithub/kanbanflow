/*
 * @(#) Runner.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package kanbanflow.runner;

import core.selenium.WebDriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;

/**
 * Class let me generate the report cucumber.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},
        glue = {"kanbanflow/steps", "kanbanflow/hooks"},
        features = {"src/test/resources/features"},
        monochrome = true)
public class Runner extends AbstractTestNGCucumberTests {

    /**
     * The method afterExecution executes the project and generate it report.
     */
    @AfterTest
    public void afterExecution() {
        ReportGenerator.generateReport();
        WebDriverManager.getInstance().getDriver().quit();
    }
}
