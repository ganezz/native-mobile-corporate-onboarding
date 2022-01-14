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

public class EntityContactPage {
    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(EntityContactPage.class);
    AndroidUtility androidUtility;

    public EntityContactPage() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By entityContactInfoPage = By.xpath("//android.view.View[@text='Entity contact information']");
    By editField = By.xpath("//android.widget.EditText");
    By addNewBtn = By.xpath("//*[@text='+ Add a new address']");
    By addNewContactAddress = By.xpath("//*[@text='Registered']");
    By searchField = By.xpath("//android.widget.EditText");
    By countryList = By.xpath("//android.view.View");
    By viewDataDetails = By.xpath("//android.view.View");
    By editValidationMsg = By.xpath("//android.view.View[@text='Address edited successfully']");
    By closBtn = By.xpath("//*[@text='Close']");

    public void isEntityContactPage() {
        genericMethods.waitForVisibility(entityContactInfoPage);
        log.debug("user in entity contact page");

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

    public void clickAddnewBtn() {
        genericMethods.click(addNewBtn);
    }

    public void isEntityaddNewAddress() {
        genericMethods.waitForVisibility(addNewContactAddress);
    }

    public void enterUnitNo(String unitno) {
        editField.findElements(driver).get(1).click();
        editField.findElements(driver).get(1).clear();
        editField.findElements(driver).get(1).sendKeys(unitno);
        editField.findElements(driver).get(2).click();
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
        editField.findElements(driver).get(2).click();
    }

    public void enterCity(String city) {
        editField.findElements(driver).get(5).click();
        editField.findElements(driver).get(5).clear();
        editField.findElements(driver).get(5).sendKeys(city);
        editField.findElements(driver).get(2).click();
    }

    public void enterZip(String zip) {
        editField.findElements(driver).get(6).click();
        editField.findElements(driver).get(6).clear();
        editField.findElements(driver).get(6).sendKeys(zip);
        editField.findElements(driver).get(2).click();
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
        if (Boolean.TRUE.equals(b)) {
            genericMethods.isElementPresent(editValidationMsg);
            genericMethods.click(closBtn);
        } else {
            genericMethods.click(closBtn);
        }

    }

}
