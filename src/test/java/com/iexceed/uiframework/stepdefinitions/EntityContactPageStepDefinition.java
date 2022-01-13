package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.EntityContactPageActions;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.HomePageDefinition.deviceConfig;

public class EntityContactPageStepDefinition extends TestBase {
 EntityContactPageActions entityContactPageActions=new EntityContactPageActions(deviceConfig.get("platform"));
    public static Logger log = LogManager.getLogger(EntityContactPageStepDefinition.class);

    @Then("user lands on Entity Contact information screen$")
    public void user_lands_on_entity_contact_information_screen(){
        entityContactPageActions.isEntityContactInfoPage();
    }

}
