package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.DashboardPageAction;
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
}
