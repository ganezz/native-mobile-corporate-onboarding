package com.iexceed.uiframework.broweser;


import com.iexceed.uiframework.core.TestBase;
import com.ssts.pcloudy.Connector;
import com.ssts.pcloudy.dto.file.PDriveFileDTO;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Properties;

public class pcloudyDynamicAPPLaunch extends TestBase {

    public static AndroidDriver<?> driver;
    Connector pCloudyCONNECTOR = new Connector();
    String appURL;
    static File f2;
   public static String renamedFilePath;
    public static String renamedAppPath;

    public pcloudyDynamicAPPLaunch() throws Exception {
        chromeAPPlaunch();
        System.out.println("app download to local");
        Thread.sleep(3000);
        String authToken = pCloudyCONNECTOR.authenticateUser("sriganesh.d@i-exceed.com", "bkx8w6zydrxh6kj7xxw5t4kr");
        try {
            PDriveFileDTO pDriveFile = pCloudyCONNECTOR.uploadApp(authToken, new File(renamedAppPath));
        }catch(Exception e){
            System.out.println(e);
        } Thread.sleep(10000);
        System.out.println("app uploaded to pcloudy");
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
        capabilities.setCapability("pCloudy_ApplicationName", "Automation-1-0-0-18-11-2021.apk");
        capabilities.setCapability("appPackage", "com.iexceed.assistedonboardingapp.automation");
        capabilities.setCapability("appActivity", "com.iexceed.assistedonboardingapp.assistedonboarding.AssistedOnboardingActivity");
        capabilities.setCapability("pCloudy_EnableVideo", "true");
        capabilities.setCapability("pCloudy_EnablePerformanceData", "true");
        capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
        driver = new AndroidDriver<WebElement>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);


        System.out.println(driver.isAppInstalled("com.example.android.contactmanager"));


    }


    public void downloadApp_browser() throws Exception {

        System.setProperty(props.getProperty("com.iexceed.firefox.driverPath"), props.getProperty("driverPath"));
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("browser.download.dir", "/home/divyabharathi/2AutomationWOrkspace/MobileAutomationWorkspace/native-mobile-corporate-onboarding/src/main/resources");
        options.addPreference("browser.download.folderList", 2);
        options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream");

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver1 = new FirefoxDriver(options);

        java.io.InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("my.properties");
        java.util.Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println("this is app url1");
        String Appurl = properties.getProperty("app.url");
        System.out.println("this is app url" + properties.getProperty("app.url"));


//        driver1.get("https://github.com/appium/sample-apps/raw/master/pre-built/ContactManager.apk");
        driver1.get(properties.getProperty("app.url"));

    }


    public void chromeAPPlaunch() throws Exception {

//        appURL = launchApp();
        TestBase.pcloudyInitialization("http://readuser:Re@d@1234@20.80.0.230:8082/artifactory/android-apk/ao/manual/automationRelease-1.0.0-18-11-2021-16:04.apk");
        Thread.sleep(2000);
        waitUntilFileToDownload(props.getProperty("downloadFilepath"));
        fileRenaming();
//        driver1.get("https://github.com/appium/sample-apps/raw/master/pre-built/ContactManager.apk");
//        driver2.get(properties.getProperty("app.url"));


    }


    public static void waitUntilFileToDownload(String folderLocation) throws InterruptedException {

        File directory = new File(folderLocation);
        boolean downloadinFilePresence = false;
        File[] filesList = null;
        Boolean filePresent = true;


        while (filePresent) {
            filesList = directory.listFiles();
            for (File file : filesList) {
                downloadinFilePresence = file.getName().contains(".apk");
                String fn1 = file.getName();
                System.out.println(fn1);
                System.out.println(file.getName().contains(".apk"));


            }
            if (downloadinFilePresence) {
                filePresent = false;

                break;
            } else {
                System.out.println("apk file is not present in that directory");
            }
        }
    }


    public void fileRenaming() throws InterruptedException {

        LocalDate currentdate = LocalDate.now();
        Month currentMonth = currentdate.getMonth();
        int currentDate = currentdate.getDayOfMonth();
//        f2 = new File("App" + currentMonth + currentDate);
        f2 = new File("Automation-1-0-0-18-11-2021");
        renamedFilePath = f2.getName();
        System.out.println("Renamed f2 file path " + renamedFilePath);
        Thread.sleep(2000);

        File newfile = getTheNewestFile(props.getProperty("downloadFilepath"), "apk");
        newfile.renameTo(new File(props.getProperty("downloadFilepath") + "/" + f2 + ".apk"));
        Thread.sleep(2000);
        renamedAppPath = props.getProperty("downloadFilepath") + "/" + f2 + ".apk";
        System.out.println("Renamed app path " + renamedAppPath);
        String filename = newfile.getName();
        System.out.println("latest file is=" + filename);

        File updated = getTheNewestFile(props.getProperty("downloadFilepath"), "apk");
        System.out.println("Changed file name is =" + updated);

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




}
