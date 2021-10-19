package com.iexceed.uiframework.PageObjects.IOS;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.iexceed.uiframework.DomainObjects.ConnectionObjects.driver;

public class iEntityDetailsPage {

    GenericMethods genericMethods;
    private WaitUtility waitUtility;

    public iEntityDetailsPage() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
    }


    public By addNewUsrBtn = By.xpath("//android.view.View[contains(@text,'+ Add A New User')]");
    public By editField = By.className("android.widget.EditText");
    public By editField1 = By.className("android.widget.EditText");
    public By user_Name = By.xpath("//*[@text='User Name *']");
    public By email = By.xpath("//*[@text='Email *']");
    public By confirmBtn = By.xpath("//*[@text='Confirm']");
    public By validationMSg = By.xpath("//*[@text='Please enter valid field']");
    public By validationMSg1 = By.xpath("//*[@text='Please enter this field']");
    public By countryField = By.xpath("//*[@text='+93']");
    public By countryList = By.xpath("//android.view.View");


    public void i_clickAddNewuserBtn() {
        genericMethods.waitForVisibility(addNewUsrBtn);
        genericMethods.click(addNewUsrBtn);

    }

    public void i_addUserName(String userName, String limit) {
        String regex = "/^[a-zA-Z0-9- ]*$/";
        driver.findElement(user_Name).click();
        driver.findElement(user_Name).sendKeys(userName);
        int count = Charactercount(userName);
        System.out.println(count);
        Assert.assertEquals(count, Integer.parseInt(limit));
        if (!userName.isEmpty()) {
            System.out.println("username is not empty");
            if (userName.matches("[" + regex + "]+")) {
                System.out.println("Invalid character in Name field");
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
        if (genericMethods.isElementPresent(validationMSg)) {
            Assert.assertFalse(false);
        } else {
            Assert.assertFalse(true);
        }
    }

    public void i_enterEmail(String Email, String limit) {
        String regex = "@@^[-!@#%&()']*$/";
        genericMethods.click(email);
        genericMethods.sendKeys(email, Email);
        String emailTxt = genericMethods.getText(email);
        int count = Charactercount(emailTxt);
        System.out.println(count);

        if (genericMethods.getText(email).isEmpty()) {
            System.out.println("email field is empty");
            genericMethods.click(editField);
        } else {
            if (count <= Integer.parseInt(limit)) {
                System.out.println("email field is not empty");
                if ((genericMethods.getText(email)).contains("$%&*#!")) {
                    System.out.println("Invalid character present in email field");
                    genericMethods.click(editField);
                } else {
                    System.out.println(" enter  email id is vaild");
                    genericMethods.click(editField);
                }
            } else {
                System.out.println("email id is more then limit value");
                genericMethods.click(editField);
            }
        }

        try {

            genericMethods.hideKeyboard();
        } catch (Exception e) {
            System.out.println("keyborad is not alive");
        }


    }

    public void i_enterCountryCode(String countryCode) throws Exception {
        driver.findElement(countryField).click();
        waitUtility.waitForSeconds(2);
        System.out.println(driver.findElements(countryList).size());
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

    }

    public void i_isYES_NOBtnPresentConfirmation() throws InterruptedException {

    }

    public void i_clickYEsBtnValidation() {

    }

    public void i_clicNoBtnValidation() {
        genericMethods.back();
    }

    public void i_isBottomValidationMsgPresent() throws InterruptedException {

    }

    public void i_validateUserDetails(String userName, String Email, String mobNum) throws Exception {

//        waitUtility.waitForSeconds(2);
//        System.out.println(driver.findElements(viewDataDetails).size());
//        List<WebElement> tempUserDetails=driver.findElements(viewDataDetails);
//        androidUtility.selectionItemVisible(userName,tempUserDetails);
//        androidUtility.selectionItemVisible(Email,tempUserDetails);
//        androidUtility.selectionItemVisible(mobNum,tempUserDetails);

    }

    public void i_clickEditBtn() {
//        genericMethods.click(editButton);
    }

    public void i_clickDeleteBtn() {
//        genericMethods.click(deleteButton);
    }

    public void i_isAddNewScreen() throws InterruptedException {
//        genericMethods.isElementPresent(editField);
    }

}

