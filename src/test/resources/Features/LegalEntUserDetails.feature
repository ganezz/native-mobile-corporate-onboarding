@SanityUserDetailsScreen
Feature: Validating User Contact Details screen in NM_CO

  Background: User should able to launch App
    Given user opens the App batch2


  Scenario Outline: Validate + Add A New User Button
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Add A New User button
    Then user will landed on the New User screen
    Examples:
      | testcase |
      | TestCase_002 |

  Scenario Outline: Validate Edit button in User List
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Add A New User button
    And enters all the details in Add A New User screen
    And clicks on Confirm button
    And user will land on User Contact Details
    And clicks Edit button
    Then user will landed on the New User screen
    Examples:
      | testcase |
      | TestCase_021 |

  Scenario Outline: Validate Delete button in User List and click Yes button
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Add A New User button
    And enters all the details in Add A New User screen
    And clicks on Confirm button
    And user will land on User Contact Details
    And clicks Delete button
    Then user will prompt to ask about confirmation
    And clicks Yes button <testcase>
    And user will be deleted and removed from the list <testcase>
    Examples:
      | testcase |
      | TestCase_021 |


  Scenario Outline: Validate Delete button in User List and click No button
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Add A New User button
    And enters all the details in Add A New User screen
    And clicks on Confirm button
    And user will land on User Contact Details
    And clicks Delete button
    Then user will prompt to ask about confirmation
    And clicks No button
    And user given details will display on User Contact Details screen <testcase>
    Examples:
      | testcase |
      | TestCase_021 |


  Scenario Outline:  Validate Cancel button in Contact screen and click Yes button
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Cancel button
    Then user will prompt to ask about confirmation
    And clicks Yes button <testcase>
    Then user will land on Dashboard screen <testcase>
    Examples:
      | testcase |
      | TestCase_002 |


  Scenario Outline:  Validate Cancel button in Contact screen and click No button
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Cancel button
    Then user will prompt to ask about confirmation
    And clicks No button
    Then user will stay on User Contact Details screen
    Examples:
      | testcase |
      | TestCase_002 |


  Scenario Outline: Add New User and check the user is listed
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Add A New User button
    And user will landed on the New User screen
    And enters all the details in Add A New User screen
    And clicks on Confirm button
    And message will be appear on the bottom
    Then user will land on User Contact Details
    And user given details will display on User Contact Details screen <testcase>
    Examples:
      | testcase |
      | TestCase_021 |


  Scenario Outline: Modify User and check the modified user is listed
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Add A New User button
    And user fills all new user details
    And clicks Edit button
    And user will landed on the New User screen
    And enters all the details in Add A New User screen
    And clicks on Confirm button
    And message will be appear on the bottom
    Then user will land on User Contact Details
    And user given details will display on User Contact Details screen <testcase>
    Examples:
      | testcase |
      | TestCase_022 |


