package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.PageObjects.Android.HomePageObjects;
import com.iexceed.uiframework.PageObjects.IOS.iHomePageObjects;

public class HomePageAction {

    HomePageObjects homePageObjects = new HomePageObjects();
    iHomePageObjects ihomePageObjects = new iHomePageObjects();


    public void isHomePageVisible(String platform) throws Exception {

        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.IOS_isHomePageVisible();
        } else {
            homePageObjects.isHomePageVisible();
        }

    }

    public void clickRegUserBtn(String platform) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.Ios_clickUserRegBtn();
        } else {
            homePageObjects.clickUserRegBtn();
        }
    }

    public void verifyPageNavigation(String platform) throws Exception {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.IOS_verifyPageLanding();
        } else {
            homePageObjects.verifyPageLanding();
        }
    }

    public void verifyLanguageAsEnglish(String platform) throws InterruptedException {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_clickEnglishLangBtn();
        } else {
            homePageObjects.clickEnglishLangBtn();
        }
    }

    public void verifyLanguageAsArabic(String platform) throws InterruptedException {
        if (platform.equalsIgnoreCase("ios")) {
            ihomePageObjects.ios_clickArabicLangBtn();
        } else {
            homePageObjects.clickArabicLangBtn();
        }
    }


}
