@regression_apps @regressionIOSLoginPage
Feature: Validating buttons in Login screen of APZ_NMCO_ONB

  Background: User should able to open App
    Given user opens the App batch5

  @a
  Scenario Outline:  Validate Login Credenials
    And user in Login screen <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    Examples:
      | testcase |
      | TestCase_001 |

#    @2
#  Scenario Outline:  Validate English language button
#    And user in Login screen <testcase>
#    When clicks language dropDown choose language <testcase>
#    Then app language change to English
#    Examples:
#      | testcase |
#      | TestCase_001 |
#
#      @3
#  Scenario Outline:  Validate Arabic button
#    And user in Login screen <testcase>
#    When clicks language dropDown choose language <testcase>
#    Then app language change to Arabic
#    Examples:
#      | testcase     |
#      | TestCase_0001 |
#
#
#@4
#  Scenario Outline: validating Username, mandatory Field with Max 100 characters and special characters are not allowed
#    And user in Login screen <testcase>
#    And user input invalid text in Username field <testcase>
#    And clicks on some other field
#    And click login button
#    Then error message should be displayed under Username field
#    Examples:
#      | testcase     |
#      | TestCase_159 |
#      | TestCase_160 |
#      | TestCase_158 |
#
#
#  @5
#  Scenario Outline: validating Password, mandatory Field with Max 100 characters
#    And user in Login screen <testcase>
#    And user input invalid text in Password field <testcase>
#    And clicks on some other field
#    And click login button
#    Then error message should be displayed under Password field
#    Examples:
#      | testcase     |
#      | TestCase_159 |
#      | TestCase_160 |
#      | TestCase_158 |
#
#
#    @6
#  Scenario Outline: validating theme toggle
#    And user in Login screen <testcase>
#    And clicks on theme toggle
#    Then App theme is changed to dark mode
#    Examples:
#      | testcase |
#      | TestCase_159 |
#
#
#
