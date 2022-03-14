package com.iexceed.uiframework.pageobjects.ios;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.domainobjects.IOSUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class IosBusinessLocationPageObjects {

    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(IosBusinessLocationPageObjects.class);
    AndroidUtility androidUtility;
    IOSUtility iosUtility;
    public IosBusinessLocationPageObjects() {
        iosUtility =new IOSUtility();
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By businessLogicMenu = By.xpath("//XCUIElementTypeButton[@name='Business Location. It is incomplete.']");
    By businessLogicMenuArabic = By.xpath("//XCUIElementTypeButton[@name='Business Location. إنه غير مكتمل.']");
    By addNewLocationBtn = By.xpath("//XCUIElementTypeButton[@name='Add a New Location Button']");
    By addNewLocationBtnArabic = By.xpath("//XCUIElementTypeButton[@name='Add a New Location Button']");
    By typeOFOperation=By.xpath("//XCUIElementTypeTextField[@name='Type Of Operation Text Field']");
    By proportion=By.xpath("//XCUIElementTypeTextField[@name='Proportion Text Field']");
    By addNewMarketBtn = By.xpath("//XCUIElementTypeButton[@name='Add a New Business Market Button']");
    By addNewMarketBtnArabic = By.xpath("//XCUIElementTypeButton[@name='Add a New Business Market Button']");
    By editField = By.xpath("//android.widget.EditText");
    By searchField = By.xpath("//XCUIElementTypeTextField[@name='SearchTextField']");
    By countryDD=By.xpath("//XCUIElementTypeButton[@name='Country Drop Down']");
    By countryList = By.xpath("//XCUIElementTypeButton");
    By viewDataDetails = By.xpath("//XCUIElementTypeStaticText");
    By locationEditMsg = By.xpath("//android.view.View[@text='Edit ! Business Location edited successfully']");
    By marketEditMsg = By.xpath("//android.view.View[@text='Edit ! Business Market edited successfully']");
    By marketEditMsgArabic = By.xpath("//android.view.View[@text='تعديل ! تم تحرير سوق العمل بنجاح']");
    By closBtn = By.xpath("//XCUIElementTypeButton[@name='Close']");
    By locationEditMsgArabic = By.xpath("//android.view.View[@text='تعديل ! تم تحرير موقع العمل بنجاح']");
    By closBtnArabic = By.xpath("//XCUIElementTypeButton[@name='Close']");
    By businessLocDeleteMsg = By.xpath("//android.view.View[@text='Are you sure you want to delete the Location of business operations ?']");
    By businessLocDeleteMsgArabic = By.xpath("//android.view.View[@text='هل أنت متأكد أنك تريد حذف موقع العمليات التجارية؟']");
    By businessMarketDeleteMsg = By.xpath("//android.view.View[@text='Are you sure you want to delete the Business Market ?']");
    By businessMarketDeleteMsgArabic = By.xpath("//android.view.View[@text='هل أنت متأكد أنك تريد حذف سوق الأعمال؟']");
    By confirmBtn = By.xpath("//XCUIElementTypeButton[@name='Confirm Button']");
    By confirmBtnArabic = By.xpath("//XCUIElementTypeButton[@name='Confirm Button']");
    By okBtn = By.xpath("//android.view.View[@content-desc='Okay button']");
    By okBtnArabic = By.xpath("//android.view.View[@content-desc='زر موافق']");
    By cancelBtn = By.xpath("//XCUIElementTypeButton[@name='Cancel Button']");
    By cancelBtnArabic = By.xpath("//XCUIElementTypeButton[@name='Cancel Button']");
    By applicCancelBtn = By.xpath("//XCUIElementTypeButton[@name='Cancel Button']");
    By applicCancelBtnArabic = By.xpath("//XCUIElementTypeButton[@name='Cancel Button']");
    By continueBtn = By.xpath("//android.view.View[@content-desc='Continue']");
    By continueBtnArabic = By.xpath("//android.view.View[@content-desc='يكمل']");
    By errorFieldValidation = By.xpath("//XCUIElementTypeStaticText[@name='Please enter this field']");
    By errorFieldValidationArabic = By.xpath("//XCUIElementTypeStaticText[@name='الرجاء إدخال هذا الحقل']");
    By errorFieldValidation1 = By.xpath("//XCUIElementTypeStaticText[@name='Please enter valid field']");
    By errorFieldValidationArabic1 = By.xpath("//XCUIElementTypeStaticText[@name='الرجاء إدخال حقل صالح']");
    By addedBinessLocationMsg=By.xpath("//XCUIElementTypeStaticText[@name='Success ! Business Location added successfully']");
    By addedBinessLocationMsgArabic=By.xpath("//XCUIElementTypeStaticText[@name='تمت إضافة موقع العمل بنجاح']");
    By addedBinessMarketMsg=By.xpath("//XCUIElementTypeStaticText[@name='Success ! Business Market added successfully']");
    By addedBinessMarketMsgArabic=By.xpath("//XCUIElementTypeStaticText[@name='تمت إضافة سوق الأعمال الناجحة بنجاح']");
    By editButton = By.xpath("//android.widget.ImageView[@content-desc='Edit Icon']");
    By editButtonArabic = By.xpath("//android.widget.ImageView[@content-desc='تحرير الأيقونة']");
    By deleteButton = By.xpath("//android.widget.ImageView[@content-desc='Delete Icon']");
    By deleteButtonArabic = By.xpath("//android.widget.ImageView[@content-desc='رمز الحذف']");


    public void selectBusinessLocationPage() throws Exception {
        iosUtility.ios_swipingHamburgerMenu();
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(businessLogicMenu);
        System.out.println(b);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(businessLogicMenu);
        } else {
            genericMethods.click(businessLogicMenuArabic);
        }
    }

    public void isErrorMsgDisplayed() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(errorFieldValidation);
        Boolean b1 = genericMethods.isElementPresent(errorFieldValidation1);
        Boolean b2 = genericMethods.isElementPresent(errorFieldValidationArabic);

        if (Boolean.TRUE.equals(b)) {
            log.debug("Proper error message is present");
        } else if(Boolean.TRUE.equals(b1)) {
            log.debug("Proper error message is present");
        }
        else if(Boolean.TRUE.equals(b2)) {
            log.debug("Proper error message is present");
        }else{
            genericMethods.isElementPresent(errorFieldValidationArabic1);
            log.debug("Proper error message is present");
        }
    }


    public void isBusinessLocationPage() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(addNewLocationBtn);
        if (Boolean.TRUE.equals(b)) {
            log.debug("user in business location page");
        } else {
            Boolean b1 = genericMethods.isElementPresent(addNewLocationBtnArabic);
            log.debug(b1);
            log.debug("user in business location Arabic screen");
        }
    }

    public void clickConfirmBtn() throws Exception {
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug("keyboard is not alive");
        }
        Boolean b = genericMethods.isElementPresent(confirmBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(confirmBtn);
        } else {
            genericMethods.click(confirmBtnArabic);
            waitUtility.waitForSeconds(2);
        }

    }

    public void selectCountry(String country) throws Exception {
      if(editField.findElements(driver).get(1).isDisplayed()){
          editField.findElements(driver).get(1).click();
          waitUtility.waitForSeconds(1);
          genericMethods.click(searchField);
          genericMethods.sendKeys(searchField, country);
          log.info(driver.findElements(countryList).size());
          List<WebElement> tempCountryList = driver.findElements(countryList);
          androidUtility.selectionOfDropdown(country, tempCountryList);
      }else{
         genericMethods.click(editField);
          waitUtility.waitForSeconds(1);
          genericMethods.click(searchField);
          genericMethods.sendKeys(searchField, country);
          log.info(driver.findElements(countryList).size());
          List<WebElement> tempCountryList = driver.findElements(countryList);
          androidUtility.selectionOfDropdown(country, tempCountryList);
        }
    }

    public void clickOkBtnValidation() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean c = genericMethods.isElementPresent(okBtn);

        if (Boolean.TRUE.equals(c)) {
            genericMethods.click(okBtn);
        } else {
            genericMethods.click(okBtnArabic);
        }
    }

    public void clickCancelBtnValidation() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean c = genericMethods.isElementPresent(cancelBtn);
        Boolean c2 = genericMethods.isElementPresent(applicCancelBtn);
        Boolean c3 = genericMethods.isElementPresent(applicCancelBtnArabic);
        if (Boolean.TRUE.equals(c)) {
            genericMethods.click(cancelBtn);
        }
        else if(Boolean.TRUE.equals(c2)) {
            genericMethods.click(applicCancelBtn);
        }
        else if(Boolean.TRUE.equals(c3)) {
            genericMethods.click(applicCancelBtnArabic);
        }else {
            genericMethods.click(cancelBtnArabic);
        }
    }

    public void clickApplicationCancelBtnValidation() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean c = genericMethods.isElementPresent(applicCancelBtn);

        if (Boolean.TRUE.equals(c)) {
            genericMethods.click(applicCancelBtn);
        } else {
            genericMethods.click(applicCancelBtnArabic);
        }
    }

    public void clickApplicationContinueBtn() throws Exception {
        waitUtility.waitForSeconds(1);
        driver.hideKeyboard();
        try {

            genericMethods.click(continueBtn);

        } catch (Exception e) {
            waitUtility.waitForSeconds(1);
            genericMethods.click(continueBtnArabic);
        }
    }

    public void addNewLocationBtn() throws Exception {
        waitUtility.waitForSeconds(3);
        Boolean b = genericMethods.isElementPresent(addNewLocationBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(addNewLocationBtn);
        } else {
        genericMethods.isElementPresent(addNewLocationBtnArabic);
        genericMethods.click(addNewLocationBtnArabic);
        }

    }

    public void addNewMarketBtn() throws InterruptedException {

        Boolean b = genericMethods.isElementPresent(addNewMarketBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(addNewMarketBtn);
        } else {
            genericMethods.isElementPresent(addNewMarketBtnArabic);
            genericMethods.click(addNewMarketBtnArabic);
        }
        genericMethods.isElementPresent(editField);
    }

    public void fillCountry(String country,String type) throws Exception {
        if(type.equalsIgnoreCase("edit")) {
            genericMethods.click(countryDD);
            waitUtility.waitForSeconds(1);
            genericMethods.click(searchField);
            genericMethods.sendKeys(searchField, "China");
            try {
                iosUtility.hideKeyboard();
            } catch (Exception e) {
                log.debug(e);
            }
            log.info(driver.findElements(countryList).size());
            iosUtility.selectionOfDropdown("China", countryList);

        }else{
            genericMethods.click(countryDD);
            waitUtility.waitForSeconds(1);
            genericMethods.click(searchField);
            genericMethods.sendKeys(searchField, country);
            try {
                iosUtility.hideKeyboard();
            } catch (Exception e) {
                log.debug(e);
            }
            log.info(driver.findElements(countryList).size());
            iosUtility.selectionOfDropdown(country, countryList);
        }

    }

    public void fillOperation(String operation) {
        genericMethods.click(typeOFOperation);
        iosUtility.clearText(typeOFOperation);
        genericMethods.sendKeys(typeOFOperation,operation);
    }

    public void fillProportion(String proportions) {
        genericMethods.click(proportion);
        iosUtility.clearText(proportion);
        genericMethods.sendKeys(proportion,proportions);
    }


    public void validateAddNewLocationField(String country, String operation) throws Exception {
        try {
            waitUtility.waitForSeconds(2);
            log.info(driver.findElements(viewDataDetails).size());
            List<WebElement> tempUserDetails = driver.findElements(viewDataDetails);
            iosUtility.selectionItemVisible(country, tempUserDetails);
            iosUtility.selectionItemVisible(operation, tempUserDetails);

        } catch (Exception e) {
            log.debug(e);
        }

    }

    public void validateAddNewMarketField(String country, String proportion) throws Exception {
        try {
            waitUtility.waitForSeconds(2);
            log.info(driver.findElements(viewDataDetails).size());
            List<WebElement> tempUserDetails = driver.findElements(viewDataDetails);
            iosUtility.selectionItemVisible(country, tempUserDetails);
            iosUtility.selectionItemVisible(proportion, tempUserDetails);

        } catch (Exception e) {
            log.debug(e);
        }

    }

    public void isAddedValidationMsgPresent() throws Exception {
        Boolean b = genericMethods.isElementPresent(addedBinessLocationMsg);
        Boolean b1 = genericMethods.isElementPresent(addedBinessLocationMsgArabic);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.isElementPresent(addedBinessLocationMsg);
            genericMethods.click(closBtn);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.isElementPresent(addedBinessLocationMsgArabic);
            genericMethods.click(closBtnArabic);
        } else {
            try {
                genericMethods.click(closBtn);
            } catch (Exception e) {
                genericMethods.click(closBtnArabic);
            }
        }
    }
    public void isAddMarketValidationMsgPresent() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(addedBinessMarketMsg);
        Boolean b1 = genericMethods.isElementPresent(addedBinessMarketMsgArabic);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.isElementPresent(addedBinessMarketMsg);
            genericMethods.click(closBtn);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.isElementPresent(addedBinessMarketMsgArabic);
            genericMethods.click(closBtnArabic);
        } else {
            try {
                genericMethods.click(closBtn);
            } catch (Exception e) {
                genericMethods.click(closBtnArabic);
            }
        }
    }


    public void isEditLocationValidationMsgPresent() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(locationEditMsg);
        Boolean b1 = genericMethods.isElementPresent(locationEditMsgArabic);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.isElementPresent(locationEditMsg);
            genericMethods.click(closBtn);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.isElementPresent(locationEditMsgArabic);
            genericMethods.click(closBtnArabic);
        } else {
            try {
                genericMethods.click(closBtn);
            } catch (Exception e) {
                genericMethods.click(closBtnArabic);
            }
        }

    }

    public void isEditMarketValidationMsgPresent() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(marketEditMsg);
        Boolean b1 = genericMethods.isElementPresent(marketEditMsgArabic);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.isElementPresent(marketEditMsg);
            genericMethods.click(closBtn);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.isElementPresent(marketEditMsgArabic);
            genericMethods.click(closBtnArabic);
        } else {
            try {
                genericMethods.click(closBtn);
            } catch (Exception e) {
                genericMethods.click(closBtnArabic);
            }
        }

    }


    public void isDeleteMsgPresent() throws InterruptedException {
        try {
            Boolean b = genericMethods.isElementPresent(businessLocDeleteMsg);
            Boolean b1 = genericMethods.isElementPresent(businessMarketDeleteMsg);
            if (Boolean.TRUE.equals(b)) {
                genericMethods.waitForVisibility(businessLocDeleteMsg);
                log.info(genericMethods.isElementPresent(businessLocDeleteMsg));
            } else if (Boolean.TRUE.equals(b1)) {
                genericMethods.isElementPresent(businessMarketDeleteMsg);
            } else {
                log.debug("no messsage popup is present");
            }
        } catch (Exception e) {
            Boolean c = genericMethods.isElementPresent(businessLocDeleteMsgArabic);
            Boolean c1 = genericMethods.isElementPresent(businessMarketDeleteMsgArabic);
            if (Boolean.TRUE.equals(c)) {
                genericMethods.waitForVisibility(businessLocDeleteMsgArabic);
                log.info(genericMethods.isElementPresent(businessMarketDeleteMsgArabic));
            } else if (Boolean.TRUE.equals(c1)) {
                genericMethods.isElementPresent(businessLocDeleteMsgArabic);
            } else {
                log.debug("no messsage popup is present");
            }
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

    public void clickDeleteBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(deleteButton);

        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(deleteButton);
        } else {
            genericMethods.click(deleteButtonArabic);
        }

    }
}

