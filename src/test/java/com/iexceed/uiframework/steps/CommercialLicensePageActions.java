package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.CommercialLicenePageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommercialLicensePageActions {
    public String platForm;
    CommercialLicenePageObjects commercialLicenePageObjects = new CommercialLicenePageObjects();
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

    public void fillLicenseNumber(String number) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            commercialLicenePageObjects.enterCommLicenseNum(number);
        }
    }

    public void clickotherField() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            commercialLicenePageObjects.clickSomeOtherField();
        }
    }

    public void validateLicenseNumberErrorMsg() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            commercialLicenePageObjects.validateLicenseNumberErrorMeg();
        }
    }

    public void fillCommercialIssuedBy(String issuedBy) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            commercialLicenePageObjects.enterCommLicenseIssued(issuedBy);
        }
    }

    public void validateCommercialLicenseIssueErroeMsg() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            commercialLicenePageObjects.validateLicenseIssuedErrorMeg();
        }
    }
    public void fillBusinessActivity(String business) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            commercialLicenePageObjects.enterBusinessActivity(business);
        }
    }

    public void validateBuinessActivity() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            commercialLicenePageObjects.validateBusinessActivityErrorMeg();
        }
    }

    public void validateIssueDate() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            commercialLicenePageObjects.selectIssueDate();
        }
    }
    public void validateExpirayDate() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            commercialLicenePageObjects.selectExpiryDate();
        }
    }

}
