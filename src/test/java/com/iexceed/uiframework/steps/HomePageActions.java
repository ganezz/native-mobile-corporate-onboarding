package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.HomePageObjects;
import com.iexceed.uiframework.pageobjects.ios.IosHomePageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePageActions {

    HomePageObjects homePageObjects = new HomePageObjects();
    IosHomePageObjects ihomePageObjects = new IosHomePageObjects();
    private static final Logger log = LogManager.getLogger(HomePageActions.class);

    public void isHomePageVisible(String platform) throws Exception {

        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.iIsHomePageVisible();
        } else {
            homePageObjects.isHomePageVisible();
        }

    }

    public void chooseLanguage(String platform, String language) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ichooseLanguage();
        } else {
            homePageObjects.chooseLanguage(language);
        }

    }

    public void clickRegUserBtn(String platform, String language) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.iClickUserRegBtn(language);
        } else {
            homePageObjects.clickUserRegBtn(language);
        }
    }

    public void enterUserName(String platform, String userNmae) {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ienterLoginCredentials();
        } else {
            homePageObjects.enterUserName(userNmae);
        }
    }

    public void isUserErrorMsgPresent(String platform) throws InterruptedException {
        if (platform.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            homePageObjects.isUsrErrormsgPresent();
        }
    }

    public void isPasswordMsgPresent(String platform) throws InterruptedException {
        if (platform.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            homePageObjects.isPasswordErrormsgPresent();
        }
    }

    public void enterPassword(String platform, String password) {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ienterLoginCredentials();
        } else {
            homePageObjects.enterPassword(password);
        }
    }

    public void clickthemeBtn(String platform) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            homePageObjects.clikckThemeBtn();
        }

    }

    public void validateLoginCredentials(String platform) {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ienterLoginCredentials();
        } else {
            homePageObjects.enterLoginCredentials();
        }
    }

    public void verifyPageNavigation(String platform) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.iVerifyPageLanding();
        } else {
            homePageObjects.verifyPageLanding();
        }
    }

    public void login(String platform) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.loginPage();
        } else {
            homePageObjects.clickLogin();
        }
    }

    public void verifyLanguageAsEnglish(String platform) throws InterruptedException {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.iClickEnglishLangBtn();
        } else {
            homePageObjects.clickEnglishLangBtn();
        }
    }

    public void verifyLanguageAsArabic(String platform) throws InterruptedException {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.iClickArabicLangBtn();
        } else {
            homePageObjects.clickArabicLangBtn();
        }
    }


}
