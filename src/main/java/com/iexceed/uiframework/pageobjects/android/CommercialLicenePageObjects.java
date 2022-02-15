package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

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

    By editField = By.xpath("//android.widget.EditText");
    By commercialLicenMenu = By.xpath("//android.view.View[@text='Commercial License']");
    By commercialLiceNum = By.xpath("//android.view.View[@content-desc='Commercial licence number']");
    By commercialLiceNumArabic = By.xpath("//android.view.View[@content-desc='رقم الرخصة التجارية']");
    By commercialLiceIssueBy = By.xpath("//android.view.View[@content-desc='Commercial licence issued by']");
    By commerLiceIssueByArabic = By.xpath("//android.view.View[@content-desc='الرخصة التجارية صادرة عن']");
    By liceNumValidMsg = By.xpath("//android.view.View[@text='Please enter valid Commercial licence number']");
    By liceNumValidMsgArabic = By.xpath("//android.view.View[@text='الرجاء إدخال رقم ترخيص تجاري صالح']");
    By issueByValidMsg = By.xpath("//android.view.View[@text='Please enter valid Commercial licence issued by']");
    By issueByValidMsgArabic = By.xpath("//android.view.View[@text='الرجاء إدخال رخصة تجارية صالحة صادرة عن']");
    By businessActivity = By.xpath("//android.view.View[@content-desc='Business Activities']");
    By businessActivityArabic = By.xpath("//android.view.View[@content-desc='الأنشطة التجارية']");
    By businessValidMsg = By.xpath("//android.view.View[@text='Please enter valid Business Activities']");
    By businessValidMsgArabic = By.xpath("//android.view.View[@text='الرجاء إدخال أنشطة تجارية صالحة']");
    By issueDate = By.xpath("//android.view.View[@content-desc='Commercial licence issue date']");
    By issueDateArabic = By.xpath("//android.view.View[@content-desc='تاريخ اصدار الرخصة التجارية']");
    By expiraryDate = By.xpath("//android.view.View[@content-desc='Commercial licence expiry date']");
    By expiraryDateArabic = By.xpath("//android.view.View[@content-desc='تاريخ انتهاء الرخصة التجارية']");
    By searchbar = By.xpath("//android.view.View[@text='Search…']");
    By searchbarArabic = By.xpath("//android.view.View[@text='بحث…']");
    By cancelCalenderBtn = By.xpath("//*[@text='CANCEL']");
    By okBtn = By.xpath("//*[@text='OK']");
    By monthToggleBar = By.xpath("//*[@resource-id='android:id/month_view']");
    By view = By.xpath("android.view.View");
    By yearFrame = By.xpath("//*[@resource-id='android:id/date_picker_header_year']");
    By yearFrameList = By.xpath("android.widget.TextView");
    By monthFrame = By.xpath("//android.widget.TextView[@resource-id='android:id/date_picker_header_date']");
    By previousMonth = By.xpath("//android.widget.ImageButton[@content-desc='Previous month']");
    By arabicDate=By.xpath("//*[@text='٩']");
    public void selectCommercialLicense() throws Exception {
        androidUtility.swipingHamburgerMenu();
        genericMethods.click(commercialLicenMenu);
    }

    public void enterCommLicenseNum(String licenseNum) throws Exception {
        waitUtility.waitForSeconds(3);
        editField.findElements(driver).get(1).click();
        editField.findElements(driver).get(1).sendKeys(licenseNum);

    }

    public void clickSomeOtherField() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(searchbar);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(searchbar);
        } else {
            genericMethods.click(searchbarArabic);
        }
    }

    public void validateLicenseNumberErrorMeg() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(liceNumValidMsg);
        if (Boolean.TRUE.equals(b)) {
            log.debug("validation message displayd");
        } else {
            genericMethods.isElementPresent(liceNumValidMsgArabic);
            log.debug("validation message displayed");
        }
    }

    public void enterCommLicenseIssued(String licenseissued) throws Exception {
        waitUtility.waitForSeconds(2);
        editField.findElements(driver).get(2).click();
        editField.findElements(driver).get(2).sendKeys(licenseissued);
    }

    public void validateLicenseIssuedErrorMeg() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(issueByValidMsg);
        if (Boolean.TRUE.equals(b)) {
            log.debug("validation message displayd");
        } else {
            genericMethods.isElementPresent(issueByValidMsgArabic);
            log.debug("validation message displayed");
        }
    }

    public void enterBusinessActivity(String businessactivity) throws Exception {
        waitUtility.waitForSeconds(3);
        editField.findElements(driver).get(3).click();
        editField.findElements(driver).get(3).sendKeys(businessactivity);
    }

    public void validateBusinessActivityErrorMeg() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(businessValidMsg);
        if (Boolean.TRUE.equals(b)) {
            log.debug("validation message displayd");
        } else {
            genericMethods.isElementPresent(businessValidMsgArabic);
            log.debug("validation message displayed");
        }
    }


    public void selectIssueDate() throws Exception {
        waitUtility.waitForSeconds(2);
        String tempDate = "10-December-2017";
        String dateArr[] = tempDate.split("-");
        String date = dateArr[0];
        String month = dateArr[1];
        String year = dateArr[2];
        editField.findElements(driver).get(4).click();
        waitUtility.waitForSeconds(2);
        genericMethods.click(yearFrame);
        AndroidDriver drive = (AndroidDriver) driver;
        drive.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + year + "\").instance(0))").click();
        List<WebElement> temp = driver.findElements(yearFrameList);
        androidUtility.selectionOfDropdown(year, temp);
//       month
        Random rand = new Random();
        for (int i = 0; i <= rand.nextInt(8); i++) {
            genericMethods.click(previousMonth);
        }
        //date
        waitUtility.waitForSeconds(2);
        String xpathTemplate = "//*[@text='%s']";
        String xpath = String.format(xpathTemplate, date);
        try {
            driver.findElement(By.xpath(xpath)).click();
        }catch(Exception e){
            genericMethods.click(arabicDate);
        }
        genericMethods.click(okBtn);

    }

    public void selectExpiryDate() throws Exception {
        waitUtility.waitForSeconds(2);
        String tempDate = "19-December-2024";
        String dateArr[] = tempDate.split("-");
        String date = dateArr[0];
        String month = dateArr[1];
        String year = dateArr[2];
        editField.findElements(driver).get(5).click();
        waitUtility.waitForSeconds(2);
        genericMethods.click(yearFrame);
        AndroidDriver drive = (AndroidDriver) driver;
        drive.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + year + "\").instance(0))").click();
        List<WebElement> temp = driver.findElements(yearFrameList);
        androidUtility.selectionOfDropdown(year, temp);
//       month
        Random rand = new Random();
        for (int i = 0; i <= rand.nextInt(5); i++) {
            genericMethods.click(previousMonth);
        }
        //date
        waitUtility.waitForSeconds(2);
        String xpathTemplate = "//*[@text='%s']";
        String xpath = String.format(xpathTemplate, date);
        try {
            driver.findElement(By.xpath(xpath)).click();
        }catch(Exception e){
            genericMethods.click(arabicDate);
        }
        genericMethods.click(okBtn);

    }
}
