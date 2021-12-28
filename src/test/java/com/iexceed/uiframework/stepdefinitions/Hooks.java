package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class Hooks extends TestBase {
    private final WaitUtility waitUtility= new WaitUtility();;


    @Before()
    public  void init(){
        System.out.println("Starting scenario");

    }

    @Before("@old")
    public  void bff(){
//        Map<String, String> deviceConfig;
//        System.out.println("Before scenario for old url");
//        deviceConfig = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("deviceSheetName"), props.getProperty(testcase));
//        System.out.println(deviceConfig.get("oldAppURL"));
//        appURL =props.getProperty("androidApplicationURL");


    }



    @BeforeStep()
    public  void bf(){
        System.out.println("Before scenario");

    }
    @AfterStep()
    public  void af(Scenario scenario) throws IOException {

        File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = FileUtils.readFileToByteArray(src);
        scenario.attach(fileContent,"image/png","screenshot");
    }
//
//    @After("not @api")
//    public void teardown(Scenario scenario) throws Exception {
//       /* if(scenario.isFailed()){
//            System.out.println("taking screenshot");
//            final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot,"image/png","screenshot");
//
//        }*/
//
//      //  VideoRecorder_utlity.stopRecord();
//        driver.quit();
//    }

//
//   @After("not @api")
//    public void teardown(Scenario scenario) throws Exception {
//        driver.quit();
//    }


    @AfterClass
    public void teardowns(Scenario scenario) throws Exception {
        driver.quit();
        waitUtility.waitForSeconds(30);
    }

}
