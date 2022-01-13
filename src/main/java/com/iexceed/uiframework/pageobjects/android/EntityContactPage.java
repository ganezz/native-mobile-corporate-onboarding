package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class EntityContactPage {
    GenericMethods genericMethods;
    WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(EntityContactPage.class);
    AndroidUtility androidUtility;

    public EntityContactPage() {
        genericMethods = new GenericMethods(driver);
        waitUtility = new WaitUtility();
        androidUtility = new AndroidUtility();
    }

    By entityContactInfoPage = By.xpath("//android.view.View[@text='Entity contact information']");

    public void isEntityContactPage(){
        genericMethods.waitForVisibility(entityContactInfoPage);
        log.debug("user in entity contact page");

    }
}
