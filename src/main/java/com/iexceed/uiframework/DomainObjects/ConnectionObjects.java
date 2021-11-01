package com.iexceed.uiframework.DomainObjects;

import com.iexceed.uiframework.appium.PcloudyConnection;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static com.iexceed.uiframework.appium.PcloudyConnection.appiumDriver;

public class ConnectionObjects {

    PcloudyConnection createConnection;
    public static AppiumDriver<WebElement> driver;
    private final WaitUtility waitUtility;


    public ConnectionObjects() {
        createConnection = new PcloudyConnection();
        waitUtility = new WaitUtility();
    }


    public void setRemoteDeviceCapabilities(String pcloudyUsername, String pcloudyApikey, String platform, String version, String deviceName, String automationName, String applicationName, String androidActivity, String androidPackage, String bundleID, String maxDuration, String deviceURL, String orientation, String isTrusted, By targetCompanyName, By trustCompanyName, By trustBtn) throws Exception {
       waitUtility.waitForSeconds(6);
        createConnection.setRemoteDeviceCapabilities(pcloudyUsername, pcloudyApikey, platform, version, deviceName, automationName, applicationName, androidActivity, androidPackage, bundleID, maxDuration, deviceURL, orientation, Boolean.valueOf(isTrusted), targetCompanyName, trustCompanyName, trustBtn);
        waitUtility.waitForSeconds(2);
        driver = appiumDriver;
    }

    public void setRealDeviceCapabilities(String platform, String deviceName, String automationName, String applicationName, String androidActivity, String androidPackage, String deviceURL, String noReset, String orientation) throws Exception {
        createConnection.setRealDeviceCapabilities(platform, deviceName, automationName, applicationName, androidActivity, androidPackage, deviceURL, noReset, orientation);
        driver = appiumDriver;
    }
}
