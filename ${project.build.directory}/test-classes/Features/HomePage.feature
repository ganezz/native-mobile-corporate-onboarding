@regression_apps @regressionHomePage
Feature: Validating buttons in Home screen of APZ_NMCO_ONB

  Background: User should able to open App
    Given user opens the App batch1

  @1
  Scenario Outline:  Validate Login Credenials
    And user in Home screen <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    Examples:
      | testcase     |
      | TestCase_000 |


  Scenario Outline:  Validate English language button
    And user in Home screen <testcase>
    When clicks language dropDown choose language <testcase>
    Then app language change to English
    Examples:
      | testcase |
      | TestCase_001 |
#
#
#  Scenario Outline:  Validate Arabic button
#    And user in Home screen <testcase>
#    When clicks language dropDown choose language <testcase>
#    Then app language change to Arabic
#    Examples:
#      | testcase     |
#      | TestCase_0001 |
#
#
#
#  Scenario Outline: validating Username, mandatory Field with Max 100 characters and special characters are not allowed
#    And user in Home screen <testcase>
#    And user input invalid text in Username field
#    And clicks on some other field
#    And click login button
#    Then error message should be displayed under Username field
#    Examples:
#      | testcase |
#
#  Scenario Outline: validating Password, mandatory Field with Max 100 characters
#    When user is in Login screen<testcase>
#    And user input invalid text in Password field
#    And clicks on password view button
#    And clicks on some other field
#    And clicks on Login button
#    Then error message should be displayed under Password field
#    Examples:
#      | testcase |
#
#  Scenario Outline: validating theme toggle
#    When user is in Login screen<testcase>
#    And clicks on theme toggle
#    Then App theme is changed to dark mode
#    Examples:
#      | testcase |
#
#
#
#
