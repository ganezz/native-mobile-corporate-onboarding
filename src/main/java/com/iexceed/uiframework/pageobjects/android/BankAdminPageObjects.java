package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class BankAdminPageObjects {

    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(BankAdminPageObjects.class);
    AndroidUtility androidUtility;

    public BankAdminPageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By bankAdminScreen = By.xpath("//android.view.View[@text='Banking Admin']");
    By addAdminBtn = By.xpath("//android.view.View[@content-desc='Add a new administrator']");
    By addAdminArabic = By.xpath("//android.view.View[@content-desc='إضافة مسؤول جديد']");
    By editField = By.xpath("//android.widget.EditText");
    By viewList = By.xpath("//android.view.View");
    By errorMsg = By.xpath("//android.view.View[@text='Please enter valid field']");
    By errorMsgArabic = By.xpath("//android.view.View[@text='الرجاء إدخال حقل صالح']");
    By countryCode = By.xpath("//android.view.View[@text='+93']");
    By dob = By.xpath("//android.view.View[@content-desc='Date of birth']");
    By dobArabic = By.xpath("//android.view.View[@content-desc='تاريخ الولادة']");
    By yearFrame = By.xpath("//*[@resource-id='android:id/date_picker_header_year']");
    By yearFrameList = By.xpath("android.widget.TextView");
    By previousMonth = By.xpath("//android.widget.ImageButton[@content-desc='Previous month']");
    By okBtn = By.xpath("//*[@text='OK']");
    By arabicDate = By.xpath("//*[@text='١٤']");
    By addDetailsMsg=By.xpath("//android.view.View[@text='Success ! Banking admin user added successfully']");
    By addDetailsArabicMsg=By.xpath("//android.view.View[@text='نجاح ! تمت إضافة مستخدم مسؤول الخدمات المصرفية بنجاح']");
    By editDetailsMsg=By.xpath("//android.view.View[@text='Edit ! Banking admin user edited successfully']");
    By editDetailsArabicMsg=By.xpath("//android.view.View[@text='يحرر ! تم تحرير مستخدم مسؤول الخدمات المصرفية بنجاح']");
    By closBtn = By.xpath("//android.view.View[@text='Close']");
    By closBtnArabic = By.xpath("//android.view.View[@text='قريب']");
    By editButton = By.xpath("//android.widget.ImageView[@content-desc='Edit']");
    By editButtonArabic = By.xpath("//android.widget.ImageView[@content-desc='تعديل']");
    By deleteBtn = By.xpath("//android.widget.ImageView[@content-desc='Delete']");
    By deleteBtnArabi = By.xpath("//android.widget.ImageView[@content-desc='حذف']");

    public void selectBankAdminMenu() throws Exception {
        androidUtility.swipingHamburgerMenu();
        genericMethods.click(bankAdminScreen);

    }

    public void clikAddBAnkAdminBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(addAdminBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(addAdminBtn);
        } else {
            genericMethods.click(addAdminArabic);

        }
    }

    public void isAdminScreen() throws InterruptedException {
        genericMethods.isElementPresent(editField);
    }

    public void chooseTitle(String tittle) throws Exception {
        waitUtility.waitForSeconds(2);
        genericMethods.click(editField);
        List<WebElement> tempdropDownList = driver.findElements(viewList);
        androidUtility.selectionOfDropdown(tittle, tempdropDownList);
    }

    public void enterFirstName(String firstNAme,String type) {
        if(type.equalsIgnoreCase("edit")) {
            editField.findElements(driver).get(1).click();
            editField.findElements(driver).get(1).clear();
            editField.findElements(driver).get(1).sendKeys("divya");
            editField.findElements(driver).get(2).click();
            androidUtility.hideKeyBoard();
        }else{
            editField.findElements(driver).get(1).click();
            editField.findElements(driver).get(1).clear();
            editField.findElements(driver).get(1).sendKeys(firstNAme);
            editField.findElements(driver).get(2).click();
            androidUtility.hideKeyBoard();
        }
    }

    public void isErrorMsgDisplayed() throws InterruptedException {

        Boolean b = genericMethods.isElementPresent(errorMsg);
        if (Boolean.TRUE.equals(b)) {
            log.debug("error message is displayed");
        } else {
            genericMethods.isElementPresent(errorMsgArabic);

        }
    }

    public void enterMiddleName(String middleNAme) {
        editField.findElements(driver).get(2).click();
        editField.findElements(driver).get(2).clear();
        editField.findElements(driver).get(2).sendKeys(middleNAme);
        editField.findElements(driver).get(1).click();
        androidUtility.hideKeyBoard();
    }

    public void enterLastName(String lastNAme) {
        editField.findElements(driver).get(3).click();
        editField.findElements(driver).get(3).clear();
        editField.findElements(driver).get(3).sendKeys(lastNAme);
        editField.findElements(driver).get(1).click();
        androidUtility.hideKeyBoard();
    }

    public void enterCountryCode(String Code) throws Exception {
        genericMethods.click(countryCode);
        waitUtility.waitForSeconds(1);
        genericMethods.click(editField);
        genericMethods.sendKeys(editField, Code);
        List<WebElement> temoCountryList = driver.findElements(viewList);
        androidUtility.selectionOfDropdown(Code, temoCountryList);
    }

    public void enterMpbileNumber(String mobNo) {
        editField.findElements(driver).get(4).click();
        editField.findElements(driver).get(4).clear();
        editField.findElements(driver).get(4).sendKeys(mobNo);
        editField.findElements(driver).get(1).click();
        androidUtility.hideKeyBoard();
    }

    public void enterEmail(String email) {
        editField.findElements(driver).get(5).click();
        editField.findElements(driver).get(5).clear();
        editField.findElements(driver).get(5).sendKeys(email);
        editField.findElements(driver).get(1).click();
        androidUtility.hideKeyBoard();
    }

    public void selectNationality(String nationlity) throws Exception {
        editField.findElements(driver).get(6).click();
        genericMethods.click(editField);
        genericMethods.sendKeys(editField, nationlity);
        List<WebElement> temoCountryList = driver.findElements(viewList);
        androidUtility.selectionOfDropdown(nationlity, temoCountryList);
    }

    public void selectDOB() throws Exception {
        String tempDate = "1-December-1995";
        String dateArr[] = tempDate.split("-");
        String date = dateArr[0];
        String month = dateArr[1];
        String year = dateArr[2];
        editField.findElements(driver).get(7).click();
        genericMethods.click(yearFrame);
        AndroidDriver drive = (AndroidDriver) driver;
        drive.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + year + "\").instance(0))").click();
        List<WebElement> temp = driver.findElements(yearFrameList);
        androidUtility.selectionOfDropdown(year, temp);
