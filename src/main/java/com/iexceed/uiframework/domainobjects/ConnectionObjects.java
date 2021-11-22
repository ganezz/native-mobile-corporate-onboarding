package com.iexceed.uiframework.domainobjects;

import com.iexceed.uiframework.appium.PcloudyConnection;
import com.iexceed.uiframework.broweser.pcloudyDynamicAPPLaunch;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.utilites.WaitUtility;
import com.ssts.pcloudy.Connector;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.iexceed.uiframework.appium.PcloudyConnection.appiumDriver;
import static com.iexceed.uiframework.broweser.pcloudyDynamicAPPLaunch.countApp;

public class ConnectionObjects extends TestBase {

    PcloudyConnection createConnection;
    public static AppiumDriver<WebElement> driver;
    private final WaitUtility waitUtility;
    Connector pCloudyCONNECTOR = new Connector();
    pcloudyDynamicAPPLaunch pcloudyDynamicAPPLaunch;


    public ConnectionObjects(String platform) throws Exception {

            if (countApp == 0) {
                pcloudyDynamicAPPLaunch = new pcloudyDynamicAPPLaunch(platform);
            } else {
                System.out.println("App is already downloaded and uploaded to pcloudy");
            }


        createConnection = new PcloudyConnection();
        waitUtility = new WaitUtility();
    }

    public synchronized void synchronizedMethod() {
        driver = appiumDriver;
    }

    public void setRemoteDeviceCapabilities(String platform, String version, String deviceName,String automationName,String applicationName, String maxDuration, String isTrusted) throws Exception {
        waitUtility.waitForSeconds(6);
        createConnection.setRemoteDeviceCapabilities(props.getProperty("pcloudyUsername"), props.getProperty("pcloudyApikey"), platform, version, deviceName,automationName,applicationName, props.getProperty("androidActivity"), props.getProperty("androidPackage"), props.getProperty("bundleID"), maxDuration, props.getProperty("deviceURL"), props.getProperty("orientation"),
                Boolean.valueOf(isTrusted), By.xpath(props.getProperty("targetCompanyName")), By.xpath(props.getProperty("trustCompanyName")), By.xpath(props.getProperty("trustBtn")));
        waitUtility.waitForSeconds(4);
        synchronizedMethod();
    }

    public void setRealDeviceCapabilities(String platform, String deviceName, String noReset,String automationName,String applicationName) throws Exception {
        createConnection.setRealDeviceCapabilities(platform, deviceName,automationName, applicationName, props.getProperty("androidActivity"), props.getProperty("androidPackage"), props.getProperty("deviceURL"), noReset, props.getProperty("orientation"));
        synchronizedMethod();
    }
}
