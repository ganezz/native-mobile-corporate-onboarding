package com.iexceed.uiframework.pageobjects.android;

import com.iexceed.uiframework.appium.GenericMethods;
import com.iexceed.uiframework.domainobjects.AndroidUtility;
import com.iexceed.uiframework.utilites.WaitUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.domainobjects.ConnectionObjects.driver;

public class LegalEntityNameType {
    AndroidUtility androidUtility;
    GenericMethods genericMethods;
    private final WaitUtility waitUtility;
    private static final Logger log = LogManager.getLogger(LegalEntityNameType.class);

    public LegalEntityNameType() {
        genericMethods = new GenericMethods(driver);
        androidUtility = new AndroidUtility();
        waitUtility = new WaitUtility();
    }



}
