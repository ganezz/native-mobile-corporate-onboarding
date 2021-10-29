package com.iexceed.uiframework.PageObjects.IOS;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.iexceed.uiframework.DomainObjects.ConnectionObjects.driver;

public class iEntityDetailsPage {

    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private final Logger log;

    public iEntityDetailsPage() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        log = LogManager.getLogger(iEntityDetailsPage.class);
    }


     By addNewUsrBtn = By.xpath("//android.view.View[contains(@text,'+ Add A New User')]");
     By editField = By.className("android.widget.EditText");
     By editField1 = By.className("android.widget.EditText");
     By user_Name = By.xpath("//*[@text='User Name *']");
     By email = By.xpath("//*[@text='Email *']");
     By confirmBtn = By.xpath("//*[@text='Confirm']");
     By validationMSg = By.xpath("//*[@text='Please enter valid field']");
     By validationMSg1 = By.xpath("//*[@text='Please enter this field']");
     By countryField = By.xpath("//*[@text='+93']");
     By countryList = By.xpath("//android.view.View");


    public void i_clickAddNewuserBtn() {
        genericMethods.waitForVisibility(addNewUsrBtn);
        genericMethods.click(addNewUsrBtn);

    }

    public void i_addUserName(String userName, String limit) {
        String regex = "/^[a-zA-Z0-9- ]*$/";
        driver.findElement(user_Name).click();
        driver.findElement(user_Name).sendKeys(userName);
        int count = Charactercount(userName);
        log.info(count);
        Assert.assertEquals(count, Integer.parseInt(limit));
        if (!userName.isEmpty()) {
            log.info("username is not empty");
            if (userName.matches("[" + regex + "]+")) {
                log.info("Invalid character in Name field");
            }
        }

        driver.hideKeyboard();
    }


    public int Charactercount(String username) {
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            if (username.charAt(i) != ' ')
                count++;
        }
        return count;
    }

    public void i_clickConfirmBtn() {
        genericMethods.click(confirmBtn);
    }

    public void i_isValidationMsgPresent() throws InterruptedException {
        genericMethods.waitForVisibility(validationMSg);
        Assert.assertFalse(!genericMethods.isElementPresent(validationMSg));
    }

    public void i_enterEmail(String Email, String limit) {
        String regex = "@@^[-!@#%&()']*$/";
        genericMethods.click(email);
        genericMethods.sendKeys(email, Email);
        String emailTxt = genericMethods.getText(email);
        int count = Charactercount(emailTxt);
        log.info(count);

        if (genericMethods.getText(email).isEmpty()) {
            log.info("email field is empty");
            genericMethods.click(editField);
        } else {
            if (count <= Integer.parseInt(limit)) {
                log.info("email field is not empty");
                if ((genericMethods.getText(email)).contains("$%&*#!")) {
                    log.info("Invalid character present in email field");
                    genericMethods.click(editField);
                } else {
                    log.info(" enter  email id is vaild");
                    genericMethods.click(editField);
                }
            } else {
                log.info("email id is more then limit value");
                genericMethods.click(editField);
            }
        }

        try {

            genericMethods.hideKeyboard();
        } catch (Exception e) {
            log.info("keyborad is not alive");
        }


    }

    public void i_enterCountryCode(String countryCode) throws Exception {
        driver.findElement(countryField).click();
        waitUtility.waitForSeconds(2);
        log.info(driver.findElements(countryList).size());
        List<WebElement> temoCountryList = (List<WebElement>) driver.findElements(countryList);
        String CountryCodeTemp = "+" + countryCode;
        selectionOfDropdown(CountryCodeTemp, temoCountryList);

    }

    public void selectionOfDropdown(String itemType, List<WebElement> type) {
        for (WebElement name : type) {
            if ((name.getText()).contains(itemType)) {
                name.click();
                break;
            }
        }
    }

    public void i_enterMobNum(String mob) {

        editField1.findElements(driver).get(2).click();
        editField1.findElements(driver).get(2).sendKeys(mob);
    }


    public void i_clickCancelBtn() {
        log.info("ios method");
    }

    public void i_isYES_NOBtnPresentConfirmation() throws InterruptedException {
        log.info("ios method");
    }

    public void i_clickYEsBtnValidation() {
        log.info("ios method");
    }

    public void i_clicNoBtnValidation() {
        genericMethods.back();
    }

    public void i_isBottomValidationMsgPresent() throws InterruptedException {
        log.info("ios method");
    }

    public void i_validateUserDetails(String userName, String Email, String mobNum) throws Exception {

        log.info("ios method");

    }

    public void i_clickEditBtn() {
        log.info("ios method");
    }

    public void i_clickDeleteBtn() {
        log.info("ios method");
    }

    public void i_isAddNewScreen() throws InterruptedException {
        log.info("ios method");
    }

    public void i_clickContinueBtn(){

        log.info("ios method");
    }


}



