package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.HomePageObjects;
import com.iexceed.uiframework.pageobjects.ios.IosHomePageObjects;

public class HomePageAction {

    HomePageObjects homePageObjects = new HomePageObjects();
    IosHomePageObjects ihomePageObjects = new IosHomePageObjects();


    public void isHomePageVisible(String platform) throws Exception {

        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.iIsHomePageVisible();
        } else {
            homePageObjects.isHomePageVisible();
        }

    }


    public void clickRegUserBtn(String platform) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.iClickUserRegBtn();
        } else {
            homePageObjects.clickUserRegBtn();
        }
    }

    public void verifyPageNavigation(String platform) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.iVerifyPageLanding();
        } else {
            homePageObjects.verifyPageLanding();
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
