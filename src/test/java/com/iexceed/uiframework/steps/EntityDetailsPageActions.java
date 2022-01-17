package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.EntityDetailsPage;
import com.iexceed.uiframework.pageobjects.ios.IosEntityDetailsPage;


public class EntityDetailsPageActions {

    EntityDetailsPage entityDetailsPage = new EntityDetailsPage();
    IosEntityDetailsPage iEntityDetailsPage = new IosEntityDetailsPage();
    public String platForm;

    public EntityDetailsPageActions(String platform) {
        this.platForm = platform;

    }

    public void hamBurgerSwipping() throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iClickAddNewuserBtn();
        } else {
            entityDetailsPage.swipingHamburgerMenu();
        }
    }

    public void validateSearchField() throws InterruptedException {

        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iClickAddNewuserBtn();
        } else {
            entityDetailsPage.isSearchField();
        }
    }

    public void clearSearchField() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iClickAddNewuserBtn();
        } else {
            entityDetailsPage.clearSearchField();
        }
    }

    public void clickAddNewUSerBtn() {

        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iClickAddNewuserBtn();
        } else {
            entityDetailsPage.clickAddNewuserBtn();
        }
    }


    public void EnterUSerName(String username, String limit) throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iAddUserName(username, limit);
        } else {
            entityDetailsPage.addUserName(username, limit);

        }
    }


    public void EnterEmailid(String email, String limit) throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iEnterEmail(email, limit);
        } else {
            entityDetailsPage.enterEmail(email);
        }
    }

    public void clickCOnfirmBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iClickConfirmBtn();
        } else {
            entityDetailsPage.clickConfirmBtn();

        }
    }

    public void verifyValidationMsg(String expectedMsg, String expectedMsg1) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iIsValidationMsgPresent();
        } else {
            entityDetailsPage.isValidationMsgPresent(expectedMsg, expectedMsg1);
        }
    }

    public void selectCountryCode(String countryCode) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iEnterCountryCode(countryCode);
        } else {
            entityDetailsPage.enterCountryCode(countryCode);
        }
    }

    public void enterMobNum(String mobNum) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iEnterMobNum(mobNum);
        } else {
            entityDetailsPage.enterMobNum(mobNum);
        }
    }

    public void clickCancelBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iClickCancelBtn();
        } else {
            entityDetailsPage.clickCancelBtn();
        }
    }

    public void YES_NO_messageConfirmantion() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iIsYesNoBtnPresentConfirmation();
        } else {
            entityDetailsPage.isYesNoBtnPresentConfirmation();
        }
    }

    public void ClickYesBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iClickYEsBtnValidation();
        } else {
            entityDetailsPage.clickYEsBtnValidation();
        }
    }

    public void ClickNOBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iClicNoBtnValidation();
        } else {
            entityDetailsPage.clicNoBtnValidation();
        }
    }

    public void validateBottomMessage() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iIsBottomValidationMsgPresent();
        } else {
            entityDetailsPage.isBottomValidationMsgPresent();
        }
    }

    public void validateUserDetails(String username, String emil, String mobNum) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iValidateUserDetails(username, emil, mobNum);
        } else {
            entityDetailsPage.validateUserDetails(username, emil, mobNum);
        }
    }

    public void clickEditButton() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iClickEditBtn();
        } else {
            entityDetailsPage.clickEditBtn();
        }
    }


    public void clickDeleteButton() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iClickDeleteBtn();
        } else {
            entityDetailsPage.clickDeleteBtn();
        }
    }

    public void isAddNewScreenVisible() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iIsAddNewScreen();
        } else {
            entityDetailsPage.isAddNewScreen();
        }
    }

    public void clickcontinueBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iEntityDetailsPage.iClickContinueBtn();
        } else {
            entityDetailsPage.clickContinueBtn();
        }
    }

}
