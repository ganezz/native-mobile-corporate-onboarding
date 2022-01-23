@regression_apps @regressionIOSHomePage
Feature: Validating buttons in Home screen of APZ_NMCO_ONB

  Background: User should able to open App
    Given user opens the App batch5

  @1
  Scenario Outline:  Validate Register button
    And user in Home screen <testcase>

    Examples:
      | testcase     |
      | TestCase_000 |
