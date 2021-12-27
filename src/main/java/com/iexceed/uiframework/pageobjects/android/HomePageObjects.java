package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;


public class HomePageObjects {

    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(HomePageObjects.class);

    public HomePageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
    }


    By userDetailsRegBt = By.xpath("//android.view.View[@text='Onboarding']");
    By addNewUsrBtn = By.xpath("//android.view.View[@text='+ Add A New User']");
    By englishBtn = By.xpath("//android.view.View[@text='English']");
    By arabicBtn = By.xpath("//android.view.View[@text='Arabic']");
    By arabicaddNewUsrBtn = By.xpath("//android.view.View[@text='+ إضافة مستخدم جديد']");


    public void isHomePageVisible() throws Exception {
        waitUtility.waitForSeconds(4);
        Boolean b1 = genericMethods.isElementPresent(userDetailsRegBt);
        Boolean b = genericMethods.isElementPresent(englishBtn);
        if (Boolean.TRUE.equals(b)) {
            log.info("user in home page");
        } else if (Boolean.TRUE.equals(b1)) {
            log.info("user in home page");
        } else {
            log.debug("home page is not launched");
        }


    }


    public void clickUserRegBtn() throws Exception {
        waitUtility.waitForSeconds(2);
        genericMethods.click(userDetailsRegBt);
    }

    public void verifyPageLanding() throws Exception {
        waitUtility.waitForSeconds(4);
        Boolean b = genericMethods.isElementPresent(addNewUsrBtn);

        if (Boolean.TRUE.equals(b)) {
            log.info("page is navigating");
        } else {
            log.info("Page is not navigating to add new user screen");
        }


    }

    public void clickEnglishLangBtn() throws InterruptedException {
        genericMethods.waitForVisibility(englishBtn);
        genericMethods.click(englishBtn);
        genericMethods.click(userDetailsRegBt);
        genericMethods.isElementPresent(addNewUsrBtn);
    }

    public void clickArabicLangBtn() throws InterruptedException {
        genericMethods.waitForVisibility(arabicBtn);
        genericMethods.click(arabicBtn);
        genericMethods.click(userDetailsRegBt);
        genericMethods.isElementPresent(arabicaddNewUsrBtn);
    }


}
