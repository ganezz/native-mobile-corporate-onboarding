package com.iexceed.uiframework.runners;


import io.cucumber.testng.CucumberOptions;


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
public class TestRunnerIOS {
}
