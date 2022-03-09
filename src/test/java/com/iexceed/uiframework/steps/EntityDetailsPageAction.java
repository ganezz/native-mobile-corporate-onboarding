package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.EntityDetailsPageObjects;
import com.iexceed.uiframework.pageobjects.ios.IosEntityDetailsPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class EntityDetailsPageAction {

    EntityDetailsPageObjects entityDetailsPage = new EntityDetailsPageObjects();
    IosEntityDetailsPageObjects iosEntityDetailsPageObjects=new IosEntityDetailsPageObjects();
    public static String platForm;
    private static final Logger log = LogManager.getLogger(EntityDetailsPageAction.class);

    public EntityDetailsPageAction(String platform) {
        this.platForm = platform;

    }

    public void hamBurgerSwipping() throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_swipingHamburgerMenu();
        } else {
            entityDetailsPage.swipingHamburgerMenu();
        }
    }

    public void validateSearchField() throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_isSearchField();
        } else {
            entityDetailsPage.isSearchField();
        }
    }

    public void clearSearchField() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.clearSearchField();
        } else {
            entityDetailsPage.clearSearchField();
        }
    }

    public void clickAddNewUSerBtn() throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_clickAddNewuserBtn();
        } else {
            entityDetailsPage.clickAddNewuserBtn();
        }
    }


    public void EnterUSerName(String username, String limit, String type) throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_addUserName(username,limit,type);
        } else {
            entityDetailsPage.addUserName(username, limit,type);

        }
    }


    public void EnterEmailid(String email, String limit) throws Exception {

        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_enterEmail(email);
        } else {
            entityDetailsPage.enterEmail(email);
        }
    }

    public void clickCOnfirmBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_clickConfirmBtn();
        } else {
            entityDetailsPage.clickConfirmBtn();

        }
    }

    public void verifyValidationMsg(String expectedMsg, String expectedMsg1) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_isValidationMsgPresent(expectedMsg,expectedMsg1);
        } else {
            entityDetailsPage.isValidationMsgPresent(expectedMsg, expectedMsg1);
        }
    }

    public void selectCountryCode(String countryCode) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_enterCountryCode(countryCode);
        } else {
            entityDetailsPage.enterCountryCode(countryCode);
        }
    }

    public void enterMobNum(String mobNum) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_enterMobNum(mobNum);
        } else {
            entityDetailsPage.enterMobNum(mobNum);
        }
    }

    public void clickCancelBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_clickCancelBtn();
        } else {
            entityDetailsPage.clickCancelBtn();
        }
    }

    public void YES_NO_messageConfirmantion() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_isYesNoBtnPresentConfirmation();
        } else {
            entityDetailsPage.isYesNoBtnPresentConfirmation();
        }
    }

    public void ClickYesBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_clickYEsBtnValidation();
        } else {
            entityDetailsPage.clickYEsBtnValidation();
        }
    }

    public void ClickNOBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_clickCancelBtnValidation();
        } else {
            entityDetailsPage.clickCancelBtnValidation();
        }
    }

    public void validateBottomMessage() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_isBottomValidationMsgPresent();
        } else {
            entityDetailsPage.isBottomValidationMsgPresent();
        }
    }

    public void validateUserDetails(String username, String emil, String mobNum) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_validateUserDetails(username,emil,mobNum);
        } else {
            entityDetailsPage.validateUserDetails(username, emil, mobNum);
        }
    }

    public void clickEditButton() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.clickEditBtn();
        } else {
            entityDetailsPage.clickEditBtn();
        }
    }


    public void clickDeleteButton() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_clickDeleteBtn();
        } else {
            entityDetailsPage.clickDeleteBtn();
        }
    }

    public void isAddNewScreenVisible() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_isAddNewScreen();
        } else {
            entityDetailsPage.isAddNewScreen();
        }
    }

    public void clickcontinueBtn() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            iosEntityDetailsPageObjects.ios_clickContinueBtn();
        } else {
            entityDetailsPage.clickContinueBtn();
        }
    }

    public void validateLableValue(){
        if (platForm.equalsIgnoreCase("ios")) {
          log.debug("ios");
        } else {
            entityDetailsPage.lableValidation();
        }
    }

}
