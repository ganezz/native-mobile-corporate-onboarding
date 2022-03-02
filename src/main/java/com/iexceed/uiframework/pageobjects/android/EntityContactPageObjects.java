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

public class EntityContactPageObjects {
    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(EntityContactPageObjects.class);
    AndroidUtility androidUtility;

    public EntityContactPageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By entityContactInfoPage = By.xpath("//android.view.View[@text='Entity contact information']");
    By entityContactInfoPageArabic = By.xpath("//android.view.View[@text='معلومات الاتصال بالكيان']");
    By editField = By.xpath("//android.widget.EditText");
    By addNewBtn = By.xpath("//android.view.View[@content-desc='Add a new address']");
    By addNewAddressBtnArabic = By.xpath("//android.view.View[@content-desc='أضف عنوانا جديدا']");
    By addNewContactAddress = By.xpath("//*[@text='Registered']");
    By addNewContactAddressArabic = By.xpath("//android.view.View[@text='نوع العنوان *']");
    By searchField = By.xpath("//android.widget.EditText");
    By countryList = By.xpath("//android.view.View");
    By viewDataDetails = By.xpath("//android.view.View");
    By editValidationMsg = By.xpath("//android.view.View[@text='Address edited successfully']");
    By editValidationMsgArabic = By.xpath("//android.view.View[@text='تم تحرير العنوان بنجاح']");
    By closBtn = By.xpath("//*[@text='Close']");
    By closBtnArabic = By.xpath("//android.view.View[@text='قريب']");
    By deleteConfirmationMsg = By.xpath("//android.view.View[@text='Are you sure you want to delete the Address from the list ?']");
    By deleteConfirmationMsgArabic = By.xpath("//android.view.View[@text='Are you sure you want to delete the Address from the list ?']");
    By entityContactMenu = By.xpath("//android.view.View[@text='Entity Contact Info']");


    public void selectEntityContactPage() throws Exception {
        androidUtility.swipingHamburgerMenu();
        genericMethods.click(entityContactMenu);
    }


    public void isEntityContactPage() throws Exception {
        waitUtility.waitForSeconds(4);
        Boolean b = genericMethods.isElementPresent(entityContactInfoPage);
        if (Boolean.TRUE.equals(b)) {
            log.debug("user in entity contact page");
        } else {
            Boolean b1 = genericMethods.isElementPresent(entityContactInfoPageArabic);
            log.debug(b1);
            log.debug("user in entity contact page");
        }

    }

    public void enterEmaild(String email) {
        genericMethods.waitForVisibility(editField);
        editField.findElements(driver).get(1).click();
        editField.findElements(driver).get(1).clear();
        editField.findElements(driver).get(1).sendKeys(email);
        genericMethods.click(editField);
    }

    public void enterCompanyWebsite(String website) {
        genericMethods.waitForVisibility(editField);
        editField.findElements(driver).get(2).click();
        editField.findElements(driver).get(2).clear();
        editField.findElements(driver).get(2).sendKeys(website);
        genericMethods.click(editField);
    }

    public void clickAddnewBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(addNewBtn);
        if(Boolean.TRUE.equals(b)) {
            genericMethods.click(addNewBtn);
        }else{
            genericMethods.click(addNewAddressBtnArabic);
        }
    }

    public void isEntityaddNewAddress() throws Exception {
        waitUtility.waitForSeconds(5);
        Boolean b = genericMethods.isElementPresent(addNewContactAddress);
        if(Boolean.TRUE.equals(b)) {
            log.debug(b);
        }else{
            log.debug(genericMethods.isElementPresent(addNewContactAddressArabic));
        }

    }

    public void enterUnitNo(String unitno,String edit) {

        if(edit.equalsIgnoreCase("edit")) {
            editField.findElements(driver).get(1).click();
            editField.findElements(driver).get(1).clear();
            editField.findElements(driver).get(1).sendKeys("hogwards");
            editField.findElements(driver).get(2).click();

        }else{
            editField.findElements(driver).get(1).click();
            editField.findElements(driver).get(1).clear();
            editField.findElements(driver).get(1).sendKeys(unitno);
            editField.findElements(driver).get(2).click();

        }

    }

    public void enterStreet(String street) {
        editField.findElements(driver).get(2).click();
        editField.findElements(driver).get(2).clear();
        editField.findElements(driver).get(2).sendKeys(street);
        editField.findElements(driver).get(1).click();
    }

    public void enterState(String state) {
        editField.findElements(driver).get(4).click();
        editField.findElements(driver).get(4).clear();
        editField.findElements(driver).get(4).sendKeys(state);
        editField.findElements(driver).get(1).click();
    }

    public void enterCity(String city) {
        editField.findElements(driver).get(5).click();
        editField.findElements(driver).get(5).clear();
        editField.findElements(driver).get(5).sendKeys(city);
        editField.findElements(driver).get(1).click();
    }

    public void enterZip(String zip) {
        editField.findElements(driver).get(6).click();
        editField.findElements(driver).get(6).clear();
        editField.findElements(driver).get(6).sendKeys(zip);
        editField.findElements(driver).get(1).click();
    }

    public void enterPstBox(String postCode) {
        editField.findElements(driver).get(7).click();
        editField.findElements(driver).get(7).clear();
        editField.findElements(driver).get(7).sendKeys(postCode);
        editField.findElements(driver).get(2).click();
    }

    public void validateCountry(String countryCode) throws Exception {
        editField.findElements(driver).get(3).click();
        waitUtility.waitForSeconds(2);
        genericMethods.click(searchField);
        genericMethods.sendKeys(searchField, countryCode);
        log.info(driver.findElements(countryList).size());
        List<WebElement> temoCountryList = driver.findElements(countryList);
        androidUtility.selectionOfDropdown(countryCode, temoCountryList);
    }

    public void validateUserDetails(String addressType, String state, String city, String zipcode, String postBox) throws Exception {
        waitUtility.waitForSeconds(2);
        log.info(driver.findElements(viewDataDetails).size());
        String addressDetails = state + "," + city;
        List<WebElement> tempUserDetails = driver.findElements(viewDataDetails);
        androidUtility.selectionItemVisible(addressType, tempUserDetails);
        androidUtility.selectionItemVisible(addressDetails, tempUserDetails);
        androidUtility.selectionItemVisible(zipcode, tempUserDetails);
        androidUtility.selectionItemVisible(postBox, tempUserDetails);

    }

    public void isEditValidationMsgPresent() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(editValidationMsg);
        Boolean b1 = genericMethods.isElementPresent(editValidationMsg);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.isElementPresent(editValidationMsg);
            genericMethods.click(closBtn);
        } else if(Boolean.TRUE.equals(b1)){
            genericMethods.isElementPresent(editValidationMsgArabic);
            genericMethods.click(closBtnArabic);
        }else {
            try {
                genericMethods.click(closBtn);
            }catch(Exception e){
                genericMethods.click(closBtnArabic);
            }
        }

    }

    public void deletePromtConfirmation() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(deleteConfirmationMsg);
        Boolean b1 = genericMethods.isElementPresent(deleteConfirmationMsgArabic);

        if (Boolean.TRUE.equals(b)) {
            genericMethods.waitForVisibility(deleteConfirmationMsg);
            log.info(genericMethods.isElementPresent(deleteConfirmationMsg));
        } else if(Boolean.TRUE.equals(b1)){
            genericMethods.waitForVisibility(deleteConfirmationMsgArabic);
            log.info(genericMethods.isElementPresent(deleteConfirmationMsgArabic));
        }else {
            log.debug("delete confirmation popup is not shown");
        }
    }

}
