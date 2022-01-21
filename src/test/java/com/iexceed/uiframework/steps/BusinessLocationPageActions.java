package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.BusinessLocationPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BusinessLocationPageActions {

    BusinessLocationPage businessLocationPage = new BusinessLocationPage();
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

    public void selectCountry(String country) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            businessLocationPage.selectCountry(country);
        }
    }

    public void addNewLocation() throws InterruptedException {
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
            businessLocationPage.isEditValidationMsgPresent();
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

}
