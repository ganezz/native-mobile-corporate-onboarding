package com.iexceed.uiframework.pageobjects.ios;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.domainobjects.IOSUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class IosHomePageObjects {


    GenericMethods genericMethods;
    IOSUtility iosUtility;

    private static final Logger log = LogManager.getLogger(IosHomePageObjects.class);
    private final WaitUtility waitUtility;

    public IosHomePageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
    }


    By userOnboardBtn = By.xpath("//XCUIElementTypeButton[@name='Launch Onboarding SDK']");
    By newApplicationBtn = By.xpath("//XCUIElementTypeButton[@name='New Application Button']");
    By newApplicationBtnArabic = By.xpath("//XCUIElementTypeButton[@name='New Application Button']");
    By addNewUsrBtn = By.xpath("//android.view.View[contains(@text,'+ Add A New User')]");
    By addNewUsrBtnArabic = By.xpath("//android.view.View[contains(@text,'+ Add A New User')]");
    By lightThemeBtn = By.xpath("//XCUIElementTypeButton[@name='Light Mode']");
    By darkThemeBtn = By.xpath("//XCUIElementTypeButton[@name='Dark Mode']");
    By englishBtn = By.xpath("//XCUIElementTypeButton[@name='English']");
    By arabicBtn = By.xpath("//XCUIElementTypeButton[@name='Arabic']");


    public void iIsHomePageVisible() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(lightThemeBtn);
        if (Boolean.TRUE.equals(b)) {
            log.info("user in home page");
        } else {
            log.debug("home page is not launched");
        }

    }


    public void ichooseLanguage() {
        log.debug("language");

    }

    public void iClickUserRegBtn(String language) throws Exception {
        waitUtility.waitForSeconds(5);
        if (language.equals("english")) {
            genericMethods.isElementPresent(userOnboardBtn);
            genericMethods.click(englishBtn);
            genericMethods.click(userOnboardBtn);
        } else {
            log.debug("arabic validations");
            genericMethods.isElementPresent(userOnboardBtn);
            genericMethods.click(arabicBtn);
            genericMethods.click(userOnboardBtn);
        }
    }

    public void ienterLoginCredentials() {
        log.debug("ios");
    }

    public void loginPage() {
        log.info("log");
    }

    public void iVerifyPageLanding() throws Exception {

        waitUtility.waitForSeconds(2);
        genericMethods.click(newApplicationBtn);
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(addNewUsrBtn);
        Boolean b1 = genericMethods.isElementPresent(addNewUsrBtnArabic);

        if (Boolean.TRUE.equals(b)) {
            log.info("page is navigating");
        } else if (Boolean.TRUE.equals(b1)) {
            log.info("page is navigating arabic");
        } else {
            log.info("Page is not navigating to add new user screen");
        }
    }

    public void iClickEnglishLangBtn() throws InterruptedException {
        genericMethods.waitForVisibility(englishBtn);
        genericMethods.click(englishBtn);
        genericMethods.click(userOnboardBtn);
        genericMethods.isElementPresent(newApplicationBtn);


    }

    public void iClickArabicLangBtn() throws InterruptedException {
        genericMethods.waitForVisibility(arabicBtn);
        genericMethods.click(arabicBtn);
        genericMethods.click(userOnboardBtn);
        genericMethods.isElementPresent(newApplicationBtnArabic);


    }


}
