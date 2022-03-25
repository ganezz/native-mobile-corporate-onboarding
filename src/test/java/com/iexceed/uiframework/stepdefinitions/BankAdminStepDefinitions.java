package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.BankAdminPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.datalist;
import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.deviceConfig;


public class BankAdminStepDefinitions extends TestBase {
    public static Logger log = LogManager.getLogger(BankAdminStepDefinitions.class);
    BankAdminPageActions bankAdminPageActions=new BankAdminPageActions(deviceConfig.get("platform"));


    @Then("user clicks Banking Admin user$")
    public void user_clicks_banking_admin_user() throws Exception {
        bankAdminPageActions.selectBankAdmin();
    }
    @And("clicks Add a new administrator button$")
    public void clicks_add_a_new_administrator_button() throws InterruptedException {
        bankAdminPageActions.clickAdminBtn();
    }
    @Then("user lands on Add a new administrator screen$")
    public void user_lands_on_add_a_new_administrator_screen() throws InterruptedException {
        bankAdminPageActions.isAdminScreen();
    }
    @And("clicks on Title field and selects a value (.+)$")
    public void clicks_on_title_field_and_selects_a_value(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        bankAdminPageActions.selectTitle(datalist.get("Title"));
    }
    @Then("user is displayed with the selected value in Title field$")
    public void user_is_displayed_with_the_selected_value_in_title_field(){
        log.debug("user is displayed with the selected value in Title field");
    }

    @And("clicks on First name field$")
    public void clicks_on_first_name_field(){
        bankAdminPageActions.enterFirstNAMe(datalist.get("firstName"),"");
    }

    @Then("error message should be displayed under First name field$")
    public void error_message_should_be_displayed_under_first_name_field() throws InterruptedException {
        bankAdminPageActions.isErrorMsgDisplayed();
      log.debug("error message should be displayed under First name field");
    }
    @And("clicks on Middle name field$")
    public void clicks_on_middle_name_field(){
        bankAdminPageActions.enterMiddleNAMe(datalist.get("middleNAme"));
    }
    @Then("error message should be displayed under Middle name field$")
    public void error_message_should_be_displayed_under_middle_name_field() throws InterruptedException {
        bankAdminPageActions.isErrorMsgDisplayed();
        log.debug("error message should be displayed under Middle name field");
    }

    @And("clicks on last name field$")
    public void clicks_on_last_name_field(){
        bankAdminPageActions.enterLastNAMe(datalist.get("lastNAme"));
    }

    @Then("error message should be displayed under last name field$")
    public void error_message_should_be_displayed_under_last_name_field() throws InterruptedException {
        bankAdminPageActions.isErrorMsgDisplayed();
        log.debug("error message should be displayed under Last name field");
    }
    @And("clicks on Code field and select value$")
    public void clicks_on_code_field_and_select_value() throws Exception {
        bankAdminPageActions.chooseCountryCode(datalist.get("countryCode"));
    }
    @Then("user is displayed with the selected value in code field$")
    public void user_is_displayed_with_the_selected_value_in_code_field(){
       log.debug("user is displayed with the selected value in code field");
    }
    @And("clicks on Mobile field$")
    public void clicks_on_mobile_field(){
        bankAdminPageActions.enterMobileNumber(datalist.get("mobNum"));
    }
    @Then("error message should be displayed under Mobile field$")
    public void error_message_should_be_displayed_under_mobile_field() throws InterruptedException {
        bankAdminPageActions.isErrorMsgDisplayed();
        log.debug("error message should be displayed under mobile number field");
    }

    @And("clicks on Email field$")
    public void clicks_on_email_field(){
        bankAdminPageActions.enterEmailId(datalist.get("emailId"));
    }
    @Then("error message should be displayed under Email field$")
    public void error_message_should_be_displayed_under_email_field(){
        log.debug("error message should be displayed under Email field");
    }
    @And("clicks on Nationality and select values$")
    public void clicks_on_nationality_and_select_values() throws Exception {
        bankAdminPageActions.selectNationlity(datalist.get("countryCode"));
    }
    @Then("user is displayed with the selected values in Nationality field$")
    public void user_is_displayed_with_the_selected_values_in_nationality_field(){
        log.debug("user is displayed with the selected values in Nationality field");
    }

    @And("clicks on Date of birth selects a past date from the calendar$")
    public void clicks_on_date_of_birth_selects_a_past_date_from_the_calendar() throws Exception {
        bankAdminPageActions.selectDOB();
    }
    @Then("user selected date should be displayed in the Date of birth field$")
    public void user_selected_date_should_be_displayed_in_the_date_of_birth_field(){
        log.debug("user selected date should be displayed in the Date of birth field");
    }
    @And("clicks on Place of birth field inputs invalid value$")
    public void clicks_on_place_of_birth_field_inputs_invalid_value(){
        bankAdminPageActions.enterBirthPlace(datalist.get("birthPlace"));
    }
    @Then("error message should be displayed under Place of birth field$")
    public void error_message_should_be_displayed_under_place_of_birth_field(){
        log.debug("error message should be displayed under Place of birth field");
    }
    @And("clicks on Passport number field inputs invalid value$")
    public void clicks_on_passport_number_field_inputs_invalid_value(){
        bankAdminPageActions.enterPAssportNum(datalist.get("passportNumber"));
    }
    @Then("error message should be displayed under Passport number field$")
    public void error_message_should_be_displayed_under_passport_number_field(){
        log.debug("error message should be displayed under Passport number field");
    }

