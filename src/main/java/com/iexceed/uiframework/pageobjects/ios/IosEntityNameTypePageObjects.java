package com.iexceed.uiframework.pageobjects.ios;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.domainobjects.IOSUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class IosEntityNameTypePageObjects {
    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(IosEntityNameTypePageObjects.class);
    IOSUtility iosUtility;

    public IosEntityNameTypePageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        iosUtility = new IOSUtility();
    }

    By searchField = By.xpath("//XCUIElementTypeSearchField[@name='SearchTextField']");
    By searchFieldList = By.xpath("//XCUIElementTypeTextField[@name='SearchTextField']");
    By fieldValidationMsg = By.xpath("//XCUIElementTypeStaticText[@name='Please enter this field']");
    By fieldValidationMsg1 = By.xpath("//XCUIElementTypeStaticText[@name='Please enter valid field']");
    By fieldValidationMsgArabic = By.xpath("//XCUIElementTypeStaticText[@name='الرجاء إدخال هذا الحقل']");
    By fieldValidationMsgArabic1 = By.xpath("//XCUIElementTypeStaticText[@name='الرجاء إدخال حقل صالح']");
    By entityLegalName = By.xpath("//XCUIElementTypeTextField[@name='Legal Name Text Field']");
    By entityLegalNameArabic = By.xpath("//XCUIElementTypeTextField[@name='Legal Name Text Field']");
    By tradeName = By.xpath("//XCUIElementTypeTextField[@name='Trade Name Text Field']");
    By previouslyKnow = By.xpath("//XCUIElementTypeTextField[@name='Previously Known as Text Field']");
    By previoslyTradeAs = By.xpath("//XCUIElementTypeTextField[@name='Previously Trading as Text Field']");
    By typeDD = By.xpath("//XCUIElementTypeStaticText[@name='Please Select']");
    By typeDropDown = By.xpath("//XCUIElementTypeButton[@name='Entity Type Drop Down']");
    By continueBtn = By.xpath("//XCUIElementTypeButton[@name='Continue Button']");
    By entityTypeList = By.xpath("//XCUIElementTypeButton");
    By entityTypeField = By.xpath("//android.view.View[@text='Legal entity type *']");
    By entityNameTypeContat = By.xpath("//XCUIElementTypeButton[@name='Entity Name & Type. It is incomplete.']");
    By entityNameTypeContatArabic = By.xpath("//XCUIElementTypeButton[@name='Entity Name & Type. إنه غير مكتمل.']");


    public void selectEntityNameType() throws Exception {
        iosUtility.ios_swipingHamburgerMenu();
        waitUtility.waitForSeconds(1);
        Boolean b=genericMethods.isElementPresent(entityNameTypeContat);
        System.out.println(b);
       if(Boolean.TRUE.equals(b)){
         genericMethods.click(entityNameTypeContat);
       }else{
           genericMethods.click(entityNameTypeContatArabic);
       }
    }


    public void ios_isEntityLegalPage() throws Exception {
        waitUtility.waitForSeconds(3);
        Boolean b = genericMethods.isElementPresent(entityLegalName);
        if (Boolean.TRUE.equals(b)) {
            log.debug("screen navigate to entity name and type page");
        } else {
            genericMethods.isElementPresent(entityLegalNameArabic);
            log.debug("screen navigate to entity name and type page in Arabic");
        }

    }

    public void ios_enterLegalEntityName(String entityName) {
        genericMethods.waitForVisibility(entityLegalName);
        genericMethods.click(entityLegalName);
        driver.findElement(entityLegalName).clear();
        genericMethods.sendKeys(entityLegalName, entityName);
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }

    }

    public void ios_enterTradeName(String tradename) {
        genericMethods.click(tradeName);
        driver.findElement(tradeName).clear();
        genericMethods.sendKeys(tradeName, tradename);
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }

    public void ios_enterPreviouslyKnown(String previouslyKnown) {
        genericMethods.click(previouslyKnow);
        driver.findElement(previouslyKnow).clear();
        genericMethods.sendKeys(previouslyKnow, previouslyKnown);

    }


    public void ios_enterPreviouslyTradingAs(String previouslyTrade) {
        genericMethods.click(previoslyTradeAs);
        driver.findElement(previoslyTradeAs).clear();
        genericMethods.sendKeys(previoslyTradeAs, previouslyTrade);
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }

    public void enterLegalEntityType(String entityType) throws Exception {
        genericMethods.click(typeDropDown);
        waitUtility.waitForSeconds(2);
        genericMethods.click(searchFieldList);
        genericMethods.sendKeys(searchFieldList, entityType);
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
        log.info(driver.findElements(entityTypeList).size());
        iosUtility.selectionOfDropdown(entityType, entityTypeList);
    }

    public void validateEntityTye(String entityType) throws Exception {
        String values = null;
        waitUtility.waitForSeconds(2);
        List<WebElement> temoCountryList = driver.findElements(entityTypeList);
        for (WebElement count : temoCountryList) {
            System.out.println(count.getAttribute("label"));
           values=count.getAttribute("label");
        }
        Assert.assertEquals(entityType,"Bank");
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }

    public void clickOtherField() {
        genericMethods.click(searchField);
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }

    public void ios_fieldValidationMsg() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(fieldValidationMsg);
        Boolean b1 = genericMethods.isElementPresent(fieldValidationMsg1);
        Boolean b2 = genericMethods.isElementPresent(fieldValidationMsgArabic);
        Boolean b3=genericMethods.isElementPresent(fieldValidationMsgArabic1);
        if (Boolean.TRUE.equals(b)) {
            Assert.assertTrue(genericMethods.isElementPresent(fieldValidationMsg));
        } else if (Boolean.TRUE.equals(b1)) {
            Assert.assertTrue(genericMethods.isElementPresent(fieldValidationMsg1));
        } else if (Boolean.TRUE.equals(b2)) {
            Assert.assertTrue(genericMethods.isElementPresent(fieldValidationMsgArabic));
        } else if(Boolean.TRUE.equals(b3)){
            genericMethods.isElementPresent(fieldValidationMsgArabic1);
            Assert.assertTrue(genericMethods.isElementPresent(fieldValidationMsgArabic1));
        }else{
            log.debug("entered valid fields");
        }
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }

    public void ios_clickContinueBtn() throws Exception {
        genericMethods.click(continueBtn);

    }

}
