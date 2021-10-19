@sanityHomePage
Feature: Validating buttons in Home screen of APZ_NMCO_ONB

  Background: User should able to open App
    Given user opens the App batch3


  Scenario Outline:  Validate Register button
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    Examples:
      | testcase     |
      | TestCase_000 |


  Scenario Outline:  Validate English language button
    And user in Home screen <testcase>
    When clicks English Button
    Then app language change to English
    Examples:
      | testcase |
      | TestCase_001 |


  Scenario Outline:  Validate Arabic button
    And user in Home screen <testcase>
    When clicks Arabic Button
    Then app language change to Arabic
    Examples:
      | testcase     |
      | TestCase_002 |