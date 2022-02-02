package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.DashboardPageAction;
import com.iexceed.uiframework.steps.LoginPageAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.deviceConfig;

public class DashboardPageStepDefinitions extends TestBase {
    DashboardPageAction DashboardPageAction =new DashboardPageAction(deviceConfig.get("platform"));
    public static Logger log = LogManager.getLogger(DashboardPageStepDefinitions.class);

    @Then("user lands on Dashboard$")
    public void user_lands_on_dashboard() throws Exception {
        DashboardPageAction.isDashboardPage();
    }
    @And("clicks on Next page button$")
    public void clicks_on_next_page_button() throws Exception {
        DashboardPageAction.nextPageArrownav();
    }
    @Then("user is displayed with the next 10 set of applications$")
    public void user_is_displayed_with_the_next_10_set_of_applications(){
        log.debug("user is displayed with the next 10 set of applications");
    }
    @Then("user is displayed with 10 set of applications$")
    public void user_is_displayed_with_10_set_of_applications() throws Exception {
        log.debug("user is displayed with the next 10 set of applications");
    }
    @And("clicks on previous page button$")
    public void clicks_on_previous_page_button() throws Exception {
        DashboardPageAction.PreviousPageArrownav();
    }
    @Then("user is displayed with previous 10 set of applications$")
    public void user_is_displayed_with_previous_10_set_of_applications() throws Exception {
        log.debug("user is displayed with the next 10 set of applications");
    }
    @And("clicks on First page button$")
    public void clicks_on_first_page_button() throws Exception {
        DashboardPageAction.firstPageArrownav();
    }
    @Then("user is displayed with First 10 set of applications$")
    public void user_is_displayed_with_first_10_set_of_applications() throws Exception {
        log.debug("user is displayed with the next 10 set of applications");
    }
    @And("clicks on last page button$")
    public void clicks_on_last_page_button() throws Exception {
        DashboardPageAction.lastPageArrownav();
    }
    @Then("user is displayed with the last page and set of applications$")
    public void user_is_displayed_with_the_last_page_and_set_of_applications() throws Exception {
        log.debug("user is displayed with the next 10 set of applications");
    }

    @And("clicks on My Applications menu$")
    public void clicks_on_my_applications_menu() throws Exception {
        DashboardPageAction.isMyapplication();
    }
    @And("clicks on Unclaimed Applications menu$")
    public void clicks_on_unclaimed_applications_menu() throws Exception {
        DashboardPageAction.isUnclaimedApplication();
    }
    @And("clicks on Completed Applications menu$")
    public void clicks_on_completed_applications_menu() throws Exception {
        DashboardPageAction.isCompletedApplication();
    }
    @And("clicks on Active Applications menu$")
    public void clicks_on_active_applications_menu() throws Exception {
        DashboardPageAction.isActiveApplication();
    }
    @Then("user is displayed with acquired 10 applications$")
    public void user_is_displayed_with_acquired_10_applications() throws Exception {
        DashboardPageAction.isTenApplicationPresent();
    }
    @Then("user is displayed with Unclaimed 10 applications$")
    public void user_is_displayed_with_unclaimed_10_applications() throws Exception {
        DashboardPageAction.isTenUnclaimedApplicationPresent();
    }

    @Then("user is displayed with Completed 10 applications$")
    public void user_is_displayed_with_completed_10_applications() throws Exception {
        DashboardPageAction.isTenCompletedApplicationPresent();
    }
    @Then("^user is displayed with Active 10 applications$")
    public void user_is_displayed_with_active_10_applications() throws Exception {
        DashboardPageAction.isTenActiveApplicationPresent();
    }

    @And("clicks on search$")
    public void clicks_on_search() throws Exception {
        DashboardPageAction.validateSearch();
    }
    @Then("user is displayed with 10 applications$")
    public void user_is_displayed_with_10_applications() throws Exception {
        user_is_displayed_with_acquired_10_applications();
    }
    @And("type a valid input$")
    public void type_a_valid_input(){
        log.debug("type a valid input");
    }
    @Then("user is displayed with respective applications$")
    public void user_is_displayed_with_respective_applications(){
        log.debug("user is displayed with respective applications");
    }
    @And("clicks on Add New Application button$")
    public void clicks_on_add_new_application_button() throws Exception {
        LoginPageAction loginPageAction = new LoginPageAction();
        loginPageAction.verifyPageNavigation(deviceConfig.get("platform"));
    }
}
