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

public class BusinessLocationPage {

    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(BusinessLocationPage.class);
    AndroidUtility androidUtility;

    public BusinessLocationPage() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }
    By businessLogicMenu = By.xpath("//*[@text='Business Location']");
    By addNewLocationBtn = By.xpath("//android.view.View[@text='+ Add a new location']");
    By addNewLocationBtnArabic = By.xpath("//android.view.View[@text='+ إضافة موقع جديد']");
    By editField=By.xpath("//android.widget.EditText");
    By searchField=By.xpath("//android.widget.EditText");
    By countryList = By.xpath("//android.view.View");




    public void selectBusinessLocationPage() throws Exception {
        androidUtility.swipingHamburgerMenu();
          genericMethods.click(businessLogicMenu);
    }
    public void isBusinessLocationPage() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(addNewLocationBtn);
        if (Boolean.TRUE.equals(b)) {
            log.debug("user in business location page");
        }else{
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




}

