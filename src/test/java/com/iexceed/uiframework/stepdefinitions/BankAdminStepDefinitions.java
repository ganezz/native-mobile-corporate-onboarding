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
        bankAdminPageActions.enterFirstNAMe(datalist.get("firstName"));
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

}

