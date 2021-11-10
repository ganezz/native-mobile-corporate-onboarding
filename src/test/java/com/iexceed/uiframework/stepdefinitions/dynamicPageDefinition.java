package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.pageobjects.android.DynamicAPPLaunch;
import com.iexceed.uiframework.steps.EntityDetailsPageActions;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;

import static com.iexceed.uiframework.stepdefinitions.HomePageDefinition.datalist;
import static com.iexceed.uiframework.stepdefinitions.HomePageDefinition.deviceConfig;

public class dynamicPageDefinition extends TestBase {

    public static Logger log = LogManager.getLogger(HomePageDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
    HomePageDefinition homePageDefinition = new HomePageDefinition();

    @Given("user launch dynamic mobile app with valid capabilities (.+)$")
    public void user_launch_dynamic_mobile_app_with_valid_capabilities(String testcase) throws MalformedURLException {
        DynamicAPPLaunch dynamicAPPLaunch=new DynamicAPPLaunch();
        dynamicAPPLaunch.DynamicAppCapability();
    }


    @When("launcing our app$")
    public void launcing_our_app() throws Exception {
        DynamicAPPLaunch dynamicAPPLaunch=new DynamicAPPLaunch();
        dynamicAPPLaunch.launchApp();

    }
}


