package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class DashboardPageObjects extends TestBase {

    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(DashboardPageObjects.class);
    AndroidUtility androidUtility;

    public DashboardPageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By addNewAppliBtn = By.xpath("//android.view.View[@content-desc='New application']");
    By addNewAppliBtnArabic = By.xpath("//android.view.View[@content-desc='تطبيق جديد']");
    By myApplicationTab = By.xpath("//android.view.View[@content-desc='My Applications']");
    By myApplicationTabArabic = By.xpath("//android.view.View[@content-desc='تطبيقاتي']");
    By unClaimApplicationTab = By.xpath("//android.view.View[@content-desc='Unclaimed Applications']");
    By unClaimApplicationTabArabic = By.xpath("//android.view.View[@content-desc='التطبيقات غير المطالب بها']");
    By completedApplicationTab = By.xpath("//android.view.View[@content-desc='Completed Applications']");
    By completedApplicationTabArabic = By.xpath("//android.view.View[@content-desc='الطلبات المكتملة']");
    By activeApplicationTab = By.xpath("//android.view.View[@content-desc='Active Applications']");
    By activeApplicationTabArabic = By.xpath("//android.view.View[@content-desc='تطبيقات نشطة']");
    By searchBox = By.xpath("//*[@content-desc='Search...']");
    By searchBoxArabic = By.xpath("//*[@content-desc='بحث...']");

    public void isDashboardPage() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(addNewAppliBtn);
        Boolean b1 = genericMethods.isElementPresent(addNewAppliBtnArabic);
        if (Boolean.TRUE.equals(b)) {
            log.info("user in dashboardPage");
        } else if (Boolean.TRUE.equals(b1)) {
            log.info("user in dashboardPage");
        } else {
            log.debug("dashboard page is not launched");
        }

    }

    public void isMyapplication() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(myApplicationTab);
        Boolean b1 = genericMethods.isElementPresent(myApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(myApplicationTab));
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(myApplicationTabArabic));
        } else {
            log.debug("myapplication tab not visible");
        }
    }

    public void isUnclaimedApplicaion() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(unClaimApplicationTab);
        Boolean b1 = genericMethods.isElementPresent(unClaimApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(unClaimApplicationTab));
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(unClaimApplicationTabArabic));
        } else {
            log.debug("unclaimed application tab is not visible");
        }
    }

    public void isCompletedApplicaion() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(completedApplicationTab);
        Boolean b1 = genericMethods.isElementPresent(completedApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(completedApplicationTab));
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(completedApplicationTabArabic));
        } else {
            log.debug("completed application tab is not visible");
        }
    }

    public void isActiveApplicaion() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(activeApplicationTab);
        Boolean b1 = genericMethods.isElementPresent(activeApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(activeApplicationTab));
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(activeApplicationTabArabic));
        } else {
            log.debug("active application tab is not visible");
        }
    }

    public void isScrollTill10ApplicationList() throws Exception {
        waitUtility.waitForSeconds(2);
        AndroidDriver drive = (AndroidDriver) driver;
        drive.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"10\"))");
        waitUtility.waitForSeconds(2);

    }

    public void isActive10ApplicationPresent() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(activeApplicationTab);
        Boolean b1= genericMethods.isElementPresent(activeApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(activeApplicationTab));
            genericMethods.click(activeApplicationTab);
            waitUtility.waitForSeconds(2);
            AndroidDriver drive = (AndroidDriver) driver;
            drive.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"10\"))");
            waitUtility.waitForSeconds(2);
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(activeApplicationTabArabic));
            genericMethods.click(activeApplicationTabArabic);
            waitUtility.waitForSeconds(2);
            AndroidDriver drive = (AndroidDriver) driver;
            drive.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"10\"))");
            waitUtility.waitForSeconds(2);
        } else {
            log.debug("Active application tab is not visible");
        }
    }

    public void isComplete10ApplicationPresent() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(completedApplicationTab);
        Boolean b1 = genericMethods.isElementPresent(completedApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(completedApplicationTab));
            genericMethods.click(completedApplicationTab);
            waitUtility.waitForSeconds(2);
            AndroidDriver drive = (AndroidDriver) driver;
            drive.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"10\"))");
            waitUtility.waitForSeconds(2);
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(completedApplicationTabArabic));
            genericMethods.click(completedApplicationTabArabic);
            waitUtility.waitForSeconds(2);
            AndroidDriver drive = (AndroidDriver) driver;
            drive.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"10\"))");
            waitUtility.waitForSeconds(2);
        } else {
            log.debug("Ccompleted application tab is not visible");
        }
    }



    public void isUnclaimed10ApplicationPresent() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(unClaimApplicationTab);
        Boolean b1 = genericMethods.isElementPresent(unClaimApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug(genericMethods.isElementPresent(unClaimApplicationTab));
            genericMethods.click(unClaimApplicationTab);
            waitUtility.waitForSeconds(2);
            AndroidDriver drive = (AndroidDriver) driver;
            drive.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"10\"))");
            waitUtility.waitForSeconds(2);
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug(genericMethods.isElementPresent(unClaimApplicationTabArabic));
            genericMethods.click(unClaimApplicationTabArabic);
            waitUtility.waitForSeconds(2);
            AndroidDriver drive = (AndroidDriver) driver;
            drive.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"10\"))");
            waitUtility.waitForSeconds(2);
        } else {
            log.debug("unclaimed application tab is not visible");
        }
    }

    public void searchValidation() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(searchBox);
        Boolean b1 = genericMethods.isElementPresent(searchBoxArabic);
        try {
            if (Boolean.TRUE.equals(b)) {
                genericMethods.click(searchBox);
                genericMethods.sendKeys(searchBox, "CPOB3087");
            } else if (Boolean.TRUE.equals(b1)) {
                genericMethods.click(searchBoxArabic);
                genericMethods.sendKeys(searchBoxArabic, "CPOB3087");
            } else {
                log.debug("not able to search ");
            }
        } catch (Exception e) {
            log.debug(e);
        }
    }


}
