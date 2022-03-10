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

public class BusinessLocationPageObjects {

    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(BusinessLocationPageObjects.class);
    AndroidUtility androidUtility;

    public BusinessLocationPageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By businessLogicMenu = By.xpath("//*[@text='Business Location']");
    By addNewLocationBtn = By.xpath("//android.view.View[@content-desc='Add a new location']");
    By addNewLocationBtnArabic = By.xpath("//android.view.View[@content-desc='أضف موقعًا جديدًا']");
    By addNewMarketBtn = By.xpath("//android.view.View[@content-desc='Add a new business market']");
    By addNewMarketBtnArabic = By.xpath("//android.view.View[@content-desc='أضف سوق عمل جديد']");
    By editField = By.xpath("//android.widget.EditText");
    By searchField = By.xpath("//android.widget.EditText");
    By countryList = By.xpath("//android.view.View");
    By viewDataDetails = By.xpath("//android.view.View");
    By locationEditMsg = By.xpath("//android.view.View[@text='Edit ! Business Location edited successfully']");
    By marketEditMsg = By.xpath("//android.view.View[@text='Edit ! Business Market edited successfully']");
    By marketEditMsgArabic = By.xpath("//android.view.View[@text='تعديل ! تم تحرير سوق العمل بنجاح']");
    By closBtn = By.xpath("//*[@text='Close']");
    By locationEditMsgArabic = By.xpath("//android.view.View[@text='تعديل ! تم تحرير موقع العمل بنجاح']");
    By closBtnArabic = By.xpath("//android.view.View[@text='قريب']");
    By businessLocDeleteMsg = By.xpath("//android.view.View[@text='Are you sure you want to delete the Location of business operations ?']");
    By businessLocDeleteMsgArabic = By.xpath("//android.view.View[@text='هل أنت متأكد أنك تريد حذف موقع العمليات التجارية؟']");
    By businessMarketDeleteMsg = By.xpath("//android.view.View[@text='Are you sure you want to delete the Business Market ?']");
    By businessMarketDeleteMsgArabic = By.xpath("//android.view.View[@text='هل أنت متأكد أنك تريد حذف سوق الأعمال؟']");
    By confirmBtn = By.xpath("//android.view.View[@content-desc='Confirm']");
    By confirmBtnArabic = By.xpath("//android.view.View[@content-desc='يتأكد']");
    By okBtn = By.xpath("//android.view.View[@content-desc='Okay button']");
    By okBtnArabic = By.xpath("//android.view.View[@content-desc='زر موافق']");
    By cancelBtn = By.xpath("//android.view.View[@content-desc='Cancel button']");
    By cancelBtnArabic = By.xpath("//android.view.View[@content-desc='زرالإلغاء']");
    By applicCancelBtn = By.xpath("//android.view.View[@content-desc='Cancel']");
    By applicCancelBtnArabic = By.xpath("//android.view.View[@content-desc='يلغي']");
    By continueBtn = By.xpath("//android.view.View[@content-desc='Continue']");
    By continueBtnArabic = By.xpath("//android.view.View[@content-desc='يكمل']");
    By errorFieldValidation = By.xpath("//*[@text='Please enter valid field']");
    By errorFieldValidationArabic = By.xpath("//*[@text='الرجاء إدخال حقل صالح']");
    By addedBinessLocationMsg=By.xpath("//android.view.View[@text='Success ! Business Location added successfully']");
    By addedBinessLocationMsgArabic=By.xpath("//android.view.View[@text='نجاح ! تمت إضافة موقع العمل بنجاح']");
    By addedBinessMarketMsg=By.xpath("//android.view.View[@text='Success ! Business Market added successfully']");
    By addedBinessMarketMsgArabic=By.xpath("//android.view.View[@text='نجاح ! تمت إضافة سوق الأعمال بنجاح']");
    By editButton = By.xpath("//android.widget.ImageView[@content-desc='Edit Icon']");
    By editButtonArabic = By.xpath("//android.widget.ImageView[@content-desc='تحرير الأيقونة']");
    By deleteButton = By.xpath("//android.widget.ImageView[@content-desc='Delete Icon']");
    By deleteButtonArabic = By.xpath("//android.widget.ImageView[@content-desc='رمز الحذف']");

    public void selectBusinessLocationPage() throws Exception {
        androidUtility.swipingHamburgerMenu();
        genericMethods.click(businessLogicMenu);
    }

    public void isErrorMsgDisplayed() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(errorFieldValidation);
        if (Boolean.TRUE.equals(b)) {
            log.debug("Proper error message is present");
        } else {
            Boolean b1 = genericMethods.isElementPresent(errorFieldValidationArabic);
            log.debug(b1);
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
            genericMethods.hideKeyboard();
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
            Boolean b1 = genericMethods.isElementPresent(addNewLocationBtnArabic);
            log.debug(b1);
            genericMethods.click(addNewLocationBtnArabic);
        }
        genericMethods.isElementPresent(editField);
    }

    public void addNewMarketBtn() throws InterruptedException {

        Boolean b = genericMethods.isElementPresent(addNewMarketBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(addNewMarketBtn);
        } else {
            Boolean b1 = genericMethods.isElementPresent(addNewMarketBtnArabic);
            log.debug(b1);
            genericMethods.click(addNewMarketBtnArabic);
        }
        genericMethods.isElementPresent(editField);
    }

    public void fillCountry(String country,String type) throws Exception {
        if(type.equalsIgnoreCase("edit")) {
            genericMethods.click(editField);
            waitUtility.waitForSeconds(1);
            genericMethods.click(searchField);
            genericMethods.sendKeys(searchField, "China");
            log.info(driver.findElements(countryList).size());
            List<WebElement> tempCountryList = driver.findElements(countryList);
            androidUtility.selectionOfDropdown("China", tempCountryList);

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

    public void fillOperation(String operation) {
        editField.findElements(driver).get(1).click();
        editField.findElements(driver).get(1).clear();
        editField.findElements(driver).get(1).sendKeys(operation);
    }

    public void fillProportion(String proportion) {
        editField.findElements(driver).get(1).click();
        editField.findElements(driver).get(1).clear();
        editField.findElements(driver).get(1).sendKeys(proportion);
    }


    public void validateAddNewLocationField(String country, String operation) throws Exception {
        log.info(driver.findElements(viewDataDetails).size());
        List<WebElement> tempDetails = driver.findElements(viewDataDetails);
        androidUtility.selectionItemVisible(country, tempDetails);
        androidUtility.selectionItemVisible(operation, tempDetails);

    }

    public void validateAddNewMarketField(String country, String proportion) throws Exception {
        log.info(driver.findElements(viewDataDetails).size());
        List<WebElement> tempDetails = driver.findElements(viewDataDetails);
        androidUtility.selectionItemVisible(country, tempDetails);
        androidUtility.selectionItemVisible(proportion, tempDetails);

    }

    public void isAddedValidationMsgPresent() throws Exception {
        waitUtility.waitForSeconds(2);
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

