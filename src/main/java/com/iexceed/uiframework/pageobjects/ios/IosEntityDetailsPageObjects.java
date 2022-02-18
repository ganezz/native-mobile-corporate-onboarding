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

public class IosEntityDetailsPageObjects {

    IOSUtility iosUtility;
    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(IosEntityDetailsPageObjects.class);

    public IosEntityDetailsPageObjects() {
        genericMethods = new GenericMethods(driver);
        iosUtility = new IOSUtility();
        waitUtility = new WaitUtility();
    }

    By hamBurgerMenu = By.xpath("//XCUIElementTypeButton[@name='DrawerButton']");
    By menuList = By.xpath("//XCUIElementTypeButton[@name='User Contact Details. It is selected.']");
    By menuListAbic = By.xpath("//XCUIElementTypeButton[@name='User Contact Details. تم تحديده.']");
    By addNewUsrBtn = By.xpath("//XCUIElementTypeButton[@name='Add a New User Button']");
    By addNewUsrBtnArabic = By.xpath("//XCUIElementTypeButton[@name='Add a New User Button']");
    By editField = By.className("android.widget.EditText");
    By username = By.xpath("//XCUIElementTypeTextField[@name='Username Text Field']");
    By email = By.xpath("//XCUIElementTypeTextField[@name='Email Text Field']");
    By mobileNo = By.xpath("//XCUIElementTypeTextField[@name='Mobile Text Field']");
    By confirmBtn = By.xpath("//XCUIElementTypeButton[@name='Confirm Button']");
    By confirmBtnArabic = By.xpath("//XCUIElementTypeButton[@name='Confirm Button']");
    By validationMSg = By.xpath("//*[contains(@label,'Please enter valid field')]");
    By validationMSg1 = By.xpath("//*[contains(@label,'Please enter this field')]");
    By validationMSgArabic = By.xpath("//*[contains(@label,'الرجاء إدخال حقل صالح')]");
    By validationMSg1Arabic = By.xpath("//*[contains(@label,'الرجاء إدخال هذا الحقل')]");

    By countryField = By.xpath("//XCUIElementTypeButton[@name='Mobile Code Drop Down']");
    By countryFieldArabic = By.xpath("//XCUIElementTypeButton[@name='Mobile Code Drop Down']");
    By searchField = By.xpath("//XCUIElementTypeTextField[@name='SearchTextField']");
    By countryList = By.xpath("//XCUIElementTypeButton");
    By cancelBtn = By.xpath("//XCUIElementTypeButton[@name='Cancel Button']");
    By cancelButton = By.xpath("//XCUIElementTypeButton[@name='Cancel Button']");
    By cancelBtnArabic = By.xpath("//XCUIElementTypeButton[@name='Cancel Button']");
    By confirmationMsg = By.xpath("//*[contains(@label,'Do you want to cancel the application?')]");
    By confirmationMsg1 = By.xpath("//XCUIElementTypeStaticText[@name='Content Text']");
    By confirmationMsgArabic = By.xpath("//*[contains(@label,'هل تريد إلغاء التطبيق')]");
    By confirmationMsg1Arabic = By.xpath("//XCUIElementTypeStaticText[@name='Content Text']");
    By validateUseCreationMsg = By.xpath("//XCUIElementTypeStaticText[@name='Success ! You have successfully added the user to the list...']");
    By validateUseCreationMsgArabic = By.xpath("//*[contains(@label,'النجاح ! لقد نجحت في إضافة المستخدم إلى القائمة ...')]");
    By closeBtn = By.xpath("//XCUIElementTypeButton[@name='Close']");
    By closeBtnArabic = By.xpath("//*[contains(@label,'اضغط على زر الإغلاق لإغلاق الخبز المحمص')]");
    By viewDataDetails = By.xpath("//XCUIElementTypeStaticText");
    By editButton = By.xpath("//XCUIElementTypeButton[@name='Edit Button0']");
    By editButtonArabic = By.xpath("//XCUIElementTypeButton[@name='Edit Button0']");
    By deleteButton = By.xpath("//XCUIElementTypeButton[@name='Delete Button0']");
    By deleteButtonArabic = By.xpath("//XCUIElementTypeButton[@name='Delete Button0']");
    By deleteConfirmationMsg = By.xpath("//XCUIElementTypeStaticText[@name='Content Text']");
    By deleteConfirmationMsgArabic = By.xpath("//XCUIElementTypeStaticText[@name='Content Text']");
    By okBtn = By.xpath("/XCUIElementTypeButton[@name='OK Button']");
    By okButton = By.xpath("//*[contains(@label,'Press to accept.')]");
    By okBtnArabic = By.xpath("//*[contains(@label,'اضغط لقبول')]");
    By okButtonArabic = By.xpath("/XCUIElementTypeButton[@name='OK Button']");
    By noButton = By.xpath("//XCUIElementTypeButton[@name='Cancel Button']");
    By continueBtn = By.xpath("//XCUIElementTypeButton[@name='Continue Button']");
    By continueBtnArabic = By.xpath("//XCUIElementTypeButton[@name='Continue Button']");
    By searchBar = By.xpath("//XCUIElementTypeSearchField[@name='SearchTextField']");
    By clearField = By.xpath("//android.view.View[@content-desc='Clear Field']");
    By clearFieldArabic = By.xpath("//android.view.View[@content-desc='الحقل خالى']");
    By entityLegalNameArabic = By.xpath("//XCUIElementTypeTextField[@name='Legal Name Text Field']");
    By entityLegalName = By.xpath("//XCUIElementTypeTextField[@name='Legal Name Text Field']");


