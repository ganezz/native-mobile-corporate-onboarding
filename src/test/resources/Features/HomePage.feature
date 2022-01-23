@regression_apps @regressionHomePage
Feature: Validating buttons in Home screen of APZ_NMCO_ONB

  Background: User should able to open App
    Given user opens the App batch1

  @1
  Scenario Outline:  Validate Login Credenials
    And user in Home screen <testcase>

    Examples:
      | testcase     |
      | TestCase_000 |
