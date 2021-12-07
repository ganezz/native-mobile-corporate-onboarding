package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.EntityDetailsPageActions;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.HomePageDefinition.datalist;
import static com.iexceed.uiframework.stepdefinitions.HomePageDefinition.deviceConfig;

public class EntityDetailsPageDefinition extends TestBase {

    public static Logger log = LogManager.getLogger(HomePageDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    HomePageDefinition homePageDefinition = new HomePageDefinition();



    @And("swipes the side menu$")
    public void swipes_the_side_menu() throws Exception {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.hamBurgerSwipping();


    }

    @Then("user able to do swipe left and right side drawer menu$")
    public void user_able_to_do_swipe_left_and_right_side_drawer_menu(){

    }

    @And("clicks Add A New User button$")
    public void clicks_add_a_new_user_button() {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.clickAddNewUSerBtn();

    }

    @And("user will landed on the New User screen$")
    public void user_will_landed_on_the_new_user_screen() throws InterruptedException {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.isAddNewScreenVisible();
        log.info("user will landed on the New User screen");
    }


    @And("user input invalid Name$")
    public void user_input_invalid_name() {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.EnterUSerName(datalist.get("userName"), datalist.get("limitCheck"));

    }

    @And("clicks on some other field$")
    public void clicks_on_some_other_field() {
        log.info("clicks on some other field");
    }


    @And("clicks on Confirm button$")
    public void clicks_on_confirm_button() {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.clickCOnfirmBtn();
        log.info("user clicks on Confirm button");
    }

    @Then("proper error message should display under User Name field$")
    public void proper_error_message_should_display_under_user_name_field() throws Exception {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.verifyValidationMsg(datalist.get("expectedMsg"), datalist.get("expectedMsg1"));
        log.info("proper error message should display under User Name field");
    }

    @And("user input invalid Email Address$")
    public void user_input_invalid_email_address() throws Exception {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.EnterEmailid(datalist.get("emailId"), datalist.get("limitCheck"));

    }

    @Then("proper error message should display under email field$")
    public void proper_error_message_should_display_under_email_field() throws Exception {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.verifyValidationMsg(datalist.get("expectedMsg"), datalist.get("expectedMsg1"));
        log.info("proper error message should display under User Name field");
    }

    @And("enters all details in Add A New User screen$")
    public void enters_all_details_in_add_a_new_user_screen() throws Exception {
        user_input_invalid_name();
        user_input_invalid_email_address();

    }

    @And("user input invalid Mobile Number$")
    public void user_input_invalid_mobile_number() throws Exception {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        user_input_invalid_name();
        user_input_invalid_email_address();
        entityDetailsPageActions.enterMobNum(datalist.get("mobNum"));
        log.info("user input invalid Mobile Number");

    }

    @And("user selects Country Code$")
    public void user_selects_country_code() throws Exception {
//          entityDetailsPageActions.selectCountryCode(deviceConfig.get("platform"),datalist.get("countryCode"));
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        log.info("user selects Country Code");
        entityDetailsPageActions.enterMobNum(datalist.get("mobNum"));
    }


    @Then("user will land on User Contact Details$")
    public void user_will_land_on_user_contact_details() throws Exception {
        log.info("user will land on User Contact Details");
        HomePageDefinition homePageDefinition = new HomePageDefinition();
        homePageDefinition.user_will_landed_on_legal_entity_user_details();
    }

    @Then("proper error message should display under mobile field$")
    public void proper_error_message_should_display_under_mobile_field() throws Exception {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.verifyValidationMsg(datalist.get("expectedMsg"), datalist.get("expectedMsg1"));
        log.info("proper error message should display under mobile field");
    }

    @And("clicks Cancel in New User$")
    public void clicks_cancel_in_new_user() throws Exception {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.clickCancelBtn();
        log.info("clicks Cancel in New User");
    }


    @And("user will prompt to ask about confirmation$")
    public void user_will_prompt_to_ask_about_confirmation() throws Exception {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.YES_NO_messageConfirmantion();
        log.info("user will prompt to ask about confirmation");
    }

    @Then("user will land on Dashboard screen (.+)$")
    public void user_will_land_on_dashboard_screen(String testcase) throws Exception {
        homePageDefinition.user_in_home_screen(testcase);
        log.info("user will land on Dashboard screen ");

    }


    @Then("user will stay on User Contact Details screen$")
    public void user_will_stay_on_user_contact_details_screen() throws Exception {
        log.info("user will stay on User Contact Details screen ");
        homePageDefinition.user_will_landed_on_legal_entity_user_details();
    }

    @And("clicks Yes button (.+)$")
    public void clicks_yes_button(String testcase) throws Exception {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.ClickYesBtn();
    }

    @And("clicks No button$")
    public void clicks_no_button() throws Exception {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.ClickNOBtn();
    }

    @Then("user will stay on Add A New User screen$")
    public void user_will_stay_on_add_a_new_user_screen() throws Exception {
        homePageDefinition.user_will_landed_on_legal_entity_user_details();
    }

    @And("enters all the details in Add A New User screen$")
    public void enters_all_the_details_in_add_a_new_user_screen() throws Exception {
        user_input_invalid_name();
        user_input_invalid_email_address();
        user_selects_country_code();
    }

    @And("message will be appear on the bottom$")
    public void message_will_be_appear_on_the_bottom() throws Exception {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.validateBottomMessage();
    }

    @And("user given details will display on User Contact Details screen (.+)$")
    public void user_given_details_will_display_on_user_contact_details_screen(String testcase) throws Exception {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.validateUserDetails(datalist.get("userName"), datalist.get("emailId"), datalist.get("mobNum"));
    }


    @And("clicks Cancel button$")
    public void clicks_cancel_button() throws Exception {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.clickCancelBtn();

    }

    @And("clicks Edit button$")
    public void clicks_edit_button() {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.clickEditButton();
    }

    @And("clicks Delete button$")
    public void clicks_delete_button() {
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.clickDeleteButton();
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
        EntityDetailsPageActions entityDetailsPageActions = new EntityDetailsPageActions(deviceConfig.get("platform"));
        entityDetailsPageActions.clickcontinueBtn();
    }

    @Then("user lands on homepage dueto feaure not yet developed (.+)$")
    public void user_lands_on_homepage_dueto_feaure_not_yet_developed(String testcase) throws Exception {
        log.info("user lands on homepage dueto feaure not yet developed");
        HomePageDefinition homePageDefinition = new HomePageDefinition();
        homePageDefinition.user_in_home_screen(testcase);
    }
}


