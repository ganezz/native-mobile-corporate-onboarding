package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.core.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DynamicAPPLaunch extends TestBase {

    public static AppiumDriver<?> driver;
    File f=new File("https://github.com/appium/sample-apps/raw/master/pre-built");
    File fs=new File(f,"selendroid-test-app.apk");
    private static final Logger LOGGER = LogManager.getLogger(EntityDetailsPage.class);

    public void DynamicAppCapability() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("pCloudy_Username", "sriganesh.d@i-exceed.com");
        capabilities.setCapability("pCloudy_ApiKey", "bkx8w6zydrxh6kj7xxw5t4kr");
        capabilities.setCapability("pCloudy_DurationInMinutes", 20);
        capabilities.setCapability("newCommandTimeout", 600);
        capabilities.setCapability("launchTimeout", 90000);
        capabilities.setCapability("pCloudy_DeviceManufacturer", "SAMSUNG");
        capabilities.setCapability("pCloudy_DeviceVersion", "11.0.0");
        capabilities.setCapability("platformVersion", "11.0.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UIAutomator2");
//        capabilities.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.android.vending");
        capabilities.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
        capabilities.setCapability("pCloudy_WildNet", "false");
        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("pCloudy_EnableVideo", "true");
        capabilities.setCapability("pCloudy_EnablePerformanceData", "true");
        capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
        driver = new AndroidDriver<WebElement>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);

        if (driver == null) {
            System.out.println("driver null");
        } else {
            driver.terminateApp("com.android.vending");
            Thread.sleep(2000);
            driver.installApp("https://a3.files.diawi.com/app-file/GKW1KVFCibSjaAXjvMC1.apk");


        }



    }

    public void IOSAPPLaunch() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("pCloudy_Username", "sriganesh.d@i-exceed.com");
        capabilities.setCapability("pCloudy_ApiKey", "bkx8w6zydrxh6kj7xxw5t4kr");
        capabilities.setCapability("pCloudy_DurationInMinutes", 15);
        capabilities.setCapability("newCommandTimeout", 600);
        capabilities.setCapability("launchTimeout", 90000);
        capabilities.setCapability("pCloudy_DeviceFullName", "APPLE_iPhoneXS_iOS_12.0.0_8bab6");
        capabilities.setCapability("platformVersion", "12.0.0");
        capabilities.setCapability("platformName", "ios");
        capabilities.setCapability("acceptAlerts", true);
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("pCloudy_WildNet", "true");
        capabilities.setCapability("pCloudy_EnableVideo", "true");
        capabilities.setCapability("pCloudy_EnablePerformanceData", "true");
        capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
        capabilities.setCapability("bundleId", "com.apple.Preferences");
        driver = new IOSDriver<WebElement>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);

        driver.terminateApp("com.apple.Preferences");
        System.out.println("Installing APP");
//        Map<String, Object> params = new HashMap();
//        params.put("app", "https://github.com/bitbar/testdroid-samples/raw/master/xcode/ipa/calculator.ipa");
//        driver.executeScript("mobile: installApp", new Object[]{params});
        driver.installApp("https://github.com/bitbar/test-samples/raw/master/apps/ios/bitbar-ios-sample.ipa");
        trustDevice(By.xpath(props.getProperty("targetCompanyName")), By.xpath(props.getProperty("trustCompanyName")), By.xpath(props.getProperty("trustBtn")));
//        params.put("bundleId", "com.bitbar.testdroid.BitbarIOSSample");
//        driver.executeScript("mobile: launchApp", new Object[]{params});

    }

    public static void trustDevice(By targetCompanyName, By trustCompanyName, By trustBtn) throws InterruptedException {
        LOGGER.info("activate Settings app");
        driver.activateApp("com.apple.Preferences");
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        scrollClick("General");
        Thread.sleep(2000L);

        try {
            scrollClick("Device Management");
        } catch (Exception var5) {
            scrollClick("Profiles & Device Management");
        }

        driver.findElement(targetCompanyName).click();

        try {
            driver.findElement(trustCompanyName).click();
            driver.findElement(trustBtn).click();
        } catch (Exception var4) {
            LOGGER.info("Problem with Settings");
        }

        Thread.sleep(3000L);
        LOGGER.info("terminate settings");
        driver.terminateApp("com.apple.Preferences");
    }

    public static void scrollClick(String name) {
        RemoteWebElement element = (RemoteWebElement)driver.findElement(By.xpath("//*[@name='" + name + "']"));
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap();
        scrollObject.put("element", elementID);
        scrollObject.put("toVisible", "not an empty string");
        driver.executeScript("mobile:scroll", new Object[]{scrollObject});
        element.click();
    }





}
