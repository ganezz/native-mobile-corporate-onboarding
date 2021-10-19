package com.iexceed.uiframework.DomainObjects;

import com.iexceed.uiframework.appium.GenericMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IOSUtility {

    GenericMethods genericMethods;
    public static Logger log = LogManager.getLogger(IOSUtility.class);


    public IOSUtility(GenericMethods genericMethods) {
        this.genericMethods = genericMethods;

    }

}
