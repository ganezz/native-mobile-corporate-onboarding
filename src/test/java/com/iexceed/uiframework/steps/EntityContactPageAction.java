package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.EntityContactPageObjects;
import com.iexceed.uiframework.pageobjects.ios.IosEntityContactPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityContactPageAction {
    public String platForm;
    EntityContactPageObjects entityContactPage = new EntityContactPageObjects();
    IosEntityContactPageObjects iosEntityContactPageObjects=new IosEntityContactPageObjects();
    private static final Logger log = LogManager.getLogger(EntityContactPageAction.class);

    public EntityContactPageAction(String platform) {
        this.platForm = platform;

    }

    public void selectEntityContactInfo() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.selectEntityContactPage();
            log.debug("ios");
        } else {
            entityContactPage.selectEntityContactPage();
        }
    }

    public void isEntityContactInfoPage() throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.isEntityContactPage();
        } else {
            entityContactPage.isEntityContactPage();
        }

    }

    public void validateEmailId(String emailId) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.enterEmaild(emailId);
        } else {
            entityContactPage.enterEmaild(emailId);
        }

    }

    public void validateWbsite(String companyWebsit) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.enterCompanyWebsite(companyWebsit);
        } else {
            entityContactPage.enterCompanyWebsite(companyWebsit);
        }


    }

    public void clickAddNewBtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.clickAddnewBtn();
        } else {
            entityContactPage.clickAddnewBtn();
        }


    }

    public void isAddNewContactAddressPage() throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.isEntityaddNewAddress();
        } else {
            entityContactPage.isEntityaddNewAddress();
        }

    }

    public void validateUnitNo(String unitno,String edit) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.enterUnitNo(unitno,edit);
        } else {
            entityContactPage.enterUnitNo(unitno,edit);
        }

    }

    public void validateStreet(String street) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.enterStreet(street);
        } else {
            entityContactPage.enterStreet(street);
        }

    }
    public void validateState(String state ) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.enterState(state);
        } else {
            entityContactPage.enterState(state);
        }

    }
    public void validateCity(String city ) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.enterCity(city);
        } else {
            entityContactPage.enterCity(city);
        }


    }
    public void validateZip(String zip ) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.enterZip(zip);
        } else {
            entityContactPage.enterZip(zip);
        }

    }

    public void validatePBOX(String pbox ) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.enterPstBox(pbox);
        } else {
            entityContactPage.enterPstBox(pbox);
        }

    }
    public void clickEditBtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.clickEditBtn();
        } else {
           log.debug("android");
        }
    }

    public void clickDeleteBtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.ios_clickDeleteBtn();
        } else {
            log.debug("android");
        }
    }

    public void validateCountry(String country) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.validateCountry(country);
        } else {
            entityContactPage.validateCountry(country);
        }

    }

    public void validateEnteredAddress(String addressType, String state,String city, String zipcode,String postBox) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.validateUserDetails(addressType,state,city,zipcode,postBox);
        } else {
            entityContactPage.validateUserDetails(addressType,state,city,zipcode,postBox);
        }

    }

    public void validateEditMsg() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.isEditValidationMsgPresent();
        } else {
            entityContactPage.isEditValidationMsgPresent();
        }


    }

    public void contactDeleteMsgValidation() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityContactPageObjects.deletePromtConfirmation();
        } else {
            entityContactPage.deletePromtConfirmation();
        }

    }
}
