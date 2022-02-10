package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class CommercialLicenePageObjects {

    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(CommercialLicenePageObjects.class);
    AndroidUtility androidUtility;

    public CommercialLicenePageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By commercialLicenMenu = By.xpath("//android.view.View[@text='Commercial License']");
    By commercialLiceNum = By.xpath("//android.view.View[@content-desc='Commercial licence number']");
    By commercialLiceNumArabic = By.xpath("//android.view.View[@content-desc='رقم الرخصة التجارية']");
    By commercialLiceIssueBy = By.xpath("//android.view.View[@content-desc='Commercial licence issued by']");
    By commerLiceIssueByArabic = By.xpath("//android.view.View[@content-desc='الرخصة التجارية صادرة عن']");
    By liceNumValidMsg = By.xpath("//android.view.View[@text='Please enter valid Commercial licence number']");
    By issueByValidMsg = By.xpath("//android.view.View[@text='Please enter valid Commercial licence issued by']");
    By businessActivity = By.xpath("//android.view.View[@content-desc='Business Activities']");
    By businessActivityArabic = By.xpath("//android.view.View[@content-desc='الأنشطة التجارية']");
    By businessValidMsg = By.xpath("//android.view.View[@text='Please enter valid Business Activities']");
    By issueDate = By.xpath("//android.view.View[@content-desc='Commercial licence issue date']");
    By issueDateArabic = By.xpath("//android.view.View[@content-desc='تاريخ اصدار الرخصة التجارية']");
    By expiraryDate = By.xpath("//android.view.View[@content-desc='Commercial licence expiry date']");
    By expiraryDateArabic = By.xpath("//android.view.View[@content-desc='تاريخ انتهاء الرخصة التجارية']");

    public void selectCommercialLicense() throws Exception {
        androidUtility.swipingHamburgerMenu();
        genericMethods.click(commercialLicenMenu);
    }

    public void enterCommLicenseNum(String licenseNum) throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(commercialLiceNum);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(commercialLiceNum);
            genericMethods.sendKeys(commercialLiceNum, licenseNum);
            genericMethods.click(commercialLiceIssueBy);
        } else {
            genericMethods.click(commercialLiceNumArabic);
            genericMethods.sendKeys(commercialLiceNumArabic, licenseNum);
            genericMethods.click(commerLiceIssueByArabic);
        }

    }

}

