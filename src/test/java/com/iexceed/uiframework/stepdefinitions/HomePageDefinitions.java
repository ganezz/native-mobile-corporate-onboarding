package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.CapabilitiesActions;
import com.iexceed.uiframework.steps.HomePageAction;
import com.iexceed.uiframework.utilites.WaitUtility;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import com.iexceed.uiframework.utilites.readexcel.TestDataHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;


public class HomePageDefinitions extends TestBase {

    public static Map<String,String> deviceConfig;
    public static Map<String,String> datalist;
    public static Logger log = LogManager.getLogger(HomePageDefinitions.class);
    TestDataHandler testdata = new TestDataHandler();
    public static String iosAppURL;
    public static String androidAppURL;
    private final WaitUtility waitUtility=new WaitUtility();


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
//            androidAppURL=launchApp();
            androidAppURL="https://artifactory.appzillon.com/artifactory/android-apk/ao/automation/qaDebug-1.0.18-02-02-2022-14:23.apk";
            ExcelHandler.UpdateTestDataToExcel(props.getProperty("appSheetPath"), props.getProperty("deviceSheetName"),"oldAppURL",androidAppURL,props.getProperty(testcase));
            testdata.setTestDataInMap(deviceConfig);
          log.debug("updated url:"+deviceConfig.get("oldAppURL"));

        }else{
            waitUtility.waitForSeconds(5);
//            iosAppURL=launchApp();
            iosAppURL="http://20.80.0.230:8082/artifactory/iOS-ipa/ao/manual/QARelease-1.0.0-01-02-2022-15:09/QARelease-1.0.0-01-02-2022-15:09.ipa";
            String[] arr=iosAppURL.split("//");
            String temp1=arr[0]+"//readuser:Re@d@1234@";
            iosAppURL=temp1+arr[1];
            log.debug(iosAppURL);

            if(iosAppURL.equals(deviceConfig.get("oldAppURL")))
            {
                iosAppURL=deviceConfig.get("oldAppURL");
            }
            waitUtility.waitForSeconds(9);
            System.out.println(iosAppURL);
            capabilities.setCapabilities(deviceConfig.get("mode"), deviceConfig.get("platform"), deviceConfig.get("version"), deviceConfig.get("deviceName"),
                    deviceConfig.get("automationName"),iosAppURL , deviceConfig.get("maxDuration"), deviceConfig.get("noReset"), deviceConfig, props.getProperty("isTrustedDevice"));
            log.info("User Opens Application in connected device :" + deviceConfig.get("deviceName"));
            testdata.setTestDataInMap(deviceConfig);
            testdata.setTestDataInMap(datalist);
            ExcelHandler.UpdateTestDataToExcel(props.getProperty("appSheetPath"), props.getProperty("deviceSheetName"),"oldAppURL",androidAppURL,props.getProperty(testcase));
            testdata.setTestDataInMap(deviceConfig);
            log.debug("updated url:"+deviceConfig.get("oldAppURL"));


        }

    }

    @And("user in Home screen (.+)$")
    public void user_in_home_screen(String testcase) throws Exception {
        HomePageAction HomePageAction = new HomePageAction();
        HomePageAction.isHomePageVisible(deviceConfig.get("platform"));
        log.info("user in Home screen");
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"),testcase);
        log.info("Test Case :" + datalist.get("TestCaseName"));
        testdata.setTestDataInMap(deviceConfig);
        testdata.setTestDataInMap(datalist);

    }
    @And("user input invalid text in Username field (.+)$")
    public void user_input_invalid_text_in_username_field(String testcase) throws Exception {
        HomePageAction HomePageAction = new HomePageAction();
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"),testcase);
        HomePageAction.enterUserName(deviceConfig.get("platform"),datalist.get("userName"));
    }
    @And("user input invalid text in Password field (.+)$")
    public void user_input_invalid_text_in_password_field(String testcase){
        HomePageAction HomePageAction = new HomePageAction();
        HomePageAction.enterPassword(deviceConfig.get("platform"),datalist.get("userName"));
    }

    @Then("error message should be displayed under Username field$")
    public void error_message_should_be_displayed_under_username_field() throws InterruptedException {
        HomePageAction HomePageAction = new HomePageAction();
        HomePageAction.isUserErrorMsgPresent(deviceConfig.get("platform"));
    }

    @Then("error message should be displayed under Password field$")
    public void error_message_should_be_displayed_under_password_field() throws InterruptedException {
        HomePageAction HomePageAction = new HomePageAction();
        HomePageAction.isPasswordMsgPresent(deviceConfig.get("platform"));
    }

    @And("clicks on theme toggle$")
    public void clicks_on_theme_toggle() throws Exception {
        HomePageAction HomePageAction = new HomePageAction();
        HomePageAction.clickthemeBtn(deviceConfig.get("platform"));
    }
    @Then("App theme is changed to dark mode$")
    public void app_theme_is_changed_to_dark_mode(){
        log.debug("App theme is changed to dark mode");
    }

    @And("click login button$")
    public void click_login_button() throws Exception {
        HomePageAction HomePageAction = new HomePageAction();
        HomePageAction.login(deviceConfig.get("platform"));
    }

    @When("enter username and password (.+)$")
    public void enter_username_and_password(String testcase){
        HomePageAction HomePageAction = new HomePageAction();
        HomePageAction.validateLoginCredentials(deviceConfig.get("platform"));
    }
    @When("clicks language dropDown choose language (.+)$")
    public void clicks_language_dropdown_choose_language(String testcase) throws Exception {
        HomePageAction HomePageAction = new HomePageAction();
        HomePageAction.chooseLanguage(deviceConfig.get("platform"),datalist.get("language"));
    }


    @Then("user will landed on Dashboard page$")
    public void user_will_landed_on_dashboard_page() throws Exception {
        HomePageAction HomePageAction = new HomePageAction();
        HomePageAction.verifyPageNavigation(deviceConfig.get("platform"));
        log.info("user will landed on Legal Entity User Details");
        log.info("Test Case :" + datalist.get("TestCaseName"));
    }


    @Then("app language change to English$")
    public void app_language_change_to_english() {
        log.info("app language change to English");
        log.info("Test Case :" + datalist.get("TestCaseName"));
    }


    @Then("app language change to Arabic$")
    public void app_language_change_to_arabic() {
        log.info("app language change to Arabic");
        log.info("Test Case :" + datalist.get("TestCaseName"));
    }




}


