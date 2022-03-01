package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.EntityDetailsPageAction;
import com.iexceed.uiframework.steps.EntityNameTypeAction;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.datalist;
import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.deviceConfig;

public class EntityNameTypePageDefinitions extends TestBase {
    EntityNameTypeAction legalEntityNameTypeAction =new EntityNameTypeAction(deviceConfig.get("platform"));
    public static Logger log = LogManager.getLogger(EntityNameTypePageDefinitions.class);

    @And("swipes the side menu and select EntityNameType$")
    public void swipes_the_side_menu_and_select_entitynametype() throws Exception {
        legalEntityNameTypeAction.selectEntityNameTypeField();
    }

    @When("user is in Entity name & type screen (.+)$")
    public void user_is_in_entity_name_type_screen(String testcase) throws Exception {
        legalEntityNameTypeAction.isEntityLegalPage();
        log.debug("screen navigate to legal entity");

    }
    @Then("user lands on Entity name and type screen$")
    public void user_lands_on_entity_name_and_type_screen() throws Exception {
        legalEntityNameTypeAction.isEntityLegalPage();
        log.debug("user lands on Entity name and type screen");
    }
    @And("^enters all mandatory fields (.+)$")
    public void enters_all_mandatory_fields(String testcase) throws Exception {
        enters_details_in_other_fields_of_entity_name_and_type_screen(testcase);
        clicks_on_the_legal_entity_type_field(testcase);
        clicks_on_previously_known_as_field(testcase);
        clicks_on_previously_trading_as_field(testcase);
    }

    @And("clicks Cancel in Entity name & type screen$")
    public void clicks_cancel_in_entity_name_type_screen() throws Exception {
        EntityDetailsPageAction EntityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        EntityDetailsPageAction.clickCancelBtn();
    }
    @And("clicks on Entity Legal Name field (.+)$")
    public void clicks_on_entity_legal_name_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        legalEntityNameTypeAction.validateEntityName(datalist.get("EntityLegalName"));
    }
    @And("user inputs invalid Name$")
    public void user_inputs_invalid_name(){
        log.debug("user inputs invalid Name");
    }
    @And("clicks on other field$")
    public void clicks_on_other_field(){
        log.debug("clicks on other field");
        legalEntityNameTypeAction.clickOtherFields();
    }
    @Then("error message should be displayed under Entity name & type field$")
    public void error_message_should_be_displayed_under_entity_name_type_field() throws InterruptedException {
        legalEntityNameTypeAction.fieldValidations();
    }
    @Then("error message should be displayed under Trade Name field$")
    public void error_message_should_be_displayed_under_trade_name_field() throws InterruptedException {
        legalEntityNameTypeAction.fieldValidations();

    }

    @And("clicks on Trade Name field (.+)$")
    public void clicks_on_trade_name_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        legalEntityNameTypeAction.validateTradeName(datalist.get("TradeName"));
    }

    @And("clicks on Previously known as field (.+)$")
    public void clicks_on_previously_known_as_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        legalEntityNameTypeAction.entePreviouslyKnownField(datalist.get("PrevioslyKnown"));
    }
    @Then("error message should be displayed under Previously known as field$")
    public void error_message_should_be_displayed_under_previously_known_as_field() throws InterruptedException {
        legalEntityNameTypeAction.fieldValidations();
    }

    @And("enters details in other fields of Entity name and type screen (.+)$")
    public void enters_details_in_other_fields_of_entity_name_and_type_screen(String testcase) throws Exception {
        clicks_on_trade_name_field(testcase);
        clicks_on_entity_legal_name_field(testcase);

    }

    @And("clicks on the Legal entity type field (.+)$")
    public void clicks_on_the_legal_entity_type_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        legalEntityNameTypeAction.validateLegalEntityType(datalist.get("LegalEntityType"));
    }
    @And("inputs a word$")
    public void inputs_a_word(){
       log.debug("inputs a word");
    }
    @Then("user is displayed with the selected value in Legal entity type field$")
    public void user_is_displayed_with_the_selected_value_in_legal_entity_type_field() throws Exception {
        legalEntityNameTypeAction.validateEntityType(datalist.get("LegalEntityType"));
    }
    @And("clicks on Previously trading as field (.+)$")
    public void clicks_on_previously_trading_as_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        legalEntityNameTypeAction.validatePreviousTradeas(datalist.get("PreviouslyTradeAs"));
    }
    @Then("error message should be displayed under Previously trading as field$")
    public void error_message_should_be_displayed_under_previously_trading_as_field() throws InterruptedException {
        legalEntityNameTypeAction.fieldValidations();
    }
    @And("click on Application Continue Button$")
    public void click_on_application_continue_button(){

    }
}
