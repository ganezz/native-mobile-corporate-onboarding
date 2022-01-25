@regressionEntityAddANewLocation
Feature: Validating Add A New Location screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the fourth menu under Entity Details

  Scenario Outline: validating Country in Add A New Location screen, Drop down, Mandatory Field
    When user is in Business Location And Operations screen <testcase>
    And clicks on Add A New Location button
    Then user lands on Add A New Location Screen
    And clicks on Country field
    And lands on new screen with the drop down values and search option
    And inputs a value
    And selects a value
    Then user is displayed with the selected value in Country field
    And user fills other mandatory fields
    And clicks on confirm button
    Then user lands on Business Location And Operations screen
    Examples:
      | testcase |

  Scenario Outline: validating Type of operations, mandatory Field with Max 100 alphanumeric characters and special characters not allowed
    When user is in Business Location And Operations screen <testcase>
    And clicks on Add A New Location button
    Then user lands on Add A New Location Screen
    And user clicks on Type of operations field
    And user input invalid type
    And clicks on Confirm button
    Then proper error message should display under Type of operations field
    Examples:
      | testcase |

  Scenario Outline: validating Add A New Location Screen Cancel button with Ok button
    When user is in Business Location And Operations Screen <testcase>
    And clicks on Add A New Location button
    And user lands on Add A New Location Screen
    And clicks on Cancel Button
    And user displayed with Cancel Prompt
    And clicks on Ok button
    Then user redirected to Business Location And Operations screen
    Examples:
      | testcase |

  Scenario Outline: validating Add A New Location Screen Cancel button with Cancel button
    When user is in Business Location And Operations Screen <testcase>
    And clicks on Add A New Location button
    And user lands on Add A New Location Screen
    And clicks on Cancel Button
    And user displayed with Cancel Prompt
    And clicks on Cancel button
    Then user remains in Add A New Location screen
    Examples:
      | testcase |

  Scenario Outline: validating Confirm button in Add A New Location screen
    When user is in Business Location And Operations Screen <testcase>
    And clicks on Add A New Location button
    And user lands on Add A New Location Screen
    And fills valid data in Country and Type of operations fields
    And clicks on Confirm button
    Then user lands on Business Location And Operations screen
    And user displayed with Successful snack bar Message
    And user Details entered displayed in Location of business operations section
    Examples:
      | testcase |