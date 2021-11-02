package com.iexceed.uiframework.domainObjects;

import com.iexceed.uiframework.appium.PcloudyConnection;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static com.iexceed.uiframework.appium.PcloudyConnection.appiumDriver;

public class ConnectionObjects extends TestBase {

    PcloudyConnection createConnection;
    public static AppiumDriver<WebElement> driver;
    private final WaitUtility waitUtility;


    public ConnectionObjects() {
        createConnection = new PcloudyConnection();
        waitUtility = new WaitUtility();
    }


    public void setRemoteDeviceCapabilities(String platform, String version, String deviceName,String applicationName,String maxDuration,String isTrusted) throws Exception {
       waitUtility.waitForSeconds(6);
        createConnection.setRemoteDeviceCapabilities(props.getProperty("pcloudyUsername"), props.getProperty("pcloudyApikey"), platform, version, deviceName, props.getProperty("automationName"), applicationName, props.getProperty("androidActivity"),props.getProperty("androidPackage"), props.getProperty("bundleID"), maxDuration,props.getProperty("deviceURL"), props.getProperty("orientation"),
                Boolean.valueOf(isTrusted),By.xpath(props.getProperty("targetCompanyName")), By.xpath(props.getProperty("trustCompanyName")), By.xpath(props.getProperty("trustBtn")));
        waitUtility.waitForSeconds(2);
        driver = appiumDriver;
    }

    public void setRealDeviceCapabilities(String platform, String deviceName, String applicationName,String noReset) throws Exception {
        createConnection.setRealDeviceCapabilities(platform, deviceName,  props.getProperty("automationName"), applicationName, props.getProperty("androidActivity"),props.getProperty("androidPackage"), props.getProperty("deviceURL"), noReset,props.getProperty("orientation"));
        driver = appiumDriver;
    }
}
