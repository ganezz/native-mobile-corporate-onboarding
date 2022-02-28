@regressionSourceofWealth
Feature: Validating Source of Wealth screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch1

  Scenario Outline: Validate + Add a new source of Wealth Button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And Lands on Source of Wealth screen
    And clicks Add A New Source of Wealth button
    Then user lands on Add A New Source of Wealth screen
    Examples:
      | testcase |
      | TestCase_189 |
      | TestCase_190 |


  Scenario Outline: validating Source of funds in Add A New Source of Funds screen, Drop down, Mandatory Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen
    And clicks Add A New Source of Wealth button
    Then user lands on Add A New Source of Wealth screen
    And clicks on Source of funds field and select the dropdown value <testcase>
    Then user is displayed with the selected DD value in SourceWealth field

    Examples:
      | testcase |
      | TestCase_189 |
      | TestCase_190 |

  Scenario Outline: validating Please elaborate on source of funds, mandatory Field with Max 100 alphanumeric characters and special characters not allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen
    And clicks Add A New Source of Wealth button
    Then user lands on Add A New Source of Wealth screen
    And clicks on Please elaborate on source of wealth screen <testcase>
    And input invalid value
    And clicks on Confirm button
    Then proper error message should display under Please elaborate on source of wealth screen
    Examples:
      | testcase     |
      | TestCase_191 |
      | TestCase_196 |
      | TestCase_194 |
      | TestCase_195 |

  Scenario Outline: validating Add A New Source of Funds Screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen
    And clicks Add A New Source of Wealth button
    Then user lands on Add A New Source of Wealth screen
    And click on Cancel button
    Then user will prompt to ask about confirmation
    And click on Ok button
    Then user redirected to Source of Wealth screen
    Examples:
      | testcase |
      | TestCase_189 |
      | TestCase_190 |

  Scenario Outline: validating Add A New Source of Funds Screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen
    And clicks Add A New Source of Wealth button
    Then user lands on Add A New Source of Wealth screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Cancel button
    Then user remains in Add A New Source of Wealth screen
    Examples:
      | testcase |
      | TestCase_189 |
      | TestCase_190 |

  Scenario Outline: validating Confirm button in Add A New Source of Funds screen
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen
    And clicks Add A New Source of Wealth button
    Then user lands on Add A New Source of Wealth screen
    And fills valid data in Source of wealth field and Please elaborate
    And clicks on Confirm button
    Then user lands on Source of wealth screen
    And user displayed with Successfulsource wealth snack bar Message
    And user Details entered displayed in Source of Wealth section
    Examples:
      | testcase |
      | TestCase_192 |
      | TestCase_193 |

    @edit
  Scenario Outline: validating Edit button in Source of Wealth List
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen
    And clicks Add A New Source of Wealth button
    Then user lands on Add A New Source of Wealth screen
    And fills valid data in Source of wealth field and Please elaborate
    And clicks on Confirm button
    Then user lands on Source of wealth screen
    And user Details entered displayed in Source of Wealth section
    And clicks on sourceWealth Edit button
    And user lands on Modification Screen Add A New Source of Wealth Screen with already given data
    And edits one or more fields source wealth screen in valid format
    And clicks on Confirm button
    And user displayed with source wealth Successfully Edited snack bar Message
    Then user displayed with edited values in Source of Wealth details screen
    Examples:
      | testcase |
      | TestCase_192 |
      | TestCase_193 |

  Scenario Outline: validating Delete icon with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen
    And clicks Add A New Source of Wealth button
    Then user lands on Add A New Source of Wealth screen
    And fills valid data in Source of wealth field and Please elaborate
    And clicks on Confirm button
    Then user lands on Source of wealth screen
    And user Details entered displayed in Source of Wealth section
    And clicks on source wealth delete icon
    And user is Displayed with Delete Prompt
    And click on Ok button
    Then Source of Wealth is removed from the list
    Examples:
      | testcase |
      | TestCase_192 |
      | TestCase_193 |


  Scenario Outline: validating Delete icon with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen
    And clicks Add A New Source of Wealth button
    Then user lands on Add A New Source of Wealth screen
    And fills valid data in Source of wealth field and Please elaborate
    And clicks on Confirm button
    Then user lands on Source of wealth screen
    And user Details entered displayed in Source of Wealth section
    And clicks on source wealth delete icon
    And user is Displayed with Delete Prompt
    And click on Cancel button
    Then Source of Wealth is not removed from the list
    Examples:
      | testcase |
      | TestCase_192 |
      | TestCase_193 |


  Scenario Outline: validating Source of Wealth screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Cancel button
    Then user remains in Source of Wealth screen
    Examples:
      | testcase |
      | TestCase_192 |
      | TestCase_193 |

  Scenario Outline: validating Source of Wealth screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Ok button
    Then user lands on Dashboard
    Examples:
      | testcase |
      | TestCase_192 |
      | TestCase_193 |

  Scenario Outline: validating Continue button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen
    And clicks on Continue Button
    Then user lands on Product user management screen
    Examples:
      | testcase |
      | TestCase_192 |
      | TestCase_193 |