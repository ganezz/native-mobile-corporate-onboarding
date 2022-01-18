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


public class HomePageObjects extends TestBase {

    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(HomePageObjects.class);
    AndroidUtility androidUtility;

    public HomePageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By userDetailsRegBt = By.xpath("//android.view.View[@text='Onboarding']");
    By addNewUsrBtn = By.xpath("//android.view.View[@text='+ Add A New User']");
    By addNewUsrBtnArabic = By.xpath("//*[@text='+ إضافة مستخدم جديد']");
    By englishBtn = By.xpath("//android.view.View[@text='English']");
    By arabicBtn = By.xpath("//android.view.View[@text='Arabic']");
    By arabicaddNewUsrBtn = By.xpath("//android.view.View[@text='+ إضافة مستخدم جديد']");
    By textField = By.xpath("//android.widget.EditText");
    By loginBtn = By.xpath("//android.view.View[@text='LOGIN']");
    By loginArabicBtn = By.xpath("//android.view.View[@text='تسجيل الدخول']");
    By dropDown = By.xpath("//android.widget.EditText[@text='English']");
    By dropDownList = By.xpath("//android.view.View");


    public void isHomePageVisible() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b1 = genericMethods.isElementPresent(userDetailsRegBt);
        Boolean b = genericMethods.isElementPresent(englishBtn);
        if (Boolean.TRUE.equals(b)) {
            log.info("user in home page");
        } else if (Boolean.TRUE.equals(b1)) {
            log.info("user in home page");
        } else {
            log.debug("home page is not launched");
        }


    }

    public void chooseLanguage(String language) {
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
        waitUtility.waitForSeconds(5);
        Boolean b = genericMethods.isElementPresent(addNewUsrBtn);
        Boolean b1 = genericMethods.isElementPresent(addNewUsrBtnArabic);

        if (Boolean.TRUE.equals(b)) {
            log.info("page is navigating");
        } else if (Boolean.TRUE.equals(b1)) {
            log.info("page is navigating arabic");
        } else {
            log.info("Page is not navigating to add new user screen");
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
        } catch (Exception e) {log.debug(e);
        }
    }


    public void clickLogin() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(loginBtn);
        Boolean b1 = genericMethods.isElementPresent(loginArabicBtn);
        if (Boolean.TRUE.equals(b)) {
            driver.findElement(By.xpath("//android.view.View[@text='LOGIN']")).click();
        } else if (Boolean.TRUE.equals(b1)) {
            driver.findElement(By.xpath("//android.view.View[@text='تسجيل الدخول']")).click();
        } else {
            log.info("Login is not happening");
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
