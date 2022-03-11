package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.ProductUserMngMntPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProductUserMngMntPageActions {

    public String platForm;
    ProductUserMngMntPageObjects productUserMngMntPageObjects = new ProductUserMngMntPageObjects();
    private static final Logger log = LogManager.getLogger(SourceofFundPageActions.class);


    public ProductUserMngMntPageActions(String platform) {
        this.platForm = platform;

    }

    public void clickEditBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.clickEditBtn();
        }
    }

    public void selectproductScreen() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.seletUserManageMnt();
        }
    }

    public void isProductScreen() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.isProductMngMntScreen();
        }
    }

    public void addProduct() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.clickAddNewProductBtn();
        }
    }

    public void chooseTradeFinance() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.clikTradeFinanceBtn();
        }
    }

    public void clickConfirmBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.clikConfirmBtn();
        }
    }

    public void validateTradeFinanceDetails(String finance) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.validateTradeFinanceDetails(finance);
        }
    }

    public void clickDeleteBtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.clickDeleteBtn();
        }
    }

    public void isDeleteTradeMsgPresent() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.deleteTradeMsgValidation();
        }
    }

    public void clickCancelBtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.clickCancelBtn();
        }
    }

    public void clickOkBtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.clickOkBtn();
        }
    }

    public void enteraccName(String accname,String type) {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.enterAccntName(accname,type);
        }
    }

    public void clickOtherField() {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.clickOtherField();
        }
    }

    public void isAccNameErrorMsgPresent() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.validateAccNumErrorMsg();
        }
    }

    public void selectPurposeOfAcount(String purpose) {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.selectPurposeOfAccount(purpose);
        }
    }

    public void enterAdditionIntentFiled(String purpose) {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.enterAdditionalIntededField(purpose);
        }
    }

    public void isAddiionFieldErrorMsgPresent() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.additionalFieldErrorMsgPresent();
        }
    }

    public void selectCurrency(String currency) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.selectCurrency(currency);
        }
    }

    public void moneyTurnOver(String money) {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.taotalMoneyTurnOver(money);
        }
    }

    public void turnOverFieldErrorValidation() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.turnOverErrorMsgPresent();
        }
    }

    public void selectCountry(String country) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.selectCountry(country);
        }
    }

    public void monthIncomeTransaction(String income) {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.enterMonthIncomeTransaction(income);
        }
    }

    public void incomeTransactionErrorMsgValidation() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.MonthIncomeTransactionErrorMsgPresent();
        }
    }

    public void monthIncomeValue(String income) {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.enterMonthIncomeValue(income);
        }
    }


    public void incomeValueErrorMsgValidation() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.MonthIncomeValueErrorMsgPresent();
        }
    }

    public void monthOutgoingTransaction(String outcome) {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.enterMonthOutgoingTransaction(outcome);
        }
    }

    public void OutGoingTransactionErrorMsgValidation() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.MonthOutgoingTransactionErrorMsgPresent();
        }
    }

    public void OutGoingValueErrorMsgValidation() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.MonthOutgoingValueErrorMsgPresent();
        }
    }

    public void monthOutgoingValue(String outcome) {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.enterMonthOutgoingValue(outcome);
        }
    }

    public void addAnotherCountry() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.addAnotheCountry();
        }
    }

    public void isAddedProductMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.isAddedProductMsgPresent();
        }
    }

    public void isEditedSnackMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.isEditedProductMsgPresent();
        }
    }
    public void addedDetailsValidation(String acName, String purposeOfAccount, String currency) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.isAddedDetailsVisible(acName, purposeOfAccount, currency);
        }
    }

    public void isDeleteromtPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.isDeleteMsgPresent();
        }
    }

}
