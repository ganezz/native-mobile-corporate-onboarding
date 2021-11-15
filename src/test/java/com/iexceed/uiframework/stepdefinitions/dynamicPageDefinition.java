package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.broweser.PcloudyDynamicAPPLaunch;
import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.pageobjects.android.DynamicAPPLaunch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;


public class dynamicPageDefinition extends TestBase {

    public static Logger log = LogManager.getLogger(HomePageDefinition.class);




    @Given("user launch app using dynamic url (.+)$")
    public void user_launch_app_using_dynamic_url(String testcase) throws MalformedURLException, InterruptedException {
        DynamicAPPLaunch dynamicAPPLaunch=new DynamicAPPLaunch();
        dynamicAPPLaunch.DynamicAppCapability();
    }


    @When("launcing our app$")
    public void launcing_our_app() throws Exception {
        PcloudyDynamicAPPLaunch pcloudyDynamicAPPLaunch=new PcloudyDynamicAPPLaunch();
        pcloudyDynamicAPPLaunch.launchApp();

    }

    @When("launcing our Dynamicapp$")
    public void launcing_our_Dynamicapp() throws Exception {
        PcloudyDynamicAPPLaunch pcloudyDynamicAPPLaunch=new PcloudyDynamicAPPLaunch();
        pcloudyDynamicAPPLaunch.DynamicAppCapability();

    }
}


