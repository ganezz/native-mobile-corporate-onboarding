package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CommercialLicensePageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.datalist;
import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.deviceConfig;

public class CommercialLicenseStepDefinition extends TestBase {
    public static Logger log = LogManager.getLogger(CommercialLicenseStepDefinition.class);
    CommercialLicensePageActions commercialLicense = new CommercialLicensePageActions(deviceConfig.get("platform"));

    @And("swipes the side menu and select Commercial licence$")
    public void swipes_the_side_menu_and_select_commercial_licence() throws Exception {
        commercialLicense.isCommercialLicensePage();
    }
    @And("user is in Commercial License screen$")
    public void user_is_in_commercial_license_screen(){
        log.debug("user is in Commercial License screen");
    }
    @And("clicks on Commercial license number (.+)$")
    public void clicks_on_commercial_license_number(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        commercialLicense.fillLicenseNumber(datalist.get("LicenseNum"));
    }

    @And("user inputs invalid value$")
    public void user_inputs_invalid_value(){
      log.debug("user inputs invalid value");
    }
    @And("clicks on other field in commercial screen$")
    public void clicks_on_other_field_in_commercial_screen() throws InterruptedException {
        commercialLicense.clickotherField();
    }
    @Then("error message should be displayed under commercialLicene field$")
    public void error_message_should_be_displayed_under_commerciallicene_field() throws InterruptedException {
        commercialLicense.validateLicenseNumberErrorMsg();
    }
    @And("clicks on Commercial licence issued by (.+)$")
    public void clicks_on_commercial_licence_issued_by(String testcase) throws Exception {
        commercialLicense.fillCommercialIssuedBy(datalist.get("LicenseIssueBy"));
    }
    @Then("error message should be displayed under commercial license issuedBy field$")
    public void error_message_should_be_displayed_under_commercial_license_issuedby_field() throws InterruptedException {
        commercialLicense.validateCommercialLicenseIssueErroeMsg();
    }
    @And("clicks on Business activities$")
    public void clicks_on_business_activities() throws Exception {
        commercialLicense.fillBusinessActivity(datalist.get("BusinessActivty"));
    }
    @Then("error message should be displayed under Business activity field$")
    public void error_message_should_be_displayed_under_business_activity_field() throws Exception {
        commercialLicense.validateBuinessActivity();
    }

    @And("clicks on Commercial licence issue date and selects a past date from the calendar$")
    public void clicks_on_commercial_licence_issue_date_and_selects_a_past_date_from_the_calendar() throws Exception {
        commercialLicense.validateIssueDate();
        log.debug("user selects a past date from the calendar");
    }
    @Then("user selected date should be displayed in the field$")
    public void user_selected_date_should_be_displayed_in_the_field(){
        log.debug("user selected date should be displayed in the field");
    }
}
