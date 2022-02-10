package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CommercialLicensePageActions;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.deviceConfig;

public class CommercialLicenseStepDefinition extends TestBase {
    public static Logger log = LogManager.getLogger(CommercialLicenseStepDefinition.class);
    CommercialLicensePageActions commercialLicense = new CommercialLicensePageActions(deviceConfig.get("platform"));

    @And("swipes the side menu and select Commercial licence$")
    public void swipes_the_side_menu_and_select_commercial_licence() throws Exception {
        commercialLicense.isCommercialLicensePage();
    }
    @And("user is in Commercial License screen$")
    public void user_is_in_commercial_license_screen(){
        log.debug("user is in Commercial License screen");
    }


}
