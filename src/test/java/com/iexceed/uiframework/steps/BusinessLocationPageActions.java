package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.BusinessLocationPageObjects;
import com.iexceed.uiframework.pageobjects.ios.IosBusinessLocationPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BusinessLocationPageActions {

    BusinessLocationPageObjects businessLocationPage = new BusinessLocationPageObjects();
    IosBusinessLocationPageObjects iosLocationPageObjects=new IosBusinessLocationPageObjects();
    private static final Logger log = LogManager.getLogger(BusinessLocationPageActions.class);
    public String platForm;

    public BusinessLocationPageActions(String platform) {
        this.platForm = platform;

    }

    public void selectBusinessLoaction() throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.selectBusinessLocationPage();
        } else {
            businessLocationPage.selectBusinessLocationPage();
        }
    }

    public void isBusinessLoactionPage() throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.isBusinessLocationPage();
        } else {
            businessLocationPage.isBusinessLocationPage();
        }
    }

    public void isErrorMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.isErrorMsgDisplayed();
        } else {
            businessLocationPage.isErrorMsgDisplayed();
        }
    }

    public void clickAddYEsToggle() {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.clickYEsToggle();
        } else {
            log.debug("android");
        }
    }

    public void selectCountry(String country) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.selectCountry(country);
        } else {
            businessLocationPage.selectCountry(country);
        }
    }

    public void clickOkBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.clickOkBtnValidation();
        } else {
            businessLocationPage.clickOkBtnValidation();
        }
    }

    public void clickCancelBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.clickCancelBtnValidation();
        } else {
            businessLocationPage.clickCancelBtnValidation();
        }
    }

    public void clickApplicationCancelBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.clickApplicationCancelBtnValidation();
        } else {
            businessLocationPage.clickApplicationCancelBtnValidation();
        }
    }

    public void clickApplicationContinueBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.clickApplicationContinueBtn();
        } else {
            businessLocationPage.clickApplicationContinueBtn();
        }
    }

    public void addNewLocation() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.addNewLocationBtn();
        } else {
            businessLocationPage.addNewLocationBtn();
        }

    }

    public void addNewMarket() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.addNewMarketBtn();
        } else {
            businessLocationPage.addNewMarketBtn();
        }
    }

    public void selectCountry(String country,String type) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
           iosLocationPageObjects.fillCountry(country,type);
        } else {
            businessLocationPage.fillCountry(country,type);

        }
    }

    public void fillCountryandOperation(String country, String operation,String type) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.fillCountry(country,type);
            iosLocationPageObjects.fillOperation(operation);
        } else {
            businessLocationPage.fillCountry(country,type);
            businessLocationPage.fillOperation(operation);
        }
    }

    public void fillTypeOfOperation(String operation) throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.fillOperation(operation);
        } else {
            businessLocationPage.fillOperation(operation);
        }
    }

    public void fillCountryandProportion(String country, String proportion,String type) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.fillCountry(country,type);
            iosLocationPageObjects.fillProportion(proportion);
        } else {
            businessLocationPage.fillCountry(country,type);
            businessLocationPage.fillProportion(proportion);
        }
    }

    public void fillProportion(String proportion) {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.fillProportion(proportion);
        } else {
            businessLocationPage.fillProportion(proportion);
        }
    }


    public void validateAddNewLocationField(String country, String operation) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
           iosLocationPageObjects.validateAddNewLocationField(country, operation);
        } else {
            businessLocationPage.validateAddNewLocationField(country, operation);
        }
    }

    public void validateAddNewMarketField(String country, String proportion) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.validateAddNewMarketField(country, proportion);
        } else {
            businessLocationPage.validateAddNewMarketField(country, proportion);
        }
    }

    public void isEditValidationMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.isEditLocationValidationMsgPresent();
        } else {
            businessLocationPage.isEditLocationValidationMsgPresent();
        }
    }

    public void isAddedValidationMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.isAddedValidationMsgPresent();
        } else {
            businessLocationPage.isAddedValidationMsgPresent();
        }
    }

    public void isAddedMaktValidationMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.isAddMarketValidationMsgPresent();
        } else {
            businessLocationPage.isAddMarketValidationMsgPresent();
        }
    }

    public void isEditBusinessMarketMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
           iosLocationPageObjects.isEditMarketValidationMsgPresent();
        } else {
            businessLocationPage.isEditMarketValidationMsgPresent();
        }
    }


    public void isDeletePopupPresent() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
           iosLocationPageObjects.isDeleteMsgPresent();
        } else {
            businessLocationPage.isDeleteMsgPresent();
        }
    }


    public void clickConfirmBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.clickConfirmBtn();
        } else {
            businessLocationPage.clickConfirmBtn();
        }
    }
    public void clickEditButtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.clickEditBtn();
        } else {
            businessLocationPage.clickEditBtn();
        }
    }
    public void clickDeleteButtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iosLocationPageObjects.clickDeleteBtn();
        } else {
            businessLocationPage.clickDeleteBtn();
        }
    }
}
