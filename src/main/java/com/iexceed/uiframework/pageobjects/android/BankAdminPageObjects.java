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

    By bankAdminScreen= By.xpath("//android.view.View[@text='Banking Admin']");
    By addAdminBtn=By.xpath("//android.view.View[@content-desc='Add a new administrator']");
    By addAdminArabic=By.xpath("//android.view.View[@content-desc='إضافة مسؤول جديد']");
    By editField = By.xpath("//android.widget.EditText");
    By viewList = By.xpath("//android.view.View");
    By errorMsg=By.xpath("//android.view.View[@text='Please enter valid field']");
    By errorMsgArabic=By.xpath("//android.view.View[@text='الرجاء إدخال حقل صالح']");


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
        waitUtility.waitForSeconds(3);
        genericMethods.click(editField);
        List<WebElement> tempdropDownList = driver.findElements(viewList);
        androidUtility.selectionOfDropdown(tittle, tempdropDownList);
    }
    public void enterFirstName(String firstNAme){
        editField.findElements(driver).get(1).click();
        editField.findElements(driver).get(1).clear();
        editField.findElements(driver).get(1).sendKeys(firstNAme);
        editField.findElements(driver).get(2).click();
        androidUtility.hideKeyBoard();
    }

    public void enterMiddleName(String middleNAme){
        editField.findElements(driver).get(2).click();
        editField.findElements(driver).get(2).clear();
        editField.findElements(driver).get(2).sendKeys(middleNAme);
        editField.findElements(driver).get(1).click();
        androidUtility.hideKeyBoard();
    }
    public void enterLastName(String lastNAme){
        editField.findElements(driver).get(3).click();
        editField.findElements(driver).get(3).clear();
        editField.findElements(driver).get(3).sendKeys(lastNAme);
        editField.findElements(driver).get(1).click();
        androidUtility.hideKeyBoard();
    }



}

