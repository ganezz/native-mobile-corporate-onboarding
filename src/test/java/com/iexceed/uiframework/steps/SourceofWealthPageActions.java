package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.SourceofWealthPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SourceofWealthPageActions {

    public String platForm;
    SourceofWealthPageObjects sourceofWealthPageObjects = new SourceofWealthPageObjects();
    private static final Logger log = LogManager.getLogger(SourceofWealthPageActions.class);


    public SourceofWealthPageActions(String platform) {
        this.platForm = platform;
    }

    public void selectoseSourceWealthScreen() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofWealthPageObjects.selectSourceOfFund();
        }
    }

    public void isSourceWealthScreen() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofWealthPageObjects.isSourceofWealthScreen();
        }
    }

    public void addSourceWealth() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofWealthPageObjects.addSourceofWealth();
        }
    }

    public void selectSourceWealth(String fund,String edit) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofWealthPageObjects.selecteSourceOFFund(fund,edit);
        }
    }
    public void isAddSnackMsgPresent() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofWealthPageObjects.isWealthSnackBarMsgPresent();
        }
    }

    public void isAddedDetailsPresent(String sourceFund,String reason) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofWealthPageObjects.isEnteredDetailsPresent(sourceFund,reason);
        }
    }

    public void isEditSnackMsgPresent() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofWealthPageObjects.isWealthEditSnackBarMsgPresent();
        }
    }

    public void enterWealthReason(String reason) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            sourceofWealthPageObjects.enterReasonForFund(reason);
        }
    }

}
