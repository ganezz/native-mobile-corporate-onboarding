package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.DashboardPageAction;
import com.iexceed.uiframework.steps.HomePageAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.HomePageDefinitions.deviceConfig;

public class DashboardPageStepDefinitions extends TestBase {
    DashboardPageAction dashboardPageAction =new DashboardPageAction(deviceConfig.get("platform"));
    public static Logger log = LogManager.getLogger(DashboardPageStepDefinitions.class);

    @Then("user lands on Dashboard$")
    public void user_lands_on_dashboard() throws Exception {
        dashboardPageAction.isDashboardPage();
    }
    @And("clicks on My Applications menu$")
    public void clicks_on_my_applications_menu() throws Exception {
        dashboardPageAction.isMyapplication();
    }
    @And("clicks on Unclaimed Applications menu$")
    public void clicks_on_unclaimed_applications_menu() throws Exception {
        dashboardPageAction.isUnclaimedApplication();
    }
    @And("clicks on Completed Applications menu$")
    public void clicks_on_completed_applications_menu() throws Exception {
        dashboardPageAction.isCompletedApplication();
    }
    @And("clicks on Active Applications menu$")
    public void clicks_on_active_applications_menu() throws Exception {
        dashboardPageAction.isActiveApplication();
    }
    @Then("user is displayed with acquired 10 applications$")
    public void user_is_displayed_with_acquired_10_applications() throws Exception {
        dashboardPageAction.isTenApplicationPresent();
    }
    @And("clicks on search$")
    public void clicks_on_search() throws Exception {
        dashboardPageAction.validateSearch();
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
        HomePageAction homePageAction = new HomePageAction();
        homePageAction.verifyPageNavigation(deviceConfig.get("platform"));
    }
}
