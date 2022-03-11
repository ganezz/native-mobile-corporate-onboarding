package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.LoginPageObjects;
import com.iexceed.uiframework.pageobjects.ios.IosLoginPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPageAction {

    LoginPageObjects loginPageObjects = new LoginPageObjects();
    IosLoginPageObjects ihomePageObjects = new IosLoginPageObjects();
    private static final Logger log = LogManager.getLogger(LoginPageAction.class);

    public LoginPageAction() {
   }

    public void isHomePageVisible(String platform) throws Exception {

        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_isHomePageVisible();
        } else {
            loginPageObjects.isHomePageVisible();
        }

    }

    public void chooseLanguage(String platform, String language) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_chooseLanguage(language);
        } else {
            loginPageObjects.chooseLanguage(language);
        }

    }


    public void enterUserName(String platform, String userNmae) {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_enterUserName(userNmae);
        } else {
            loginPageObjects.enterUserName(userNmae);
        }
    }

    public void isUserErrorMsgPresent(String platform) throws InterruptedException {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_isUsrErrormsgPresent();
        } else {
            loginPageObjects.isUsrErrormsgPresent();
        }
    }

    public void isPasswordMsgPresent(String platform) throws InterruptedException {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_isPasswordErrormsgPresent();
        } else {
            loginPageObjects.isPasswordErrormsgPresent();
        }
    }

    public void enterPassword(String platform, String password) {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_enterPassword(password);
        } else {
            loginPageObjects.enterPassword(password);
        }
    }

    public void clickthemeBtn(String platform) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_clikckThemeBtn();
        } else {
            loginPageObjects.clikckThemeBtn();
        }

    }

    public void validateLoginCredentials(String platform) throws InterruptedException {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_enterLoginCredentials();
        } else {
            loginPageObjects.enterLoginCredentials();
        }
    }

    public void verifyPageNavigation(String platform) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_verifyPageLanding();
        } else {
            loginPageObjects.verifyPageLanding();
        }
    }

    public void login(String platform) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_clickLogin();
        } else {
            loginPageObjects.clickLogin();
        }
    }




}
