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

    public static void iosConnectionUtilities(String bundleID, String applicationName, By targetCompanyName, By trustCompanyName, By trustBtn) {
        List<String> listIOS = new ArrayList<>();


        /**
         *
         *
         */

        listIOS.add("APPLE_iPad7_iOS_14.0.1_7de055");
        listIOS.add("APPLE_iPadPro3_iOS_14.7.1_c7375");
        listIOS.add("APPLE_iPad8thGen_iOS_14.4.2_d5dd0");
        listIOS.add("APPLE_iPad9.7(5thGen)_iOS_14.2.0_b2772");
        listIOS.add("APPLE_iPad_iOS_14.6.0_18525");
        listIOS.add("APPLE_iPad9.7_iOS_14.4.0_a1d17");
        listIOS.add("APPLE_iPad8thGen_iOS_15.1.0_7c2de");
        listIOS.add("APPLE_iPad9.7_iOS_14.3.0_a13e3");
        listIOS.add("APPLE_iPad_iOS_13.7.0_c08f6");

        for (String DeviceName : listIOS) {

            if (driver == null) {
                try {
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("pCloudy_Username", "sriganesh.d@i-exceed.com");
                    capabilities.setCapability("pCloudy_ApiKey", "bkx8w6zydrxh6kj7xxw5t4kr");
                    capabilities.setCapability("pCloudy_DurationInMinutes", 800);
                    capabilities.setCapability("newCommandTimeout", 600);
                    capabilities.setCapability("launchTimeout", 90000);
                    capabilities.setCapability("pCloudy_DeviceFullName", DeviceName);
                    capabilities.setCapability("platformVersion", "13.1.3");
                    capabilities.setCapability("platformName", "ios");
                    capabilities.setCapability("unicodeKeyboard", true);
                    capabilities.setCapability("resetKeyboard", true);
                    capabilities.setCapability("acceptAlerts", true);
                    capabilities.setCapability("automationName", "XCUITest");
                    capabilities.setCapability("pCloudy_WildNet", "true");
                    capabilities.setCapability("pCloudy_EnableVideo", "true");
                    capabilities.setCapability("pCloudy_EnablePerformanceData", "true");
                    capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
                    capabilities.setCapability("bundleId", "com.apple.Preferences");
                    try {
                        driver = new IOSDriver<>(new URL("https://us.pcloudy.com/appiumcloud/wd/hub"), capabilities);
                        log.debug("driver connceted Device:{}", DeviceName);
                    } catch (Exception e) {
                        log.debug(e);
                    }
                    if (driver != null) {
                        appiumDriver = driver;
                        launchApp(bundleID, applicationName, targetCompanyName, trustCompanyName, trustBtn);
                    }
                } catch (InterruptedException | MalformedURLException ie) {
                    log.debug(ie);

                }
            } else {
                log.debug("driver is not null,its running ");
            }

        }
    }


}










