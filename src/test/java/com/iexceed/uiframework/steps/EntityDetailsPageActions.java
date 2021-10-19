package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.PageObjects.Android.EntityDetailsPage;
import com.iexceed.uiframework.PageObjects.IOS.iEntityDetailsPage;

public class EntityDetailsPageActions {

    EntityDetailsPage entityDetailsPage = new EntityDetailsPage();
    iEntityDetailsPage iEntityDetailsPage = new iEntityDetailsPage();
    public String platForm;

    public EntityDetailsPageActions(String platform) {
        this.platForm = platform;

    }

    public void clickAddNewUSerBtn() {

        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_clickAddNewuserBtn();
        } else {
            entityDetailsPage.clickAddNewuserBtn();
        }
    }


    public void EnterUSerName(String username, String limit) {

        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_addUserName(username, limit);
        } else {
            entityDetailsPage.addUserName(username, limit);

        }
    }


    public void EnterEmailid(String email, String limit) throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_enterEmail(email, limit);
        } else {
            entityDetailsPage.enterEmail(email, limit);
        }
    }

    public void clickCOnfirmBtn() {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_clickConfirmBtn();
        } else {
            entityDetailsPage.clickConfirmBtn();

        }
    }

    public void verifyValidationMsg(String expectedMsg, String expectedMsg1) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_isValidationMsgPresent();
        } else {
            entityDetailsPage.isValidationMsgPresent(expectedMsg, expectedMsg1);
        }
    }

    public void selectCountryCode(String countryCode) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_enterCountryCode(countryCode);
        } else {
            entityDetailsPage.enterCountryCode(countryCode);
        }
    }

    public void enterMobNum(String mobNum) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_enterMobNum(mobNum);
        } else {
            entityDetailsPage.enterMobNum(mobNum);
        }
    }

    public void clickCancelBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_clickCancelBtn();
        } else {
            entityDetailsPage.clickCancelBtn();
        }
    }

    public void YES_NO_messageConfirmantion() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_isYES_NOBtnPresentConfirmation();
        } else {
            entityDetailsPage.isYES_NOBtnPresentConfirmation();
        }
    }

    public void ClickYesBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_clickYEsBtnValidation();
        } else {
            entityDetailsPage.clickYEsBtnValidation();
        }
    }

    public void ClickNOBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_clicNoBtnValidation();
        } else {
            entityDetailsPage.clicNoBtnValidation();
        }
    }

    public void validateBottomMessage() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_isBottomValidationMsgPresent();
        } else {
            entityDetailsPage.isBottomValidationMsgPresent();
        }
    }

    public void validateUserDetails(String username, String emil, String MobNum) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_validateUserDetails(username, emil, MobNum);
        } else {
            entityDetailsPage.validateUserDetails(username, emil, MobNum);
        }
    }

    public void clickEditButton() {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_clickEditBtn();
        } else {
            entityDetailsPage.clickEditBtn();
        }
    }


    public void clickDeleteButton() {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_clickDeleteBtn();
        } else {
            entityDetailsPage.clickDeleteBtn();
        }
    }

    public void isAddNewScreenVisible() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.i_isAddNewScreen();
        } else {
            entityDetailsPage.isAddNewScreen();
        }
    }

}
