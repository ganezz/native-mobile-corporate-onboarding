package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class SourceofWealthPageObjects {

    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(SourceofWealthPageObjects.class);
    AndroidUtility androidUtility;

    public SourceofWealthPageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By editField = By.xpath("//android.widget.EditText");
    By surceOfWealthMenu = By.xpath("//android.view.View[@text='Source of Wealth']");
    By addSourceWealthBbtn = By.xpath("//android.view.View[@content-desc='Add a new source of wealth']");
    By addSourceWealthBtnArabic = By.xpath("//android.view.View[@content-desc='أضف مصدر ثروة جديدًا']");
    By sourceWealthField=By.xpath("//android.view.View[@content-desc='Source of wealth']");
    By sourceWealthArabic=By.xpath("//android.view.View[@content-desc='مصدر الثروة']");
    By sourceWealthReason=By.xpath("//android.view.View[@content-desc='Please elaborate on source of wealth']");
    By sourceWealthReasonArabic=By.xpath("//android.view.View[@content-desc='يرجى توضيح مصدر الثروة']");
    By searchBox = By.xpath("//android.widget.EditText");
    By viewField = By.xpath("//android.view.View");
    By snackBarMsg = By.xpath("//android.view.View[@text='Success ! Source of Wealth added successfully']");
    By snackBarMsgArabic = By.xpath("//android.view.View[@text='نجاح ! تمت إضافة مصدر الثروة بنجاح']");
    By snackBarEditMsg = By.xpath("//android.view.View[@text='Edit ! Source of Wealth edited successfully']");
    By snackBarMsgEditArabic = By.xpath("//android.view.View[@text='يحرر ! تم تحرير مصدر الثروة بنجاح']");
    By closeBtn = By.xpath("//android.view.View[@text='Close']");
    By closeBtnArabic = By.xpath("//android.view.View[@text='قريب']");

    public void selectSourceOfFund() throws Exception {
        androidUtility.swipingHamburgerMenu();
        genericMethods.click(surceOfWealthMenu);
    }

    public void isSourceofWealthScreen() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(addSourceWealthBbtn);
        if (Boolean.TRUE.equals(b)) {
            log.debug("user in source wealth screen");
        } else {
            genericMethods.isElementPresent(addSourceWealthBtnArabic);
            log.debug("user in source wealth screen");
        }
    }
    public void addSourceofWealth() throws Exception {
        Boolean b = genericMethods.isElementPresent(addSourceWealthBbtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(addSourceWealthBbtn);
        } else {
            genericMethods.isElementPresent(addSourceWealthBtnArabic);
            genericMethods.click(addSourceWealthBtnArabic);
        }
    }
    public void selecteSourceOFFund(String fund,String edit) throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(sourceWealthField);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(sourceWealthField);
        } else {
            genericMethods.click(sourceWealthArabic);
        }
        waitUtility.waitForSeconds(1);
        genericMethods.click(searchBox);
        if(edit.equalsIgnoreCase("edit")) {
            genericMethods.sendKeys(searchBox, "Employment income");
            log.info(driver.findElements(viewField).size());
            List<WebElement> tempSectionList = driver.findElements(viewField);
            androidUtility.selectionOfDropdown("Employment income", tempSectionList);
        }else{
            genericMethods.sendKeys(searchBox, fund);
            log.info(driver.findElements(viewField).size());
            List<WebElement> tempSectionList = driver.findElements(viewField);
            androidUtility.selectionOfDropdown(fund, tempSectionList);
        }

    }
    public void isWealthSnackBarMsgPresent() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(snackBarMsg);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(closeBtn);
        } else {
            genericMethods.isElementPresent(snackBarMsgArabic);
            genericMethods.click(closeBtnArabic);
        }
    }
    public void isWealthEditSnackBarMsgPresent() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(snackBarEditMsg);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(closeBtn);
        } else {
            genericMethods.isElementPresent(snackBarMsgEditArabic);
            genericMethods.click(closeBtnArabic);
        }
    }
    public void isEnteredDetailsPresent(String sourceFund,String reason) throws Exception {
        log.info(driver.findElements(viewField).size());
        List<WebElement> tempUserDetails = driver.findElements(viewField);
        androidUtility.selectionItemVisible(sourceFund, tempUserDetails);
         androidUtility.selectionItemVisible(reason, tempUserDetails);

    }
    public void enterReasonForFund(String reason) throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(sourceWealthReason);
        if (Boolean.TRUE.equals(b)) {
            driver.findElement(sourceWealthReason).click();
            driver.findElement(sourceWealthReason).clear();
        } else  {
            driver.findElement(sourceWealthReasonArabic).click();
            driver.findElement(sourceWealthReasonArabic).clear();
        }
         editField.findElements(driver).get(1).click();
        editField.findElements(driver).get(1).sendKeys(reason);
    }

}
