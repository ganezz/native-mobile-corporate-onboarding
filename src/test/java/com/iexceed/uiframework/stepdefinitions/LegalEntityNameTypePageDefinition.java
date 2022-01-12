package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LegalEntityNameTypePageDefinition extends TestBase {

    public static Logger log = LogManager.getLogger(HomePageDefinition.class);

    @When("user is in Entity name & type screen (.+)$")
    public void user_is_in_entity_name_type_screen(String testcase){
        log.debug("screen navigate to legal entity");
    }
}
