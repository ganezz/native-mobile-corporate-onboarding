package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.ProductUserMngMntPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.datalist;
import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.deviceConfig;

public class ProductMngMntStepDefinitions extends TestBase {
    public static Logger log = LogManager.getLogger(SourceofFundStepDefinition.class);
   ProductUserMngMntPageActions productUserMngMntPageActions=new ProductUserMngMntPageActions(deviceConfig.get("platform"));

   @And("swipes side menu and selects Product and User Management$")
    public void swipes_side_menu_and_selects_product_and_user_management() throws Exception {
       productUserMngMntPageActions.selectproductScreen();
    }

    @Then("user lands on Product Selection screen$")
    public void user_lands_on_product_selection_screen() throws InterruptedException {
        productUserMngMntPageActions.isProductScreen();
    }
    @And("clicks Add a new product button$")
    public void clicks_add_a_new_product_button() throws InterruptedException {
        productUserMngMntPageActions.addProduct();
    }
    @Then("user lands on Add A Product screen$")
    public void user_lands_on_add_a_product_screen(){
       log.debug("user lands on Add A Product screen");
    }
    @And("user clicks confirm$")
    public void user_clicks_confirm() throws Exception {
        productUserMngMntPageActions.clickConfirmBtn();
    }

    @And("clicks on Trade Finance button$")
    public void clicks_on_trade_finance_button() throws InterruptedException {
        productUserMngMntPageActions.chooseTradeFinance();
    }

