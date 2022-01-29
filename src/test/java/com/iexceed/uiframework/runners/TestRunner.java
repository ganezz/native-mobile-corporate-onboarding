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
//
//        features = "src/test/resources/Features",
//        glue = {"com.iexceed.uiframework.stepdefinitions"},
//        tags= "@sanity_apps",
//        plugin= {"pretty",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//                "json:target/jsonReports/cucumber-reports.json","html:target/cucumber-ui-reports.html",
//                "rerun:target/failedrerun.txt"
//
//
//
//        }


)

public class TestRunner extends AbstractTestNGCucumberTests {
    private TestNGCucumberRunner testNGCucumberRunner;
    private final WaitUtility waitUtility= new WaitUtility();

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

    @SneakyThrows
    @AfterClass(alwaysRun = true)
    public void tearDownClass() {

        try {
            driver.quit();
            System.out.println("driver is closed now");
            waitUtility.waitForSeconds(77);
//                testNGCucumberRunner.finish();
        }catch(Exception e){

        }
    }


//    @BeforeTest
//    @Parameters("deviceName")
//    public void parameterTest(String deviceName) {
//        System.out.println("Parameterized value deviceName : " + deviceName);
//            DeviceName=deviceName;
//    }

    }