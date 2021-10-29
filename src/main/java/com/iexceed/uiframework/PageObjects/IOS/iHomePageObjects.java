package com.iexceed.uiframework.PageObjects.IOS;

import com.iexceed.uiframework.DomainObjects.IOSUtility;
import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.DomainObjects.ConnectionObjects.driver;

public class iHomePageObjects {


    GenericMethods genericMethods;
    IOSUtility iosUtility;


    private final WaitUtility waitUtility;

    public iHomePageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
    }


     By userDetailsRegBt = By.xpath("//*[@text='User Contact UI No User']");
     By addNewUsrBtn = By.xpath("//android.view.View[contains(@text,'+ Add A New User')]");
     By englishBtn = By.xpath("//*[@text='English']");
     By arabicBtn = By.xpath("//*[@text='Arabic']");
     By ArabicaddNewUsrBtn = By.xpath("//*[@text='+ إضافة مستخدم جديد']");


    public void IOS_isHomePageVisible() {
        try {
            genericMethods.waitForVisibility(englishBtn);

        } catch (Exception e) {
            genericMethods.waitForVisibility(userDetailsRegBt);

        }

    }

    public void Ios_clickUserRegBtn() throws Exception {
        waitUtility.waitForSeconds(2);
        genericMethods.click(userDetailsRegBt);
    }

    public void IOS_verifyPageLanding() throws Exception {
        genericMethods.isElementPresent(addNewUsrBtn);
        waitUtility.waitForSeconds(2);
    }

    public void ios_clickEnglishLangBtn() throws InterruptedException {
        genericMethods.waitForVisibility(englishBtn);
        genericMethods.click(englishBtn);
        genericMethods.click(userDetailsRegBt);
        genericMethods.isElementPresent(addNewUsrBtn);
    }

    public void ios_clickArabicLangBtn() throws InterruptedException {
        genericMethods.waitForVisibility(arabicBtn);
        genericMethods.click(arabicBtn);
        genericMethods.click(userDetailsRegBt);
        genericMethods.isElementPresent(ArabicaddNewUsrBtn);
    }


}
