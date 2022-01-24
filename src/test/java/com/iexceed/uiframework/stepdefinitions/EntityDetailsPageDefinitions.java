package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.EntityDetailsPageAction;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.HomePageDefinitions.datalist;
import static com.iexceed.uiframework.stepdefinitions.HomePageDefinitions.deviceConfig;

public class EntityDetailsPageDefinitions extends TestBase {

    public static Logger log = LogManager.getLogger(HomePageDefinitions.class);
    TestDataHandler testdata = new TestDataHandler();
    HomePageDefinitions homePageDefinitions = new HomePageDefinitions();



    @And("swipes the side menu$")
    public void swipes_the_side_menu() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.hamBurgerSwipping();


    }

    @Then("user able to do swipe left and right side drawer menu$")
    public void user_able_to_do_swipe_left_and_right_side_drawer_menu(){

    }


    @And("clicks on search field$")
    public void clicks_on_search_field()  {
        log.info("clicks on search field");
           }

    @Then("user is shown with a editable text field with a cancel button$")
    public void user_is_shown_with_a_editable_text_field_with_a_cancel_button() throws InterruptedException {
        log.info("user is shown with a editable text field with a cancel button");
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.validateSearchField();
    }

    @And("user enters text and clicks on cancel button$")
    public void user_enters_text_and_clicks_on_cancel_button() throws InterruptedException {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.clearSearchField();

    }
    @Then("search field becomes normal$")
    public void search_field_becomes_normal(){
        log.info("search field becomes normal");
    }

    @And("clicks Add A New User button$")
    public void clicks_add_a_new_user_button() {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.clickAddNewUSerBtn();

    }

    @And("user will landed on the New User screen$")
    public void user_will_landed_on_the_new_user_screen() throws InterruptedException {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.isAddNewScreenVisible();
        log.info("user will landed on the New User screen");
    }


    @And("user input invalid Name$")
    public void user_input_invalid_name() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.EnterUSerName(datalist.get("userName"), datalist.get("limitCheck"));

    }

    @And("clicks on some other field$")
    public void clicks_on_some_other_field() {
        log.info("clicks on some other field");
    }


    @And("clicks on Confirm button$")
    public void clicks_on_confirm_button() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.clickCOnfirmBtn();
        log.info("user clicks on Confirm button");
    }

    @Then("proper error message should display under User Name field$")
    public void proper_error_message_should_display_under_user_name_field() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.verifyValidationMsg(datalist.get("expectedMsg"), datalist.get("expectedMsg1"));
        log.info("proper error message should display under User Name field");
    }

    @And("user input invalid Email Address$")
    public void user_input_invalid_email_address() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.EnterEmailid(datalist.get("emailId"), datalist.get("limitCheck"));

    }

    @Then("proper error message should display under email field$")
    public void proper_error_message_should_display_under_email_field() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.verifyValidationMsg(datalist.get("expectedMsg"), datalist.get("expectedMsg1"));
        log.info("proper error message should display under User Name field");
    }

    @And("enters all details in Add A New User screen$")
    public void enters_all_details_in_add_a_new_user_screen() throws Exception {
        user_input_invalid_name();
        user_input_invalid_email_address();

    }

    @And("user input invalid Mobile Number$")
    public void user_input_invalid_mobile_number() throws Exception {

        user_selects_country_code();
        log.info("user input invalid Mobile Number");

    }

    @And("user selects Country Code$")
    public void user_selects_country_code() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.selectCountryCode(datalist.get("countryCode"));
        log.info(" Country Code selected");
        entityDetailsPageAction.enterMobNum(datalist.get("mobNum"));
    }

    @Then("user is displayed with the selected value in Code field$")
    public void user_is_displayed_with_the_selected_value_in_code_field() {
      log.debug("user is displayed with the selected value in Code field");
    }

    @And("lands on new screen with the drop down values and search option$")
    public void lands_on_new_screen_with_the_drop_down_values_and_search_option()  {
       log.debug("lands on new screen with the drop down values and search option");
    }

    @And("selects a value$")
    public void selects_a_value() {
       log.debug("selects a value");
    }


    @Then("user will land on User Contact Details$")
    public void user_will_land_on_user_contact_details() throws Exception {
        log.info("user will land on User Contact Details");
        HomePageDefinitions homePageDefinitions = new HomePageDefinitions();
        homePageDefinitions.user_will_landed_on_dashboard_page();
    }

    @Then("proper error message should display under mobile field$")
    public void proper_error_message_should_display_under_mobile_field() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.verifyValidationMsg(datalist.get("expectedMsg"), datalist.get("expectedMsg1"));
        log.info("proper error message should display under mobile field");
    }

    @And("clicks Cancel in New User$")
    public void clicks_cancel_in_new_user() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.clickCancelBtn();
        log.info("clicks Cancel in New User");
    }


    @And("user will prompt to ask about confirmation$")
    public void user_will_prompt_to_ask_about_confirmation() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.YES_NO_messageConfirmantion();
        log.info("user will prompt to ask about confirmation");
    }

    @Then("user will land on Dashboard screen (.+)$")
    public void user_will_land_on_dashboard_screen(String testcase) throws Exception {
        homePageDefinitions.user_in_home_screen(testcase);
        log.info("user will land on Dashboard screen ");

    }


    @Then("user will stay on User Contact Details screen$")
    public void user_will_stay_on_user_contact_details_screen() throws Exception {
        log.info("user will stay on User Contact Details screen ");
        homePageDefinitions.user_will_landed_on_dashboard_page();
    }

    @And("clicks Yes button (.+)$")
    public void clicks_yes_button(String testcase) throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.ClickYesBtn();
    }

    @And("clicks No button$")
    public void clicks_no_button() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.ClickNOBtn();
    }

    @Then("user will stay on Add A New User screen$")
    public void user_will_stay_on_add_a_new_user_screen() throws Exception {
        homePageDefinitions.user_will_landed_on_dashboard_page();
    }

    @And("enters all the details in Add A New User screen$")
    public void enters_all_the_details_in_add_a_new_user_screen() throws Exception {
        user_input_invalid_name();
        user_input_invalid_email_address();
        user_selects_country_code();
    }

    @And("message will be appear on the bottom$")
    public void message_will_be_appear_on_the_bottom() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.validateBottomMessage();
    }

    @And("user given details will display on User Contact Details screen (.+)$")
    public void user_given_details_will_display_on_user_contact_details_screen(String testcase) throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.validateUserDetails(datalist.get("userName"), datalist.get("emailId"), datalist.get("mobNum"));
    }


    @And("clicks Cancel button$")
    public void clicks_cancel_button() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.clickCancelBtn();

    }

    @And("clicks Edit button$")
    public void clicks_edit_button() throws InterruptedException {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.clickEditButton();
    }

    @And("clicks Delete button$")
    public void clicks_delete_button() throws InterruptedException {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.clickDeleteButton();
    }

    @And("user will be deleted and removed from the list (.+)$")
    public void user_will_be_deleted_and_removed_from_the_list(String testcase) throws Exception {
        user_given_details_will_display_on_user_contact_details_screen(testcase);
    }

    @And("user fills all new user details$")
    public void user_fills_all_new_user_details() throws Exception {
        enters_all_the_details_in_add_a_new_user_screen();
        clicks_on_confirm_button();
        message_will_be_appear_on_the_bottom();
        user_will_land_on_user_contact_details();

    }

    @And("clicks on Continue Button$")
    public void clicks_on_continue_button() throws Exception {
        EntityDetailsPageAction entityDetailsPageAction = new EntityDetailsPageAction(deviceConfig.get("platform"));
        entityDetailsPageAction.clickcontinueBtn();
    }
    @Then("user lands on entity legal screen (.+)$")
    public void user_lands_on_entity_legal_screen(String testcase){
       log.debug("user lands on entity legal screen ");
    }



}


