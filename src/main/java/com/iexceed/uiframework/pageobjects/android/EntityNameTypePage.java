package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class EntityNameTypePage {
    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(EntityNameTypePage.class);
    AndroidUtility androidUtility;

    public EntityNameTypePage() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By entityLegalScreenEditField = By.xpath("//android.widget.EditText");
    By fieldValidationMsg = By.xpath("//android.view.View[@text='Please enter valid field']");
    By entityLegalName = By.xpath("//android.view.View[@text='Entity Legal Name *']");
    By continueBtn = By.xpath("//*[@text='Continue']");
    By searchField = By.xpath("//android.widget.EditText");
    By entityTypeList = By.xpath("//android.view.View");
    By entityTypeField = By.xpath("//android.view.View[@text='Legal entity type *']");

    public void isEntityLegalPage() {
        genericMethods.waitForVisibility(entityLegalName);
    }

    public void enterLegalEntityName(String entityName) {
        genericMethods.waitForVisibility(entityLegalName);
        entityLegalScreenEditField.findElements(driver).get(1).click();
        entityLegalScreenEditField.findElements(driver).get(1).clear();
        entityLegalScreenEditField.findElements(driver).get(1).sendKeys(entityName);
        genericMethods.click(entityLegalScreenEditField);


    }

    public void enterTradeName(String tradeName) {
        genericMethods.waitForVisibility(entityLegalName);
        Boolean b = entityLegalScreenEditField.findElements(driver).get(2).isDisplayed();
        if (Boolean.TRUE.equals(b)) {
            entityLegalScreenEditField.findElements(driver).get(2).click();
            entityLegalScreenEditField.findElements(driver).get(2).clear();
            entityLegalScreenEditField.findElements(driver).get(2).sendKeys(tradeName);
            genericMethods.click(entityLegalScreenEditField);
        } else {
            entityLegalScreenEditField.findElements(driver).get(1).click();
            entityLegalScreenEditField.findElements(driver).get(1).clear();
            entityLegalScreenEditField.findElements(driver).get(1).sendKeys(tradeName);
            genericMethods.click(entityLegalScreenEditField);
        }

    }

    public void enterPreviouslyKnown(String previouslyKnown) {
        genericMethods.waitForVisibility(entityLegalName);
        Boolean b = entityLegalScreenEditField.findElements(driver).get(4).isDisplayed();
        if (Boolean.TRUE.equals(b)) {
            entityLegalScreenEditField.findElements(driver).get(4).click();
            entityLegalScreenEditField.findElements(driver).get(4).clear();
            entityLegalScreenEditField.findElements(driver).get(4).sendKeys(previouslyKnown);
            genericMethods.click(entityLegalScreenEditField);
        } else {
            entityLegalScreenEditField.findElements(driver).get(1).click();
            entityLegalScreenEditField.findElements(driver).get(1).clear();
            entityLegalScreenEditField.findElements(driver).get(1).sendKeys(previouslyKnown);
            genericMethods.click(entityLegalScreenEditField);
        }

    }


    public void enterPreviouslyTradingAs(String previouslyTrade) {
        genericMethods.waitForVisibility(entityLegalName);
        Boolean b = entityLegalScreenEditField.findElements(driver).get(5).isDisplayed();
        if (Boolean.TRUE.equals(b)) {
            entityLegalScreenEditField.findElements(driver).get(5).click();
            entityLegalScreenEditField.findElements(driver).get(5).clear();
            entityLegalScreenEditField.findElements(driver).get(5).sendKeys(previouslyTrade);
            genericMethods.click(entityLegalScreenEditField);
        } else {
            entityLegalScreenEditField.findElements(driver).get(4).click();
            entityLegalScreenEditField.findElements(driver).get(4).clear();
            entityLegalScreenEditField.findElements(driver).get(4).sendKeys(previouslyTrade);
            genericMethods.click(entityLegalScreenEditField);
        }

    }

    public void enterLegalEntityType(String entityType) throws Exception {
        genericMethods.waitForVisibility(entityLegalName);
        entityLegalScreenEditField.findElements(driver).get(3).click();
        waitUtility.waitForSeconds(3);
        genericMethods.click(searchField);
        genericMethods.sendKeys(searchField, entityType);
        log.info(driver.findElements(entityTypeList).size());
        List<WebElement> tempentityTypeList = driver.findElements(entityTypeList);
        androidUtility.selectionOfDropdown(entityType, tempentityTypeList);
        genericMethods.click(entityLegalScreenEditField);


    }

    public void validateEntityTye(String entityType) throws Exception {
        waitUtility.waitForSeconds(2);
        Assert.assertEquals(entityType,  entityLegalScreenEditField.findElements(driver).get(3).getText());
    }

    public void clickOtherField() {
        genericMethods.click(entityLegalScreenEditField);
    }

    public void fieldValidationMsg() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(fieldValidationMsg);
        if (Boolean.TRUE.equals(b)) {
            Assert.assertTrue(genericMethods.isElementPresent(fieldValidationMsg));

        } else {

            log.debug("entered valid fields");
        }
    }


}
