package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.EntityContactPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityContactPageActions {
    public String platForm;
    EntityContactPageObjects entityContactPage = new EntityContactPageObjects();
    private static final Logger log = LogManager.getLogger(EntityContactPageActions.class);

    public EntityContactPageActions(String platform) {
        this.platForm = platform;

    }

    public void isEntityContactInfoPage() throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.isEntityContactPage();
        }

    }

    public void validateEmailId(String emailId) {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.enterEmaild(emailId);
        }

    }

    public void validateWbsite(String companyWebsit) {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.enterCompanyWebsite(companyWebsit);
        }


    }

    public void clickAddNewBtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.clickAddnewBtn();
        }


    }

    public void isAddNewContactAddressPage() throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.isEntityaddNewAddress();
        }

    }

    public void validateUnitNo(String unitno){
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.enterUnitNo(unitno);
        }

    }

    public void validateStreet(String street){
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.enterStreet(street);
        }

    }
    public void validateState(String state ){
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.enterState(state);
        }

    }
    public void validateCity(String city ){
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.enterCity(city);
        }


    }
    public void validateZip(String zip ){
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.enterZip(zip);
        }

    }

    public void validatePBOX(String pbox ){
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.enterPstBox(pbox);
        }

    }
    public void validateCountry(String country) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.validateCountry(country);
        }

    }

    public void validateEnteredAddress(String addressType, String state,String city, String zipcode,String postBox) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.validateUserDetails(addressType,state,city,zipcode,postBox);
        }

    }

    public void validateEditMsg() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.isEditValidationMsgPresent();
        }


    }

    public void contactDeleteMsgValidation() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            entityContactPage.deletePromtConfirmation();
        }

    }
}
