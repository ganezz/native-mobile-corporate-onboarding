package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.BusinessLocationPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.HomePageDefinition.datalist;
import static com.iexceed.uiframework.stepdefinitions.HomePageDefinition.deviceConfig;

public class BusinessLocationStepDefinition extends TestBase {
   BusinessLocationPageActions businessLocationPageActions=new BusinessLocationPageActions(deviceConfig.get("platform"));
    public static Logger log = LogManager.getLogger(BusinessLocationStepDefinition.class);

    @And("swipes the side menu and select Business Location$")
    public void swipes_the_side_menu_and_select_business_location() throws Exception {
        businessLocationPageActions.selectBusinessLoaction();
    }
    @When("user is in Business Location And Operations screen$")
    public void user_is_in_business_location_and_operations_screen() throws Exception {
        businessLocationPageActions.isBusinessLoactionPage();
    }
    @And("clicks on toggle$")
    public void clicks_on_toggle(){
      log.debug("click country dropdwon");
    }
    @And("user displayed with a Country of domicile dropdown field (.+)$")
    public void user_displayed_with_a_country_of_domicile_dropdown_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        businessLocationPageActions.selectCountry(datalist.get("countryCode"));
    }
    @Then("user is displayed with the selected value in Country of domicile field$")
    public void user_is_displayed_with_the_selected_value_in_country_of_domicile_field(){
        log.debug("user is displayed with the selected value in Country of domicile field");
    }
}
