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

public class IosEntityDetailsPage {

    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(IosEntityDetailsPage.class);
    public String stringmsg;
    public IosEntityDetailsPage() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();

    }


    By addNewUsrBtn = By.xpath("//android.view.View[contains(@text,'+ Add A New User')]");
    By editField = By.className("android.widget.EditText");
    By editField1 = By.className("android.widget.EditText");
    By username = By.xpath("//*[@text='User Name *']");
    By email = By.xpath("//*[@text='Email *']");
    By confirmBtn = By.xpath("//*[@text='Confirm']");
    By validationMSg = By.xpath("//*[@text='Please enter valid field']");
    By validationMSg1 = By.xpath("//*[@text='Please enter this field']");
    By countryField = By.xpath("//*[@text='+93']");
    By countryList = By.xpath("//android.view.View");


    public void iClickAddNewuserBtn() {
        genericMethods.waitForVisibility(addNewUsrBtn);
        genericMethods.click(addNewUsrBtn);

    }

    public void iAddUserName(String userName, String limit) {
        String regex = "^[a-zA-Z0-9- ]*$/";
        driver.findElement(username).click();
        driver.findElement(username).sendKeys(userName);
        int count = characterCount(userName);
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


    public int characterCount(String username) {
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            if (username.charAt(i) != ' ')
                count++;
        }
        return count;
    }

    public void iClickConfirmBtn() {
        genericMethods.click(confirmBtn);
    }

    public void iIsValidationMsgPresent() throws InterruptedException {
        genericMethods.waitForVisibility(validationMSg);
        Assert.assertFalse(!genericMethods.isElementPresent(validationMSg));
    }

    public void iEnterEmail(String Email, String limit) {

        genericMethods.click(email);
        genericMethods.sendKeys(email, Email);
        String emailTxt = genericMethods.getText(email);
        int count = characterCount(emailTxt);
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

    public void iEnterCountryCode(String countryCode) throws Exception {
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

    public void iEnterMobNum(String mob) {

        editField1.findElements(driver).get(2).click();
        editField1.findElements(driver).get(2).sendKeys(mob);
    }


    public void iClickCancelBtn() {
        log.info("ios method9");
    }

    public void iIsYesNoBtnPresentConfirmation()  {
        log.info("ios method7");
    }

    public void iClickYEsBtnValidation() {
        log.info("ios 6method");
    }

    public void iClicNoBtnValidation() {
        genericMethods.back();
    }

    public void iIsBottomValidationMsgPresent(){
        log.info("ios method6");
    }

    public void iValidateUserDetails(String userName, String Email, String mobNum) {
        stringmsg=String.format("elements are %s %s %s", userName, Email, mobNum);
        log.info("ios method5: {}",stringmsg);

    }

    public void iClickEditBtn() {
        log.info("ios method4");
    }

    public void iClickDeleteBtn() {
        log.info("ios method3");
    }

    public void iIsAddNewScreen() {
        log.info("ios method2");
    }

    public void iClickContinueBtn() {

        log.info("ios method1");
    }


}



