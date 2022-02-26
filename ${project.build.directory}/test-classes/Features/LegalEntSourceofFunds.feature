@regressionSourceoffunds
Feature: Validating Source of funds screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch1


  @1
  Scenario Outline: Validate + Add a new source of funds Button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofFunds
    And Lands on Source of funds screen
    And clicks Add A New Source of funds button
    Then user lands on Add A New Source of funds screen
    Examples:
      | testcase     |
      | TestCase_189 |
      | TestCase_190 |

  @2
  Scenario Outline: validating Source of funds in Add A New Source of Funds screen, Drop down, Mandatory Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofFunds
    And user is in Source of Funds screen
    And clicks Add A New Source of funds button
    Then user lands on Add A New Source of funds screen
    And clicks on Source of funds field and choose dropdown value <testcase>
    Then user is displayed with the selected value in Source of funds field
    Examples:
      | testcase     |
      | TestCase_189 |
      | TestCase_190 |

  @3
  Scenario Outline: validating Country of origin for source of funds, Drop down, Mandatory Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofFunds
    And user is in Source of Funds screen
    And clicks Add A New Source of funds button
    Then user lands on Add A New Source of funds screen
    And clicks on Country of origin for source of funds field and choose the country <testcase>
    Then user is displayed with the selected value in Country of origin for source of funds field
    Examples:
      | testcase     |
      | TestCase_012 |
      | TestCase_017 |
      | TestCase_091 |
      | TestCase_092 |

  @4
  Scenario Outline: validating Please elaborate on source of funds, mandatory Field with Max 100 alphanumeric characters and special characters not allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofFunds
    And user is in Source of Funds screen
    And clicks Add A New Source of funds button
    Then user lands on Add A New Source of funds screen
    And clicks on Please elaborate on source of funds field <testcase>
    And input invalid value
    And clicks on Confirm button
    Then proper error message should display under Please elaborate on source of funds field
    Examples:
      | testcase     |
      | TestCase_191 |
      | TestCase_196 |
      | TestCase_194 |
      | TestCase_195 |

  @5
  Scenario Outline: validating Add A New Source of Funds Screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofFunds
    And user is in Source of Funds screen
    And clicks Add A New Source of funds button
    Then user lands on Add A New Source of funds screen
    And click on Cancel button
    Then user will prompt to ask about confirmation
    And click on Ok button
    Then user redirected to Source of Funds screen
    Examples:
      | testcase     |
      | TestCase_189 |
      | TestCase_190 |

  @6
  Scenario Outline: validating Add A New Source of Funds Screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofFunds
    And user is in Source of Funds screen
    And clicks Add A New Source of funds button
    Then user lands on Add A New Source of funds screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Cancel button
    Then user remains in Add A New Source of Funds screen
    Examples:
      | testcase     |
      | TestCase_189 |
      | TestCase_190 |

  @7
  Scenario Outline: validating Confirm button in Add A New Source of Funds screen
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofFunds
    And user is in Source of Funds screen
    And clicks Add A New Source of funds button
    Then user lands on Add A New Source of funds screen
    And fills valid data in Source of funds, Country of origin for source of funds, Please elaborate on source of funds fields
    And clicks on Confirm button
    Then user lands on Source of Funds screen
    And user displayed with Successful snack bar Message
    And user Details entered displayed in Source of Funds section
    Examples:
      | testcase     |
      | TestCase_192 |
      | TestCase_193 |

  @8
  Scenario Outline: validating Edit button in Source of Funds List
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofFunds
    And user is in Source of Funds screen
    And clicks Add A New Source of funds button
    Then user lands on Add A New Source of funds screen
    And fills valid data in Source of funds, Country of origin for source of funds, Please elaborate on source of funds fields
    And clicks on Confirm button
    Then user lands on Source of Funds screen
    And user Details entered displayed in Source of Funds section
    And clicks on sourcrfund Edit button
    And user lands on Modification Screen Add A New Source of funds Screen with already given data
    And edits one or more fields in source screen
    And clicks on Confirm button
    And user displayed with Successfully Edited source snack bar Message
    Then user displayed with edited values in Source of funds details screen
    Examples:
      | testcase     |
      | TestCase_192 |
      | TestCase_193 |

  @9
  Scenario Outline: validating Delete icon with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofFunds
    And user is in Source of Funds screen
    And clicks Add A New Source of funds button
    Then user lands on Add A New Source of funds screen
    And fills valid data in Source of funds, Country of origin for source of funds, Please elaborate on source of funds fields
    And clicks on Confirm button
    And user lands on Source of funds screen
    And user Details entered displayed in Source of Funds section
    And clicks on sourceFund Delete button
    And user is Displayed with Delete Prompt
    And click on Ok button
    Then Source of funds is removed from the list
    Examples:
      | testcase     |
      | TestCase_192 |
      | TestCase_193 |

  @10
  Scenario Outline: validating Delete icon with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofFunds
    And user is in Source of Funds screen
    And clicks Add A New Source of funds button
    Then user lands on Add A New Source of funds screen
    And fills valid data in Source of funds, Country of origin for source of funds, Please elaborate on source of funds fields
    And clicks on Confirm button
    And user lands on Source of funds screen
    And user Details entered displayed in Source of Funds section
    And clicks on sourceFund Delete button
    And user is Displayed with Delete Prompt
    And click on Cancel button
    Then Source of funds is not removed from the list
    Examples:
      | testcase     |
      | TestCase_192 |
      | TestCase_193 |

  @11
  Scenario Outline: validating Source of funds screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofFunds
    And user is in Source of Funds screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Cancel button
    Then user remains in Source of funds screen
    Examples:
      | testcase     |
      | TestCase_192 |
      | TestCase_193 |

  @12
  Scenario Outline: validating Source of funds screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofFunds
    And user is in Source of Funds screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Ok button
    Then user lands on Dashboard
    Examples:
      | testcase     |
      | TestCase_192 |
      | TestCase_193 |

  @13
  Scenario Outline: validating Continue button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofFunds
    And user is in Source of Funds screen
    And clicks on Continue Button
    Then user lands on Source of wealth screen
    Examples:
      | testcase     |
      | TestCase_192 |
      | TestCase_193 |