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

public class ProductUserMngMntPageObjects {
    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(BusinessLocationPageObjects.class);
    AndroidUtility androidUtility;

    public ProductUserMngMntPageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By productMngMntScreen = By.xpath("//android.view.View[@text='Product & User Management']");
    By addNewProductBtn = By.xpath("//android.view.View[@content-desc='Add a new product']");
    By addNewProductBtnArabic = By.xpath("//android.view.View[@content-desc='أضف منتج جديد']");
    By editField = By.xpath("//android.widget.EditText");
    By tradeFinance = By.xpath("//android.view.View[@content-desc='Trade finance']");
    By tradeFinanceArabic = By.xpath("//android.view.View[@content-desc='تمويل التجارة']");
    By confirmBtn = By.xpath("//android.view.View[@content-desc='Confirm']");
    By confirmArabic = By.xpath("//android.view.View[@content-desc='يتأكد']");
    By viewDataDetails = By.xpath("//android.view.View");
    By deleteBtn = By.xpath("//android.widget.ImageView[@content-desc='Delete']");
    By deleteBtnArabi = By.xpath("//android.widget.ImageView[@content-desc='حذف']");
    By deleteTradeMg = By.xpath("//android.view.View[@text='Are you sure you want to delete the Trade Finance ?']");
    By deleteTradeMsgArabic = By.xpath("//android.view.View[@text='هل أنت متأكد أنك تريد حذف تمويل التجارة؟']");
    By cancelBtn = By.xpath("//android.view.View[@content-desc='Cancel button']");
    By cancelBtnArabic = By.xpath("//android.view.View[@content-desc='زرالإلغاء']");
    By okBtn = By.xpath("//android.view.View[@content-desc='Okay button']");
    By okBtnArabic = By.xpath("//android.view.View[@content-desc='زر موافق']");
    By accNameErrorMsg = By.xpath("//android.view.View[@text='Please enter valid Preferred operating account name']");
    By accNameErrorMsgArabic = By.xpath("//android.view.View[@text='الرجاء إدخال اسم حساب تشغيل مفضل صالح']");
    By viewList = By.xpath("//android.view.View");
    By additionFieldErrorMsg = By.xpath("//android.view.View[@text='Please enter valid Additional details on intended use']");
    By additionFieldErrorMsgArabic = By.xpath("//android.view.View[@text='الرجاء إدخال تفاصيل إضافية صالحة عن الاستخدام المقصود']");
    By searchField = By.xpath("//android.widget.EditText");
    By turnOverErrorMsg = By.xpath("//android.view.View[@text='Please enter valid Total anticipated monthly transaction turnover']");
    By turnOverErrorMsgArabic = By.xpath("//android.view.View[@text='الرجاء إدخال صالح إجمالي حجم المعاملات الشهرية المتوقعة']");
    By incomeTransactionErrorMsg = By.xpath("//android.view.View[@text='Please enter valid Incoming transaction vol. per month']");
    By incomeTransactionErrorMsgArabic = By.xpath("//android.view.View[@text='الرجاء إدخال صالح المعاملات الواردة المجلد. كل شهر']");
    By incomeValueErrorMsg = By.xpath("//android.view.View[@text='Please enter valid Incoming value per month (USD)']");
    By incomeValueErrorMsgArabic = By.xpath("//android.view.View[@text='الرجاء إدخال قيمة واردة صالحة لكل شهر (بالدولار الأمريكي)']");
    By outgoingTransErrorMsg = By.xpath("//android.view.View[@text='Please enter valid Outgoing transaction vol. per month']");
    By outgoingTransErrorMsgArabic = By.xpath("//android.view.View[@text='الرجاء إدخال حجم المعاملات الصادرة صالح. كل شهر']");
    By outgoingValueErrorMsg = By.xpath("//android.view.View[@text='Please enter valid Outgoing value per month (USD)']");
    By outGoingValueErrorMsgArabic = By.xpath("//android.view.View[@text='الرجاء إدخال قيمة صادرة صالحة شهريًا (بالدولار الأمريكي)']");
    By addAnotherCountry = By.xpath("//android.view.View[@content-desc='Add another country']");
    By addAnotherCountryArabic = By.xpath("//android.view.View[@content-desc='أضف دولة أخرى']");
    By closBtn = By.xpath("//android.view.View[@text='Close']");
    By closBtnArabic = By.xpath("//android.view.View[@text='قريب']");
    By addProductMsg = By.xpath("//android.view.View[@text='Success ! Corporate Account added successfully']");
    By addProductMsgArabic = By.xpath("//android.view.View[@text='Edit ! Corporate Account edited successfully']");
    By editProductMsg = By.xpath("//android.view.View[@text='Success ! Corporate Account added successfully']");
    By editProductMsgArabic = By.xpath("//android.view.View[@text='Edit ! Corporate Account edited successfully']");
    By deleteMsg = By.xpath("//android.view.View[@text='Are you sure you want to delete the Corporate Account ?']");
    By deletemsgArabic = By.xpath("//android.view.View[@text='هل أنت متأكد أنك تريد حذف حساب الشركة؟']");
    By editButton = By.xpath("//android.widget.ImageView[@content-desc='Edit']");
    By editButtonArabic = By.xpath("//android.widget.ImageView[@content-desc='تعديل']");



