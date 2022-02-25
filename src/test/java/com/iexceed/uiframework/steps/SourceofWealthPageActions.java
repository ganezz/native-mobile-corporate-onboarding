package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.SourceofFundPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SourceofWealthPageActions {

    public String platForm;
    SourceofFundPageObjects sourceofFundPageObjects = new SourceofFundPageObjects();
    private static final Logger log = LogManager.getLogger(SourceofWealthPageActions.class);


    public SourceofWealthPageActions(String platform) {
        this.platForm = platform;

    }




}
