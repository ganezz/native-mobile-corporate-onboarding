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


  Scenario Outline: validating Source of funds in Add A New Source of Funds screen, Drop down, Mandatory Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Funds screen
    And clicks on Add A New Source of Funds button
    Then user lands on Add A New Source of Funds Screen
    And clicks on Source of funds field
    And lands on new screen with the drop down values
    And selects a value
    Then user is displayed with the selected value in Source of funds field
    And user fills other mandatory fields
    And clicks on confirm button
    Then user lands on Source of Funds screen
    Examples:
      | testcase |

  Scenario Outline: validating Country of origin for source of funds, Drop down, Mandatory Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Funds screen
    And clicks on Add A New Source of Funds button
    Then user lands on Add A New Source of Funds Screen
    And clicks on Country of origin for source of funds field
    And lands on new screen with the drop down values
    And selects a value
    Then user is displayed with the selected value in Country of origin for source of funds field
    And user fills other mandatory fields
    And clicks on confirm button
    Then user lands on Source of Funds screen
    Examples:
      | testcase |

  Scenario Outline: validating Please elaborate on source of funds, mandatory Field with Max 100 alphanumeric characters and special characters not allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Funds screen
    And clicks on Add A New Source of Funds button
    Then user lands on Add A New Source of Funds Screen
    And clicks on Please elaborate on source of funds field
    And input invalid value
    And clicks on Confirm button
    Then proper error message should display under Please elaborate on source of funds field
    Examples:
      | testcase |

  Scenario Outline: validating Add A New Source of Funds Screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Funds Screen <testcase>
    And clicks on Add A New Source of Funds button
    And user lands on Add A New Source of Funds Screen
    And clicks on Cancel Button
    And user displayed with Cancel Prompt
    And clicks on Ok button
    Then user redirected to Source of Funds screen
    Examples:
      | testcase |

  Scenario Outline: validating Add A New Source of Funds Screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Funds Screen <testcase>
    And clicks on Add A New Source of Funds button
    And user lands on Add A New Source of Funds Screen
    And clicks on Cancel Button
    And user displayed with Cancel Prompt
    And clicks on Cancel button
    Then user remains in Add A New Source of Funds screen
    Examples:
      | testcase |

  Scenario Outline: validating Confirm button in Add A New Source of Funds screen
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Funds Screen
    And clicks on Add A New Source of Funds button
    And user lands on Add A New Source of Funds Screen
    And fills valid data in Source of funds, Country of origin for source of funds, Please elaborate on source of funds fields
    And clicks on Confirm button
    Then user lands on Source of Funds screen
    And user displayed with Successful snack bar Message
    And user Details entered displayed in Source of Funds section
    Examples:
      | testcase |

  Scenario Outline: validating Edit button in Source of Wealth List
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen
    And clicks on Add A New Source of Wealth button
    And user lands on Add A New Source of Wealth Screen
    And fills valid data in Source of wealth, Please elaborate on source of wealth
    And clicks on Confirm button
    And user lands on Source of Wealth screen
    And user entered Source of Wealth is displayed in Source of Wealth details tab
    And clicks on Edit button
    And user lands on Modification Screen i.e Add A New Source of Wealth Screen with already given data
    And edits one or more fields in valid format
    And clicks on Confirm button
    And user displayed with Successfully Edited snack bar Message
    Then user displayed with edited values in Source of Wealth details screen
    Examples:
      | testcase |

  Scenario Outline: validating Delete icon with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen Screen
    And clicks on Add A New Source of Wealth button
    And user lands on Add A New Source of Wealth Screen
    And fills valid data in Source of wealth, Please elaborate on source of wealth
    And clicks on Confirm button
    And user lands on Source of Wealth screen
    And user entered Source of Wealth is displayed in Source of Wealth details tab
    And clicks on delete icon
    And user is Displayed with Delete Prompt
    And clicks on Ok button
    Then Source of Wealth is removed from the list
    Examples:
      | testcase |

  Scenario Outline: validating Delete icon with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth screen Screen
    And clicks on Add A New Source of Wealth button
    And user lands on Add A New Source of Wealth Screen
    And fills valid data in Source of wealth, Please elaborate on source of wealth
    And clicks on Confirm button
    And user lands on Source of Wealth screen
    And user entered Source of Wealth is displayed in Source of Wealth details tab
    And clicks on delete icon
    And user is Displayed with Delete Prompt
    And clicks on Cancel button
    Then Source of Wealth is not removed from the list
    Examples:
      | testcase |

  Scenario Outline: validating Source of Wealth screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth Screen
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Cancel button
    Then user remains in Source of Wealth screen
    Examples:
      | testcase |

  Scenario Outline: validating Source of Wealth screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth Screen
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Ok button
    Then user lands on Dashboard screen
    Examples:
      | testcase |

  Scenario Outline: validating Continue button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select SourceofWealth
    And user is in Source of Wealth Screen
    And add a new source of Wealth
    And clicks on Continue Button
    Then user lands on Product & user management screen
    Examples:
      | testcase |