//       month
        Random rand = new Random();
        for (int i = 0; i <= rand.nextInt(6); i++) {
            genericMethods.click(previousMonth);
        }
        //date
        waitUtility.waitForSeconds(2);
        String xpathTemplate = "//*[@text='%s']";
        String xpath = String.format(xpathTemplate, date);
        try {
            driver.findElement(By.xpath(xpath)).click();
        } catch (Exception e) {
            genericMethods.click(arabicDate);
        }
        genericMethods.click(okBtn);

    }

    public void enterPlaceOfBirth(String birthPlace) {
        editField.findElements(driver).get(8).click();
        editField.findElements(driver).get(8).clear();
        editField.findElements(driver).get(8).sendKeys(birthPlace);
        editField.findElements(driver).get(1).click();
        androidUtility.hideKeyBoard();
    }

    public void enterPassportNum(String passportNum) {
        editField.findElements(driver).get(9).click();
        editField.findElements(driver).get(9).clear();
        editField.findElements(driver).get(9).sendKeys(passportNum);
        editField.findElements(driver).get(1).click();
        androidUtility.hideKeyBoard();
    }

    public void selectExpiryDate() throws Exception {
        waitUtility.waitForSeconds(1);
        String tempDate = "27-December-2025";
        String dateArr[] = tempDate.split("-");
        String date = dateArr[0];
        String month = dateArr[1];
        String year = dateArr[2];
        editField.findElements(driver).get(10).click();
        waitUtility.waitForSeconds(1);
        genericMethods.click(yearFrame);
        AndroidDriver drive = (AndroidDriver) driver;
        drive.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + year + "\").instance(0))").click();
        List<WebElement> temp = driver.findElements(yearFrameList);
        androidUtility.selectionOfDropdown(year, temp);
