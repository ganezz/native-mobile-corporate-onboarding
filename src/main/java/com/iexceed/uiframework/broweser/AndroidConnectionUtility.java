package com.iexceed.uiframework.broweser;
import com.iexceed.uiframework.core.TestBase;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static com.iexceed.uiframework.appium.PcloudyConnection.appiumDriver;
import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class AndroidConnectionUtility extends TestBase {


    private static final Logger log = LogManager.getLogger(AndroidConnectionUtility.class);

    public static void androidConnectionUtilities(String pcloudyUsername, String pcloudyApikey, String platform, String version, String automationName, String applicationName, String androidActivity, String androidPackage){
        List<String> list = new ArrayList<>();
        list.add("LENOVO_M10Plus_Android_10.0.0_2ba36");
        list.add("SAMSUNG_GalaxyTabS4_Android_10.0.0_2133b");
        list.add("SAMSUNG_GalaxyTabS5e_Android_11.0.0_cb1ca");

        for (String appName : list) {

            if (driver == null) {
                try{
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("pCloudy_Username", pcloudyUsername);
                    capabilities.setCapability("pCloudy_ApiKey", pcloudyApikey);
                    capabilities.setCapability("pCloudy_DurationInMinutes", 78);
                    capabilities.setCapability("newCommandTimeout", 600);
                    capabilities.setCapability("launchTimeout", 90000);
                    capabilities.setCapability("pCloudy_DeviceFullName", appName);
                    capabilities.setCapability("platformVersion", version);
                    capabilities.setCapability("platformName", platform);
                    capabilities.setCapability("automationName", automationName);
                    capabilities.setCapability("pCloudy_ApplicationName", applicationName);
                    capabilities.setCapability("appPackage", androidPackage);
                    capabilities.setCapability("appActivity", androidActivity);
                    capabilities.setCapability("pCloudy_WildNet", "true");
                    capabilities.setCapability("pCloudy_EnableVideo", "true");
                    capabilities.setCapability("pCloudy_EnablePerformanceData", "false");
                    capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
                    driver = new AndroidDriver<>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
                    appiumDriver=driver;
                    log.debug(" driver connceted using Device:{}",appName);

                }catch(Exception e){
                    log.debug(e);
                }
            }
            else{
                log.debug("driver is not null,its running ");
            }

        }
    }


}