    public void ios_clickAddNewuserBtn() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(addNewUsrBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(addNewUsrBtn);
        } else {
            genericMethods.click(addNewUsrBtnArabic);

        }
    }

    public void ios_swipingHamburgerMenu() throws Exception {
        waitUtility.waitForSeconds(3);
        genericMethods.click(hamBurgerMenu);
        Boolean b = genericMethods.isElementPresent(menuList);
        if (Boolean.TRUE.equals(b)) {
            log.debug("menu is swipped");
        } else {
            Boolean b1 = genericMethods.isElementPresent(menuListAbic);
            log.debug(Boolean.TRUE.equals(b));
        }
        genericMethods.click(hamBurgerMenu);
        log.debug("menu swipped is closed");
    }

    public void ios_isSearchField() throws Exception {
        waitUtility.waitForSeconds(3);
        genericMethods.isElementPresent(searchBar);
        genericMethods.sendKeys(searchBar, "divya");

    }

    public void clearSearchField() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(clearField);
        Boolean b1 = genericMethods.isElementPresent(clearField);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(clearField);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.click(clearFieldArabic);
        } else {
            log.debug("clear is not happening");
        }

    }

    public void ios_addUserName(String userName, String limit, String type) throws Exception {
        waitUtility.waitForSeconds(2);
        genericMethods.click(username);
        iosUtility.clearText(username);
        if (type.equalsIgnoreCase("edit")) {
            genericMethods.sendKeys(username, "jackyChan");
        } else {
            genericMethods.sendKeys(username, userName);
        }
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.info("keyborad ia not alive");

        }
    }


    public void ios_enterEmail(String emaill) {
        genericMethods.click(email);
        iosUtility.clearText(email);
        genericMethods.sendKeys(email, emaill);
        genericMethods.click(editField);
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.info("keyborad is not alive");
        }

    }

    public void ios_clickConfirmBtn() throws Exception {
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
        genericMethods.click(confirmBtn);
    }


    public void ios_isValidationMsgPresent(String expectedMsg, String expectedMsg1) throws Exception {
        waitUtility.waitForSeconds(2);
        try {
            Boolean b = genericMethods.isElementPresent(validationMSg);
            Boolean b1 = genericMethods.isElementPresent(validationMSg1);
            if (Boolean.TRUE.equals(b)) {
                Assert.assertEquals(genericMethods.getText(validationMSg), expectedMsg);
                log.info(genericMethods.getText(validationMSg));
                Assert.assertFalse(false);
            } else if (Boolean.TRUE.equals(b1)) {
                Assert.assertEquals(genericMethods.getText(validationMSg1), expectedMsg1);
                log.info(genericMethods.getText(validationMSg1));
                Assert.assertFalse(false);

            } else {
                log.info("Message is not visible-user enter valid input");

            }
        } catch (Exception e) {
            Boolean b = genericMethods.isElementPresent(validationMSgArabic);
            Boolean b1 = genericMethods.isElementPresent(validationMSg1Arabic);
            if (Boolean.TRUE.equals(b)) {
                Assert.assertEquals(genericMethods.getText(validationMSgArabic), "الرجاء إدخال حقل صالح");
                log.info(genericMethods.getText(validationMSgArabic));
                Assert.assertFalse(false);
            } else if (Boolean.TRUE.equals(b1)) {
                Assert.assertEquals(genericMethods.getText(validationMSg1Arabic), "الرجاء إدخال هذا الحقل");
                log.info(genericMethods.getText(validationMSg1Arabic));
                Assert.assertFalse(false);

            } else {
                log.info("Message is not visible-user enter valid input");

            }

        }
    }


    public void ios_enterCountryCode(String countryCode) throws Exception {
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

    public void ios_enterMobNum(String mob) throws Exception {
        waitUtility.waitForSeconds(5);
        genericMethods.click(mobileNo);
        iosUtility.clearText(mobileNo);
        genericMethods.sendKeys(mobileNo, mob);
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }

    public void ios_clickCancelBtn() throws Exception {
        waitUtility.waitForSeconds(2);
        genericMethods.click(cancelBtnArabic);
    }


    public void ios_isYesNoBtnPresentConfirmation() throws InterruptedException {
        try {
            waitUtility.waitForSeconds(3);
            Boolean b = genericMethods.isElementPresent(confirmationMsg);
            Boolean b1 = genericMethods.isElementPresent(deleteConfirmationMsg);
            if (Boolean.TRUE.equals(b)) {
                genericMethods.isElementPresent(confirmationMsg);
            } else if (Boolean.TRUE.equals(b1)) {
                genericMethods.isElementPresent(deleteConfirmationMsg);
            } else {
                genericMethods.isElementPresent(confirmationMsg1);
            }
        } catch (Exception e) {
            Boolean c = genericMethods.isElementPresent(confirmationMsgArabic);
            Boolean c1 = genericMethods.isElementPresent(deleteConfirmationMsgArabic);
            if (Boolean.TRUE.equals(c)) {
                log.info(genericMethods.isElementPresent(confirmationMsgArabic));
            } else if (Boolean.TRUE.equals(c1)) {
                genericMethods.isElementPresent(deleteConfirmationMsgArabic);
            } else {
                genericMethods.isElementPresent(confirmationMsg1Arabic);
            }
        }
    }

    public void ios_clickYEsBtnValidation() throws Exception {
        Boolean c = genericMethods.isElementPresent(okBtn);
        Boolean c1 = genericMethods.isElementPresent(okButton);
        Boolean c2 = genericMethods.isElementPresent(okButtonArabic);
        if (Boolean.TRUE.equals(c)) {
            genericMethods.click(okBtn);
        } else if (Boolean.TRUE.equals(c1)) {
            genericMethods.click(okButton);
        } else if (Boolean.TRUE.equals(c2)) {
            genericMethods.click(okButtonArabic);
        } else {
            genericMethods.click(okBtnArabic);
        }

    }

    public void ios_clickCancelBtnValidation() {

        try {
            waitUtility.waitForSeconds(2);
            Boolean c = genericMethods.isElementPresent(noButton);
            if (Boolean.TRUE.equals(c)) {
                genericMethods.click(noButton);
            } else {
                genericMethods.click(cancelButton);
            }
        } catch (Exception e) {
            genericMethods.back();
        }
    }

    public void ios_isBottomValidationMsgPresent() throws Exception {
        Boolean b = genericMethods.isElementPresent(validateUseCreationMsg);
        Boolean b1 = genericMethods.isElementPresent(validateUseCreationMsgArabic);
        try {
            if (Boolean.TRUE.equals(b)) {
                genericMethods.isElementPresent(validateUseCreationMsg);
                genericMethods.click(closeBtn);
            } else if (Boolean.TRUE.equals(b1)) {
                genericMethods.isElementPresent(validateUseCreationMsgArabic);
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

    public void ios_validateUserDetails(String userName, String email, String mobNum) throws Exception {
        try {
            waitUtility.waitForSeconds(2);
            log.info(driver.findElements(viewDataDetails).size());
            List<WebElement> tempUserDetails = driver.findElements(viewDataDetails);
            iosUtility.selectionItemVisible(userName, tempUserDetails);
            iosUtility.selectionItemVisible(email, tempUserDetails);
            iosUtility.selectionItemVisible(mobNum, tempUserDetails);
        } catch (Exception e) {
            log.debug(e);
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

    public void ios_isAddNewScreen() throws InterruptedException {
        genericMethods.isElementPresent(username);
    }

    public void ios_clickContinueBtn() throws Exception {
        waitUtility.waitForSeconds(2);
        genericMethods.click(continueBtn);
    }

}
