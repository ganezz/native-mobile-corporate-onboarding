package com.iexceed.uiframework.broweser;

import com.iexceed.uiframework.core.TestBase;
import io.appium.java_client.ios.IOSDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.iexceed.uiframework.appium.PcloudyConnection.appiumDriver;
import static com.iexceed.uiframework.appium.PcloudyConnection.trustDevice;
import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class IOSConnectionUtility extends TestBase {


    private static final Logger log = LogManager.getLogger(IOSConnectionUtility.class);

    public IOSConnectionUtility(Boolean isTrustDevice, String bundleID, String applicationName, By targetCompanyName, By trustCompanyName, By trustBtn) {

        List<String> list = new ArrayList<>();
        list.add("APPLE_iPhone7_iOS_13.1.3_316f0");
        list.add("APPLE_iPhone7plus_iOS_13.3.1_ce483");
        list.add("APPLE_iPhoneX_iOS_14.0.0_1b718");
        for (String appName : list) {

            if (driver == null) {
                try {
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("pCloudy_Username", "sriganesh.d@i-exceed.com");
                    capabilities.setCapability("pCloudy_ApiKey", "bkx8w6zydrxh6kj7xxw5t4kr");
                    capabilities.setCapability("pCloudy_DurationInMinutes", 12);
                    capabilities.setCapability("newCommandTimeout", 600);
                    capabilities.setCapability("launchTimeout", 90000);
                    capabilities.setCapability("pCloudy_DeviceFullName", appName);
                    capabilities.setCapability("platformVersion", "13.1.3");
                    capabilities.setCapability("platformName", "ios");
                    capabilities.setCapability("acceptAlerts", true);
                    capabilities.setCapability("automationName", "XCUITest");
                    capabilities.setCapability("pCloudy_WildNet", "true");
                    capabilities.setCapability("pCloudy_EnableVideo", "true");
                    capabilities.setCapability("pCloudy_EnablePerformanceData", "true");
                    capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
                    if (isTrustDevice) {
                        capabilities.setCapability("bundleId", "com.apple.Preferences");
                        driver = new IOSDriver<>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
                        appiumDriver = driver;
                        log.debug("Device:" + appName + "driver connceted");
                        launchApp(bundleID, applicationName, targetCompanyName, trustCompanyName, trustBtn);


                    } else {
                        capabilities.setCapability("pCloudy_ApplicationName", applicationName);
                        capabilities.setCapability("bundleId", bundleID);
                        driver = new IOSDriver<>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);

                    }


                } catch (Exception e) {
                    log.debug(e);
                }
            } else {
                log.debug("driver is not null,its running ");
            }

        }
    }


    public void launchApp(String bundleId, String app, By targetCompanyName, By trustCompanyName, By trustBtn) throws InterruptedException, MalformedURLException {
        HashMap<String, Object> args = new HashMap();
        args.put("app", app);
        args.put("bundleId", bundleId);
        log.info("driver connected");
        appiumDriver.terminateApp("com.apple.Preferences");
        args.put("instrument", "noinstrument");
        appiumDriver.executeScript("mobile:installApp", new Object[]{args});
        System.out.println("app installed");
        trustDevice(targetCompanyName, trustCompanyName, trustBtn);
        args.put("bundleId", bundleId);
        appiumDriver.executeScript("mobile: launchApp", new Object[]{args});
        System.out.println("app launched");
        log.info("launch Application");
    }

}










