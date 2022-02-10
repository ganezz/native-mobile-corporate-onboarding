package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.CommercialLicenePageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommercialLicensePageActions {
    public String platForm;
    CommercialLicenePageObjects commercialLicenePageObjects=new CommercialLicenePageObjects();
    private static final Logger log = LogManager.getLogger(CommercialLicensePageActions.class);


    public CommercialLicensePageActions(String platform) {
        this.platForm = platform;

    }

    public void isCommercialLicensePage() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            commercialLicenePageObjects.selectCommercialLicense();
        }

    }





}
