package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.BusinessLocationPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BusinessLocationPageActions {

    BusinessLocationPageObjects businessLocationPage = new BusinessLocationPageObjects();
    private static final Logger log = LogManager.getLogger(BusinessLocationPageActions.class);
    public String platForm;

    public BusinessLocationPageActions(String platform) {
        this.platForm = platform;

    }

    public void selectBusinessLoaction() throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.selectBusinessLocationPage();
        }
    }

    public void isBusinessLoactionPage() throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.isBusinessLocationPage();
        }
    }

    public void isErrorMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.isErrorMsgDisplayed();
        }
    }
    public void selectCountry(String country) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.selectCountry(country);
        }
    }

    public void clickOkBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.clickOkBtnValidation();
        }
    }

    public void clickCancelBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.clickCancelBtnValidation();
        }
    }

    public void clickApplicationCancelBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.clickApplicationCancelBtnValidation();
        }
    }

    public void clickApplicationContinueBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.clickApplicationContinueBtn();
        }
    }

    public void addNewLocation() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.addNewLocationBtn();
        }

    }

    public void addNewMarket() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.addNewMarketBtn();
        }
    }

    public void fillCountryandOperation(String country, String operation) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.fillCountry(country);
            businessLocationPage.fillOperation(operation);
        }
    }

    public void fillTypeOfOperation(String operation) {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.fillOperation(operation);
        }
    }

    public void fillCountryandProportion(String country, String proportion) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.fillCountry(country);
            businessLocationPage.fillProportion(proportion);
        }
    }


    public void validateAddNewLocationField(String country, String operation) {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.validateAddNewLocationField(country, operation);
        }
    }

    public void validateAddNewMarketField(String country, String proportion) {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.validateAddNewMarketField(country, proportion);
        }
    }

    public void isEditValidationMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.isEditLocationValidationMsgPresent();
        }
    }

    public void isAddedValidationMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.isAddedValidationMsgPresent();
        }
    }

    public void isEditBusinessMarketMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.isEditMarketValidationMsgPresent();
        }
    }



    public void isDeletePopupPresent() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.isDeleteMsgPresent();
        }
    }


    public void clickConfirmBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.clickConfirmBtn();
        }
    }
}
