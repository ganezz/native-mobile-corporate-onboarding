package com.iexceed.uiframework.broweser;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static com.iexceed.uiframework.appium.PcloudyConnection.appiumDriver;
import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;
public class AndroidConnectionUtility {


    private static final Logger log = LogManager.getLogger(AndroidConnectionUtility.class);

    public AndroidConnectionUtility(){

        List<String> list = new ArrayList<>();
        list.add("LENOVO_M10Plus_Android_10.0.0_2ba36");
        list.add("SAMSUNG_GalaxyTabS4_Android_10.0.0_2133b");
                for (String appName : list) {

                if (driver == null) {
                    try{
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("pCloudy_Username", "sriganesh.d@i-exceed.com");
                    capabilities.setCapability("pCloudy_ApiKey", "bkx8w6zydrxh6kj7xxw5t4kr");
                    capabilities.setCapability("pCloudy_DurationInMinutes", 78);
                    capabilities.setCapability("newCommandTimeout", 600);
                    capabilities.setCapability("launchTimeout", 90000);
                    capabilities.setCapability("pCloudy_DeviceFullName", appName);
                    capabilities.setCapability("platformVersion", "11.0.0");
                    capabilities.setCapability("platformName", "Android");
                    capabilities.setCapability("automationName", "uiautomator2");
                    capabilities.setCapability("pCloudy_ApplicationName", "Automation-1-0-8-03-01-2022.apk");
                    capabilities.setCapability("appPackage", "com.iexceed.assistedonboardingapp.qa");
                    capabilities.setCapability("appActivity", "com.iexceed.assistedonboardingapp.assistedonboarding.AssistedOnboardingActivity");
                    capabilities.setCapability("pCloudy_WildNet", "true");
                    capabilities.setCapability("pCloudy_EnableVideo", "true");
                    capabilities.setCapability("pCloudy_EnablePerformanceData", "false");
                    capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
                    driver = new AndroidDriver<>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
                        appiumDriver=driver;
                    log.debug("Device:"+appName+"driver connceted");

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









