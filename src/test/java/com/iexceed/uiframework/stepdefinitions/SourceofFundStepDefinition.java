package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.SourceofFundPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.datalist;
import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.deviceConfig;

public class SourceofFundStepDefinition extends TestBase {
    public static Logger log = LogManager.getLogger(SourceofFundStepDefinition.class);
    SourceofFundPageActions sourceofFundPageActions=new SourceofFundPageActions(deviceConfig.get("platform"));

    @And("swipes the side menu and select SourceofFunds$")
    public void swipes_the_side_menu_and_select_sourceoffunds() throws Exception {
        sourceofFundPageActions.selectSourcrOfFund();
    }
    @And("Lands on Source of funds screen$")
    public void lands_on_source_of_funds_screen() throws InterruptedException {
        sourceofFundPageActions.isSourceOfFundScreen();
    }
    @And("clicks Add A New Source of funds button$")
    public void clicks_add_a_new_source_of_funds_button() throws InterruptedException {
        sourceofFundPageActions.clicAddSourceBtn();
    }
    @Then("user lands on Add A New Source of funds screen$")
    public void user_lands_on_add_a_new_source_of_funds_screen(){
        log.debug("user lands on Add A New Source of funds screen");
    }
    @And("user is in Source of Funds screen$")
    public void user_is_in_source_of_funds_screen() throws InterruptedException {
        sourceofFundPageActions.isSourceOfFundScreen();
    }
    @And("clicks on Source of funds field and choose dropdown value (.+)$")
    public void clicks_on_source_of_funds_field_and_choose_dropdown_value(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        sourceofFundPageActions.chooseSourceOfFund(datalist.get("SourceOfFunds"),"");
    }

    @Then("user is displayed with the selected value in Source of funds field$")
    public void user_is_displayed_with_the_selected_value_in_source_of_funds_field(){
        log.debug("user is displayed with the selected value in Source of funds field");
    }
    @And("clicks on Country of origin for source of funds field and choose the country (.+)$")
    public void clicks_on_country_of_origin_for_source_of_funds_field_and_choose_the_country(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        sourceofFundPageActions.chooseCountry(datalist.get("countryCode"));
    }
    @Then("user is displayed with the selected value in Country of origin for source of funds field$")
    public void user_is_displayed_with_the_selected_value_in_country_of_origin_for_source_of_funds_field(){
     log.debug("user is displayed with the selected value in Country of origin for source of funds field");
    }

    @And("clicks on Please elaborate on source of funds field (.+)$")
    public void clicks_on_please_elaborate_on_source_of_funds_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        sourceofFundPageActions.enterSourcFundReason(datalist.get("ElabrationReason"));
    }

    @And("input invalid value$")
    public void input_invalid_value(){
        log.debug("input invalid value");
    }
    @Then("proper error message should display under Please elaborate on source of funds field$")
    public void proper_error_message_should_display_under_please_elaborate_on_source_of_funds_field() throws InterruptedException {
          sourceofFundPageActions.validateErrorMsg();
    }

    @Then("user redirected to Source of Funds screen$")
    public void user_redirected_to_source_of_funds_screen() throws InterruptedException {
        sourceofFundPageActions.isSourceOfFundScreen();
    }
    @Then("user remains in Add A New Source of Funds screen$")
    public void user_remains_in_add_a_new_source_of_funds_screen() throws InterruptedException {
        sourceofFundPageActions.isAddNewSourceScreen();
    }

    @And("fills valid data in Source of funds, Country of origin for source of funds, Please elaborate on source of funds fields$")
    public void fills_valid_data_in_source_of_funds_country_of_origin_for_source_of_funds_please_elaborate_on_source_of_funds_fields() throws Exception {
        sourceofFundPageActions.chooseSourceOfFund(datalist.get("SourceOfFunds"),"");
        sourceofFundPageActions.chooseCountry(datalist.get("countryCode"));
        sourceofFundPageActions.enterSourcFundReason(datalist.get("ElabrationReason"));
    }
    @And("user displayed with Successful snack bar Message$")
    public void user_displayed_with_successful_snack_bar_message() throws InterruptedException {
        sourceofFundPageActions.snackbarMsgPresent();
    }

    @And("user Details entered displayed in Source of Funds section$")
    public void user_details_entered_displayed_in_source_of_funds_section() throws Exception {
        sourceofFundPageActions.enteredDetailsPresent(datalist.get("SourceOfFunds"),datalist.get("countryCode"),datalist.get("ElabrationReason"));
    }
    @And("user lands on Modification Screen Add A New Source of funds Screen with already given data$")
    public void user_lands_on_modification_screen_add_a_new_source_of_funds_screen_with_already_given_data() throws Exception {
       log.debug("user lands on Modification Screen Add A New Source of funds Screen with already given data$");
    }
    @And("edits one or more fields in source screen$")
    public void edits_one_or_more_fields_in_source_screen() throws Exception {
        sourceofFundPageActions.chooseSourceOfFund(datalist.get("SourceOfFunds"),"edit");
        sourceofFundPageActions.enterSourcFundReason(datalist.get("ElabrationReason"));
        sourceofFundPageActions.enterSourcFundReason(datalist.get("ElabrationReason"));
    }
    @Then("user displayed with edited values in Source of funds details screen$")
    public void user_displayed_with_edited_values_in_source_of_funds_details_screen() throws Exception {
        sourceofFundPageActions.enteredDetailsPresent(datalist.get("SourceOfFunds"),datalist.get("countryCode"),datalist.get("ElabrationReason"));
    }

    @And("user displayed with Successfully Edited source snack bar Message$")
    public void user_displayed_with_successfully_edited_source_snack_bar_message() throws Exception {
        sourceofFundPageActions.isEditSnackMsgPresent();
    }
    @And("user lands on Source of funds screen$")
    public void user_lands_on_source_of_funds_screen() throws InterruptedException {
        sourceofFundPageActions.isSourceOfFundScreen();
    }

    @Then("Source of funds is removed from the list$")
    public void source_of_funds_is_removed_from_the_list() throws Exception {
        user_displayed_with_edited_values_in_source_of_funds_details_screen();
    }
    @Then("Source of funds is not removed from the list$")
    public void source_of_funds_is_not_removed_from_the_list() throws Exception {
        user_displayed_with_edited_values_in_source_of_funds_details_screen();
    }
    @Then("user remains in Source of funds screen$")
    public void user_remains_in_source_of_funds_screen() throws InterruptedException {
        sourceofFundPageActions.isSourceOfFundScreen();
    }

    @Then("user lands on Source of wealth screen$")
    public void user_lands_on_source_of_wealth_screen(){
       log.debug("user lands on Source of wealth screen");
    }
    @And("clicks on sourcrfund Edit button$")
    public void clicks_on_sourcrfund_edit_button() throws InterruptedException {
        sourceofFundPageActions.clickSourceFundEditBtn();
    }
    @And("clicks on sourceFund Delete button$")
    public void clicks_on_sourcefund_delete_button() throws InterruptedException {
        sourceofFundPageActions.clickSourceFundDeleteIcon();
    }
}


