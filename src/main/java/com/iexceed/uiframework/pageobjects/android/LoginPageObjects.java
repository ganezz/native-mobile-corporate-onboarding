package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;


public class LoginPageObjects extends TestBase {

    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(LoginPageObjects.class);
    AndroidUtility androidUtility;

    public LoginPageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By userDetailsRegBt = By.xpath("//android.view.View[@text='Onboarding']");
    By addNewUsrBtn = By.xpath("//android.view.View[@text='+ Add A New User']");
    By addNewUsrBtnArabic = By.xpath("//*[@text='+ إضافة مستخدم جديد']");
    By addNewAppliBtn = By.xpath("//android.view.View[@content-desc='New application']");
    By addNewAppliBtnArabic = By.xpath("//android.view.View[@content-desc='تطبيق جديد']");
    By englishBtn = By.xpath("//android.view.View[@text='English']");
    By arabicBtn = By.xpath("//android.view.View[@text='Arabic']");
    By arabicaddNewUsrBtn = By.xpath("//android.view.View[@text='+ إضافة مستخدم جديد']");
    By textField = By.xpath("//android.widget.EditText");
    By loginBtn = By.xpath("//android.view.View[@content-desc='Login']");
    By loginArabicBtn = By.xpath("//android.view.View[@content-desc='تسجيل الدخول']");
    By dropDown = By.xpath("//android.widget.EditText[@text='English']");
    By dropDownList = By.xpath("//android.view.View");
    By userNameErrorMsg = By.xpath("//android.view.View[@text='Please Enter Valid Username']");
    By userNameErrorMsgArabic = By.xpath("//android.view.View[@text='Please Enter Valid Username']");
    By passwordErrorMsg = By.xpath("//android.view.View[@text='Please Enter Valid Password']");
    By passwordErrorMsgArabic = By.xpath("//android.view.View[@text='الرجاء إدخال كلمة مرور صالحة']");
    By themeToggleBtn = By.xpath("//android.widget.Switch[@content-desc='Dark Theme']");
    By themeToggleBtnArabic = By.xpath("//android.widget.Switch[@content-desc='مظهر داكن']");

    public void isHomePageVisible() throws Exception {
        waitUtility.waitForSeconds(4);
        Boolean b1 = genericMethods.isElementPresent(textField);
        Boolean b = genericMethods.isElementPresent(englishBtn);
        if (Boolean.TRUE.equals(b)) {
            log.info("user in home page");
        } else if (Boolean.TRUE.equals(b1)) {
            log.info("user in home page");
        } else {
            log.debug("home page is not launched");
        }
    }


    public void clikckThemeBtn() throws InterruptedException {

        Boolean b = genericMethods.isElementPresent(themeToggleBtn);
        Boolean b1 = genericMethods.isElementPresent(themeToggleBtnArabic);

        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(themeToggleBtn);
            log.info("changed to dark mode");
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.click(themeToggleBtnArabic);
            log.info("changed to dark mode");
        } else {
            log.info("theme is not applied");
        }


    }

    public void chooseLanguage(String language) throws Exception {
       waitUtility.waitForSeconds(3);
        genericMethods.click(dropDown);
        List<WebElement> tempdropDownList = driver.findElements(dropDownList);
        androidUtility.selectionOfDropdown(language, tempdropDownList);
    }


    public void clickUserRegBtn(String language) throws Exception {
        waitUtility.waitForSeconds(5);
        if (language.equals("english")) {
            genericMethods.isElementPresent(userDetailsRegBt);
            genericMethods.click(englishBtn);
            genericMethods.click(userDetailsRegBt);
        } else {
            log.debug("arabic validations");
            genericMethods.isElementPresent(userDetailsRegBt);
            genericMethods.click(arabicBtn);
            genericMethods.click(userDetailsRegBt);
        }
    }


    public void verifyPageLanding() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(addNewAppliBtn);
        Boolean b1 = genericMethods.isElementPresent(addNewAppliBtnArabic);

        if (Boolean.TRUE.equals(b)) {
            log.info("page is navigating");
            genericMethods.click(addNewAppliBtn);
        } else {
            genericMethods.click(addNewAppliBtnArabic);
            log.info("page is navigating arabic");
        }
        waitUtility.waitForSeconds(6);

    }

    public void enterUserName(String userNmae) {
        genericMethods.waitForVisibility(textField);
        textField.findElements(driver).get(1).click();
        textField.findElements(driver).get(1).sendKeys(userNmae);
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }

    public void isUsrErrormsgPresent() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(loginBtn);
        Boolean b1 = genericMethods.isElementPresent(loginArabicBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(loginBtn);
            genericMethods.isElementPresent(userNameErrorMsg);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.click(loginArabicBtn);
            genericMethods.isElementPresent(userNameErrorMsgArabic);
        } else {
            log.info("Error message is not present");
        }

    }

    public void isPasswordErrormsgPresent() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(loginBtn);
        Boolean b1 = genericMethods.isElementPresent(loginArabicBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(loginBtn);
            genericMethods.isElementPresent(passwordErrorMsg);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.click(loginArabicBtn);
            genericMethods.isElementPresent(passwordErrorMsgArabic);
        } else {
            log.info("Error message is not present");
        }

    }

    public void enterPassword(String password) {
        genericMethods.waitForVisibility(textField);
        textField.findElements(driver).get(2).click();
        textField.findElements(driver).get(2).clear();
        textField.findElements(driver).get(2).sendKeys(password);
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }

    public void enterLoginCredentials() {
        genericMethods.waitForVisibility(textField);
        textField.findElements(driver).get(1).click();
        textField.findElements(driver).get(1).sendKeys(props.getProperty("username"));
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
        textField.findElements(driver).get(2).click();
        textField.findElements(driver).get(2).clear();
        textField.findElements(driver).get(2).sendKeys(props.getProperty("password"));
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }


    public void clickLogin() throws InterruptedException {
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
        Boolean b = genericMethods.isElementPresent(loginBtn);
        Boolean b1 = genericMethods.isElementPresent(loginArabicBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(loginBtn);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.click(loginArabicBtn);
        }
    }

    public void clickEnglishLangBtn() throws InterruptedException {
        genericMethods.waitForVisibility(englishBtn);
        genericMethods.click(englishBtn);
        genericMethods.click(userDetailsRegBt);
        genericMethods.isElementPresent(addNewUsrBtn);
    }

    public void clickArabicLangBtn() throws InterruptedException {
        genericMethods.waitForVisibility(arabicBtn);
        genericMethods.click(arabicBtn);
        genericMethods.click(userDetailsRegBt);
        genericMethods.isElementPresent(arabicaddNewUsrBtn);
    }


}
