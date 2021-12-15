package com.iexceed.uiframework.pageobjects.ios;

import com.iexceed.uiframework.domainobjects.IOSUtility;
import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class IosHomePageObjects {


    GenericMethods genericMethods;
    IOSUtility iosUtility;


    private final WaitUtility waitUtility;

    public IosHomePageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
    }


    By userDetailsRegBt = By.xpath("//*[@text='User Contact UI No User']");
    By addNewUsrBtn = By.xpath("//android.view.View[contains(@text,'+ Add A New User')]");
    By lightThemeBtn = By.xpath("//XCUIElementTypeButton[@name='Light Mode']");
    By darkThemeBtn = By.xpath("//XCUIElementTypeButton[@name='Dark Mode']");
    By englishBtn = By.xpath("//XCUIElementTypeButton[@name='English']");
    By arabicBtn = By.xpath("//XCUIElementTypeButton[@name='Arabic']");



    public void iIsHomePageVisible() {
        try {
            genericMethods.waitForVisibility(englishBtn);

        } catch (Exception e) {
            genericMethods.waitForVisibility(lightThemeBtn);

        }

    }

    public void iClickUserRegBtn() throws Exception {
        waitUtility.waitForSeconds(2);
        genericMethods.click(userDetailsRegBt);
    }

    public void iVerifyPageLanding() throws Exception {
        genericMethods.isElementPresent(addNewUsrBtn);
        waitUtility.waitForSeconds(2);
    }

    public void iClickEnglishLangBtn() throws InterruptedException {
        genericMethods.waitForVisibility(englishBtn);
        genericMethods.isElementPresent(englishBtn);
        genericMethods.click(englishBtn);


    }

    public void iClickArabicLangBtn() throws InterruptedException {
        genericMethods.waitForVisibility(arabicBtn);
        genericMethods.isElementPresent(arabicBtn);
        genericMethods.click(arabicBtn);


    }


}
