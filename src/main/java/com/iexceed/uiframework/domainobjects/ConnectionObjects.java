package com.iexceed.uiframework.domainobjects;

import com.iexceed.uiframework.appium.PcloudyConnection;
import com.iexceed.uiframework.broweser.PcloudyDynamicappLaunch;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.AppiumDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.iexceed.uiframework.appium.PcloudyConnection.appiumDriver;
import static com.iexceed.uiframework.broweser.AndroidConnectionUtility.androidConnectionUtilities;
import static com.iexceed.uiframework.broweser.IOSConnectionUtility.iosConnectionUtilities;

public class ConnectionObjects extends TestBase {

    PcloudyConnection createConnection;
    public static AppiumDriver<WebElement> driver;
    private final WaitUtility waitUtility;
    PcloudyDynamicappLaunch pcloudyDynamicAPPLaunch;
    private static final Logger log = LogManager.getLogger(ConnectionObjects.class);


    public ConnectionObjects(String platform) {

        if (platform.equalsIgnoreCase("Android")) {
            if (PcloudyDynamicappLaunch.getCountApp() == 0) {
                try {
                    pcloudyDynamicAPPLaunch = new PcloudyDynamicappLaunch();
                } catch (Exception e) {
                    log.debug(e);
                }
            } else {
                log.debug("App is already downloaded and uploaded to pcloudy");
            }
        }

        createConnection = new PcloudyConnection();
        waitUtility = new WaitUtility();
    }

    public  synchronized void synchronizedMethod() {
        if (driver == null) {
            driver = appiumDriver;
        } else {
            log.debug("driver is not null");
        }
    }

    public void setRemoteDeviceCapabilities(String platform, String version, String deviceName, String automationName, String applicationName, String maxDuration, String isTrusted) throws Exception {
        waitUtility.waitForSeconds(8);
        createConnection.setRemoteDeviceCapabilities(props.getProperty("pcloudyUsername"), props.getProperty("pcloudyApikey"), platform, version, deviceName, automationName, applicationName, props.getProperty("androidActivity"),props.getProperty("androidPackage"), props.getProperty("bundleID"), maxDuration, props.getProperty("deviceURL"), props.getProperty("orientation"),
                Boolean.valueOf(isTrusted), By.xpath(props.getProperty("targetCompanyName")), By.xpath(props.getProperty("trustCompanyName")), By.xpath(props.getProperty("trustBtn")));
        waitUtility.waitForSeconds(4);
        synchronizedMethod();
        if (platform.equals("Android")) {
            if (driver == null) {
                androidConnectionUtilities();
            } else {
                log.debug("Android driver is connected");
            }
        } else {
            if (driver == null) {
                iosConnectionUtilities( props.getProperty("bundleID"), applicationName, By.xpath(props.getProperty("targetCompanyName")), By.xpath(props.getProperty("trustCompanyName")), By.xpath(props.getProperty("trustBtn")));

            } else {
                log.debug("driver connected");
            }

        }
    }

    public void setRealDeviceCapabilities(String platform, String deviceName, String noReset, String automationName, String applicationName) throws Exception {
        createConnection.setRealDeviceCapabilities(platform, deviceName, automationName, applicationName, props.getProperty("androidActivity"), props.getProperty("androidPackage"), props.getProperty("deviceURL"), noReset, props.getProperty("orientation"));
        synchronizedMethod();
    }
}
