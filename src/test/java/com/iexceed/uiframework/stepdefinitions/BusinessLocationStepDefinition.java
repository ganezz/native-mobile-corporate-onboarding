package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.BusinessLocationPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.HomePageDefinition.datalist;
import static com.iexceed.uiframework.stepdefinitions.HomePageDefinition.deviceConfig;

public class BusinessLocationStepDefinition extends TestBase {
   BusinessLocationPageActions businessLocationPageActions=new BusinessLocationPageActions(deviceConfig.get("platform"));
    public static Logger log = LogManager.getLogger(BusinessLocationStepDefinition.class);

    @And("swipes the side menu and select Business Location$")
    public void swipes_the_side_menu_and_select_business_location() throws Exception {
        businessLocationPageActions.selectBusinessLoaction();
    }
    @When("user is in Business Location And Operations screen$")
    public void user_is_in_business_location_and_operations_screen() throws Exception {
        businessLocationPageActions.isBusinessLoactionPage();
    }
    @And("clicks on toggle$")
    public void clicks_on_toggle(){
      log.debug("click country dropdwon");
    }
    @And("user displayed with a Country of domicile dropdown field (.+)$")
    public void user_displayed_with_a_country_of_domicile_dropdown_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        businessLocationPageActions.selectCountry(datalist.get("countryCode"));
    }
    @Then("user is displayed with the selected value in Country of domicile field$")
    public void user_is_displayed_with_the_selected_value_in_country_of_domicile_field(){
        log.debug("user is displayed with the selected value in Country of domicile field");
    }
    @And("user entered Business market is displayed in Business market Section$")
    public void user_entered_business_market_is_displayed_in_business_market_section(){

        businessLocationPageActions.validateAddNewMarketField(datalist.get("countryCode"),datalist.get("proportion"));
    }
    @And("clicks Add A New Location button$")
    public void clicks_add_a_new_location_button() throws InterruptedException {
        businessLocationPageActions.addNewLocation();
    }
    @Then("user lands on Add A New Location screen$")
    public void user_lands_on_add_a_new_location_screen(){
        log.debug("user lands on Add A New Location screen");
    }
    @And("fills valid data in Country and Type of operations fields (.+)$")
    public void fills_valid_data_in_country_and_type_of_operations_fields(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        businessLocationPageActions.fillCountryandOperation(datalist.get("countryCode"),datalist.get("typeOfOperation"));
    }
    @And("fills valid data in Country and Proportion of Business fields$")
    public void fills_valid_data_in_country_and_proportion_of_business_fields() throws Exception {
        businessLocationPageActions.fillCountryandProportion(datalist.get("countryCode"),datalist.get("proportion"));
    }
    @And("user entered Location is displayed in Location of business operations Section$")
    public void user_entered_location_is_displayed_in_location_of_business_operations_section() {
        businessLocationPageActions.validateAddNewLocationField(datalist.get("countryCode"),datalist.get("typeOfOperation"));
    }
    @And("user lands on Modification Screen Add A New Location Screen with already given data$")
    public void user_lands_on_modification_screen_add_a_new_location_screen_with_already_given_data(){
       log.debug("user lands on Modification Screen Add A New Location Screen with already given data");
    }
    @And("edits one or more fields in loation screen valid format (.+)$")
    public void edits_one_or_more_fields_in_loation_screen_valid_format(String testcase) throws Exception {
        fills_valid_data_in_country_and_type_of_operations_fields(testcase);
    }
    @And("edits one or more fields in business market screen valid format (.+)$")
    public void edits_one_or_more_fields_in_business_market_screen_valid_format(String testcase) throws Exception {
        fills_valid_data_in_country_and_proportion_of_business_fields();
    }

    @And("user displayed with Successfully Edited location snack bar Message$")
    public void user_displayed_with_successfully_edited_location_snack_bar_message() throws Exception {
        businessLocationPageActions.isEditValidationMsgPresent();
    }

    @And("user displayed with Successfully Edited market snack bar Message$")
    public void user_displayed_with_successfully_edited_market_snack_bar_message() throws Exception {
        businessLocationPageActions.isEditBusinessMarketMsgPresent();
    }

    @Then("user displayed with edited values in Location of business operations Section$")
    public void user_displayed_with_edited_values_in_location_of_business_operations_section(){
        user_entered_location_is_displayed_in_location_of_business_operations_section();
    }
    @Then("Location is removed from the list$")
    public void location_is_removed_from_the_list(){
        user_entered_location_is_displayed_in_location_of_business_operations_section();
    }

    @And("user is Displayed with Delete Prompt$")
    public void user_is_displayed_with_delete_prompt() throws InterruptedException {
        businessLocationPageActions.isDeletePopupPresent();
    }
    @Then("Location is not removed from the list$")
    public void location_is_not_removed_from_the_list(){
        user_entered_location_is_displayed_in_location_of_business_operations_section();
    }
    @And("clicks Add A New Business Markets button$")
    public void clicks_add_a_new_business_markets_button() throws InterruptedException {
        businessLocationPageActions.addNewMarket();
    }
    @Then("user lands on Add A New Business Markets screen$")
    public void user_lands_on_add_a_new_business_markets_screen(){
      log.debug("user lands on Add A New Business Markets screen");
    }
    @And("user lands on Modification Screen Add A New Business market Screen with already given data$")
    public void user_lands_on_modification_screen_add_a_new_business_market_screen_with_already_given_data(){
        log.debug("user lands on Modification Screen Add A New Business market Screen with already given data");
    }
    @Then("user displayed with edited values in Business markets Section$")
    public void user_displayed_with_edited_values_in_business_markets_section(){
        user_entered_business_market_is_displayed_in_business_market_section();
    }
    @Then("Business market is removed from the list$")
    public void business_market_is_removed_from_the_list(){
        user_entered_business_market_is_displayed_in_business_market_section();
    }
}
