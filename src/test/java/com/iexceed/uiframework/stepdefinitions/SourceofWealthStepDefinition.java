package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.SourceofFundPageActions;
import com.iexceed.uiframework.steps.SourceofWealthPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.datalist;
import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.deviceConfig;

public class SourceofWealthStepDefinition extends TestBase {
    public static Logger log = LogManager.getLogger(SourceofWealthStepDefinition.class);
   SourceofWealthPageActions sourceofWealthPageActions=new SourceofWealthPageActions(deviceConfig.get("platform"));
    SourceofFundPageActions sourceofFundPageActions=new SourceofFundPageActions(deviceConfig.get("platform"));

    @And("swipes the side menu and select SourceofWealth$")
    public void swipes_the_side_menu_and_select_sourceofwealth() throws Exception {
       sourceofWealthPageActions.selectoseSourceWealthScreen();
    }
    @And("Lands on Source of Wealth screen$")
    public void lands_on_source_of_wealth_screen() throws Exception {
        sourceofWealthPageActions.isSourceWealthScreen();
    }
    @And("user is in Source of Wealth screen$")
    public void user_is_in_source_of_wealth_screen() throws Exception {
        sourceofWealthPageActions.isSourceWealthScreen();
    }
    @And("clicks Add A New Source of Wealth button$")
    public void clicks_add_a_new_source_of_wealth_button() throws Exception {
        sourceofWealthPageActions.addSourceWealth();
    }
    @Then("user lands on Add A New Source of Wealth screen$")
    public void user_lands_on_add_a_new_source_of_wealth_screen(){
     log.debug("user lands on Add A New Source of Wealth screen");
    }
    @And("clicks on Source of funds field and select the dropdown value (.+)$")
    public void clicks_on_source_of_funds_field_and_select_the_dropdown_value(String testcase)  throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        sourceofWealthPageActions.selectSourceWealth(datalist.get("SourceOfWealth"),"");
    }
    @Then("user is displayed with the selected DD value in SourceWealth field$")
    public void user_is_displayed_with_the_selected_dd_value_in_sourcewealth_field(){
       log.debug("user is displayed with the selected DD value in SourceWealth field");
    }

    @And("clicks on Please elaborate on source of wealth screen (.+)$")
    public void clicks_on_please_elaborate_on_source_of_wealth_screen(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        sourceofWealthPageActions.enterWealthReason(datalist.get("ElabrationReason"));
    }

    @Then("proper error message should display under Please elaborate on source of wealth screen$")
    public void proper_error_message_should_display_under_please_elaborate_on_source_of_wealth_screen() throws InterruptedException {
        sourceofFundPageActions.validateErrorMsg();
    }

    @Then("user redirected to Source of Wealth screen$")
    public void user_redirected_to_source_of_wealth_screen() throws Exception {
        sourceofWealthPageActions.isSourceWealthScreen();
    }
    @Then("user remains in Add A New Source of Wealth screen$")
    public void user_remains_in_add_a_new_source_of_wealth_screen(){
       log.debug("user remains in Add A New Source of Wealth screen");
    }

    @And("fills valid data in Source of wealth field and Please elaborate$")
    public void fills_valid_data_in_source_of_wealth_field_and_please_elaborate() throws Exception {
        sourceofWealthPageActions.selectSourceWealth(datalist.get("SourceOfWealth"),"");
        sourceofWealthPageActions.enterWealthReason(datalist.get("ElabrationReason"));
    }
    @And("user displayed with Successfulsource wealth snack bar Message$")
    public void user_displayed_with_successfulsource_wealth_snack_bar_message() throws InterruptedException {
        sourceofWealthPageActions.isAddSnackMsgPresent();
    }

    @And("user Details entered displayed in Source of Wealth section$")
    public void user_details_entered_displayed_in_source_of_wealth_section() throws Exception {
        sourceofWealthPageActions.isAddedDetailsPresent(datalist.get("SourceOfWealth"),datalist.get("ElabrationReason"));
    }

    @And("clicks on sourceWealth Edit button$")
    public void clicks_on_sourcewealth_edit_button() throws InterruptedException {
        sourceofFundPageActions.clickSourceFundEditBtn();
    }
    @And("user lands on Modification Screen Add A New Source of Wealth Screen with already given data$")
    public void user_lands_on_modification_screen_add_a_new_source_of_wealth_screen_with_already_given_data(){
      log.debug("user lands on Modification Screen Add A New Source of Wealth Screen with already given data");
    }

    @And("edits one or more fields source wealth screen in valid format$")
    public void edits_one_or_more_fields_source_wealth_screen_in_valid_format() throws Exception {
        sourceofWealthPageActions.selectSourceWealth(datalist.get("SourceOfWealth"),"edit");
        sourceofWealthPageActions.enterWealthReason(datalist.get("ElabrationReason"));
    }
    @And("user displayed with source wealth Successfully Edited snack bar Message$")
    public void user_displayed_with_source_wealth_successfully_edited_snack_bar_message() throws Exception {
        sourceofWealthPageActions.isEditSnackMsgPresent();
    }
    @Then("user displayed with edited values in Source of Wealth details screen$")
    public void user_displayed_with_edited_values_in_source_of_wealth_details_screen() throws Exception {
        user_details_entered_displayed_in_source_of_wealth_section();
    }
    @And("clicks on source wealth delete icon$")
    public void clicks_on_source_wealth_delete_icon() throws InterruptedException {
        sourceofFundPageActions.clickSourceFundDeleteIcon();
    }
    @Then("Source of Wealth is removed from the list$")
    public void source_of_wealth_is_removed_from_the_list() throws Exception {
        user_details_entered_displayed_in_source_of_wealth_section();
    }
    @Then("Source of Wealth is not removed from the list$")
    public void source_of_wealth_is_not_removed_from_the_list() throws Exception {
        user_details_entered_displayed_in_source_of_wealth_section();
    }

    @Then("user remains in Source of Wealth screen$")
    public void user_remains_in_source_of_wealth_screen() throws Exception {
        sourceofWealthPageActions.isSourceWealthScreen();
    }
    @Then("user lands on Product user management screen$")
    public void user_lands_on_product_user_management_screen() throws InterruptedException {
    log.debug("user lands on Product & user management screen");
    Thread.sleep(2000);
    }
}


