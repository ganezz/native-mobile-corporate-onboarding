package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;


public class HomePageObjects {

    AndroidUtility androidUtility = new AndroidUtility();
    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(HomePageObjects.class);
    String stringmsg;
    public HomePageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
    }


     By userDetailsRegBt = By.xpath("//*[@text='User Contact UI No User']");
     By addNewUsrBtn = By.xpath("//android.view.View[contains(@text,'+ Add A New User')]");
     By englishBtn = By.xpath("//*[@text='English']");
     By arabicBtn = By.xpath("//*[@text='Arabic']");
     By arabicaddNewUsrBtn = By.xpath("//*[@text='+ إضافة مستخدم جديد']");


    public void isHomePageVisible() throws Exception {
        waitUtility.waitForSeconds(4);
        try {
            genericMethods.isElementPresent(englishBtn);

        } catch (Exception e) {

            genericMethods.isElementPresent(userDetailsRegBt);
            Thread.currentThread().interrupt();
        }

    }

    public void clickUserRegBtn() throws Exception {
        waitUtility.waitForSeconds(2);
        genericMethods.click(userDetailsRegBt);
    }

    public void verifyPageLanding() throws Exception {

        try {
            waitUtility.waitForSeconds(2);
            genericMethods.isElementPresent(addNewUsrBtn);

        } catch (Exception e) {
            stringmsg=String.format(" %s",e);
            Thread.currentThread().interrupt();
            log.info("Page is not navigating to add new user screen:{}",stringmsg);
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
