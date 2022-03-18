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
    @And("user inputs invalid value$")
    public void user_inputs_invalid_value(){
        log.debug("user inputs invalid value");
    }
    @Then("error message should be displayed under First name field$")
    public void error_message_should_be_displayed_under_first_name_field(){
      log.debug("error message should be displayed under First name field");
    }
}

