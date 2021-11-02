package com.iexceed.uiframework.pageObjects.IOS;

import com.iexceed.uiframework.domainObjects.IOSUtility;
import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.domainObjects.ConnectionObjects.driver;

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
     By englishBtn = By.xpath("//*[@text='English']");
     By arabicBtn = By.xpath("//*[@text='Arabic']");
     By arabicaddNewUsrBtn = By.xpath("//*[@text='+ إضافة مستخدم جديد']");


    public void iIsHomePageVisible() {
        try {
            genericMethods.waitForVisibility(englishBtn);

        } catch (Exception e) {
            genericMethods.waitForVisibility(userDetailsRegBt);

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
        genericMethods.click(englishBtn);
        genericMethods.click(userDetailsRegBt);
        genericMethods.isElementPresent(addNewUsrBtn);
    }

    public void iClickArabicLangBtn() throws InterruptedException {
        genericMethods.waitForVisibility(arabicBtn);
        genericMethods.click(arabicBtn);
        genericMethods.click(userDetailsRegBt);
        genericMethods.isElementPresent(arabicaddNewUsrBtn);
    }


}
