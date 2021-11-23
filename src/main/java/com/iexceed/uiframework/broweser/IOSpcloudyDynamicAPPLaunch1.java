package com.iexceed.uiframework.broweser;


import com.iexceed.uiframework.core.TestBase;
import com.ssts.pcloudy.Connector;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.io.FileFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class IOSpcloudyDynamicAPPLaunch1 extends TestBase {


    public static AppiumDriver<?> driver;
    Connector pCloudyCONNECTOR = new Connector();
    String appURL;
    static File f2;
    public static String renamedFilePath;
    public static String renamedAppPath;
    public static int countApp = 0;
    static String AppPlatform;
    private static Logger LOGGER = LogManager.getLogger(IOSpcloudyDynamicAPPLaunch1.class);
    DesiredCapabilities capabilities = new DesiredCapabilities();
    File f = new File("src/main/resources/app");
    File fs = new File(f, "AutomationIOS-1-0-0-18-11-2021.ipa");

    String bundleID = "com.apple.Preferences";


    // App2 capabilities
    String applicationName = "AutomationIOS-1-0-0-18-11-2021.ipa";
    String bundleID2 = "com.ixceed.AssistedOnboardingApplication.automation";

    public IOSpcloudyDynamicAPPLaunch1() throws Exception {

//        chromeAPPlaunch();
//        System.out.println("app download to local");
//        Thread.sleep(3000);
//        String authToken = pCloudyCONNECTOR.authenticateUser("sriganesh.d@i-exceed.com", "bkx8w6zydrxh6kj7xxw5t4kr");
//        try {
//            PDriveFileDTO pDriveFile = pCloudyCONNECTOR.uploadApp(authToken, new File(renamedAppPath));
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        Thread.sleep(2000);
//        System.out.println("app uploaded to pcloudy");

    }


    public void DynamicAppCapability() throws MalformedURLException, MalformedURLException, InterruptedException {

        capabilities.setCapability("pCloudy_Username", "sriganesh.d@i-exceed.com");
        capabilities.setCapability("pCloudy_ApiKey", "bkx8w6zydrxh6kj7xxw5t4kr");
        capabilities.setCapability("pCloudy_DurationInMinutes", 400);
        capabilities.setCapability("newCommandTimeout", 200);
        capabilities.setCapability("launchTimeout", 90000);
        capabilities.setCapability("pCloudy_DeviceFullName", "APPLE_iPhoneSE_iOS_13.5.1_c982c");
        capabilities.setCapability("platformVersion", "13.5.1");
        capabilities.setCapability("platformName", "ios");
        capabilities.setCapability("acceptAlerts", true);
        capabilities.setCapability("automationName", "XCUITest");
//        capabilities.setCapability("pCloudy_ApplicationName", "AutomationIOS-1-0-0-18-11-2021.ipa");
        capabilities.setCapability("bundleId", "com.apple.Preferences");
        capabilities.setCapability("pCloudy_EnableVideo", "true");
        capabilities.setCapability("pCloudy_EnablePerformanceData", "true");
        capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");

        HashMap<String, Object> args = new HashMap<>();
        args.put("app","https://readuser:Re@d@1234@artifactory.appzillon.com/artifactory/iOS-ipa/ao/automated/AUTOMATIONDebug-1.0.0-20-11-2021-22%3A37/AUTOMATIONDebug-1.0.0-20-11-2021-22%3A37.ipa");
        args.put("bundleId", "com.ixceed.AssistedOnboardingApplication.automation");
        driver = new IOSDriver<WebElement>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
        System.out.println("driver connected");
        driver.terminateApp("com.apple.Preferences");
//        args.put("file", "src/main/resources/app/AutomationIOS-1-0-0-18-11-2021.ipa");
        args.put("instrument", "noinstrument");
        driver.executeScript("mobile:installApp", args);
        System.out.println("app installed");
        trustDevice(By.xpath(props.getProperty("targetCompanyName")), By.xpath(props.getProperty("trustCompanyName")), By.xpath(props.getProperty("trustBtn")));
        args.put("bundleId", "com.ixceed.AssistedOnboardingApplication.automation");
        driver.executeScript("mobile: launchApp", args);
        System.out.println("app launched");
        LOGGER.info("launch Application");

    }


    public static void trustDevice(By targetCompanyName, By trustCompanyName, By trustBtn) throws InterruptedException {
        LOGGER.info("activate Settings app");
        driver.activateApp("com.apple.Preferences");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        scrollClick("General");
        Thread.sleep(2000);
        try {
            scrollClick("Device Management");
        } catch (Exception e) {
            scrollClick("Profiles & Device Management");
        }
        driver.findElement(targetCompanyName).click();
        Thread.sleep(1000);
        if(driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Trust “i-exceed technology solutions private limited”']")).isDisplayed())
        {
            driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Trust “i-exceed technology solutions private limited”']")).click();
        }else{
            LOGGER.info("Problem with Settings");
        }

        driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Trust']")).click();
        Thread.sleep(3000);
        LOGGER.info("terminate settings");
        driver.terminateApp("com.apple.Preferences");
    }

    public static void scrollClick(String name) {
        RemoteWebElement element = (RemoteWebElement) driver.findElement(By.xpath("//*[@name='" + name + "']"));
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", elementID);
        scrollObject.put("toVisible", "not an empty string");
        driver.executeScript("mobile:scroll", scrollObject);
        element.click();
    }


    public int chromeAPPlaunch() throws Exception {

//        appURL = launchApp();
//        TestBase.pcloudyInitialization(appURL);

        TestBase.pcloudyInitialization("https://readuser:Re@d@1234@artifactory.appzillon.com/artifactory/iOS-ipa/ao/automated/AUTOMATIONDebug-1.0.0-20-11-2021-22%3A37/AUTOMATIONDebug-1.0.0-20-11-2021-22%3A37.ipa");

        Thread.sleep(10000);
        waitUntilFileToDownload(props.getProperty("downloadFilepath"));
        fileRenaming(AppPlatform);
        ++countApp;
        return countApp;

    }


    public static void waitUntilFileToDownload(String folderLocation) throws InterruptedException {

        File directory = new File(folderLocation);
        boolean downloadinFilePresence = false;
        File[] filesList = null;
        Boolean filePresent = true;


        while (filePresent) {
            filesList = directory.listFiles();
            for (File file : filesList) {


                downloadinFilePresence = file.getName().contains(".ipa");
                String fn1 = file.getName();
                System.out.println(fn1);
                System.out.println(file.getName().contains(".ipa"));


            }
            if (downloadinFilePresence) {
                filePresent = false;

                break;
            } else {
                System.out.println("app file is not present in that directory");
            }
        }
    }


    public void fileRenaming(String platform) throws InterruptedException {

        LocalDate currentdate = LocalDate.now();
        Month currentMonth = currentdate.getMonth();
        int currentDate = currentdate.getDayOfMonth();
//        f2 = new File("App" + currentMonth + currentDate);
        f2 = new File("AutomationIOS-1-0-0-18-11-2021");
        renamedFilePath = f2.getName();
        System.out.println("Renamed f2 file path " + renamedFilePath);
        Thread.sleep(2000);

        File newfile = getTheNewestFile(props.getProperty("downloadFilepath"), "ipa");
        newfile.renameTo(new File(props.getProperty("downloadFilepath") + "/" + f2 + ".ipa"));
        Thread.sleep(2000);
        renamedAppPath = props.getProperty("downloadFilepath") + "/" + f2 + ".ipa";
        System.out.println("Renamed ipa path " + renamedAppPath);
        String filename = newfile.getName();
        System.out.println("latest ipa file is=" + filename);

        File updated = getTheNewestFile(props.getProperty("downloadFilepath"), "ipa");
        System.out.println("Changed ipa file name is =" + updated);

    }

    public static File getTheNewestFile(String filePath, String ext) {
        File theNewestFile = null;
        File dir = new File(filePath);
        FileFilter fileFilter = new WildcardFileFilter("*." + ext);
        File[] files = dir.listFiles(fileFilter);

        if (files.length > 0) {
            /* The newest file comes first */
            Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
            theNewestFile = files[0];
        }

        return theNewestFile;
    }

    public String launchApp() throws Exception {

        java.io.InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("my.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println("this is app url" + properties.getProperty("app.url"));
        return properties.getProperty("app.url");

    }


}
