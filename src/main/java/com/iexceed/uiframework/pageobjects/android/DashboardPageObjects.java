package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class DashboardPageObjects extends TestBase {

    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(HomePageObjects.class);
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
    By completedApplicationTab=By.xpath("//android.view.View[@content-desc='Completed Applications']");
    By completedApplicationTabArabic=By.xpath("//android.view.View[@content-desc='الطلبات المكتملة']");
    By activeApplicationTab=By.xpath("//android.view.View[@content-desc='Active Applications']");
    By activeApplicationTabArabic=By.xpath("//android.view.View[@content-desc='تطبيقات نشطة']");
    By applicId=By.xpath("//android.view.View[@content-desc='Application ID']");
    By applicIdArabic=By.xpath("//android.view.View[@content-desc='رقم الاستمارة']");
    By sNo10=By.xpath("//android.view.View[@content-desc='10']");

    public void isDashboardPage() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b1 = genericMethods.isElementPresent(addNewAppliBtn);
        Boolean b = genericMethods.isElementPresent(addNewAppliBtnArabic);
        if (Boolean.TRUE.equals(b)) {
            log.info("user in dashboardPage");
        } else if (Boolean.TRUE.equals(b1)) {
            log.info("user in dashboardPage");
        } else {
            log.debug("dashboard page is not launched");
        }

    }

    public void isMyapplication() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b1 = genericMethods.isElementPresent(myApplicationTab);
        Boolean b = genericMethods.isElementPresent(myApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
           genericMethods.click(myApplicationTab);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.click(myApplicationTabArabic);
        } else {
            log.debug("myapplication tab clicked");
        }
    }

    public void isUnclaimedApplicaion() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b1 = genericMethods.isElementPresent(unClaimApplicationTab);
        Boolean b = genericMethods.isElementPresent(unClaimApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(unClaimApplicationTab);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.click(unClaimApplicationTabArabic);
        } else {
            log.debug("myapplication tab clicked");
        }
    }
    public void isCompletedApplicaion() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b1 = genericMethods.isElementPresent(completedApplicationTab);
        Boolean b = genericMethods.isElementPresent(completedApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(completedApplicationTab);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.click(completedApplicationTabArabic);
        } else {
            log.debug("myapplication tab clicked");
        }
    }

    public void isActiveApplicaion() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b1 = genericMethods.isElementPresent(activeApplicationTab);
        Boolean b = genericMethods.isElementPresent(activeApplicationTabArabic);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(activeApplicationTab);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.click(activeApplicationTabArabic);
        } else {
            log.debug("myapplication tab clicked");
        }
    }

    public void isScrollTill10ApplicationList() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b1 = genericMethods.isElementPresent(applicId);
        Boolean b = genericMethods.isElementPresent(applicIdArabic);

        if (Boolean.TRUE.equals(b)) {
            androidUtility.ScrollElement(applicId,sNo10);
        } else if (Boolean.TRUE.equals(b1)) {
            androidUtility.ScrollElement(applicIdArabic,sNo10);
        } else {
            log.debug("scrolling is not happeing");
        }
    }



}
