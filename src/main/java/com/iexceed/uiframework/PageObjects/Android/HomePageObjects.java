package com.iexceed.uiframework.PageObjects.Android;

import com.iexceed.uiframework.DomainObjects.AndroidUtility;
import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.DomainObjects.ConnectionObjects.driver;


public class HomePageObjects {

    AndroidUtility androidUtility = new AndroidUtility();
    GenericMethods genericMethods;
    private WaitUtility waitUtility;

    public HomePageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
    }


    public By userDetailsRegBt = By.xpath("//*[@text='User Contact UI No User']");
    public By addNewUsrBtn = By.xpath("//android.view.View[contains(@text,'+ Add A New User')]");
    public By englishBtn = By.xpath("//*[@text='English']");
    public By arabicBtn = By.xpath("//*[@text='Arabic']");
    public By ArabicaddNewUsrBtn = By.xpath("//*[@text='+ إضافة مستخدم جديد']");


    public void isHomePageVisible() throws Exception {
        waitUtility.waitForSeconds(4);
        try {
            genericMethods.isElementPresent(englishBtn);

        } catch (Exception e) {
            genericMethods.isElementPresent(userDetailsRegBt);
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
            System.out.println("Page is not navigating to add new user screen");
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
        genericMethods.isElementPresent(ArabicaddNewUsrBtn);
    }


}
