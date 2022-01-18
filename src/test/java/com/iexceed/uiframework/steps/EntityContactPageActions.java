package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.EntityContactPage;

public class EntityContactPageActions {
    public String platForm;
    EntityContactPage entityContactPage = new EntityContactPage();

    public EntityContactPageActions(String platform) {
        this.platForm = platform;

    }

    public void isEntityContactInfoPage() throws Exception {
        entityContactPage.isEntityContactPage();
    }

    public void validateEmailId(String emailId) {
        entityContactPage.enterEmaild(emailId);
    }

    public void validateWbsite(String companyWebsit) {
        entityContactPage.enterCompanyWebsite(companyWebsit);
    }

    public void clickAddNewBtn() throws InterruptedException {
        entityContactPage.clickAddnewBtn();
    }

    public void isAddNewContactAddressPage() throws Exception {
        entityContactPage.isEntityaddNewAddress();
    }

    public void validateUnitNo(String unitno){
        entityContactPage.enterUnitNo(unitno);
    }

    public void validateStreet(String street){
        entityContactPage.enterStreet(street);
    }
    public void validateState(String state ){
        entityContactPage.enterState(state);
    }
    public void validateCity(String city ){
        entityContactPage.enterCity(city);
    }
    public void validateZip(String zip ){
        entityContactPage.enterZip(zip);
    }

    public void validatePBOX(String pbox ){
        entityContactPage.enterPstBox(pbox);
    }
    public void validateCountry(String country) throws Exception {
        entityContactPage.validateCountry(country);
    }

    public void validateEnteredAddress(String addressType, String state,String city, String zipcode,String postBox) throws Exception {
        entityContactPage.validateUserDetails(addressType,state,city,zipcode,postBox);
    }

    public void validateEditMsg() throws Exception {
        entityContactPage.isEditValidationMsgPresent();
    }

    public void contactDeleteMsgValidation() throws InterruptedException {
        entityContactPage.deletePromtConfirmation();
    }
}
