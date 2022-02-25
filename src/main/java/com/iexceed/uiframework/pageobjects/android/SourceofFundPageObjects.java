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

public class SourceofFundPageObjects {

    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(SourceofFundPageObjects.class);
    AndroidUtility androidUtility;

    public SourceofFundPageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By editField = By.xpath("//android.widget.EditText");
    By sourceOfFundMenu = By.xpath("//android.view.View[@text='Source of Funds']");
    By addNewUser = By.xpath("//android.view.View[@content-desc='Add a new source of funds']");
    By addNewUserArabic = By.xpath("//android.view.View[@content-desc='إضافة مصدر جديد للأموال']");
    By sourceofFundfield = By.xpath("//android.view.View[@content-desc='Source of fund']");
    By sourceofFundfieldArabic = By.xpath("//android.view.View[@content-desc='مصدر التمويل']");
    By countryFiled = By.xpath("//android.view.View[@content-desc='Country of origin for source of funds']");
    By countryFiledArabic = By.xpath("//android.view.View[@content-desc='بلد المنشأ لمصدر الأموال']");
    By fundReason = By.xpath("//android.view.View[@content-desc='Please elaborate on source of funds']");
    By fundReasonArabic = By.xpath("//android.view.View[@content-desc='يرجى توضيح مصدر الأموال']");
    By searchBox = By.xpath("//android.widget.EditText");
    By viewField = By.xpath("//android.view.View");
    By errorValidMsg = By.xpath("//android.view.View[@text='Please enter valid field']");
    By errorMsgArabic = By.xpath("//android.view.View[@text='الرجاء إدخال حقل صالح']");
    By snackBarMsg = By.xpath("//android.view.View[@text='Success ! Source of Funds added successfully']");
    By snackBarMsgArabic = By.xpath("//android.view.View[@text='نجاح ! تمت إضافة مصدر الأموال بنجاح']");
    By closeBtn = By.xpath("//android.view.View[@text='Close']");
    By closeBtnArabic = By.xpath("//android.view.View[@text='قريب']");
    By snackBarEditMsg = By.xpath("//android.view.View[@text='Edit ! Source of Funds edited successfully']");
    By snackBarEditMsgArabic = By.xpath("//android.view.View[@text='يحرر ! تم تحرير مصدر الأموال بنجاح']");
    By editButton = By.xpath("//android.widget.ImageView[@content-desc='Edit']");
    By editButtonArabic = By.xpath("//android.widget.ImageView[@content-desc='تعديل']");
    By deleteButton = By.xpath("//android.widget.ImageView[@content-desc='Delete']");
    By deleteButtonArabic = By.xpath("//android.widget.ImageView[@content-desc='حذف']");

    public void selectSourceOfFund() throws Exception {
        androidUtility.swipingHamburgerMenu();
        genericMethods.click(sourceOfFundMenu);
    }

    public void isSourceofFund() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(addNewUser);
        if (Boolean.TRUE.equals(b)) {
            log.debug("user is in source of fund screen");
        } else {
            genericMethods.isElementPresent(addNewUserArabic);
        }
    }

    public void clickAddSourceBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(addNewUser);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(addNewUser);
        } else {
            genericMethods.click(addNewUserArabic);
        }
    }

    public void chooseSourceOFFund(String fund,String edit) throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(sourceofFundfield);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(sourceofFundfield);
        } else {
            genericMethods.click(sourceofFundfieldArabic);
        }
        waitUtility.waitForSeconds(1);
        genericMethods.click(searchBox);
        if(edit.equalsIgnoreCase("edit")) {
            genericMethods.sendKeys(searchBox, "Shareholders account");
            log.info(driver.findElements(viewField).size());
            List<WebElement> tempSectionList = driver.findElements(viewField);
            androidUtility.selectionOfDropdown("Shareholders account", tempSectionList);
        }else{
            genericMethods.sendKeys(searchBox, fund);
            log.info(driver.findElements(viewField).size());
            List<WebElement> tempSectionList = driver.findElements(viewField);
            androidUtility.selectionOfDropdown(fund, tempSectionList);
        }

    }

    public void chooseCountry(String country) throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(countryFiled);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(countryFiled);
        } else {
            genericMethods.click(countryFiledArabic);
        }
        waitUtility.waitForSeconds(1);
        genericMethods.click(searchBox);
        genericMethods.sendKeys(searchBox, country);
        log.info(driver.findElements(viewField).size());
        List<WebElement> tempSectionList = driver.findElements(viewField);
        androidUtility.selectionOfDropdown(country, tempSectionList);
    }

    public void enterReasonForFund(String reason) throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(fundReason);
        if (Boolean.TRUE.equals(b)) {
            driver.findElement(fundReason).click();
            driver.findElement(fundReason).clear();
        } else  {
            driver.findElement(fundReasonArabic).click();
            driver.findElement(fundReasonArabic).clear();
        }
        editField.findElements(driver).get(2).click();
        editField.findElements(driver).get(2).sendKeys(reason);
    }

    public void validateErrorMeg() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(errorValidMsg);
        Boolean b1 = genericMethods.isElementPresent(errorMsgArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug("validation message displayd");
        } else if (Boolean.TRUE.equals(b1)) {
            log.debug("validation message displayed");
        } else {
            log.debug("error message not present");
        }
    }

    public void isAddNewSourceScreen() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(sourceofFundfield);
        if (Boolean.TRUE.equals(b)) {
            log.debug("user is in source of fund screen");
        } else {
            genericMethods.isElementPresent(sourceofFundfieldArabic);
        }
    }

    public void isSnackBarMsgPresent() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(snackBarMsg);
        if (Boolean.TRUE.equals(b)) {
           genericMethods.click(closeBtn);
        } else {
            genericMethods.isElementPresent(snackBarMsgArabic);
            genericMethods.click(closeBtnArabic);
        }
    }

    public void isEditSnackBarMsgPresent() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(snackBarEditMsg);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(closeBtn);
        } else {
            genericMethods.isElementPresent(snackBarEditMsgArabic);
            genericMethods.click(closeBtnArabic);
        }
    }

    public void isEnteredDetailsPresent(String sourceFund,String country,String reason) throws Exception {
           log.info(driver.findElements(viewField).size());
            List<WebElement> tempUserDetails = driver.findElements(viewField);
            androidUtility.selectionItemVisible(sourceFund, tempUserDetails);
            androidUtility.selectionItemVisible(country, tempUserDetails);
            androidUtility.selectionItemVisible(reason, tempUserDetails);

    }
    public void clickEditBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(editButton);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(editButton);
        } else {
            genericMethods.click(editButtonArabic);
        }
    }

    public void clickDeleteBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(deleteButton);

        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(deleteButton);
        } else {
            genericMethods.click(deleteButtonArabic);
        }

    }



}
