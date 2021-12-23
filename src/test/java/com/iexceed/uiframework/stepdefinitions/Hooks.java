package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static com.iexceed.uiframework.broweser.pcloudyDynamicAPPLaunch.appURL;
import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class Hooks extends TestBase {



    @Before()
    public  void init(){
        System.out.println("Starting scenario");

    }

    @Before("@old")
    public  void bff(){
        Map<String, String> deviceConfig;
        System.out.println("Before scenario for old url");
//        deviceConfig = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("deviceSheetName"), props.getProperty(testcase));
//        System.out.println(deviceConfig.get("oldAppURL"));
        appURL =props.getProperty("androidApplicationURL");


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


    @AfterMethod
    public void endTest() throws  IOException {

        driver.quit();
    }

}
