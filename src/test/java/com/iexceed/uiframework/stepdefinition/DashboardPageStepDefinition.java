package com.iexceed.uiframework.stepdefinition;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.DashboardPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinition.HomePageDefinition.deviceConfig;

public class DashboardPageStepDefinition extends TestBase {
    DashboardPageActions dashboardPageActions=new DashboardPageActions(deviceConfig.get("platform"));
    public static Logger log = LogManager.getLogger(DashboardPageStepDefinition.class);

    @Then("user lands on Dashboard$")
    public void user_lands_on_dashboard() throws Exception {
        dashboardPageActions.isDashboardPage();
    }
    @And("clicks on My Applications menu$")
    public void clicks_on_my_applications_menu() throws Exception {
        dashboardPageActions.isMyapplication();
    }
    @And("clicks on Unclaimed Applications menu$")
    public void clicks_on_unclaimed_applications_menu() throws Exception {
        dashboardPageActions.isUnclaimedApplication();
    }
    @And("clicks on Completed Applications menu$")
    public void clicks_on_completed_applications_menu() throws Exception {
        dashboardPageActions.isCompletedApplication();
    }
    @And("clicks on Active Applications menu$")
    public void clicks_on_active_applications_menu() throws Exception {
        dashboardPageActions.isActiveApplication();
    }
    @Then("user is displayed with acquired 10 applications$")
    public void user_is_displayed_with_acquired_10_applications() throws Exception {
        dashboardPageActions.isTenApplicationPresent();
    }
}