//       month
        Random rand = new Random();
        for (int i = 0; i <= rand.nextInt(2); i++) {
            genericMethods.click(previousMonth);
        }
        //date
        String xpathTemplate = "//*[@text='%s']";
        String xpath = String.format(xpathTemplate, date);
        try {
            driver.findElement(By.xpath(xpath)).click();
        } catch (Exception e) {
            genericMethods.click(arabicDate);
        }
        genericMethods.click(okBtn);

    }

    public void passPortIssueCountry(String country){
        editField.findElements(driver).get(11).click();
        genericMethods.click(editField);
        genericMethods.sendKeys(editField, country);
        List<WebElement> temoCountryList = driver.findElements(viewList);
        androidUtility.selectionOfDropdown(country, temoCountryList);
    }

    public void residencyCountry(String country){
        editField.findElements(driver).get(12).click();
        genericMethods.click(editField);
        genericMethods.sendKeys(editField, country);
        List<WebElement> temoCountryList = driver.findElements(viewList);
        androidUtility.selectionOfDropdown(country, temoCountryList);
    }

    public void addBankAdminMsg() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(addDetailsMsg);
        Boolean b1 = genericMethods.isElementPresent(addDetailsArabicMsg);
        try {
            if (Boolean.TRUE.equals(b)) {
                genericMethods.isElementPresent(addDetailsMsg);
                genericMethods.click(closBtn);
            } else if (Boolean.TRUE.equals(b1)) {
                genericMethods.isElementPresent(addDetailsArabicMsg);
                genericMethods.click(closBtnArabic);
            } else {
                try {
                    genericMethods.click(closBtn);
                } catch (Exception e) {
                    genericMethods.click(closBtnArabic);
                }
            }
        }catch(Exception e){
            log.debug(e);
        }
    }

    public void editAddbankAdminMsg() throws Exception {
        Boolean b = genericMethods.isElementPresent(editDetailsMsg);
        Boolean b1 = genericMethods.isElementPresent(editDetailsArabicMsg);
        try{
            if (Boolean.TRUE.equals(b)) {
                genericMethods.isElementPresent(editDetailsMsg);
                genericMethods.click(closBtn);
            } else if (Boolean.TRUE.equals(b1)) {
                genericMethods.isElementPresent(editDetailsArabicMsg);
                genericMethods.click(closBtnArabic);
            }
        }catch(Exception e){
            try {
                genericMethods.click(closBtn);
            } catch (Exception e1) {
                genericMethods.click(closBtnArabic);
            }
        }
    }
    public void isAddedBankDetailsVisible(String title, String fName, String lasNAme,String email) throws Exception {
        try {
            List<WebElement> tempDetails = driver.findElements(viewList);
            androidUtility.selectionItemVisible(title, tempDetails);
            androidUtility.selectionItemVisible(fName, tempDetails);
            androidUtility.selectionItemVisible(lasNAme, tempDetails);
            androidUtility.selectionItemVisible(email, tempDetails);
        }catch(Exception e){
            log.debug(e);
        }

    }
    public void clickEditBtn() throws Exception {
        waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(editButton);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(editButton);
        } else {
            genericMethods.click(editButtonArabic);
        }
    }
    public void clickDeleteBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(deleteBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(deleteBtn);
        } else {
            genericMethods.click(deleteBtnArabi);
        }
    }

}

