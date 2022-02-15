package com.iexceed.uiframework.stepdefinitions;

import com.iexceed.uiframework.core.TestBase;
import com.iexceed.uiframework.steps.IndustryPageActions;
import com.iexceed.uiframework.utilites.readexcel.ExcelHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.datalist;
import static com.iexceed.uiframework.stepdefinitions.LoginPageDefinitions.deviceConfig;

public class IndustryStepDefinition extends TestBase {
    public static Logger log = LogManager.getLogger(IndustryStepDefinition.class);
    IndustryPageActions industryPageActions=new IndustryPageActions(deviceConfig.get("platform"));

    @And("swipes the side menu and select Industry$")
    public void swipes_the_side_menu_and_select_industry() throws Exception {
        industryPageActions.isIndustryPage();
    }
    @When("user is in Industry screen (.+)$")
    public void user_is_in_industry_screen(String testcase){
        log.debug("user is in Industry screen");
    }
    @And("clicks Add A New Industry button$")
    public void clicks_add_a_new_industry_button() throws Exception {
        industryPageActions.clickAddIndustryBtn();
    }
    @Then("user lands on Add A New Industry screen$")
    public void user_lands_on_add_a_new_industry_screen() throws Exception {
        industryPageActions.isAddIndustryPage();
    }
    @And("clicks on Type of Industry field$")
    public void clicks_on_type_of_industry_field(){
        log.debug("clicks on Type of Industry field");
    }
    @And("user clicks on any one of the values (.+)$")
    public void user_clicks_on_any_one_of_the_values(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        industryPageActions.selectIndustryType(datalist.get("TypeofIndustry"));
    }
    @And("user is displayed with the selected value in Type of Industry field$")
    public void user_is_displayed_with_the_selected_value_in_type_of_industry_field(){
        log.debug("user is displayed with the selected value in Type of Industry field");
    }
    @And("selects value from Type of Industry field (.+)$")
    public void selects_value_from_type_of_industry_field(String testcase) throws Exception {
        user_clicks_on_any_one_of_the_values(testcase);
    }
    @And("clicks on Section field and choose values (.+)$")
    public void clicks_on_section_field_and_choose_values(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        industryPageActions.selectSection(datalist.get("Section"));
    }
    @And("user is displayed with the selected value in Section field$")
    public void user_is_displayed_with_the_selected_value_in_section_field(){
       log.debug("user is displayed with the selected value in Section field");
    }
    @And("selects value from Type of Section field (.+)$")
    public void selects_value_from_type_of_section_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        industryPageActions.selectSection(datalist.get("Section"));
    }
    @And("clicks on Division field and choose the values (.+)$")
    public void clicks_on_division_field_and_choose_the_values(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        industryPageActions.selectDivision(datalist.get("Division"));
    }
    @And("user is displayed with the selected value in Division field$")
    public void user_is_displayed_with_the_selected_value_in_division_field(){
      log.debug("user is displayed with the selected value in Division field");
    }
    @And("selects value from Division field (.+)$")
    public void selects_value_from_division_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        industryPageActions.selectDivision(datalist.get("Division"));
    }
    @And("clicks on Group field and choose the values (.+)$")
    public void clicks_on_group_field_and_choose_the_values(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        industryPageActions.selectGroup(datalist.get("Group"));
    }
    @And("user is displayed with the selected value in Group field$")
    public void user_is_displayed_with_the_selected_value_in_group_field(){
        log.debug("user is displayed with the selected value in Group field");
    }
    @And("selects value from Group field (.+)$")
    public void selects_value_from_group_field(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        industryPageActions.selectGroup(datalist.get("Group"));
    }
    @And("clicks on Class field and choose value (.+)$")
    public void clicks_on_class_field_and_choose_value(String testcase) throws Exception {
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        industryPageActions.selectClass(datalist.get("Class"),"");
    }
    @And("user is displayed with the selected value in Class field$")
    public void user_is_displayed_with_the_selected_value_in_class_field(){
     log.debug("user is displayed with the selected value in Class field");
    }
    @And("user fills other fields$")
    public void user_fills_other_fields(){
      log.debug("user fills other fields");
    }
    @Then("user redirected to Industry screen$")
    public void user_redirected_to_industry_screen() throws Exception {
        industryPageActions.isIndustryPage();
    }
    @Then("user remains in Add A New Industry screen$")
    public void user_remains_in_add_a_new_industry_screen(){
       log.debug("user remains in Add A New Industry screen");
    }

    @And("selects value from Class field (.+)$")
    public void selects_value_from_class_field(String testcase) throws Exception {
        clicks_on_class_field_and_choose_value(testcase);
    }
    @And("fills valid data in Type of Industry, Section, Division, Group, Class (.+)$")
    public void fills_valid_data_in_type_of_industry_section_division_group_class(String testcase) throws Exception {
        selects_value_from_type_of_industry_field(testcase);
        selects_value_from_type_of_section_field(testcase);
        selects_value_from_division_field(testcase);
        selects_value_from_group_field(testcase);
        selects_value_from_class_field(testcase);
    }
    @And("user entered Industry is displayed in Industry details tab$")
    public void user_entered_industry_is_displayed_in_industry_details_tab() throws Exception {
        industryPageActions.validateEnteredDetails(datalist.get("TypeofIndustry"),datalist.get("Section"),datalist.get("Division"),datalist.get("Group"),datalist.get("Class"));
    }
    @And("user lands on Modification Screen Add A New Industry Screen with already given data$")
    public void user_lands_on_modification_screen_add_a_new_industry_screen_with_already_given_data(){
       log.debug("user lands on Modification Screen Add A New Industry Screen with already given data");
    }
    @And("edits one or more industry fields in valid data (.+)$")
    public void edits_one_or_more_industry_fields_in_valid_data(String testcase) throws Exception {
        selects_value_from_type_of_industry_field(testcase);
        selects_value_from_type_of_section_field(testcase);
        selects_value_from_division_field(testcase);
        selects_value_from_group_field(testcase);
        datalist = ExcelHandler.getTestDataInMap(props.getProperty("appSheetPath"), props.getProperty("appSheetName"), testcase);
        industryPageActions.selectClass(datalist.get("Class"),"edit");
    }
    @Then("user displayed with edited values in Industry details screen$")
    public void user_displayed_with_edited_values_in_industry_details_screen() throws Exception {
        user_entered_industry_is_displayed_in_industry_details_tab();
    }
    @And("user displayed with Successfully Edited Industry snack bar Message$")
    public void user_displayed_with_successfully_edited_industry_snack_bar_message() throws Exception {
        industryPageActions.isEditMsgPresent();
    }
    @Then("Industry is removed from the list$")
    public void industry_is_removed_from_the_list() throws Exception {
        user_displayed_with_edited_values_in_industry_details_screen();
    }
    @Then("Industry is not removed from the list$")
    public void industry_is_not_removed_from_the_list() throws Exception {
        user_displayed_with_edited_values_in_industry_details_screen();
    }
    @Then("user remains in Industry screen$")
    public void user_remains_in_industry_screen(){
        log.debug("user remains in Industry screen");
    }

    @Then("user lands on Incorporation screen$")
    public void user_lands_on_incorporation_screen(){
        log.debug("user lands on Incorporation screen");
    }
}
