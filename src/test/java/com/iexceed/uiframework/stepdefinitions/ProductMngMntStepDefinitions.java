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
    public void user_clicks_confirm() throws InterruptedException {
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
        productUserMngMntPageActions.enteraccName(datalist.get("accName"));
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

}




