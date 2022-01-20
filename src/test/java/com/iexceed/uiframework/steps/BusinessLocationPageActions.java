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

}
