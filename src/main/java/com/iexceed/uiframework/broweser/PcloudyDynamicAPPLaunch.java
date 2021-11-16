package com.iexceed.uiframework.broweser;



import com.iexceed.uiframework.core.TestBase;
import com.ssts.pcloudy.Connector;
import com.ssts.pcloudy.dto.file.PDriveFileDTO;
import com.ssts.pcloudy.exception.ConnectError;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;

public class PcloudyDynamicAPPLaunch extends TestBase {

    public static AndroidDriver<?> driver;
    Connector pCloudyCONNECTOR = new Connector();
    // User Authentication over pCloudy


    public PcloudyDynamicAPPLaunch() throws Exception {
        chromeAPPlaunch();
//        downloadApp_browser();
        System.out.println("app uploaded to local");
        String authToken = pCloudyCONNECTOR.authenticateUser("sriganesh.d@i-exceed.com", "bkx8w6zydrxh6kj7xxw5t4kr");

        PDriveFileDTO pDriveFile = pCloudyCONNECTOR.uploadApp(authToken, new File("src/main/resources/ContactManager.apk"));
        Thread.sleep(2000);
        System.out.println("app uploaded");
    }

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
        capabilities.setCapability("pCloudy_ApplicationName", "ContactManager.apk");
        capabilities.setCapability("appPackage", "com.example.android.contactmanager");
        capabilities.setCapability("appActivity", "com.example.android.contactmanager.ContactManager");
        capabilities.setCapability("pCloudy_EnableVideo", "true");
        capabilities.setCapability("pCloudy_EnablePerformanceData", "true");
        capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
        driver = new AndroidDriver<WebElement>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);


        System.out.println(driver.isAppInstalled("com.example.android.contactmanager"));


    }



    public void downloadApp_browser() throws Exception {

        System.setProperty(props.getProperty("com.iexceed.firefox.driverPath"), props.getProperty("driverPath"));
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("browser.download.dir","/home/divyabharathi/2AutomationWOrkspace/MobileAutomationWorkspace/native-mobile-corporate-onboarding/src/main/resources");
        options.addPreference("browser.download.folderList", 2);
        options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream");
        // Initialize Gecko Driver using Desired Capabilities Class
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver1 = new FirefoxDriver(options);

        java.io.InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("my.properties");
        java.util.Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println("this is app url1");
        String Appurl = properties.getProperty("app.url");
        System.out.println("this is app url"+properties.getProperty("app.url"));

        // Launch Website

//        driver1.get("https://github.com/appium/sample-apps/raw/master/pre-built/ContactManager.apk");
        driver1.get(properties.getProperty("app.url"));

    }


    public void chromeAPPlaunch() throws Exception {
//        System.setProperty(props.getProperty("com.iexceed.chrome.driverPath"), props.getProperty("chromeDriver"));
//        String downloadFilepath = "/home/divyabharathi/2AutomationWOrkspace/MobileAutomationWorkspace/native-mobile-corporate-onboarding/src/main/resources";
//        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//        chromePrefs.put("profile.default_content_settings.popups", 0);
//        chromePrefs.put("download.default_directory", downloadFilepath);
//        chromePrefs.put("safebrowsing.enabled", "true");
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("prefs", chromePrefs);
//        options.addArguments("--headless");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--safebrowsing-disable-download-protection");
//
//        DesiredCapabilities cap = DesiredCapabilities.chrome();
//        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//        cap.setCapability(ChromeOptions.CAPABILITY, options);
//        ChromeDriver driver2 =new ChromeDriver(options);

        java.io.InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("my.properties");
        java.util.Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println("this is app url1");
        String Appurl = properties.getProperty("app.url");
        System.out.println("this is app url"+properties.getProperty("app.url"));

        TestBase.initialization(properties.getProperty("app.url"));
        // Launch Website

//        driver1.get("https://github.com/appium/sample-apps/raw/master/pre-built/ContactManager.apk");
//        driver2.get(properties.getProperty("app.url"));

    }
    public void launchApp() throws Exception {

        java.io.InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("my.properties");
        java.util.Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println("this is app url1");
        String Appurl = properties.getProperty("app.url");
        System.out.println("this is app url"+properties.getProperty("app.url"));
        System.out.println("this is app url2");
        try{
            driver.closeApp();
        }catch(Exception e){
            System.out.println("caught exception");
        }

        System.out.println("app closed");

    }



}
