package com.iexceed.uiframework.domainobjects;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class AndroidConnectionUtility {

    private static AppiumDriver<?> driver;


    public static void main(String args[]) throws MalformedURLException {

        List<String> list = new ArrayList<String>();
        list.add("LENOVO_M10Plus_Android_10.0.0_2ba36");
        list.add("SAMSUNG_GalaxyTabS4_Android_10.0.0_2133b");
        list.add("SAMSUNG_GalaxyTabS6_Android_9.0.0_16c48");
        for (String appName : list) {
            while (driver == null) {
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
                    capabilities.setCapability("pCloudy_ApplicationName", "Automation-1-0-6-13-12-2021.apk");
                    capabilities.setCapability("appPackage", "com.iexceed.assistedonboardingapp.qa");
                    capabilities.setCapability("appActivity", "com.iexceed.assistedonboardingapp.assistedonboarding.AssistedOnboardingActivity");
                    capabilities.setCapability("pCloudy_WildNet", "true");
                    capabilities.setCapability("pCloudy_EnableVideo", "true");
                    capabilities.setCapability("pCloudy_EnablePerformanceData", "false");
                    capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
                    driver = new AndroidDriver<WebElement>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
                    System.out.println(driver + "connceted");
                }
            }
        }


    }










