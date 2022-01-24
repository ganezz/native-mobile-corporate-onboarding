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
    By addNewLocationBtn = By.xpath("//android.view.View[@text='+ Add a new location']");
    By addNewLocationBtnArabic = By.xpath("//android.view.View[@text='+ إضافة موقع جديد']");
    By addNewMarketBtn = By.xpath("//android.view.View[@text='+ Add a new business market']");
    By addNewMarketBtnArabic = By.xpath("//android.view.View[@text='+ أضف سوق عمل جديد']");
    By editField = By.xpath("//android.widget.EditText");
    By searchField = By.xpath("//android.widget.EditText");
    By countryList = By.xpath("//android.view.View");
    By viewDataDetails = By.xpath("//android.view.View");
    By locationEditMsg=By.xpath("//android.view.View[@text='Edit ! Business Location edited successfully']");
    By marketEditMsg=By.xpath("//android.view.View[@text='Edit ! Business Market edited successfully']");
    By marketEditMsgArabic=By.xpath("//android.view.View[@text='تعديل ! تم تحرير سوق العمل بنجاح']");
    By closBtn = By.xpath("//*[@text='Close']");
    By locationEditMsgArabic=By.xpath("//android.view.View[@text='تعديل ! تم تحرير موقع العمل بنجاح']");
    By closBtnArabic = By.xpath("//android.view.View[@text='قريب']");
    By businessLocDeleteMsg=By.xpath("//android.view.View[@text='Are you sure you want to delete the Address from the list ?']");
    By businessLocDeleteMsgArabic=By.xpath("//android.view.View[@text='هل أنت متأكد أنك تريد حذف العنوان من القائمة؟']");
    By businessMarketDeleteMsg=By.xpath("//android.view.View[@text='Are  ghg you sure you want to delete the Address from the list ?']");
    By businessMarketDeleteMsgArabic=By.xpath("//android.view.View[@text='Are ygggfou sure you want to delete the Address from the list ?']");

    public void selectBusinessLocationPage() throws Exception {
        androidUtility.swipingHamburgerMenu();
        genericMethods.click(businessLogicMenu);
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


    public void selectCountry(String country) throws Exception {
        editField.findElements(driver).get(1).click();
        waitUtility.waitForSeconds(1);
        genericMethods.click(searchField);
        genericMethods.sendKeys(searchField, country);
        log.info(driver.findElements(countryList).size());
        List<WebElement> tempCountryList = driver.findElements(countryList);
        androidUtility.selectionOfDropdown(country, tempCountryList);
    }

    public void addNewLocationBtn() throws InterruptedException {

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

    public void fillCountry(String country) throws Exception {
        genericMethods.click(editField);
        waitUtility.waitForSeconds(1);
        genericMethods.click(searchField);
        genericMethods.sendKeys(searchField, country);
        log.info(driver.findElements(countryList).size());
        List<WebElement> tempCountryList = driver.findElements(countryList);
        androidUtility.selectionOfDropdown(country, tempCountryList);

    }

    public void fillOperation(String operation) {
        editField.findElements(driver).get(1).click();
        editField.findElements(driver).get(1).clear();
        editField.findElements(driver).get(1).sendKeys(operation);
    }

    public void fillProportion(String proportion){
        editField.findElements(driver).get(1).click();
        editField.findElements(driver).get(1).clear();
        editField.findElements(driver).get(1).sendKeys(proportion);
    }


    public void validateAddNewLocationField(String country,String operation){
        log.info(driver.findElements(viewDataDetails).size());
        List<WebElement> tempDetails = driver.findElements(viewDataDetails);
        androidUtility.selectionItemVisible(country, tempDetails);
        androidUtility.selectionItemVisible(operation, tempDetails);

    }
    public void validateAddNewMarketField(String country,String proportion){
        log.info(driver.findElements(viewDataDetails).size());
        List<WebElement> tempDetails = driver.findElements(viewDataDetails);
        androidUtility.selectionItemVisible(country, tempDetails);
        androidUtility.selectionItemVisible(proportion, tempDetails);

    }


    public void isEditValidationMsgPresent() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(locationEditMsg);
        Boolean b1 = genericMethods.isElementPresent(locationEditMsgArabic);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.isElementPresent(locationEditMsg);
            genericMethods.click(closBtn);
        } else if(Boolean.TRUE.equals(b1)){
            genericMethods.isElementPresent(locationEditMsgArabic);
            genericMethods.click(closBtnArabic);
        }else {
            try {
                genericMethods.click(closBtn);
            }catch(Exception e){
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
        } else if(Boolean.TRUE.equals(b1)){
            genericMethods.isElementPresent(marketEditMsgArabic);
            genericMethods.click(closBtnArabic);
        }else {
            try {
                genericMethods.click(closBtn);
            }catch(Exception e){
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

}