    @And("clicks on Passport expiry date selects a future date from the calendar$")
    public void clicks_on_passport_expiry_date_selects_a_future_date_from_the_calendar() throws Exception {
        bankAdminPageActions.selectExpiryDate();
    }
    @Then("user selected date should be displayed in the Passport expiry date field$")
    public void user_selected_date_should_be_displayed_in_the_passport_expiry_date_field(){
        log.debug("user selected date should be displayed in the Passport expiry date field");
    }


    @And("clicks on Passport issuing country field and select a value$")
    public void clicks_on_passport_issuing_country_field_and_select_a_value()throws Exception {
        bankAdminPageActions.selectPassportIssueCountry(datalist.get("countryCode"));
    }
    @Then("user is displayed with the selected value in Passport issuing country field$")
    public void user_is_displayed_with_the_selected_value_in_passport_issuing_country_field(){
      log.debug("user is displayed with the selected value in Passport issuing country field");
    }
    @And("clicks on Country of residence field and select a value$")
    public void clicks_on_country_of_residence_field_and_select_a_value() throws Exception {
        bankAdminPageActions.selectResidencyCountry(datalist.get("countryCode"));
    }

    @Then("user is displayed with the selected value in Country of residence field$")
    public void user_is_displayed_with_the_selected_value_in_country_of_residence_field(){
        log.debug("user is displayed with the selected value in Country of residence field");
    }
    @Then("user redirected to Banking Admin user screen$")
    public void user_redirected_to_banking_admin_user_screen(){
        log.debug("user redirected to Banking Admin user screen");
    }

    @Then("user remains in the same Banking Admin user screen$")
    public void user_remains_in_the_same_banking_admin_user_screen(){
     log.debug("user remains in the same Banking Admin user screen");
    }
    @And("fills valid data in all the Mandatory fields in Bank admin screen$")
    public void fills_valid_data_in_all_the_mandatory_fields_in_bank_admin_screen() throws Exception {
        bankAdminPageActions.selectTitle(datalist.get("Title"));
        bankAdminPageActions.enterFirstNAMe(datalist.get("firstName"),"");
        bankAdminPageActions.enterMiddleNAMe(datalist.get("middleNAme"));
        bankAdminPageActions.enterLastNAMe(datalist.get("lastNAme"));
        bankAdminPageActions.chooseCountryCode(datalist.get("countryCode"));
        bankAdminPageActions.enterMobileNumber(datalist.get("mobNum"));
        bankAdminPageActions.enterEmailId(datalist.get("emailId"));
        bankAdminPageActions.selectNationlity(datalist.get("countryCode"));
        bankAdminPageActions.selectDOB();
        bankAdminPageActions.enterBirthPlace(datalist.get("birthPlace"));
        bankAdminPageActions.enterPAssportNum(datalist.get("passportNumber"));
        bankAdminPageActions.selectExpiryDate();
        bankAdminPageActions.selectPassportIssueCountry(datalist.get("countryCode"));
        bankAdminPageActions.selectResidencyCountry(datalist.get("countryCode"));
    }
    @Then("user lands on Banking Admin User screen$")
    public void user_lands_on_banking_admin_user_screen(){
        log.debug("user lands on Banking Admin User screen");
    }
    @And("user displayed with Successful bank admin snack bar Message$")
    public void user_displayed_with_successful_bank_admin_snack_bar_message() throws InterruptedException {
        bankAdminPageActions.bankAdminAddDetailsMsg();
    }

    @And("Administrator details entered is displayed in Banking Admin User screen$")
    public void administrator_details_entered_is_displayed_in_banking_admin_user_screen() throws Exception {
        bankAdminPageActions.isAddedBankAdminDetailsVisible(datalist.get("Title"),datalist.get("firstName"),datalist.get("lastNAme")
        ,datalist.get("emailId"));
    }
    @And("clicks on Edit button in bank details$")
    public void clicks_on_edit_button_in_bank_details() throws Exception {
        bankAdminPageActions.clickEditBtn();
    }
    @And("user lands on Modification Screen add a new administrator Screen with already given data$")
    public void user_lands_on_modification_screen_add_a_new_administrator_screen_with_already_given_data(){
    log.debug("user lands on Modification Screen add a new administrator Screen with already given data");
    }

    @And("edits one or more fields in bank admin screen with valid format$")
    public void edits_one_or_more_fields_in_bank_admin_screen_with_valid_format(){
        bankAdminPageActions.enterFirstNAMe(datalist.get("firstName"),"edit");
    }

    @And("user displayed with Successfully bank admin Edited Floating Message$")
    public void user_displayed_with_successfully_bank_admin_edited_floating_message() throws Exception {
        bankAdminPageActions.bankAdminEditDetailsMsg();
    }
    @Then("user displayed with edited values in Banking Admin User screen$")
    public void user_displayed_with_edited_values_in_banking_admin_user_screen(){
       log.debug("user displayed with edited values in Banking Admin User screen");
    }

    @Then("Administrator details is not removed from the list$")
    public void administrator_details_is_not_removed_from_the_list(){
        log.debug("Administrator details is not removed from the list");
    }

    @Then("Administrator details is removed from the list$")
    public void administrator_details_is_removed_from_the_list(){
     log.debug("Administrator details is removed from the list");
    }

    @Then("user remains in Banking admin user screen$")
    public void user_remains_in_banking_admin_user_screen() throws InterruptedException {
        bankAdminPageActions.isAdminScreen();
    }
    @Then("user lands on Ownership details screen$")
    public void user_lands_on_ownership_details_screen(){
        log.debug("user lands on Ownership details screen");
    }
}