    public void clickEditBtn() throws Exception {
       waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(editButton);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(editButton);
        } else {
            genericMethods.click(editButtonArabic);
        }
    }


    public void seletUserManageMnt() throws Exception {
        waitUtility.waitForSeconds(7);
        androidUtility.swipingHamburgerMenu();
        genericMethods.click(productMngMntScreen);
    }

    public void isProductMngMntScreen() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(addNewProductBtn);
        if (Boolean.TRUE.equals(b)) {
            log.debug("User in product management screen");
        } else {
            genericMethods.isElementPresent(addNewProductBtnArabic);
            log.debug("User in product management screen");
        }
    }

    public void clickAddNewProductBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(addNewProductBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(addNewProductBtn);
        } else {
            genericMethods.click(addNewProductBtnArabic);
        }
    }

    public void clikTradeFinanceBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(tradeFinance);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(tradeFinance);
        } else {
            genericMethods.click(tradeFinanceArabic);
        }
    }

    public void clikConfirmBtn() throws Exception {
        Boolean b = genericMethods.isElementPresent(confirmBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(confirmBtn);
        } else {
            genericMethods.click(confirmArabic);
        }
        waitUtility.waitForSeconds(1);
    }

    public void validateTradeFinanceDetails(String trade) throws Exception {
        try {
            genericMethods.click(closBtn);
        } catch (Exception e) {
            genericMethods.click(closBtnArabic);
        }
        try {
            log.info(driver.findElements(viewDataDetails).size());
            List<WebElement> tempDetails = driver.findElements(viewDataDetails);
            androidUtility.selectionItemVisible(trade, tempDetails);
        }catch(Exception e1){
            log.debug(e1);
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

    public void deleteTradeMsgValidation() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(deleteTradeMg);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(deleteTradeMg);
        } else {
            genericMethods.click(deleteTradeMsgArabic);
        }
    }

    public void clickCancelBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(cancelBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(cancelBtn);
        } else {
            genericMethods.click(cancelBtnArabic);
        }
    }

    public void clickOkBtn() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(okBtn);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(okBtn);
        } else {
            genericMethods.click(okBtnArabic);
        }
    }

    public void enterAccntName(String accName, String type) {
        genericMethods.click(editField);
        driver.findElement(editField).clear();
        if (type.equalsIgnoreCase("edit")) {
            genericMethods.sendKeys(editField, "Money market");
             } else {
            genericMethods.sendKeys(editField, accName);
            androidUtility.hideKeyBoard();
        }
        androidUtility.hideKeyBoard();
    }

    public void clickOtherField() {
        editField.findElements(driver).get(2).click();
    }

    public void validateAccNumErrorMsg() throws InterruptedException {
        Boolean b = genericMethods.isElementPresent(accNameErrorMsg);
        if (Boolean.TRUE.equals(b)) {
            log.debug("error message is present");
        } else {
            genericMethods.isElementPresent(accNameErrorMsgArabic);
        }
    }

    public void selectPurposeOfAccount(String purposeOffAcc) {
        editField.findElements(driver).get(1).click();
        List<WebElement> tempdropDownList = driver.findElements(viewList);
        androidUtility.selectionOfDropdown(purposeOffAcc, tempdropDownList);
    }

    public void enterAdditionalIntededField(String additionfield) {
        editField.findElements(driver).get(2).click();
        editField.findElements(driver).get(2).clear();
        editField.findElements(driver).get(2).sendKeys(additionfield);
        androidUtility.hideKeyBoard();
    }

    public void additionalFieldErrorMsgPresent() throws InterruptedException {
        genericMethods.click(editField);
        Boolean b = genericMethods.isElementPresent(additionFieldErrorMsg);
        if (Boolean.TRUE.equals(b)) {
            log.debug("error message is present");
        } else {
            genericMethods.isElementPresent(additionFieldErrorMsgArabic);
        }
    }

    public void selectCurrency(String currency) throws Exception {
        editField.findElements(driver).get(3).click();
        waitUtility.waitForSeconds(1);
        genericMethods.waitForVisibility(searchField);
        genericMethods.click(searchField);
        genericMethods.sendKeys(searchField, currency);
        log.info(driver.findElements(viewList).size());
        List<WebElement> temoCurrencyList = driver.findElements(viewList);
        androidUtility.selectionOfDropdown(currency, temoCurrencyList);
    }

    public void taotalMoneyTurnOver(String money) {
        editField.findElements(driver).get(4).click();
        editField.findElements(driver).get(4).clear();
        editField.findElements(driver).get(4).sendKeys(money);
        androidUtility.hideKeyBoard();
    }

    public void turnOverErrorMsgPresent() throws InterruptedException {
        genericMethods.click(editField);
        Boolean b = genericMethods.isElementPresent(turnOverErrorMsg);
        if (Boolean.TRUE.equals(b)) {
            log.debug("error message is present");
        } else {
            genericMethods.isElementPresent(turnOverErrorMsgArabic);
        }
    }

    public void selectCountry(String country) throws Exception {
        editField.findElements(driver).get(5).click();
        waitUtility.waitForSeconds(2);
        genericMethods.click(searchField);
        genericMethods.sendKeys(searchField, country);
        log.info(driver.findElements(viewList).size());
        List<WebElement> temoCountryList = driver.findElements(viewList);
        androidUtility.selectionOfDropdown(country, temoCountryList);
    }

    public void enterMonthIncomeTransaction(String incomeMonth) {
        editField.findElements(driver).get(6).click();
        editField.findElements(driver).get(6).clear();
        editField.findElements(driver).get(6).sendKeys(incomeMonth);
        androidUtility.hideKeyBoard();
    }

    public void MonthIncomeTransactionErrorMsgPresent() throws InterruptedException {
        androidUtility.hideKeyBoard();
        genericMethods.click(editField);
        Boolean b = genericMethods.isElementPresent(incomeTransactionErrorMsgArabic);
        if (Boolean.TRUE.equals(b)) {
            log.debug("error message is present");
        } else {
            genericMethods.isElementPresent(incomeTransactionErrorMsg);
        }
    }

    public void enterMonthIncomeValue(String incomeMonth) {
        androidUtility.hideKeyBoard();
        editField.findElements(driver).get(7).click();
        editField.findElements(driver).get(7).clear();
        editField.findElements(driver).get(7).sendKeys(incomeMonth);
        androidUtility.hideKeyBoard();
    }

    public void MonthIncomeValueErrorMsgPresent() throws InterruptedException {
        androidUtility.hideKeyBoard();
        genericMethods.click(editField);
        Boolean b = genericMethods.isElementPresent(incomeValueErrorMsg);
        if (Boolean.TRUE.equals(b)) {
            log.debug("error message is present");
        } else {
            genericMethods.isElementPresent(incomeValueErrorMsgArabic);
        }
    }

    public void enterMonthOutgoingTransaction(String outGoingMonth) {
        androidUtility.hideKeyBoard();
        editField.findElements(driver).get(8).click();
        editField.findElements(driver).get(8).clear();
        editField.findElements(driver).get(8).sendKeys(outGoingMonth);
        androidUtility.hideKeyBoard();
    }

    public void MonthOutgoingTransactionErrorMsgPresent() throws InterruptedException {
        androidUtility.hideKeyBoard();
        genericMethods.click(editField);
        Boolean b = genericMethods.isElementPresent(outgoingTransErrorMsg);
        if (Boolean.TRUE.equals(b)) {
            log.debug("error message is present");
        } else {
            genericMethods.isElementPresent(outgoingTransErrorMsgArabic);
        }
    }

    public void enterMonthOutgoingValue(String outGoingMonth) {
        editField.findElements(driver).get(9).click();
        editField.findElements(driver).get(9).clear();
        editField.findElements(driver).get(9).sendKeys(outGoingMonth);
        androidUtility.hideKeyBoard();
    }

    public void MonthOutgoingValueErrorMsgPresent() throws InterruptedException {
        genericMethods.click(editField);
        Boolean b = genericMethods.isElementPresent(outgoingValueErrorMsg);
        if (Boolean.TRUE.equals(b)) {
            log.debug("error message is present");
        } else {
            genericMethods.isElementPresent(outGoingValueErrorMsgArabic);
        }
    }

    public void addAnotheCountry() throws InterruptedException {
        androidUtility.hideKeyBoard();
        Boolean b = genericMethods.isElementPresent(addAnotherCountry);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.click(addAnotherCountry);
        } else {
            genericMethods.click(addAnotherCountryArabic);
        }
        androidUtility.hideKeyBoard();
    }

    public void isAddedProductMsgPresent() throws Exception {
        Boolean b = genericMethods.isElementPresent(addProductMsg);
        Boolean b1 = genericMethods.isElementPresent(addProductMsgArabic);
       try {
           if (Boolean.TRUE.equals(b)) {
               genericMethods.isElementPresent(addProductMsg);
               genericMethods.click(closBtn);
           } else if (Boolean.TRUE.equals(b1)) {
               genericMethods.isElementPresent(addProductMsgArabic);
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

    public void isEditedProductMsgPresent() throws Exception {
        waitUtility.waitForSeconds(2);
        Boolean b = genericMethods.isElementPresent(editProductMsg);
        Boolean b1 = genericMethods.isElementPresent(editProductMsgArabic);
        try{
        if (Boolean.TRUE.equals(b)) {
            genericMethods.isElementPresent(editProductMsg);
            genericMethods.click(closBtn);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.isElementPresent(editProductMsgArabic);
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

    public void isAddedDetailsVisible(String acName, String purposeOfAccount, String currency) throws Exception {
        try {
            List<WebElement> tempDetails = driver.findElements(viewDataDetails);
            androidUtility.selectionItemVisible(acName, tempDetails);
            androidUtility.selectionItemVisible(purposeOfAccount, tempDetails);
            androidUtility.selectionItemVisible(currency, tempDetails);
        }catch(Exception e){
            log.debug(e);
        }

    }



    public void isDeleteMsgPresent() throws Exception {
       waitUtility.waitForSeconds(1);
        Boolean b = genericMethods.isElementPresent(deleteMsg);
        Boolean b1 = genericMethods.isElementPresent(deletemsgArabic);
        if (Boolean.TRUE.equals(b)) {
            genericMethods.isElementPresent(deleteMsg);
        } else if (Boolean.TRUE.equals(b1)) {
            genericMethods.isElementPresent(deletemsgArabic);
        }
    }

}
