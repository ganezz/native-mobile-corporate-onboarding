@regressionBankingAdminUser
Feature: Validating Banking Admin user screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch1

  Scenario Outline: validating + Add a new administrator Button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    Examples:
      | testcase     |
      | TestCase_199 |
      | TestCase_200 |

  Scenario Outline: validating Title field, Mandatory dropdown field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Title field and selects a value <testcase>
    Then user is displayed with the selected value in Title field
    Examples:
      | testcase |
      | TestCase_215 |
      | TestCase_216 |

  Scenario Outline: validating First name, Mandatory alphabet field with Max 100 characters
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on First name field
    And user inputs invalid value
    Then error message should be displayed under First name field
    Examples:
      | testcase |
      | TestCase_215 |
      | TestCase_216 |

  Scenario Outline: validating Middle name, optional alphabet field with Max 100 characters
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Middle name field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under Middle name field
    Examples:
      | testcase |

  Scenario Outline: validating last name, Mandatory alphabet field with Max 100 characters
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on last name field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under last name field
    Examples:
      | testcase |

  Scenario Outline: validating Code field, Mandatory dropdown field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Code field
    And selects a value
    Then user is displayed with the selected value in code field
    Examples:
      | testcase |

  Scenario Outline: validating Mobile, mandatory Numeric Field with Max and Min are with respect to Country Code
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Mobile field
    And user input invalid Mobile Number
    And clicks on other fields
    Then error message should be displayed under Mobile field
    Examples:
      | testcase |

  Scenario Outline: validating Email, mandatory Field with Max 100 characters and should follow email regex and Case insensitive
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Email field
    And user input invalid Email
    And clicks on other fields
    Then error message should be displayed under Email field
    Examples:
      | testcase |

  Scenario Outline: validating Nationality / Nationalities field, Mandatory dropdown field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Nationality / Nationalities field
    And selects one or more values
    Then user is displayed with the selected values in Nationality / Nationalities field
    Examples:
      | testcase |

  Scenario Outline: Validate Date of birth, mandatory date field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Date of birth
    Then user is shown with a calendar
    And selects a past date from the calendar
    Then user selected date should be displayed in the Date of birth field
    Examples:
      | testcase |

  Scenario Outline: validating Place of birth, optional alphanumeric field with Max 100 characters
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Place of birth field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under Place of birth field
    Examples:
      | testcase |

  Scenario Outline: validating Passport number, optional alphanumeric field with Max 100 characters
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Passport number field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under Passport number field
    Examples:
      | testcase |

  Scenario Outline: Validate Passport expiry date, mandatory date field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Passport expiry date
    Then user is shown with a calendar
    And selects a future date from the calendar
    Then user selected date should be displayed in the Passport expiry date field
    Examples:
      | testcase |

  Scenario Outline: validating Passport issuing country field, Mandatory dropdown field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Passport issuing country field
    And selects a value
    Then user is displayed with the selected value in Passport issuing country field
    Examples:
      | testcase |

  Scenario Outline: validating Country of residence, Mandatory dropdown field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Country of residence field
    And selects a value
    Then user is displayed with the selected value in Country of residence field
    Examples:
      | testcase |

  Scenario Outline: validating Add a new administrator product Screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Ok button
    Then user redirected to Banking Admin user screen
    Examples:
      | testcase |

  Scenario Outline: validating Add a new administrator product Screen Cancel button with cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on cancel button
    Then user remains in the same Banking Admin user screen
    Examples:
      | testcase |

  Scenario Outline: validating Confirm button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And fills valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Banking Admin User screen
    And user displayed with Successful snack bar Message
    And Administrator details entered is displayed in Banking Admin User screen
    Examples:
      | testcase |

  Scenario Outline: validating Edit button in Banking admin user List in Banking Admin User screen
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And fills valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Banking Admin User screen
    And user displayed with Successful snack bar Message
    And Administrator details entered is displayed in Banking Admin User screen
    And clicks on Edit button
    And user lands on Modification Screen i.e Add a new administrator Screen with already given data
    And edits one or more fields in valid format
    And clicks on Confirm button
    And user displayed with Successfully Edited Floating Message
    Then user displayed with edited values in Banking Admin User screen
    Examples:
      | testcase |

  Scenario Outline: validating Delete button in Banking admin user List with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And fills valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Banking Admin User screen
    And user displayed with Successful snack bar Message
    And Administrator details entered is displayed in Banking Admin User screen
    And clicks on delete icon
    And user is Displayed with Delete Prompt
    And clicks on Cancel button
    Then Administrator details is not removed from the list
    Examples:
      | testcase |

  Scenario Outline: validating Delete button in Banking admin user List with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And fills valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Banking Admin User screen
    And user displayed with Successful snack bar Message
    And Administrator details entered is displayed in Banking Admin User screen
    And clicks on delete icon
    And user is Displayed with Delete Prompt
    And clicks on Ok button
    Then Administrator details is removed from the list
    Examples:
      | testcase |

  Scenario Outline: validating Banking admin user screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Cancel button
    Then user remains in Banking admin user screen
    Examples:
      | testcase |

  Scenario Outline: validating Banking admin user screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Ok button
    Then user lands on Dashboard screen
    Examples:
      | testcase |

  Scenario Outline: validating Banking admin user screen Continue button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user clicks Banking Admin user
    And clicks Add a new administrator button
    Then user lands on Add a new administrator screen
    And fills valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Banking Admin User screen
    And user displayed with Successful snack bar Message
    And Administrator details entered is displayed in Banking Admin User screen
    And clicks on continue button
    Then user lands on Ownership details screen
    Examples:
      | testcase |