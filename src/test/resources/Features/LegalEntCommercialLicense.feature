@regressionCommerciallicense
Feature: Validating Commercial License screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch1

  @1
  Scenario Outline: Validate Commercial licence number, mandatory field with Max 100 characters and special characters allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Commercial licence
    And user is in Commercial License screen
    And clicks on Commercial license number <testcase>
    And user inputs invalid value
    And clicks on other field in commercial screen
    Then error message should be displayed under commercialLicene field
    Examples:
      | testcase     |
      | TestCase_179 |
      | TestCase_180 |
      | TestCase_181 |
      | TestCase_182 |
      | TestCase_183 |
      | TestCase_184 |
      | TestCase_185 |
      | TestCase_186 |


  @2
  Scenario Outline: Validate Commercial licence issued by, mandatory field with Max 100 characters and special characters allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Commercial licence
    And user is in Commercial License screen
    And clicks on Commercial licence issued by <testcase>
    And user inputs invalid value
    And clicks on other field
    Then error message should be displayed under commercial license issuedBy field
    Examples:
      | testcase     |
      | TestCase_179 |
      | TestCase_180 |
      | TestCase_181 |
      | TestCase_182 |
      | TestCase_183 |
      | TestCase_184 |
      | TestCase_185 |
      | TestCase_186 |

  @3
  Scenario Outline: Validate Business activities, mandatory field with Max 100 characters and special characters allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Commercial licence
    And user is in Commercial License screen
    And clicks on Business activities
    And user inputs invalid value
    And clicks on other field
    Then error message should be displayed under Business activity field
    Examples:
      | testcase     |
      | TestCase_179 |
      | TestCase_180 |
      | TestCase_181 |
      | TestCase_182 |
      | TestCase_183 |
      | TestCase_184 |
      | TestCase_185 |
      | TestCase_186 |

  @4
  Scenario Outline: Validate Commercial licence issue date, mandatory date field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Commercial licence
    And user is in Commercial License screen
    And clicks on Commercial licence issue date and selects a past date from the calendar
    Then user selected date should be displayed in the field
    Examples:
      | testcase     |
      | TestCase_179 |
      | TestCase_185 |


  @5
  Scenario Outline: Validate Commercial licence expiry date, mandatory date field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Commercial licence
    And user is in Commercial License screen
    And clicks on Commercial licence expiry date selects a future date from the calendar
    Then user selected date should be displayed in the field
    Examples:
      | testcase     |
      | TestCase_179 |
      | TestCase_185 |


  Scenario Outline: validating Commercial License screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Commercial licence
    And user is in Commercial License screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Cancel button
    Then user remains in Commercial License screen
    Examples:
      | testcase     |
      | TestCase_179 |
      | TestCase_185 |


  Scenario Outline: validating Commercial License screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Commercial licence
    And user is in Commercial License screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Ok button
    Then user lands on Dashboard
    Examples:
      | testcase     |
      | TestCase_179 |
      | TestCase_185 |

@continue
  Scenario Outline: validating Commercial License Continue button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Commercial licence
    And user is in Commercial License screen
    And fills valid data in Commercial licence number, Commercial licence issued by, Business activities,Commercial licence issue date, Commercial licence expiry date <testcase>
    And clicks on Continue Button
    Then user lands on Source of Funds screen
    Examples:
      | testcase     |
      | TestCase_187 |
      | TestCase_188 |
