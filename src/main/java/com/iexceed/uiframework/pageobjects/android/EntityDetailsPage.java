package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class EntityDetailsPage {

    AndroidUtility androidUtility;
    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(EntityDetailsPage.class);

    public EntityDetailsPage() {
        genericMethods = new GenericMethods(driver);
        androidUtility = new AndroidUtility();
        waitUtility = new WaitUtility();
    }


    By addNewUsrBtn = By.xpath("//android.view.View[contains(@text,'+ Add A New User')]");
    By editField = By.className("android.widget.EditText");
    By editField1 = By.xpath("//android.widget.EditText");
    By userName = By.xpath("//*[@text='User Name *']");
    By email = By.xpath("//*[@text='Email *']");
    By confirmBtn = By.xpath("//*[@text='Confirm']");
    By validationMSg = By.xpath("//*[@text='Please enter valid field']");
    By validationMSg1 = By.xpath("//*[@text='Please enter this field']");
    By countryField = By.xpath("//*[@text='+93']");
    By countryList = By.xpath("//android.view.View");
    By mobNumField = By.xpath("//*[@text='Mobile *']");
    By cancelBtn = By.xpath("//*[@text='Cancel']");
    By confirmationMsg = By.xpath("//*[@text='Do you want to cancel ?']");
    By confirmationMsg1 = By.xpath("//*[@text='Do you want to cancel the application ?']");
    By validateUseCreationMsg = By.xpath("//*[@text='Success ! You have successfully added the user to the list...']");
    By closeBtn = By.xpath("//*[@text='Close']");
    By viewDataDetails = By.xpath("//android.view.View");
    By editButton = By.xpath("//android.widget.ImageView[@content-desc='Edit Icon']");
    By deleteButton = By.xpath("//android.widget.ImageView[@content-desc='Delete Icon']");
    By deleteConfirmationMsg = By.xpath("//*[@text='Are you sure you want to delete the User from the list ?']");
    By okBtn = By.xpath("//*[@text='OK']");
    By noButton = By.xpath("//android.view.View[3]");
    By continueBtn = By.xpath("//*[@text='Continue']");
    By consultMsg1 = By.xpath("//*[@text='Added New Sub Feature One by consultant Team inside Entity ']");
    By consultMsg2 = By.xpath("//*[@text='Added New Feature by consultant Team inside ']");

    public void clickAddNewuserBtn() {
        genericMethods.waitForVisibility(addNewUsrBtn);
        genericMethods.click(addNewUsrBtn);

    }


    public void addUserName(String userName, String limit) {
        String regex = "@@^[-!@#%&()']*$/";
        genericMethods.click(editField);
        androidUtility.clearText(editField);
        genericMethods.sendKeys(editField, userName);
        String userNameTxt = genericMethods.getText(editField);
        int count = androidUtility.characterCount(userNameTxt);
        log.info(count);


        if (userName.isEmpty()) {
            log.info("user name is empty");
            clickSomeOtherField();
        } else {
            if (count <= Integer.parseInt(limit)) {
                log.info("username is not empty");
                if (userName.contains(regex)) {
                    log.info("Invalid character in Name field");
                    clickSomeOtherField();
                } else {
                    log.info("user enter valid name");
                    clickSomeOtherField();
                }
            } else {
                log.info("user name is more then limit value");
                clickSomeOtherField();
            }
        }
        try {

            genericMethods.hideKeyboard();
        } catch (Exception e) {
            log.info("keyborad ia not alive");

        }
    }

    public void clickSomeOtherField() {
        genericMethods.click(email);
    }


    public void enterEmail(String emaill, String limit) throws Exception {
        log.debug(driver.findElements(editField).size());
        editField1.findElements(driver).get(1).click();
        editField1.findElements(driver).get(1).clear();
        editField1.findElements(driver).get(1).sendKeys(emaill);
        String emailIdTxt = editField1.findElements(driver).get(1).getText();
        int count = androidUtility.characterCount(emailIdTxt);
        log.debug(count);

        if (emailIdTxt.isEmpty()) {
            log.info("email field is empty");
            genericMethods.click(editField);
        } else {
            if (count <= Integer.parseInt(limit)) {
                log.info("email field is not empty");
                if ((genericMethods.getText(email)).contains("@#$%")) {
                    log.info("Invalid character present in email field");
                    genericMethods.click(editField);
                } else if (emailIdTxt.matches("1234567890@gmail.com")) {
                    log.info(emailIdTxt.matches("1234567890@gmail.com"));
                    genericMethods.click(editField);
                    waitUtility.waitForSeconds(1);
                    Assert.assertFalse(!genericMethods.isElementPresent(validationMSg));
                } else {
                    genericMethods.click(editField);
                    log.info(" enter  email id is vaild");

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

    public void clickConfirmBtn() {

        try {
            genericMethods.hideKeyboard();
            genericMethods.click(confirmBtn);
        } catch (Exception e) {
            log.debug("keyboard is not alive");
            genericMethods.click(confirmBtn);
        }

    }

    public void isValidationMsgPresent(String expectedMsg, String expectedMsg1) throws Exception {
        waitUtility.waitForSeconds(2);

        Boolean b = genericMethods.isElementPresent(validationMSg);
        Boolean b1 = genericMethods.isElementPresent(validationMSg1);
        if (Boolean.TRUE.equals(b)) {
            Assert.assertEquals(genericMethods.getText(validationMSg), expectedMsg);
            log.info(genericMethods.getText(validationMSg));
            Assert.assertFalse(false);
        } else if (Boolean.TRUE.equals(b1)) {
            Assert.assertEquals(genericMethods.getText(validationMSg1), expectedMsg1);
            log.info(genericMethods.getText(validationMSg1));
            Assert.assertFalse(false);

        } else {
            log.info("Message is not visible-user enter valid input");

        }
    }


    public void enterCountryCode(String countryCode) throws Exception {
        driver.findElement(countryField).click();
        waitUtility.waitForSeconds(2);
        log.info(driver.findElements(countryList).size());
        List<WebElement> temoCountryList = driver.findElements(countryList);
        String countryCodeTemp = "+" + countryCode;
        androidUtility.selectionOfDropdown(countryCodeTemp, temoCountryList);

    }

    public void enterMobNum(String mob) throws Exception {
        log.info(driver.findElements(editField).size());
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(editField);
        try {
            if (Boolean.TRUE.equals(b)) {
                editField.findElements(driver).get(2).click();
                editField.findElements(driver).get(2).clear();
                editField.findElements(driver).get(2).sendKeys(mob);
            } else {
                editField1.findElements(driver).get(2).click();
                editField1.findElements(driver).get(2).clear();
                editField1.findElements(driver).get(2).sendKeys(mob);
            }
        } catch (Exception e) {
            genericMethods.click(mobNumField);
            androidUtility.clearText(mobNumField);
            genericMethods.sendKeys(mobNumField, mob);

        }
    }

    public void clickCancelBtn() {
        genericMethods.click(cancelBtn);
    }

    public void isYesNoBtnPresentConfirmation() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(confirmationMsg);

        try {
            if (Boolean.TRUE.equals(b)) {
                genericMethods.waitForVisibility(confirmationMsg);
                log.info(genericMethods.isElementPresent(confirmationMsg));
            } else {
                genericMethods.isElementPresent(deleteConfirmationMsg);
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            genericMethods.waitForVisibility(confirmationMsg1);
            genericMethods.isElementPresent(confirmationMsg1);
        }
    }

    public void clickYEsBtnValidation() throws Exception {
        waitUtility.waitForSeconds(2);
        genericMethods.click(okBtn);
    }

    public void clicNoBtnValidation() throws Exception {

        try {
            waitUtility.waitForSeconds(2);
            genericMethods.click(noButton);
        } catch (Exception e) {
            genericMethods.back();
        }
    }

    public void isBottomValidationMsgPresent() throws Exception {
        waitUtility.waitForSeconds(2);
      try {
          genericMethods.isElementPresent(validateUseCreationMsg);
          genericMethods.click(closeBtn);
      }catch (InterruptedException ie) {
          log.error("InterruptedException: ", ie);
          genericMethods.click(closeBtn);
          Thread.currentThread().interrupt();
      }

    }

    public void validateUserDetails(String userName, String email, String mobNum) throws Exception {

        waitUtility.waitForSeconds(2);
        log.info(driver.findElements(viewDataDetails).size());
        List<WebElement> tempUserDetails = driver.findElements(viewDataDetails);
        androidUtility.selectionItemVisible(userName, tempUserDetails);
        androidUtility.selectionItemVisible(email, tempUserDetails);
        androidUtility.selectionItemVisible(mobNum, tempUserDetails);

    }

    public void clickEditBtn() {
        genericMethods.click(editButton);
    }

    public void clickDeleteBtn() {
        genericMethods.waitForVisibility(deleteButton);
        genericMethods.click(deleteButton);
    }

    public void isAddNewScreen() throws InterruptedException {
        genericMethods.isElementPresent(editField);
    }

    public void clickContinueBtn() throws Exception {
        waitUtility.waitForSeconds(2);
        genericMethods.click(continueBtn);
        Boolean b = genericMethods.isElementPresent(consultMsg1);

        try {
            if (Boolean.TRUE.equals(b)) {
                genericMethods.click(continueBtn);
                Boolean b1 = genericMethods.isElementPresent(consultMsg2);
                if (Boolean.TRUE.equals(b1)) {
                    genericMethods.click(continueBtn);
                }
            }
        } catch (Exception e) {
            log.info(e);
            Thread.currentThread().interrupt();
        }
    }

}