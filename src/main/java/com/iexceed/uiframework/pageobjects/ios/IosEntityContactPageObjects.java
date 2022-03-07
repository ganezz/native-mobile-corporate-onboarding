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

public class IosEntityContactPageObjects {
    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(IosEntityContactPageObjects.class);
    IOSUtility iosUtility;

    public IosEntityContactPageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        iosUtility = new IOSUtility();

    }

    By deleteButton = By.xpath("//XCUIElementTypeButton[@name='Delete Button 0']");
    By deleteButtonArabic = By.xpath("//XCUIElementTypeButton[@name='Delete Button 0']");
    By editButton = By.xpath("//XCUIElementTypeButton[@name='Edit Button 0']");
    By editButtonArabic = By.xpath("//XCUIElementTypeButton[@name='Edit Button 0']");
    By countryField = By.xpath("//XCUIElementTypeButton[@name='Country Drop Down']");
    By searchField = By.xpath("//XCUIElementTypeTextField[@name='SearchTextField']");
    By countryList = By.xpath("//XCUIElementTypeButton");
    By fieldValidationMsg = By.xpath("//XCUIElementTypeStaticText[@name='Please enter this field']");
    By fieldValidationMsg1 = By.xpath("//XCUIElementTypeStaticText[@name='Please enter valid field']");
    By fieldValidationMsgArabic = By.xpath("//XCUIElementTypeStaticText[@name='الرجاء إدخال هذا الحقل']");
    By fieldValidationMsgArabic1 = By.xpath("//XCUIElementTypeStaticText[@name='الرجاء إدخال حقل صالح']");
    By entityContactInfoPage = By.xpath("//XCUIElementTypeStaticText[@name='Entity contact information']");
    By entityContactInfoPageArabic = By.xpath("//XCUIElementTypeStaticText[@name='معلومات الاتصال بالكيان']");
    By emailId = By.xpath("//XCUIElementTypeTextField[@name='Email Text Field']");
    By websiteFiled = By.xpath("//XCUIElementTypeTextField[@name='Website Text Field']");
    By unitNo = By.xpath("//XCUIElementTypeTextField[@name='Unit No Text Field']");
    By streetNo = By.xpath("//XCUIElementTypeTextField[@name='Street Text Field']");
    By stateField = By.xpath("//XCUIElementTypeTextField[@name='State Text Field']");
    By cityField = By.xpath("//XCUIElementTypeTextField[@name='City Text Field']");
    By poBoxField = By.xpath("//XCUIElementTypeTextField[@name='PO Box Text Field']");
    By zipCode = By.xpath("//XCUIElementTypeTextField[@name='Postal Code Text Field']");
    By addNewBtn = By.xpath("//XCUIElementTypeButton[@name='Add a New Address Button']");
    By addNewAddressBtnArabic = By.xpath("//XCUIElementTypeButton[@name='Add a New Address Button']");
    By addNewContactAddress = By.xpath("//XCUIElementTypeStaticText[@name='Registered']");
    By addNewContactAddressArabic = By.xpath("//XCUIElementTypeStaticText[@name='Registered']");
    By viewDataDetails = By.xpath("//XCUIElementTypeStaticText");
    By recordAddedMsg = By.xpath("//XCUIElementTypeStaticText[@name='Address added successfully']");
    By recordAddedMsgArabic = By.xpath("//XCUIElementTypeStaticText[@name='تمت إضافة العنوان بنجاح']");
    By editValidationMsg = By.xpath("//XCUIElementTypeStaticText[@name='Address edited successfully']");
    By editValidationMsgArabic = By.xpath("//XCUIElementTypeStaticText[@name='تم تحرير العنوان بنجاح']");
    By closeBtn = By.xpath("//XCUIElementTypeButton[@name='Close']");
    By closeBtnArabic = By.xpath("//*[contains(@label,'اضغط على زر الإغلاق لإغلاق الخبز المحمص')]");
    By deleteConfirmationMsg = By.xpath("//*[contains(@label,'Are you sure you want to delete the Address from the list?')]");
    By deleteConfirmationMsgArabic = By.xpath("//*[contains(@label,'هل أنت متأكد أنك تريد حذف العنوان من القائمة')]");
    By entityContactMenu = By.xpath("//XCUIElementTypeButton[@name='Entity Contact Info. It is incomplete.']");
    By entityContactMenuArabic = By.xpath("//XCUIElementTypeButton[@name='Entity Contact Info. إنه غير مكتمل.']");


    public void selectEntityContactPage() throws Exception {
        iosUtility.ios_swipingHamburgerMenu();
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(entityContactMenu);
        System.out.println(b);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(entityContactMenu);
        } else {
            genericMethods.click(entityContactMenuArabic);
        }
    }

    public void contactfieldValidationMsg() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(fieldValidationMsg);
        Boolean b1 = genericMethods.isElementPresent(fieldValidationMsg1);
        Boolean b2 = genericMethods.isElementPresent(fieldValidationMsgArabic);
        Boolean b3 = genericMethods.isElementPresent(fieldValidationMsgArabic1);
        if (Boolean.TRUE.equals(b)) {
            Assert.assertTrue(genericMethods.isElementPresent(fieldValidationMsg));
        } else if (Boolean.TRUE.equals(b1)) {
            Assert.assertTrue(genericMethods.isElementPresent(fieldValidationMsg1));
        } else if (Boolean.TRUE.equals(b2)) {
            Assert.assertTrue(genericMethods.isElementPresent(fieldValidationMsgArabic));
        } else if (Boolean.TRUE.equals(b3)) {
            genericMethods.isElementPresent(fieldValidationMsgArabic1);
            Assert.assertTrue(genericMethods.isElementPresent(fieldValidationMsgArabic1));
        } else {
            log.debug("entered valid fields");
        }
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }

    public void isEntityContactPage() throws Exception {
         Boolean b = genericMethods.isElementPresent(entityContactInfoPage);
        if (Boolean.TRUE.equals(b)) {
            log.debug("user in entity contact page");
        } else {
            genericMethods.isElementPresent(entityContactInfoPageArabic);
            log.debug("user in entity contact page");
        }

    }

    public void enterEmaild(String email) throws Exception {
        waitUtility.waitForSeconds(2);
        genericMethods.click(emailId);
        iosUtility.clearText(emailId);
        genericMethods.sendKeys(emailId, email);

    }

    public void enterCompanyWebsite(String website) throws Exception {
        waitUtility.waitForSeconds(2);
        genericMethods.click(websiteFiled);
        iosUtility.clearText(websiteFiled);
        genericMethods.sendKeys(websiteFiled, website);
    }

    public void clickAddnewBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(addNewBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(addNewBtn);
        } else {
            genericMethods.click(addNewAddressBtnArabic);
        }
    }

    public void isEntityaddNewAddress() throws Exception {
        waitUtility.waitForSeconds(3);
        Boolean b = genericMethods.isElementPresent(addNewContactAddress);
        if (Boolean.TRUE.equals(b)) {
            log.debug(b);
        } else {
            log.debug(genericMethods.isElementPresent(addNewContactAddressArabic));
        }

    }

    public void enterUnitNo(String unitno, String edit) throws Exception {
        if (edit.equalsIgnoreCase("edit")) {

            genericMethods.click(unitNo);
            iosUtility.clearText(unitNo);
            genericMethods.sendKeys(unitNo, "hogwards");
        } else {
            genericMethods.click(unitNo);
            genericMethods.sendKeys(unitNo, unitno);
        }
    }

    public void enterStreet(String street) throws Exception {
        waitUtility.waitForSeconds(1);
        genericMethods.click(streetNo);
        iosUtility.clearText(streetNo);
        genericMethods.sendKeys(streetNo, street);
    }

    public void enterState(String state) throws Exception {
        iosUtility.scrollUp();
        genericMethods.click(stateField);
        iosUtility.clearText(stateField);
        genericMethods.sendKeys(stateField, state);
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
            System.out.println(e);
        }
    }

    public void enterCity(String city) throws Exception {
        genericMethods.click(cityField);
        iosUtility.clearText(stateField);
        genericMethods.sendKeys(cityField, city);
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
            System.out.println(e);
        }
    }

    public void enterZip(String zip) throws Exception {
        iosUtility.scrollUp();
        genericMethods.click(zipCode);
        iosUtility.clearText(zipCode);
        genericMethods.sendKeys(zipCode, zip);
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
            System.out.println(e);
        }
    }

    public void enterPstBox(String postCode) throws Exception {
        iosUtility.scrollUp();
        genericMethods.click(poBoxField);
        genericMethods.sendKeys(poBoxField, postCode);
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
            System.out.println(e);
        }
    }

    public void validateCountry(String countryCode) throws Exception {
        Boolean b = genericMethods.isElementPresent(countryField);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(countryField);
            waitUtility.waitForSeconds(2);
            genericMethods.click(searchField);
            genericMethods.sendKeys(searchField, countryCode);
            try {
                iosUtility.hideKeyboard();
            } catch (Exception e) {
                log.debug(e);
            }
            log.info(driver.findElements(countryList).size());
            iosUtility.selectionOfDropdown(countryCode, countryList);
        }
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }

    public void validateUserDetails(String addressType, String state, String city, String zipcode, String postBox) throws Exception {
        log.info(driver.findElements(viewDataDetails).size());
        List<WebElement> tempUserDetails = driver.findElements(viewDataDetails);
        try {
            iosUtility.selectionItemVisible(addressType, tempUserDetails);
            iosUtility.selectionItemVisible(state, tempUserDetails);
            iosUtility.selectionItemVisible(city, tempUserDetails);
            iosUtility.selectionItemVisible(zipcode, tempUserDetails);
            iosUtility.selectionItemVisible(postBox, tempUserDetails);
        } catch (Exception e) {
            log.debug(e);
        }

    }

    public void isEditValidationMsgPresent() throws Exception {
        Boolean b = genericMethods.isElementPresent(editValidationMsg);
        Boolean b1 = genericMethods.isElementPresent(editValidationMsgArabic);
        try {
            if (Boolean.TRUE.equals(b)) {
                genericMethods.isElementPresent(editValidationMsg);
                genericMethods.click(closeBtn);
            } else if (Boolean.TRUE.equals(b1)) {
                genericMethods.isElementPresent(editValidationMsgArabic);
                genericMethods.click(closeBtnArabic);
            } else {
                try {
                    genericMethods.click(closeBtn);
                } catch (Exception e) {
                    genericMethods.click(closeBtnArabic);
                    log.debug("close button need to be implement");
                }
            }
        } catch (Exception e) {
            log.debug(e);
        }

    }

    public void deletePromtConfirmation() throws Exception {
        Boolean b = genericMethods.isElementPresent(deleteConfirmationMsg);
        Boolean b1 = genericMethods.isElementPresent(deleteConfirmationMsgArabic);
        if (Boolean.TRUE.equals(b)) {
            waitUtility.waitForSeconds(2);
            log.info(genericMethods.isElementPresent(deleteConfirmationMsg));
        } else if (Boolean.TRUE.equals(b1)) {
            waitUtility.waitForSeconds(2);
            log.info(genericMethods.isElementPresent(deleteConfirmationMsgArabic));
        }
    }

    public void clickEditBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(editButton);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(editButton);
        } else {
            genericMethods.click(editButtonArabic);
        }
    }

    public void ios_clickDeleteBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(deleteButton);

        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(deleteButton);
        } else {
            genericMethods.click(deleteButtonArabic);
        }

    }
}
