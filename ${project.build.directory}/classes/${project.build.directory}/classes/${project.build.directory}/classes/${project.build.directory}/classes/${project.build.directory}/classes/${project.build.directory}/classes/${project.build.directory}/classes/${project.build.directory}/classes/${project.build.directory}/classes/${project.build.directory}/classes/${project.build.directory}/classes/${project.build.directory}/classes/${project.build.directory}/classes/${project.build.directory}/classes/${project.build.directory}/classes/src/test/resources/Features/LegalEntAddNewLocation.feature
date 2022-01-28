@regressionEntityAddANewLocation
Feature: Validating Add A New Location screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch1

  Scenario Outline: validating Country in Add A New Location screen, Drop down, Mandatory Field
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    Then user lands on Add A New Location screen
    And clicks on Country field
    And lands on new screen with the drop down values and search option
    And selects a value
    Then user is displayed with the selected value in Country field
    And fills valid data in Country and Type of operations fields <testcase>
    And click on Confirm button
    And user displayed with Successfully Edited location snack bar Message
    Then user displayed with edited values in Location of business operations Section
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_156 |
      | TestCase_157 |
      | TestCase_158 |

  Scenario Outline: validating Type of operations, mandatory Field with Max 100 alphanumeric characters and special characters not allowed
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    And user clicks on Type of operations field <testcase>
    And user input invalid type
    And click on Confirm button
    Then proper error message should display under Type of operations field
    Examples:
      | testcase |
      | TestCase_165 |
      | TestCase_166 |

  Scenario Outline: validating Add A New Location Screen Cancel button with Ok button
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Ok button
    Then user lands on Dashboard
    Examples:
      | testcase |

  Scenario Outline: validating Add A New Location Screen Cancel button with Cancel button
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Cancel button
    Then user remains in Business Location and Operations screen
    Examples:
      | testcase |

  Scenario Outline: validating Confirm button in Add A New Location screen
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    And fills valid data in Country and Type of operations fields <testcase>
    And click on Confirm button
    Then user lands on Add A New Location screen
    And user displayed with Successfull addded snack bar Message
    Then user displayed with edited values in Location of business operations Section
    Examples:
      | testcase |