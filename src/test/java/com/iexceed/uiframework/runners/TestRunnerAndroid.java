package com.iexceed.uiframework.runners;


import com.iexceed.uiframework.utilites.WaitUtility;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/Features/check.feature",
        glue = {"com.iexceed.uiframework.stepdefinitions"},
        tags= "@mobileEle",
        plugin= {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/jsonReports/cucumber-reports.json","html:target/cucumber-ui-reports.html",
                "rerun:target/failedrerun.txt"
        }

)

public class TestRunnerAndroid extends AbstractTestNGCucumberTests {
        private TestNGCucumberRunner testNGCucumberRunner;
        private final WaitUtility waitUtility= new WaitUtility();


//        @BeforeClass(alwaysRun = true)
//        public void setUpClass() {
//                testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//        }
//
//        @Test(dataProvider = "features")
//        public void feature(PickleWrapper eventwrapper, FeatureWrapper cucumberFeature) throws Throwable {
//                //testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//                testNGCucumberRunner.runScenario(eventwrapper.getPickle());
//        }
//
//        @DataProvider//(parallel=true)
//        public Object[][] features() {
//                // return testNGCucumberRunner.provideFeatures();
//                return testNGCucumberRunner.provideScenarios();
//        }
//
//        @SneakyThrows
//        @AfterClass(alwaysRun = true)
//        public void tearDownClass() {
//
//                driver.quit();
//                System.out.println("driver is closed now");
//                waitUtility.waitForSeconds(64);
////                testNGCucumberRunner.finish();
//        }
//        @BeforeTest
//        @Parameters("deviceName")
//        public void parameterTest(String deviceName) {
//                System.out.println("Parameterized value deviceName : " + deviceName);
//                DeviceName=deviceName;
//        }

}