    @And("Trade Finance is displayed in the Product selection screen (.+)$")
    public void trade_finance_is_displayed_in_the_product_selection_screen(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        productUserMngMntPageActions.validateTradeFinanceDetails(datalist.get("TradeFinance"));
    }
    @And("user clicks on delete button$")
    public void user_clicks_on_delete_button() throws InterruptedException {
        productUserMngMntPageActions.clickDeleteBtn();
    }
    @Then("user prompted with Trade Delete pop up$")
    public void user_prompted_with_trade_delete_pop_up() throws InterruptedException {
        productUserMngMntPageActions.isDeleteTradeMsgPresent();
    }
    @And("clicks on cancel button$")
    public void clicks_on_cancel_button() throws InterruptedException {
        productUserMngMntPageActions.clickCancelBtn();
    }
    @And("user lands on product selection screen with trade finance not being deleted$")
    public void user_lands_on_product_selection_screen_with_trade_finance_not_being_deleted(){
       log.debug("user lands on product selection screen with trade finance not being deleted");
    }
    @And("clicks on Ok button$")
    public void clicks_on_ok_button() throws InterruptedException {
        productUserMngMntPageActions.clickOkBtn();
    }
    @And("user lands on product selection screen with trade finance deleted$")
    public void user_lands_on_product_selection_screen_with_trade_finance_deleted(){
       log.debug("user lands on product selection screen with trade finance deleted");
    }
    @And("clicks Corporate account radio button$")
    public void clicks_corporate_account_radio_button(){
      log.debug("clicks Corporate account radio button");
    }
    @And("user displayed with multiple unfilled fields$")
    public void user_displayed_with_multiple_unfilled_fields(){
       log.debug("user displayed with multiple unfilled fields");
    }
    @And("clicks on Preferred operating account name field (.+)$")
    public void clicks_on_preferred_operating_account_name_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        productUserMngMntPageActions.enteraccName(datalist.get("accName"),"");
    }
    @And("clicks on other fields$")
    public void clicks_on_other_fields(){
        productUserMngMntPageActions.clickOtherField();
    }
    @Then("error message should be displayed under Preferred operating account name field$")
    public void error_message_should_be_displayed_under_preferred_operating_account_name_field() throws InterruptedException {
        productUserMngMntPageActions.isAccNameErrorMsgPresent();
    }

    @And("clicks on Purpose of account field (.+)$")
    public void clicks_on_purpose_of_account_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        productUserMngMntPageActions.selectPurposeOfAcount(datalist.get("purposeOfAccount"));
    }
    @Then("user is displayed with the selected value in Purpose of account field$")
    public void user_is_displayed_with_the_selected_value_in_purpose_of_account_field(){
       log.debug("user is displayed with the selected value in Purpose of account field");
    }
    @And("clicks on Additional details on intended use field$")
    public void clicks_on_additional_details_on_intended_use_field(){
        productUserMngMntPageActions.enterAdditionIntentFiled(datalist.get("purposeOfAccount"));
    }
    @Then("error message should be displayed under Additional details on intended use field$")
    public void error_message_should_be_displayed_under_additional_details_on_intended_use_field() throws InterruptedException {
        productUserMngMntPageActions.isAddiionFieldErrorMsgPresent();
    }

    @And("user selects Currency field (.+)$")
    public void user_selects_currency_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        productUserMngMntPageActions.selectCurrency(datalist.get("Currency"));
    }
    @Then("user is displayed with the selected value in Currency field$")
    public void user_is_displayed_with_the_selected_value_in_currency_field(){
       log.debug("user is displayed with the selected value in Currency field");
    }
    @And("clicks on Total anticipated monthly transaction turnover field (.+)$")
    public void clicks_on_total_anticipated_monthly_transaction_turnover_field(String testcase){
        productUserMngMntPageActions.moneyTurnOver(datalist.get("TurnOver"));
    }

    @Then("error message should be displayed under Total anticipated monthly transaction turnover field$")
    public void error_message_should_be_displayed_under_total_anticipated_monthly_transaction_turnover_field() throws InterruptedException {
        productUserMngMntPageActions.turnOverFieldErrorValidation();
    }
    @And("user selects Country field$")
    public void user_selects_country_field() throws Exception {
        productUserMngMntPageActions.selectCountry(datalist.get("countryCode"));
    }
    @And("clicks on Incoming transaction value per month field$")
    public void clicks_on_incoming_transaction_value_per_month_field(){
        productUserMngMntPageActions.monthIncomeTransaction(datalist.get("IncomeTransaction"));
    }
    @Then("error message should be displayed under Incoming transaction value per month field$")
    public void error_message_should_be_displayed_under_incoming_transaction_value_per_month_field() throws InterruptedException {
        productUserMngMntPageActions.incomeTransactionErrorMsgValidation();
    }
    @And("clicks on Incoming value per month field$")
    public void clicks_on_incoming_value_per_month_field(){
        productUserMngMntPageActions.monthIncomeValue(datalist.get("IncomeValue"));
    }
    @Then("error message should be displayed under Incoming value per month field$")
    public void error_message_should_be_displayed_under_incoming_value_per_month_field() throws InterruptedException {
        productUserMngMntPageActions.incomeValueErrorMsgValidation();
    }

    @And("clicks on Outgoing transaction value per month field$")
    public void clicks_on_outgoing_transaction_value_per_month_field(){
        productUserMngMntPageActions.monthOutgoingTransaction(datalist.get("OutGoingTransaction"));
    }
    @Then("error message should be displayed under Outgoing transaction value per month field$")
    public void error_message_should_be_displayed_under_outgoing_transaction_value_per_month_field() throws InterruptedException {
        productUserMngMntPageActions.OutGoingTransactionErrorMsgValidation();
    }
    @And("clicks on Outgoing value per month field$")
    public void clicks_on_outgoing_value_per_month_field(){
        productUserMngMntPageActions.monthOutgoingValue(datalist.get("OutGoingValue"));
    }
    @Then("error message should be displayed under OOutgoing value per month field$")
    public void error_message_should_be_displayed_under_ooutgoing_value_per_month_field() throws InterruptedException {
        productUserMngMntPageActions.OutGoingValueErrorMsgValidation();
    }

    @And("clicks Add another country button$")
    public void clicks_add_another_country_button() throws InterruptedException {
        productUserMngMntPageActions.addAnotherCountry();
    }
    @Then("user displayed with another set of country,Incoming transaction volume per month, Incoming value per month,Outgoing transaction volume per month, Outgoing value per month fields with same validations$")
    public void user_displayed_with_another_set_of_countryincoming_transaction_volume_per_month_incoming_value_per_monthoutgoing_transaction_volume_per_month_outgoing_value_per_month_fields_with_same_validations() {
      log.debug("user displayed with another set of country,Incoming transaction volume per month, Incoming value per month,Outgoing transaction volume per month, Outgoing value per month fields with same validations");
    }

    @Then("user redirected to Product Selection screen$")
    public void user_redirected_to_product_selection_screen(){
       log.debug("user redirected to Product Selection screen");
    }

    @Then("user remains in the same Add A Product screen$")
    public void user_remains_in_the_same_add_a_product_screen(){
       log.debug("user remains in the same Add A Product screen");
    }
    @And("fills all product management screen valid data in all the Mandatory fields$")
    public void fills_all_product_management_screen_valid_data_in_all_the_mandatory_fields() throws Exception {
        productUserMngMntPageActions.enteraccName(datalist.get("accName"),"");
        productUserMngMntPageActions.selectPurposeOfAcount(datalist.get("purposeOfAccount"));
        productUserMngMntPageActions.enterAdditionIntentFiled(datalist.get("purposeOfAccount"));
        productUserMngMntPageActions.selectCurrency(datalist.get("Currency"));
        productUserMngMntPageActions.moneyTurnOver(datalist.get("TurnOver"));
        productUserMngMntPageActions.selectCountry(datalist.get("countryCode"));
        productUserMngMntPageActions.monthIncomeTransaction(datalist.get("IncomeTransaction"));
        productUserMngMntPageActions.monthIncomeValue(datalist.get("IncomeValue"));
        productUserMngMntPageActions.monthOutgoingTransaction(datalist.get("OutGoingTransaction"));
        productUserMngMntPageActions.monthOutgoingValue(datalist.get("OutGoingValue"));
    }
    @And("user displayed with Successful product added snack bar Message$")
    public void user_displayed_with_successful_product_added_snack_bar_message() throws Exception {
        productUserMngMntPageActions.isAddedProductMsgPresent();
    }
    @And("Product Details entered is displayed in Product selection screen$")
    public void product_details_entered_is_displayed_in_product_selection_screen() throws Exception {
        productUserMngMntPageActions.addedDetailsValidation(datalist.get("accName"),datalist.get("purposeOfAccount"),datalist.get("Currency"));
    }

    @And("clicks on Product Edit button$")
    public void clicks_on_product_edit_button() throws Exception {
        productUserMngMntPageActions.clickEditBtn();
    }
    @And("user lands on Modification Screen Add a product Screen with already given data$")
    public void user_lands_on_modification_screen_add_a_product_screen_with_already_given_data(){
       log.debug("user lands on Modification Screen Add a product Screen with already given data");
    }
    @And("edits one or more fields product details in valid format$")
    public void edits_one_or_more_fields_product_details_in_valid_format(){
        productUserMngMntPageActions.enteraccName(datalist.get("accName"),"edit");
    }

    @Then("user displayed with edited values in Product selection screen$")
    public void user_displayed_with_edited_values_in_product_selection_screen(){
       log.debug("user displayed with edited values in Product selection screen");
    }
    @And("user displayed with Successfully Edited Floating Message$")
    public void user_displayed_with_successfully_edited_floating_message() throws Exception {
        productUserMngMntPageActions.isEditedSnackMsgPresent();
    }
    @And("user is Displayed with product Delete Prompt$")
    public void user_is_displayed_with_product_delete_prompt() throws Exception {
        productUserMngMntPageActions.isDeleteromtPresent();
    }
    @Then("Product is not removed from the list$")
    public void product_is_not_removed_from_the_list(){
     log.debug("Product is not removed from the list");
    }

    @Then("Product is removed from the list$")
    public void product_is_removed_from_the_list(){
       log.debug("Product is removed from the list");
    }
    @Then("user remains in Product selection screen$")
    public void user_remains_in_product_selection_screen(){
       log.debug("user remains in Product selection screen");
    }
    @Then("user lands on Administration details screen$")
    public void user_lands_on_administration_details_screen(){
       log.debug("user lands on Administration details screen");
    }

}




