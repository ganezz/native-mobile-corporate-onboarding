package com.iexceed.uiframework.broweser;


import com.iexceed.uiframework.core.TestBase;
import com.ssts.pcloudy.Connector;
import com.ssts.pcloudy.dto.file.PDriveFileDTO;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileFilter;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Properties;

public class pcloudyDynamicAPPLaunch extends TestBase {

    public static AndroidDriver<?> driver;
    Connector pCloudyCONNECTOR = new Connector();
    String appURL;
    static File f2;
    static String renamedFilePath;
    static String renamedAppPath;
    public static int countApp = 0;
    private static final Logger log = LogManager.getLogger(pcloudyDynamicAPPLaunch.class);

    public pcloudyDynamicAPPLaunch() throws Exception {

        chromeAPPlaunch();
        log.debug("app download to local");
        Thread.sleep(3000);
        String authToken = pCloudyCONNECTOR.authenticateUser("sriganesh.d@i-exceed.com", "bkx8w6zydrxh6kj7xxw5t4kr");
        try {
            PDriveFileDTO pDriveFile = pCloudyCONNECTOR.uploadApp(authToken, new File(renamedAppPath));
        } catch (Exception e) {
            System.out.println(e);
        }
        Thread.sleep(3000);
      log.debug("app uploaded to pcloudy");
    }


    public int chromeAPPlaunch() throws Exception {


        appURL = launchApp();
        String[] arr = appURL.split("//");
        String temp1 = arr[0] + "//readuser:Re@d@1234@";
        appURL = temp1 + arr[1];
        log.debug(appURL);

        if (appURL.equals(props.getProperty("androidApplicationURL"))) {
            appURL = props.getProperty("androidApplicationURL");
        }

        log.debug(appURL);
        TestBase.pcloudyInitialization(appURL);
//        TestBase.pcloudyInitialization("http://readuser:Re@d@1234@20.80.0.230:8082/artifactory/android-apk/ao/manual/qaRelease-1.0.5-06-12-2021-19:31.apk");
        Thread.sleep(15000);
        waitUntilFileToDownload(props.getProperty("downloadFilepath"));
        fileRenaming();
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
                downloadinFilePresence = file.getName().contains(".apk");
                String fn1 = file.getName();
                log.debug(fn1);
                log.debug(file.getName().contains(".apk"));


            }
            if (downloadinFilePresence) {
                filePresent = false;

                break;
            } else {
                log.debug("app file is not present in that directory");
            }
        }
    }


    public void fileRenaming() throws InterruptedException {

        LocalDate currentdate = LocalDate.now();
        Month currentMonth = currentdate.getMonth();
        int currentDate = currentdate.getDayOfMonth();
//        f2 = new File("App" + currentMonth + currentDate);
        f2 = new File("Automation-1-0-7-21-12-2021");
        renamedFilePath = f2.getName();
        log.debug("Renamed f2 file path " + renamedFilePath);
        Thread.sleep(2000);

        File newfile = getTheNewestFile(props.getProperty("downloadFilepath"), "apk");
        Thread.sleep(4000);
        newfile.renameTo(new File(props.getProperty("downloadFilepath") + "/" + f2 + ".apk"));
        Thread.sleep(7000);
        renamedAppPath = props.getProperty("downloadFilepath") + "/" + f2 + ".apk";
        log.debug("Renamed apk path " + renamedAppPath);
        String filename = newfile.getName();
       log.debug("latest apk file is=" + filename);
        File updated = getTheNewestFile(props.getProperty("downloadFilepath"), "apk");
        log.debug("Changed apk file name is =" + updated);


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

    public static String launchApp() throws Exception {

        java.io.InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("my.properties");
        java.util.Properties properties = new Properties();
        properties.load(inputStream);
        log.debug("this is app url" + properties.getProperty("app.url"));
        return properties.getProperty("app.url");

    }


}
