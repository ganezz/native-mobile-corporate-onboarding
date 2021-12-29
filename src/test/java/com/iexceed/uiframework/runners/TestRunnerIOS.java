package com.iexceed.uiframework.runners;


import com.iexceed.uiframework.utilites.WaitUtility;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import lombok.SneakyThrows;
import org.testng.annotations.AfterClass;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

//@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources/Features/HomePageIOS.feature",
        glue = {"com.iexceed.uiframework.stepdefinitions"},
        tags= "@regressionIOSHomePage",
        plugin= {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/jsonReports/cucumberIOS-reports.json","html:target/cucumberIOS-ui-reports.html",
                "rerun:target/failedrerun.txt"


        }


)
public class TestRunnerIOS extends AbstractTestNGCucumberTests {
        private TestNGCucumberRunner testNGCucumberRunner;
        private final WaitUtility waitUtility= new WaitUtility();

        @SneakyThrows
        @AfterClass(alwaysRun = true)
        public void tearDownClass() {
                driver.quit();
                System.out.println("driver is closed now");
                waitUtility.waitForSeconds(77);
//                testNGCucumberRunner.finish();
        }

}
