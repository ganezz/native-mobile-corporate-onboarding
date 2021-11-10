package com.iexceed.uiframework.pageobjects.android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class DynamicAPPLaunch {

    public static AndroidDriver<?> driver;
//    static File appURL= new File("/home/divyabharathi/Downloads/General-Store.apk");
//    static String appURL1="https://a4.files.diawi.com/app-file/IZGnTYhpBzdeGo1jlaje.apk";
//    static String appURL1;
    public void DynamicAppCapability() throws MalformedURLException {
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
        capabilities.setCapability("automationName", "uiautomator2");
//        capabilities.setCapability("app", "http://20.80.0.230:8082/artifactory/android-apk/ao/manual/devDebug-1.0.0-09-11-2021-16:03.apk");
        capabilities.setCapability("appPackage", "com.android.vending");
        capabilities.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
        capabilities.setCapability("pCloudy_WildNet", "true");
        capabilities.setCapability("pCloudy_EnableVideo", "true");
        capabilities.setCapability("pCloudy_EnablePerformanceData", "true");
        capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
        driver = new AndroidDriver<WebElement>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
    }

    public void launchApp() throws Exception {

        java.io.InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("my.properties");
        java.util.Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println("this is app url1");
        String Appurl = properties.getProperty("app.url");
        System.out.println("this is app url"+properties.getProperty("app.url"));
        System.out.println("this is app url2");
//        driver.closeApp();
        System.out.println("app closed");
//        driver.installApp("Appurl");



    }
}
