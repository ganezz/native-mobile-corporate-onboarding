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
import java.util.List;

import static com.iexceed.uiframework.appium.PcloudyConnection.appiumDriver;
import static com.iexceed.uiframework.appium.PcloudyConnection.launchApp;
import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class IOSConnectionUtility extends TestBase {


    private static final Logger log = LogManager.getLogger(IOSConnectionUtility.class);

    public static void iosConnectionUtilities(String pcloudyUsername, String pcloudyApikey, String platform, String version, String automationName, Boolean isTrustDevice, String bundleID, String applicationName, By targetCompanyName, By trustCompanyName, By trustBtn) {
        String bundleId="bundleID";
        List<String> listIOS = new ArrayList<>();
        listIOS.add("APPLE_iPhone7_iOS_13.1.3_316f0");
        listIOS.add("APPLE_iPhone7plus_iOS_13.3.1_ce483");
        listIOS.add("APPLE_iPhoneX_iOS_14.0.0_1b718");
        for (String DeviceName : listIOS) {

            if (driver == null) {
                try {
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("pCloudy_Username",pcloudyUsername );
                    capabilities.setCapability("pCloudy_ApiKey", pcloudyApikey);
                    capabilities.setCapability("pCloudy_DurationInMinutes", 12);
                    capabilities.setCapability("newCommandTimeout", 600);
                    capabilities.setCapability("launchTimeout", 90000);
                    capabilities.setCapability("pCloudy_DeviceFullName", DeviceName);
                    capabilities.setCapability("platformVersion", version);
                    capabilities.setCapability("platformName", platform);
                    capabilities.setCapability("acceptAlerts", true);
                    capabilities.setCapability("automationName", automationName);
                    capabilities.setCapability("pCloudy_WildNet", "true");
                    capabilities.setCapability("pCloudy_EnableVideo", "true");
                    capabilities.setCapability("pCloudy_EnablePerformanceData", "true");
                    capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
                    Boolean b=isTrustDevice;
                    if (Boolean.TRUE.equals(b)) {
                        capabilities.setCapability("bundleId", "com.apple.Preferences");
                        driver = new IOSDriver<>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
                        appiumDriver = driver;
                        log.debug("driver connceted Device:{}", DeviceName );
                        launchApp(bundleID, applicationName, targetCompanyName, trustCompanyName, trustBtn);

                    } else {
                        capabilities.setCapability("pCloudy_ApplicationName", applicationName);
                        capabilities.setCapability(bundleId, bundleID);
                        driver = new IOSDriver<>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);

                    }
                } catch (InterruptedException | MalformedURLException ie) {
                    log.debug(ie);
                    Thread.currentThread().interrupt();
                }
            } else {
                log.debug("driver is not null,its running ");
            }

        }
    }



}










