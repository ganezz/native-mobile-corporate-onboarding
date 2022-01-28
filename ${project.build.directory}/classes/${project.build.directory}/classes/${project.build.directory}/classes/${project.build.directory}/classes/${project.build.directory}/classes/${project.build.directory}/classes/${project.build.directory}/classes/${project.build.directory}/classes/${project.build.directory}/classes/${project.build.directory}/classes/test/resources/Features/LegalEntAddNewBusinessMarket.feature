@regressionEntityAddANewBusinessMarket
Feature: Validating Add A New Location screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch1

  Scenario Outline: validating Country in Add A New Business Market screen, Drop down, Mandatory Field
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    And clicks on Country field
    And lands on new screen with the drop down values and search option
    And selects a value
    Then user is displayed with the selected value in Country field
    And fills valid data in Country and Proportion of Business fields
    And click on Confirm button
    And user displayed with Successfull addded Market snack bar Message
    Then user displayed with edited values in Business markets Section
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_156 |
      | TestCase_157 |
      | TestCase_158 |

  Scenario Outline: validating Proportion of Business(%), mandatory Numeric Field with limit 1 to 100
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    And user clicks Proportion of Business field
    And user input invalid number
    And clicks on Confirm button
    Then proper error message should display under proportion field
    Examples:
      | testcase |

  Scenario Outline: validating Add A New Business Market Screen Cancel button with Ok button
    When user is in Business Location And Operations Screen <testcase>
    And clicks on Add A New Business Market button
    And user lands on Add A New Business Market Screen
    And clicks on Cancel Button
    And user displayed with Cancel Prompt
    And clicks on Ok button
    Then user redirected to Business Location And Operations screen
    Examples:
      | testcase |

  Scenario Outline: validating Add A New Business Market Screen Cancel button with Cancel button
    When user is in Business Location And Operations Screen <testcase>
    And clicks on Add A New Business Market button
    And user lands on Add A New Business Market Screen
    And clicks on Cancel Button
    And user displayed with Cancel Prompt
    And clicks on Cancel button
    Then user remains in Add A New Business Market screen
    Examples:
      | testcase |

  Scenario Outline: validating Confirm button in Add A New Business Market screen
    When user is in Business Location And Operations Screen <testcase>
    And clicks on Add A New Business Market button
    And user lands on Add A New Business Market Screen
    And fills valid data in Country and  Proportion of Business(%) fields
    And clicks on Confirm button
    Then user lands on Business Location And Operations screen
    And user displayed with Successful snack bar Message
    And user Details entered displayed in Business Markets section
    Examples:
      | testcase |