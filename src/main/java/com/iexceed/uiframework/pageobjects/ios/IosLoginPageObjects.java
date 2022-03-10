package com.iexceed.uiframework.pageobjects.ios;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.domainobjects.IOSUtility;
import com.iexceed.uiframework.pageobjects.android.LoginPageObjects;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class IosLoginPageObjects extends TestBase {


    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(LoginPageObjects.class);
    IOSUtility iosUtility=new IOSUtility();

    public IosLoginPageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
    }


    By addNewAppliBtn = By.xpath("//XCUIElementTypeButton[@name='New Application Button']");
    By addNewAppliBtnArabic = By.xpath("//XCUIElementTypeButton[@name='New Application Button']");
    By loginBtn = By.xpath("//XCUIElementTypeButton[@name='LoginButton']");
    By loginArabicBtn = By.xpath("//XCUIElementTypeButton[@name='LoginButton']");
    By dropDown = By.xpath("//XCUIElementTypeButton[@name='LanguageDropDown']");
    By userName=By.xpath("//XCUIElementTypeTextField[@name='UsernameTextField']");
    By password=By.xpath("//XCUIElementTypeSecureTextField[@name='PasswordTextField']");
    By passWordEyeICon=By.xpath("//XCUIElementTypeImage[@name='PasswordShowHideButton']");
    By userNameErrorMsg = By.xpath("//*[contains(@label,'Please enter valid field')]");
    By userNameErrorMsgArabic = By.xpath("//*[contains(@label,'الرجاء إدخال حقل صالح')]");
    By passwordErrorMsg =  By.xpath("//*[contains(@label,'Please enter valid field')]");
    By passwordErrorMsgArabic = By.xpath("//*[contains(@label,'الرجاء إدخال حقل صالح')]");
    By themeToggleBtn = By.xpath("//XCUIElementTypeSwitch[@name='DarkModeSwitch']");
    By themeToggleBtnArabic = By.xpath("//XCUIElementTypeSwitch[@name='DarkModeSwitch']");
    By englishBtn=By.xpath("//XCUIElementTypeButton[@name='English']");
    By arabicBtn=By.xpath("//XCUIElementTypeButton[@name='عربى']");


    public void ios_isHomePageVisible() throws Exception {
        waitUtility.waitForSeconds(4);
      genericMethods.isElementPresent(dropDown);
                   log.info("user in home page");

    }


    public void ios_clikckThemeBtn() throws InterruptedException {

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

    public void ios_chooseLanguage(String language) {
        genericMethods.waitForVisibility(dropDown);
        genericMethods.click(dropDown);
          if(language.equalsIgnoreCase("English")){
           genericMethods.waitForVisibility(englishBtn);
            genericMethods.click(englishBtn);
          }else{
              genericMethods.waitForVisibility(arabicBtn);
              genericMethods.click(arabicBtn);
          }
    }


    public void ios_verifyPageLanding() throws Exception {
        waitUtility.waitForSeconds(5);
        Boolean b = genericMethods.isElementPresent(addNewAppliBtn);
        Boolean b1 = genericMethods.isElementPresent(addNewAppliBtnArabic);

        if (Boolean.TRUE.equals(b)) {
            log.info("page is navigating");
            genericMethods.click(addNewAppliBtn);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.click(addNewAppliBtnArabic);
            log.info("page is navigating arabic");
        }
        waitUtility.waitForSeconds(3);

    }

    public void ios_enterUserName(String userNAme) {
        genericMethods.waitForVisibility(userName);
        genericMethods.click(userName);
        genericMethods.sendKeys(userName,userNAme);
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }

    public void ios_isUsrErrormsgPresent() throws InterruptedException {
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

    public void ios_isPasswordErrormsgPresent() throws InterruptedException {
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

    public void ios_enterPassword(String passWord) {
        try{
            iosUtility.scrollUp();
        }catch(Exception e){
            log.debug(e);
        }
        genericMethods.waitForVisibility(password);
        genericMethods.click(password);
        genericMethods.sendKeys(password,passWord);
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }

    public void ios_enterLoginCredentials() throws InterruptedException {
        genericMethods.waitForVisibility(userName);
        genericMethods.click(userName);
        genericMethods.sendKeys(userName,props.getProperty("iusername"));
        iosUtility.hideKeyboard();
        genericMethods.click(passWordEyeICon);
        genericMethods.click(password);
        genericMethods.sendKeys(password,props.getProperty("ipassword"));
        try {
            iosUtility.hideKeyboard();
        } catch (Exception e) {
            log.debug(e);
        }
    }


    public void ios_clickLogin() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(loginBtn);
        Boolean b1 = genericMethods.isElementPresent(loginArabicBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(loginBtn);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.click(loginArabicBtn);
        } else {
            log.info("Login is not happening");
        }

    }



}
