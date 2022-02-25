package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class SourceofWealthPageObjects {

    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(SourceofWealthPageObjects.class);
    AndroidUtility androidUtility;

    public SourceofWealthPageObjects() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By editField = By.xpath("//android.widget.EditText");

    public void selectSourceOfFund() throws Exception {
        androidUtility.swipingHamburgerMenu();
//        genericMethods.click(sourceOfFundMenu);
    }





}
