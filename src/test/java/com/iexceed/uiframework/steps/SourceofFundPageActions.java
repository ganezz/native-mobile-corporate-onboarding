package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.SourceofFundPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SourceofFundPageActions {

    public String platForm;
    SourceofFundPageObjects sourceofFundPageObjects = new SourceofFundPageObjects();
    private static final Logger log = LogManager.getLogger(SourceofFundPageActions.class);


    public SourceofFundPageActions(String platform) {
        this.platForm = platform;

    }

    public void selectSourcrOfFund() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofFundPageObjects.selectSourceOfFund();
        }
    }

    public void isSourceOfFundScreen() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofFundPageObjects.isSourceofFund();
        }
    }

    public void clicAddSourceBtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofFundPageObjects.clickAddSourceBtn();
        }
    }

    public void chooseSourceOfFund(String source,String edit) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofFundPageObjects.chooseSourceOFFund(source,edit);
        }
    }

    public void chooseCountry(String country) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofFundPageObjects.chooseCountry(country);
        }
    }

    public void enterSourcFundReason(String reason) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofFundPageObjects.enterReasonForFund(reason);
        }
    }

    public void validateErrorMsg() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofFundPageObjects.validateErrorMeg();
        }
    }

    public void isAddNewSourceScreen() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofFundPageObjects.isAddNewSourceScreen();
        }
    }

    public void snackbarMsgPresent() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofFundPageObjects.isSnackBarMsgPresent();
        }
    }
    public void enteredDetailsPresent(String sourceFund,String country,String reason) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofFundPageObjects.isEnteredDetailsPresent(sourceFund,country,reason);
        }
    }
    public void isEditSnackMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofFundPageObjects.isEditSnackBarMsgPresent();
        }
    }


    public void clickSourceFundEditBtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofFundPageObjects.clickEditBtn();
        }
    }

    public void clickSourceFundDeleteIcon() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofFundPageObjects.clickDeleteBtn();
        }
    }



}
