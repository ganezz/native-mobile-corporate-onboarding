package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.BankAdminPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BankAdminPageActions {

   BankAdminPageObjects bankAdminPageObjects=new BankAdminPageObjects();
    private static final Logger log = LogManager.getLogger(BankAdminPageActions.class);
    public String platForm;

    public BankAdminPageActions(String platform) {
        this.platForm = platform;

    }

    public void selectBankAdmin() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            bankAdminPageObjects.selectBankAdminMenu();
        }
    }

    public void clickAdminBtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            bankAdminPageObjects.clikAddBAnkAdminBtn();
        }
    }
    public void isAdminScreen() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            bankAdminPageObjects.isAdminScreen();
        }
    }

    public void selectTitle(String title) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            bankAdminPageObjects.chooseTitle(title);
        }
    }

    public void enterFirstNAMe(String fNAMe){
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            bankAdminPageObjects.enterFirstName(fNAMe);
        }
    }
    public void enterMiddleNAMe(String mNAMe){
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            bankAdminPageObjects.enterFirstName(mNAMe);
        }
    }
    public void enterLastNAMe(String lNAMe){
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            bankAdminPageObjects.enterFirstName(lNAMe);
        }
    }

}
