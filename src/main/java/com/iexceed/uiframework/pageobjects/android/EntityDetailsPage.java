package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class EntityDetailsPage {

    AndroidUtility androidUtility;
    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(EntityDetailsPage.class);

    public EntityDetailsPage() {
        genericMethods = new GenericMethods(driver);
        androidUtility = new AndroidUtility();
        waitUtility = new WaitUtility();
    }

    By hamBurgerMenu = By.xpath("//android.widget.ImageView[@content-desc='HAMBURGER_ICON']");
    By menuList = By.xpath("//*[@text='User Contact Details']");

    By addNewUsrBtn = By.xpath("//android.view.View[contains(@text,'+ Add A New User')]");
    By addNewUsrBtnArabic = By.xpath("//*[@text='+ إضافة مستخدم جديد']");
    By editField = By.className("android.widget.EditText");
    By editField1 = By.xpath("//android.widget.EditText");
    By userName = By.xpath("//*[@text='User Name *']");
    By emailAddress = By.xpath("//android.view.View[@content-desc=\"UserContactDetailsView\"]/android.widget.ScrollView/android.view.View/android.widget.EditText[2]");
    By email = By.xpath("//*[@text='Email *']");
    By confirmBtn = By.xpath("//*[@text='Confirm']");
    By confirmBtnArabic = By.xpath("//*[@text='يتأكد']");
    By validationMSg = By.xpath("//*[@text='Please enter valid field']");
    By validationMSg1 = By.xpath("//*[@text='Please enter this field']");
    By validationMSgArabic = By.xpath("//*[@text='الرجاء إدخال حقل صالح']");
    By validationMSg1Arabic = By.xpath("//*[@text='الرجاء إدخال هذا الحقل']");

    By countryField = By.xpath("//android.view.View[@text='Code *']");
    By countryFieldArabic = By.xpath("//*[@text='الشفرة *']");
    By searchField = By.xpath("//android.widget.EditText");
    By countryList = By.xpath("//android.view.View");
    By mobNumField = By.xpath("//*[@text='Mobile *']");
    By cancelBtn = By.xpath("//*[@text='Cancel']");
    By cancelBtnArabic = By.xpath("//android.view.View[@text='يلغي']");
    By confirmationMsg = By.xpath("//*[@text='Do you want to cancel ?']");
    By confirmationMsg1 = By.xpath("//*[@text='Do you want to cancel the application ?']");
    By confirmationMsgArabic = By.xpath("//android.view.View[@text='هل تريد الالغاء ؟']");
    By confirmationMsg1Arabic = By.xpath("//android.view.View[@text='هل تريد إلغاء التطبيق؟']");
    By validateUseCreationMsg = By.xpath("//*[@text='Success ! You have successfully added the user to the list...']");
    By validateUseCreationMsgArabic = By.xpath("//*[@text='Success ! You have successfully added the user to the list...']");
    By closeBtn = By.xpath("//*[@text='Close']");
    By closeBtnArabic = By.xpath("//android.view.View[@text='قريب']");
    By viewDataDetails = By.xpath("//android.view.View");
    By editButton = By.xpath("//android.widget.ImageView[@content-desc='Edit Icon']");
    By deleteButton = By.xpath("//android.widget.ImageView[@content-desc='Delete Icon']");
    By deleteConfirmationMsg = By.xpath("//*[@text='Are you sure you want to delete the User from the list ?']");
    By deleteConfirmationMsgArabic = By.xpath("//android.view.View[@text='هل أنت متأكد أنك تريد حذف المستخدم من القائمة؟']");
    By okBtn = By.xpath("//*[@text='OK']");
    By okBtnArabic = By.xpath("//android.view.View[@text='نعم']");
    By noButton = By.xpath("//android.view.View[3]");
    By continueBtn = By.xpath("//*[@text='Continue']");
    By searchBar = By.xpath("//android.widget.EditText");
    By clearField = By.xpath("//android.view.View[@content-desc='Clear Field']");
    By clearFieldArabic = By.xpath("//android.view.View[@content-desc='الحقل خالى']");

    By entityLegalName = By.xpath("//android.view.View[@text='Entity Legal Name *']");

    public void clickAddNewuserBtn() {
        try {
            genericMethods.waitForVisibility(addNewUsrBtn);
            genericMethods.click(addNewUsrBtn);
        } catch (Exception e) {
            log.debug(e);
            genericMethods.waitForVisibility(addNewUsrBtnArabic);
            genericMethods.click(addNewUsrBtnArabic);

        }
    }

    public void swipingHamburgerMenu() throws InterruptedException {
        try {
            genericMethods.waitForVisibility(addNewUsrBtn);
        } catch (Exception e) {
            log.debug(e);
        }

        genericMethods.click(hamBurgerMenu);
        Boolean b = genericMethods.isElementPresent(menuList);
        if (Boolean.TRUE.equals(b)) {
            log.debug("menu is swipped");
        }
        genericMethods.click(hamBurgerMenu);
        log.debug("menu swipped is closed");
    }

    public void isSearchField() throws InterruptedException {
        genericMethods.isElementPresent(searchBar);
        genericMethods.sendKeys(searchBar, "divya");

    }

    public void clearSearchField() {
        try {
            genericMethods.click(clearField);
        } catch (Exception e) {
            genericMethods.click(clearFieldArabic);
        }
    }

    public void addUserName(String userName, String limit) throws Exception {
        String regex = "@@^[-!@#%&()']*$/";
        waitUtility.waitForSeconds(7);
        genericMethods.click(editField);
        androidUtility.clearText(editField);
        genericMethods.sendKeys(editField, userName);
        String userNameTxt = genericMethods.getText(editField);
        int count = androidUtility.characterCount(userNameTxt);
        log.info(count);


        if (userName.isEmpty()) {
            log.info("user name is empty");
            clickSomeOtherField();
        } else {
            if (count <= Integer.parseInt(limit)) {
                log.info("username is not empty");
                if (userName.contains(regex)) {
                    log.info("Invalid character in Name field");
                    clickSomeOtherField();
                } else {
                    log.info("user enter valid name");
                    clickSomeOtherField();
                }
            } else {
                log.info("user name is more then limit value");
                clickSomeOtherField();
            }
        }
        try {

            genericMethods.hideKeyboard();
        } catch (Exception e) {
            log.info("keyborad ia not alive");

        }
    }

    public void clickSomeOtherField() {
        genericMethods.click(editField);
    }


    public void enterEmail(String emaill) {

        log.debug(driver.findElements(editField).size());
        try {
            editField1.findElements(driver).get(1).click();
            editField1.findElements(driver).get(1).clear();
            editField1.findElements(driver).get(1).sendKeys(emaill);

        } catch (Exception e) {
            genericMethods.click(editField);
            driver.findElement(editField).clear();
            genericMethods.sendKeys(editField, emaill);

        }
        genericMethods.click(editField);
        try {

            genericMethods.hideKeyboard();
        } catch (Exception e) {
            log.info("keyborad is not alive");

        }

    }

    public void clickConfirmBtn() throws Exception {
        genericMethods.hideKeyboard();
        Boolean b = genericMethods.isElementPresent(confirmBtn);

        if (Boolean.TRUE.equals(b)) {
            try {
                genericMethods.click(confirmBtn);
            } catch (Exception e) {
                log.debug("keyboard is not alive");
                genericMethods.click(confirmBtn);
            }
        } else {

            genericMethods.hideKeyboard();
            waitUtility.waitForSeconds(2);
            genericMethods.click(confirmBtnArabic);

        }

    }

    public void isValidationMsgPresent(String expectedMsg, String expectedMsg1) throws Exception {
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


    public void enterCountryCode(String countryCode) throws Exception {
        try {
            genericMethods.isElementPresent(countryField);
            genericMethods.click(countryField);
            waitUtility.waitForSeconds(3);
            genericMethods.waitForVisibility(searchField);
            genericMethods.click(searchField);
            genericMethods.sendKeys(searchField, countryCode);
            log.info(driver.findElements(countryList).size());
            List<WebElement> temoCountryList = driver.findElements(countryList);
            androidUtility.selectionOfDropdown(countryCode, temoCountryList);
        } catch (Exception e) {
            genericMethods.click(countryFieldArabic);
            waitUtility.waitForSeconds(3);
            genericMethods.click(searchField);
            genericMethods.sendKeys(searchField, countryCode);
            log.info(driver.findElements(countryList).size());
            List<WebElement> temoCountryList = driver.findElements(countryList);
            androidUtility.selectionOfDropdown(countryCode, temoCountryList);
        }

    }

    public void enterMobNum(String mob) throws Exception {
        log.info(driver.findElements(editField).size());
        waitUtility.waitForSeconds(5);
        Boolean b = genericMethods.isElementPresent(editField);
        try {
            if (Boolean.TRUE.equals(b)) {
                editField.findElements(driver).get(2).click();
                editField.findElements(driver).get(2).clear();
                editField.findElements(driver).get(2).sendKeys(mob);
            } else {
                editField1.findElements(driver).get(2).click();
                editField1.findElements(driver).get(2).clear();
                editField1.findElements(driver).get(2).sendKeys(mob);
            }
        } catch (Exception e) {
            genericMethods.click(mobNumField);
            androidUtility.clearText(mobNumField);
            genericMethods.sendKeys(mobNumField, mob);

        }
    }

    public void clickCancelBtn() throws Exception {
        waitUtility.waitForSeconds(4);
        Boolean b = genericMethods.isElementPresent(cancelBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(cancelBtn);
        } else {
            genericMethods.click(cancelBtnArabic);
        }
    }


    public void isYesNoBtnPresentConfirmation() throws InterruptedException {
        try {
            Boolean b = genericMethods.isElementPresent(confirmationMsg);
            Boolean b1 = genericMethods.isElementPresent(deleteConfirmationMsg);
            if (Boolean.TRUE.equals(b)) {
                genericMethods.waitForVisibility(confirmationMsg);
                log.info(genericMethods.isElementPresent(confirmationMsg));
            } else if (Boolean.TRUE.equals(b1)) {
                genericMethods.isElementPresent(deleteConfirmationMsg);
            } else {
                genericMethods.waitForVisibility(confirmationMsg1);
                genericMethods.isElementPresent(confirmationMsg1);
            }
        }catch(Exception e){
            Boolean c = genericMethods.isElementPresent(confirmationMsgArabic);
            Boolean c1 = genericMethods.isElementPresent(deleteConfirmationMsgArabic);
            if (Boolean.TRUE.equals(c)) {
                genericMethods.waitForVisibility(confirmationMsgArabic);
                log.info(genericMethods.isElementPresent(confirmationMsgArabic));
            } else if (Boolean.TRUE.equals(c1)) {
                genericMethods.isElementPresent(deleteConfirmationMsgArabic);
            } else {
                genericMethods.waitForVisibility(confirmationMsg1Arabic);
                genericMethods.isElementPresent(confirmationMsg1Arabic);
            }
        }
    }

    public void clickYEsBtnValidation() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean c = genericMethods.isElementPresent(okBtn);

        if (Boolean.TRUE.equals(c)) {
            genericMethods.click(okBtn);
        }else{
            genericMethods.click(okBtnArabic);
        }
    }

    public void clicNoBtnValidation() {

        try {
            waitUtility.waitForSeconds(2);
            genericMethods.click(noButton);
        } catch (Exception e) {
            genericMethods.back();
        }
    }

    public void isBottomValidationMsgPresent() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(validateUseCreationMsg);
        Boolean b1 = genericMethods.isElementPresent(validateUseCreationMsgArabic);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.isElementPresent(validateUseCreationMsg);
            genericMethods.click(closeBtn);
        } else if(Boolean.TRUE.equals(b1)){
            genericMethods.isElementPresent(validateUseCreationMsgArabic);
            genericMethods.click(closeBtn);
        }else {
            genericMethods.click(closeBtn);
        }

    }

    public void validateUserDetails(String userName, String email, String mobNum) throws Exception {

        waitUtility.waitForSeconds(2);
        log.info(driver.findElements(viewDataDetails).size());
        List<WebElement> tempUserDetails = driver.findElements(viewDataDetails);
        androidUtility.selectionItemVisible(userName, tempUserDetails);
        androidUtility.selectionItemVisible(email, tempUserDetails);
        androidUtility.selectionItemVisible(mobNum, tempUserDetails);

    }

    public void clickEditBtn() {
        genericMethods.click(editButton);
    }

    public void clickDeleteBtn() {
        genericMethods.waitForVisibility(deleteButton);
        genericMethods.click(deleteButton);
    }

    public void isAddNewScreen() throws InterruptedException {
        genericMethods.isElementPresent(editField);
    }

    public void clickContinueBtn() throws Exception {
        waitUtility.waitForSeconds(5);
        driver.hideKeyboard();
        genericMethods.click(continueBtn);
        Boolean b = genericMethods.isElementPresent(entityLegalName);

        if (Boolean.TRUE.equals(b)) {
            log.debug("screen navigate to entity legal screen");
        } else {
            log.debug("screen navigation is not happening");
        }

    }

}
