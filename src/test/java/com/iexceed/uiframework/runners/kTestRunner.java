package com.iexceed.uiframework.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


//@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources/Features",
        glue = {"com.iexceed.uiframework.stepdefinitions"},
        tags = "@regression_apps",
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/jsonReports/cucumber-reports.json", "html:target/cucumber-ui-reports.html",
                "rerun:target/failedrerun.txt"


        }


)

public class kTestRunner extends AbstractTestNGCucumberTests {
    private TestNGCucumberRunner testNGCucumberRunner;

//    @BeforeClass(alwaysRun = true)
//    public void setUpClass() {
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }
//
//    @Test(dataProvider = "features")
//    public void feature(PickleWrapper eventwrapper, FeatureWrapper cucumberFeature) throws Throwable {
//        //testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//        testNGCucumberRunner.runScenario(eventwrapper.getPickle());
//    }
//
//    @DataProvider//(parallel=true)
//    public Object[][] features() {
//        // return testNGCucumberRunner.provideFeatures();
//        return testNGCucumberRunner.provideScenarios();
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void tearDownClass() {
//        testNGCucumberRunner.finish();
//    }


//    @BeforeTest
//    @Parameters("deviceName")
//    public void parameterTest(String deviceName) {
//        System.out.println("Parameterized value deviceName : " + deviceName);
//            DeviceName=deviceName;
//    }

    }