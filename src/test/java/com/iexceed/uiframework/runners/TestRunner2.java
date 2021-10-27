package com.iexceed.uiframework.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import static com.iexceed.uiframework.stepdefinitions.HomePageDefinition.DeviceName;


//@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources/Features",
        glue = {"com.iexceed.uiframework.stepdefinitions"},
        tags= "@sanity",
        plugin= {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/jsonReports/cucumber-reports.json","html:target/cucumber-ui-reports.html",
                "rerun:target/failedrerun.txt"


        }


)

public class TestRunner2 extends AbstractTestNGCucumberTests {
        private TestNGCucumberRunner testNGCucumberRunner;


//        @DataProvider(parallel = true)
//        public Object[][] features() {
//                // return testNGCucumberRunner.provideFeatures();
//                return testNGCucumberRunner.provideScenarios();
//        }

//        @BeforeTest
//        @Parameters("deviceName")
//        public void parameterTest(String deviceName) {
//                System.out.println("Parameterized value deviceName : " + deviceName);
//                DeviceName=deviceName;
//        }

}