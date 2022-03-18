package com.iexceed.uiframework.broweser;


import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.utilites.WaitUtility;
import com.ssts.pcloudy.Connector;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class PcloudyDynamicappLaunch extends TestBase {

    Connector pCloudyCONNECTOR = new Connector();
    static String appURL = null;
    static File f2;
    static String renamedFilePath;
    static String renamedAppPath;
     static int countApp = 0;
    private static final Logger log = LogManager.getLogger(PcloudyDynamicappLaunch.class);
    public static WebDriver chromeDriver;

    static String appDownloadFilePath = props.getProperty("downloadFilepath");
    private static final WaitUtility waitUtility = new WaitUtility();

    public PcloudyDynamicappLaunch() throws Exception {
        chromeAPPlaunch();
        log.debug("app download to local");
        Thread.sleep(3000);
        String authToken = pCloudyCONNECTOR.authenticateUser("sriganesh.d@i-exceed.com", "bkx8w6zydrxh6kj7xxw5t4kr");
        try {
            pCloudyCONNECTOR.uploadApp(authToken, new File(renamedAppPath));
        } catch (Exception e) {
            log.debug(e);
        }
        Thread.sleep(3000);
        log.debug("app uploaded to pcloudy");
    }

    public static int getCountApp() {
        return countApp++;
    }

    public static void chromeAPPlaunch() throws Exception {

        appURL = launchApp();
        String[] arr = appURL.split("//");
        String temp1 = arr[0] + "//readuser:Re@d@1234@";
        appURL = temp1 + arr[1];
        log.debug(appURL);
        String appURLtemp = "https://artifactory.appzillon.com/artifactory/android-apk/ao/automation/qaDebug-1.0.22-17-03-2022-17:10.apk";
        log.debug(appURLtemp);
        chromeDriver=TestBase.pcloudyInitialization(appURL);
        Thread.sleep(15000);
        waitUntilFileToDownload(appDownloadFilePath);
        fileRenaming();
        chromeDriver.quit();
    }


    public static void waitUntilFileToDownload(String folderLocation) {

        File directory = new File(folderLocation);
        boolean downloadinFilePresence = false;
        File[] filesList = null;
        Boolean filePresent = true;


        while (true) {
            filesList = directory.listFiles();
            for (File file : filesList) {
                downloadinFilePresence = file.getName().contains(".apk");
                String fn1 = file.getName();
                log.debug(fn1);
                log.debug(file.getName().contains(".apk"));


            }
            if (downloadinFilePresence) {
                filePresent = false;
                log.debug(filePresent);
                break;
            } else {
                log.debug("app file is not present in that directory");
            }
        }
    }


    public static void fileRenaming() throws Exception, NullPointerException {
        f2 = new File("Automation-1-0-22-17-3-2022");
        renamedFilePath = f2.getName();
        log.debug("Renamed f2 file path :{}", renamedFilePath);
        waitUtility.waitForSeconds(3);
        File newfile = getTheNewestFile(appDownloadFilePath, "apk");
        waitUtility.waitForSeconds(4);
        if (newfile == null) {
            log.debug("file is nullable");
        } else {
          Boolean b= newfile.renameTo(new File(appDownloadFilePath + File.separator + f2 + ".apk"));
            log.debug(b);
            waitUtility.waitForSeconds(7);
            renamedAppPath = appDownloadFilePath + File.separator + f2 + ".apk";
            log.debug("Renamed apk path :{}", renamedAppPath);
            String filename = newfile.getName();
            log.debug("latest apk file is:{}", filename);
            File updated = getTheNewestFile(appDownloadFilePath, "apk");
            log.debug("Changed apk file name is :{}", updated);
        }

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

    public static String launchApp() throws IOException {

        java.io.InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("my.properties");
        java.util.Properties properties = new Properties();
        properties.load(inputStream);
        log.debug("this is app url:{}", properties.getProperty("app.url"));
        return properties.getProperty("app.url");

    }


}
