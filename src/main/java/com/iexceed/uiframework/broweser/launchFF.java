package com.iexceed.uiframework.broweser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class launchFF {


    public static void main(String[] args) throws InterruptedException {


        // System Property for Gecko Driver
        System.setProperty("webdriver.gecko.driver", "/home/divyabharathi/Downloads/geckodriver-v0.30.0-linux64/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("browser.download.dir", "/home/divyabharathi/2AutomationWOrkspace/MobileAutomationWorkspace/native-mobile-corporate-onboarding/src/main/resources");
        options.addPreference("browser.download.folderList", 2);
        options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream");
        // Initialize Gecko Driver using Desired Capabilities Class
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(options);

        // Launch Website
        driver.get("https://github.com/appium/sample-apps/raw/master/pre-built/ContactManager.apk");
        Thread.sleep(4000);

    }

}
