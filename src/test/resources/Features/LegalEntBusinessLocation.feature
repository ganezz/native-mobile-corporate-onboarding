@regressionBusinessLocationAndOperations
Feature: Validating Business Location And Operations screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch1

  @1
  Scenario Outline: validating Is the country of domicile the same as the country of incorporation?, Mandatory Field
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks on toggle
    And user displayed with a Country of domicile dropdown field <testcase>
    And lands on new screen with the drop down values and search option
    And selects a value
    Then user is displayed with the selected value in Country of domicile field
#    And user enters valid data in other fields
#    And user clicks on confirm button
#    Then user lands on Industry screen
    Examples:
      | testcase     |
      | TestCase_012 |
      | TestCase_017 |
      | TestCase_091 |
      | TestCase_092 |

  @2
  Scenario Outline: validating + Add A New Location Button, Mandatory section
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    Then user lands on Add A New Location screen
    Examples:
      | testcase     |
      | TestCase_012 |

  @3
  Scenario Outline: validating Edit button in Location of business operations section
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    And clicks Add A New Location button
    Then user lands on Add A New Location screen
    And fills valid data in Country and Type of operations fields <testcase>
    And clicks on Confirm button
    Then user lands on Add A New Location screen
    And user entered Location is displayed in Location of business operations Section
    And clicks Edit button
    And user lands on Modification Screen Add A New Location Screen with already given data
    And edits one or more fields in loation screen valid format <testcase>
    And clicks on Confirm button
    And user displayed with Successfully Edited location snack bar Message
    Then user displayed with edited values in Location of business operations Section
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_156 |
      | TestCase_157 |
      | TestCase_158 |

  @4
  Scenario Outline: validating Delete icon of Location of business operations section with Ok button
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    Then user lands on Add A New Location screen
    And fills valid data in Country and Type of operations fields <testcase>
    And clicks on Confirm button
    Then user lands on Add A New Location screen
    And user entered Location is displayed in Location of business operations Section
    And clicks Delete button
    And user is Displayed with Delete Prompt
    And clicks Yes button <testcase>
    Then Location is removed from the list
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_157 |


  @5
  Scenario Outline: validating Delete icon of Location of business operations section with Cancel button
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    Then user lands on Add A New Location screen
    And fills valid data in Country and Type of operations fields <testcase>
    And clicks on Confirm button
    Then user lands on Add A New Location screen
    And user entered Location is displayed in Location of business operations Section
    And clicks Delete button
    And user is Displayed with Delete Prompt
    And clicks No button
    Then Location is not removed from the list
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_157 |


  @6
  Scenario Outline: validating + Add A New Business Market Button, Mandatory section
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    Examples:
      | testcase     |
      | TestCase_012 |

  Scenario Outline: validating Edit button in Business markets section
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    And fills valid data in Country and Proportion of Business fields
    And clicks on Confirm button
    When user is in Business Location And Operations screen
    And user entered Business market is displayed in Business market Section
    And clicks Edit button
    And user lands on Modification Screen Add A New Business market Screen with already given data
    And edits one or more fields in business market screen valid format <testcase>
    And clicks on Confirm button
    And user displayed with Successfully Edited market snack bar Message
    Then user displayed with edited values in Business markets Section
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_156 |
      | TestCase_157 |
      | TestCase_158 |


  Scenario Outline: validating Delete icon of Business markets section with Ok button
    When user is in Business Location And Operations screen Screen <testcase>
    And clicks on Add A New Business market button
    And user lands on Add A New Business markets Screen
    And fills valid data in Country and Proportion of Business(%) fields
    And clicks on Confirm button
    And user lands on Business Location And Operations screen
    And user entered Business markets is displayed in Business markets Section
    And clicks on delete icon
    And user is Displayed with Delete Prompt
    And clicks on Ok button
    Then Business market is removed from the list
    Examples:
      | testcase |

  Scenario Outline: validating Delete icon of Business markets section with Cancel button
    When user is in Business Location And Operations screen Screen <testcase>
    And clicks on Add A New Business market button
    And user lands on Add A New Business markets Screen
    And fills valid data in Country and Proportion of Business(%) fields
    And clicks on Confirm button
    And user lands on Business Location And Operations screen
    And user entered Business markets is displayed in Business markets Section
    And clicks on delete icon
    And user is Displayed with Delete Prompt
    And clicks on Cancel button
    Then Business market is not removed from the list
    Examples:
      | testcase |

  Scenario Outline: validating Business Location and Operations screen Cancel button with Cancel button
    When user is in Business Location and Operations Screen <testcase>
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Cancel button
    Then user remains in Business Location and Operations screen
    Examples:
      | testcase |

  Scenario Outline: validating Business Location and Operations screen Cancel button with Ok button
    When user is in Business Location and Operations Screen <testcase>
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Ok button
    Then user lands on Dashboard
    Examples:
      | testcase |

  Scenario Outline: validating Continue button
    When user is in Business Location And Operations Screen <testcase>
    And user fills all mandatory values
    And clicks on Continue Button
    Then user lands on Industry screen
    Examples:
      | testcase |