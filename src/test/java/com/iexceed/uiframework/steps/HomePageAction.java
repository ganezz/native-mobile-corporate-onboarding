package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.HomePageObjects;
import com.iexceed.uiframework.pageobjects.ios.IosHomePageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePageAction {

    HomePageObjects homePageObjects = new HomePageObjects();
    IosHomePageObjects ihomePageObjects = new IosHomePageObjects();
    private static final Logger log = LogManager.getLogger(HomePageAction.class);

    public HomePageAction() {
   }

    public void isHomePageVisible(String platform) throws Exception {

        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_isHomePageVisible();
        } else {
            homePageObjects.isHomePageVisible();
        }

    }

    public void chooseLanguage(String platform, String language)  {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_chooseLanguage(language);
        } else {
            homePageObjects.chooseLanguage(language);
        }

    }


    public void enterUserName(String platform, String userNmae) {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_enterUserName(userNmae);
        } else {
            homePageObjects.enterUserName(userNmae);
        }
    }

    public void isUserErrorMsgPresent(String platform) throws InterruptedException {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_isUsrErrormsgPresent();
        } else {
            homePageObjects.isUsrErrormsgPresent();
        }
    }

    public void isPasswordMsgPresent(String platform) throws InterruptedException {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_isPasswordErrormsgPresent();
        } else {
            homePageObjects.isPasswordErrormsgPresent();
        }
    }

    public void enterPassword(String platform, String password) {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_enterPassword(password);
        } else {
            homePageObjects.enterPassword(password);
        }
    }

    public void clickthemeBtn(String platform) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_clikckThemeBtn();
        } else {
            homePageObjects.clikckThemeBtn();
        }

    }

    public void validateLoginCredentials(String platform) {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_enterLoginCredentials();
        } else {
            homePageObjects.enterLoginCredentials();
        }
    }

    public void verifyPageNavigation(String platform) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_verifyPageLanding();
        } else {
            homePageObjects.verifyPageLanding();
        }
    }

    public void login(String platform) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_clickLogin();
        } else {
            homePageObjects.clickLogin();
        }
    }




}
