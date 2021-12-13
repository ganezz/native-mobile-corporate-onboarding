package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CapabilitiesActions;
import com.iexceed.uiframework.steps.HomePageAction;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

import static com.iexceed.uiframework.broweser.pcloudyDynamicAPPLaunch.launchApp;


public class HomePageDefinition extends TestBase {

    public static Map<String, String> deviceConfig;
    public static Map<String, String> datalist;
    public static Logger log = LogManager.getLogger(HomePageDefinition.class);
    TestDataHandler testdata = new TestDataHandler();
      public static String iosAppURL;


    @Given("user opens the App (.+)$")
    public void user_open_the_app_in_device(String testcase) throws Exception {
        deviceConfig = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("deviceSheetName"), props.getProperty(testcase));
        CapabilitiesActions capabilities = new CapabilitiesActions(deviceConfig.get("platform"));
        if(deviceConfig.get("platform").equalsIgnoreCase("Android")) {
            capabilities.setCapabilities(deviceConfig.get("mode"), deviceConfig.get("platform"), deviceConfig.get("version"), deviceConfig.get("deviceName"),
                    deviceConfig.get("automationName"), deviceConfig.get("applicationName"), deviceConfig.get("maxDuration"), deviceConfig.get("noReset"), deviceConfig, props.getProperty("isTrustedDevice"));
            log.info("User Opens Application in connected device :" + deviceConfig.get("deviceName"));
            testdata.setTestDataInMap(deviceConfig);
            testdata.setTestDataInMap(datalist);
        }else{
            iosAppURL=launchApp();

            if(iosAppURL.equals(props.getProperty("iosApplicionURL")))
            {
                iosAppURL=props.getProperty("iosApplicionURL");
            }

            System.out.println(iosAppURL);
            capabilities.setCapabilities(deviceConfig.get("mode"), deviceConfig.get("platform"), deviceConfig.get("version"), deviceConfig.get("deviceName"),
                    deviceConfig.get("automationName"), iosAppURL, deviceConfig.get("maxDuration"), deviceConfig.get("noReset"), deviceConfig, props.getProperty("isTrustedDevice"));
            log.info("User Opens Application in connected device :" + deviceConfig.get("deviceName"));
            testdata.setTestDataInMap(deviceConfig);
            testdata.setTestDataInMap(datalist);
        }

    }


    @And("user in Home screen (.+)$")
    public void user_in_home_screen(String testcase) throws Exception {
        HomePageAction homePageAction = new HomePageAction();
        homePageAction.isHomePageVisible(deviceConfig.get("platform"));
        log.info("user in Home screen");
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        log.info("Test Case :" + datalist.get("TestCaseName"));
        testdata.setTestDataInMap(deviceConfig);
        testdata.setTestDataInMap(datalist);
    }

    @When("clicks Register Button$")
    public void clicks_register_button() throws Exception {
        log.info("clicks Register Button");
        HomePageAction homePageAction = new HomePageAction();
        homePageAction.clickRegUserBtn(deviceConfig.get("platform"));
    }

    @Then("user will landed on Legal Entity User Details$")
    public void user_will_landed_on_legal_entity_user_details() throws Exception {
        HomePageAction homePageAction = new HomePageAction();
        homePageAction.verifyPageNavigation(deviceConfig.get("platform"));
        log.info("user will landed on Legal Entity User Details");
        log.info("Test Case :" + datalist.get("TestCaseName"));
    }


    @When("clicks English Button$")
    public void clicks_english_button() throws InterruptedException {
        HomePageAction homePageAction = new HomePageAction();
        homePageAction.verifyLanguageAsEnglish(deviceConfig.get("platform"));
    }

    @Then("app language change to English$")
    public void app_language_change_to_english() {
        log.info("app language change to English");
        log.info("Test Case :" + datalist.get("TestCaseName"));
    }


    @When("clicks Arabic Button$")
    public void clicks_arabic_button() throws InterruptedException {
        HomePageAction homePageAction = new HomePageAction();
        homePageAction.verifyLanguageAsArabic(deviceConfig.get("platform"));
    }

    @Then("app language change to Arabic$")
    public void app_language_change_to_arabic() {
        log.info("app language change to Arabic");
        log.info("Test Case :" + datalist.get("TestCaseName"));
    }
}
