package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.EntityContactPageActions;
import com.iexceed.uiframework.steps.EntityNameTypeActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.HomePageDefinition.datalist;
import static com.iexceed.uiframework.stepdefinitions.HomePageDefinition.deviceConfig;

public class EntityContactPageStepDefinition extends TestBase {
    EntityContactPageActions entityContactPageActions = new EntityContactPageActions(deviceConfig.get("platform"));
    public static Logger log = LogManager.getLogger(EntityContactPageStepDefinition.class);

    @Then("user lands on Entity Contact information screen$")
    public void user_lands_on_entity_contact_information_screen() {
        entityContactPageActions.isEntityContactInfoPage();
    }

    @When("user is in Entity Contact Information screen (.+)$")
    public void user_is_in_entity_contact_information_screen(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        entityContactPageActions.isEntityContactInfoPage();
    }
    @Then("user remains in User Contact Information screen (.+)$")
    public void user_remains_in_user_contact_information_screen(String testcase) throws Exception {
        user_is_in_entity_contact_information_screen(testcase);
    }


    @And("clicks on Email Address field$")
    public void clicks_on_email_address_field() {
        entityContactPageActions.validateEmailId(datalist.get("emailId"));
    }

    @And("user inputs invalid data$")
    public void user_inputs_invalid_data() {
        log.debug("user inputs invalid email");
    }
    @Then("error message should be displayed under Email Address field$")
    public void error_message_should_be_displayed_under_email_address_field() throws InterruptedException {
        EntityNameTypeActions legalEntityNameTypeActions=new EntityNameTypeActions(deviceConfig.get("platform"));
        legalEntityNameTypeActions.fieldValidations();
    }
    @And("clicks on Company Website$")
    public void clicks_on_company_website(){
        entityContactPageActions.validateWbsite(datalist.get("Website"));
    }
    @Then("error message should be displayed under Company Website field$")
    public void error_message_should_be_displayed_under_company_website_field() throws InterruptedException {
        EntityNameTypeActions legalEntityNameTypeActions=new EntityNameTypeActions(deviceConfig.get("platform"));
        legalEntityNameTypeActions.fieldValidations();
    }
    @And("clicks Add A New Address button$")
    public void clicks_add_a_new_address_button(){
        entityContactPageActions.clickAddNewBtn();
    }

    @Then("user lands on Add A New Address screen$")
    public void user_lands_on_add_a_new_address_screen(){
        entityContactPageActions.isAddNewContactAddressPage();
    }
    @And("clicks on Unit no$")
    public void clicks_on_unit_no(){
        entityContactPageActions.validateUnitNo(datalist.get("Unitno"));
    }
    @Then("error message should be displayed under field$")
    public void error_message_should_be_displayed_under_field() throws InterruptedException {
        EntityNameTypeActions legalEntityNameTypeActions=new EntityNameTypeActions(deviceConfig.get("platform"));
        legalEntityNameTypeActions.fieldValidations();
    }

    @And("clicks on Street field$")
    public void clicks_on_street_field(){
        entityContactPageActions.validateStreet(datalist.get("Street"));
    }
    @And("clicks on city and post box$")
    public void clicks_on_city_and_post_box(){
        entityContactPageActions.validateCity(datalist.get("city"));
        entityContactPageActions.validatePBOX(datalist.get("postbox"));
        entityContactPageActions.validateState(datalist.get("State"));
    }

    @And("clicks on zipcode$")
    public void clicks_on_zipcode(){
        entityContactPageActions.validateZip(datalist.get("zipCode"));
    }
    @And("fills valid data in AddressType, UnitNo,Building name,street,Area, Country, State, town,city, zip,postalCode, PO Box$")
    public void fills_valid_data_in_addresstype_unitnobuilding_namestreetarea_country_state_towncity_zippostalcode_po_box() throws Exception {

        clicks_on_unit_no();
        clicks_on_street_field();
        clicks_on_county();
        clicks_on_city_and_post_box();
        clicks_on_zipcode();

    }

    @And("clicks on County$")
    public void clicks_on_county() throws Exception {
        entityContactPageActions.validateCountry(datalist.get("countryCode"));
    }

    @And("user entered address is displayed in address details tab$")
    public void user_entered_address_is_displayed_in_address_details_tab() throws Exception {
        entityContactPageActions.validateEnteredAddress("Registered",datalist.get("State"),datalist.get("city"),datalist.get("zipCode"),datalist.get("postbox"));
    }
    @And("user lands on Modification Screen Add A New Address Screen with already given data$")
    public void user_lands_on_modification_screen_add_a_new_address_screen_with_already_given_data(){
        entityContactPageActions.isAddNewContactAddressPage();
    }
    @And("edits one or more fields in valid format$")
    public void edits_one_or_more_fields_in_valid_format(){
        clicks_on_unit_no();
        clicks_on_zipcode();
    }
    @And("user displayed with Successfully Edited snack bar Message$")
    public void user_displayed_with_successfully_edited_snack_bar_message() throws Exception {
        entityContactPageActions.validateEditMsg();
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
        log.debug(" develpment is in progeress");
    }

    @Then("user will prompt to ask about Delete confirmation$")
    public void user_will_prompt_to_ask_about_delete_confirmation() throws InterruptedException {
        entityContactPageActions.contactDeleteMsgValidation();
    }
}
