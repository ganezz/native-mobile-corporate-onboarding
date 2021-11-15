package com.iexceed.uiframework.broweser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;

public class lauchWebBrowser {

public static void main(String args[]) throws InterruptedException {
    String downloadFilepath = "src/main/resources";
    System.setProperty("webdriver.chrome.driver", "/home/divyabharathi/Downloads/chromedriver_linux64/chromedriver");

    ChromeOptions options = new ChromeOptions();
    HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
    chromePrefs.put("profile.default_content_settings.popups", 0);
    chromePrefs.put("download.default_directory", downloadFilepath);
//    chromePrefs.put("--safebrowsing-disable-extension-blacklist", "true");
    chromePrefs.put("download.prompt_for_download", "true");
    options.addArguments("--disable-web-security");
    options.addArguments("disable-popup-blocking");
    options.addArguments("--allow-running-insecure-content");
    options.addArguments("--disable-notifications");
//    options.addArguments("--safebrowsing-disable-extension-blacklist");
//    options.addArguments("--safebrowsing-disable-download-protection");
    options.setExperimentalOption("prefs", chromePrefs);


    DesiredCapabilities cap = DesiredCapabilities.chrome();

//    cap.setCapability("safebrowsing-disable-extension-blacklist", true);
//    cap.setCapability("safebrowsing-disable-download-protection", true);
//    cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    cap.setCapability(ChromeOptions.CAPABILITY, options);
    WebDriver driver = new ChromeDriver(options);
    Thread.sleep(2000);


    driver.get("https://github.com/appium/sample-apps/raw/master/pre-built/ContactManager.apk");

//    driver.findElement(By.xpath("//a[@id='raw-url']")).click();


}
}
