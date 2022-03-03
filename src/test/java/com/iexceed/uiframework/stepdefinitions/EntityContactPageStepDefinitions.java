package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.EntityContactPageAction;
import com.iexceed.uiframework.steps.EntityNameTypeAction;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.datalist;
import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.deviceConfig;

public class EntityContactPageStepDefinitions extends TestBase {
    EntityContactPageAction EntityContactPageActions = new EntityContactPageAction(deviceConfig.get("platform"));
    public static Logger log = LogManager.getLogger(EntityContactPageStepDefinitions.class);

    @And("swipes the side menu and select Entity contact$")
    public void swipes_the_side_menu_and_select_entity_contact() throws Exception {
        EntityContactPageActions.selectEntityContactInfo();
    }

    @Then("user lands on Entity Contact information screen$")
    public void user_lands_on_entity_contact_information_screen() throws Exception {
        EntityContactPageActions.isEntityContactInfoPage();
    }

    @When("user is in Entity Contact Information screen (.+)$")
    public void user_is_in_entity_contact_information_screen(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        EntityContactPageActions.isEntityContactInfoPage();
    }
    @Then("user remains in User Contact Information screen (.+)$")
    public void user_remains_in_user_contact_information_screen(String testcase) throws Exception {
        user_is_in_entity_contact_information_screen(testcase);
    }


    @And("clicks on Email Address field$")
    public void clicks_on_email_address_field() throws Exception {
        EntityContactPageActions.validateEmailId(datalist.get("emailId"));
    }

    @And("user inputs invalid data$")
    public void user_inputs_invalid_data() {
        log.debug("user inputs invalid email");
    }
    @Then("error message should be displayed under Email Address field$")
    public void error_message_should_be_displayed_under_email_address_field() throws InterruptedException {
        EntityNameTypeAction legalEntityNameTypeAction =new EntityNameTypeAction(deviceConfig.get("platform"));
        legalEntityNameTypeAction.fieldValidations();
    }
    @And("clicks on Company Website$")
    public void clicks_on_company_website() throws Exception {
        EntityContactPageActions.validateWbsite(datalist.get("Website"));
    }
    @Then("error message should be displayed under Company Website field$")
    public void error_message_should_be_displayed_under_company_website_field() throws InterruptedException {
        EntityNameTypeAction legalEntityNameTypeAction =new EntityNameTypeAction(deviceConfig.get("platform"));
        legalEntityNameTypeAction.fieldValidations();
    }
    @And("clicks Add A New Address button$")
    public void clicks_add_a_new_address_button() throws InterruptedException {
        EntityContactPageActions.clickAddNewBtn();
    }

    @Then("user lands on Add A New Address screen$")
    public void user_lands_on_add_a_new_address_screen() throws Exception {
        EntityContactPageActions.isAddNewContactAddressPage();
    }
    @And("clicks on Unit no$")
    public void clicks_on_unit_no() throws Exception {
        EntityContactPageActions.validateUnitNo(datalist.get("Unitno"),"");
    }
    @Then("error message should be displayed under field$")
    public void error_message_should_be_displayed_under_field() throws InterruptedException {
        EntityNameTypeAction legalEntityNameTypeAction =new EntityNameTypeAction(deviceConfig.get("platform"));
        legalEntityNameTypeAction.fieldValidations();
    }

    @And("clicks on Street field$")
    public void clicks_on_street_field() throws Exception {
        EntityContactPageActions.validateStreet(datalist.get("Street"));
    }
    @And("clicks on city and post box$")
    public void clicks_on_city_and_post_box() throws Exception {
        EntityContactPageActions.validateCity(datalist.get("city"));
        EntityContactPageActions.validatePBOX(datalist.get("postbox"));
        EntityContactPageActions.validateState(datalist.get("State"));
    }

    @And("clicks on zipcode$")
    public void clicks_on_zipcode() throws Exception {
        EntityContactPageActions.validateZip(datalist.get("zipCode"));
    }
    @And("fills valid data in AddressType, UnitNo,Building name,street,Area, Country, State, town,city, zip,postalCode, PO Box$")
    public void fills_valid_data_in_addresstype_unitnobuilding_namestreetarea_country_state_towncity_zippostalcode_po_box() throws Exception {
        clicks_on_unit_no();
        clicks_on_street_field();
        clicks_on_county();
        EntityContactPageActions.validateState(datalist.get("State"));
        EntityContactPageActions.validateCity(datalist.get("city"));
        EntityContactPageActions.validatePBOX(datalist.get("postbox"));
        clicks_on_zipcode();

    }

    @And("clicks Edit button in EntityName Screen$")
    public void clicks_edit_button_in_entityname_screen() throws InterruptedException {
        EntityContactPageActions.clickEditBtn();
    }
    @And("clicks on County$")
    public void clicks_on_county() throws Exception {
        EntityContactPageActions.validateCountry(datalist.get("countryCode"));
    }
    @And("clicks Delete button in EntityName Screen$")
    public void clicks_delete_button_in_entityname_screen() throws InterruptedException {
        EntityContactPageActions.clickDeleteBtn();
    }
    @And("user entered address is displayed in address details tab$")
    public void user_entered_address_is_displayed_in_address_details_tab() throws Exception {
        EntityContactPageActions.validateEnteredAddress("Registered",datalist.get("State"),datalist.get("city"),datalist.get("zipCode"),datalist.get("postbox"));
    }
    @And("user lands on Modification Screen Add A New Address Screen with already given data$")
    public void user_lands_on_modification_screen_add_a_new_address_screen_with_already_given_data() throws Exception {
        EntityContactPageActions.isAddNewContactAddressPage();
    }
    @And("edits one or more fields in valid format$")
    public void edits_one_or_more_fields_in_valid_format() throws Exception {
        EntityContactPageActions.validateUnitNo(datalist.get("Unitno"),"edit");

    }
    @And("user displayed with Successfully Edited snack bar Message$")
    public void user_displayed_with_successfully_edited_snack_bar_message() throws Exception {
        EntityContactPageActions.validateEditMsg();
    }
    @Then("user displayed with edited values in address details screen$")
    public void user_displayed_with_edited_values_in_address_details_screen() throws Exception {
        user_entered_address_is_displayed_in_address_details_tab();
    }

    @Then("address is removed from the list$")
    public void address_is_removed_from_the_list() throws Exception {
        user_entered_address_is_displayed_in_address_details_tab();
    }
    @And("user given details will display on Entity Contact Details screen$")
    public void user_given_details_will_display_on_entity_contact_details_screen() throws Exception {
        user_entered_address_is_displayed_in_address_details_tab();
    }
    @Then("user lands on Business Location screen$")
    public void user_lands_on_business_location_screen(){
        log.debug(" user lands on Business Location screen");
    }

    @Then("user will prompt to ask about Delete confirmation$")
    public void user_will_prompt_to_ask_about_delete_confirmation() throws Exception {
        EntityContactPageActions.contactDeleteMsgValidation();
    }
}
