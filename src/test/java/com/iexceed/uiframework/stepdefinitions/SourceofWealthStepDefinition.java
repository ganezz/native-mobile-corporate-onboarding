package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.SourceofFundPageActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.deviceConfig;

public class SourceofWealthStepDefinition extends TestBase {
    public static Logger log = LogManager.getLogger(SourceofWealthStepDefinition.class);
    SourceofFundPageActions sourceofFundPageActions=new SourceofFundPageActions(deviceConfig.get("platform"));

}


