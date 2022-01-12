@regressionEntityNameAndType
Feature: Validating Entity Name And Type screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch1
    When user opens the second menu under Entity Details


  Scenario Outline: Validate Entity Legal Name, mandatory field with Max 100 characters and special characters allowed
    When user is in Entity name & type screen <testcase>
    And clicks on Entity Legal Name field
    And user inputs invalid Name
    And enters details in other fields of Entity name and type screen
    And clicks on other field
    Then error message should be displayed under Entity name & type field
    Examples:
      | testcase |

  Scenario Outline: Validate Trade Name(s), optional field with Max 100 characters and special characters allowed
    When user is in Entity name & type screen <testcase>
    And clicks on Trade Name(s) field
    And user inputs invalid Name
    And enters details in other fields of Entity name and type screen
    And clicks on other fields
    Then error message should be displayed under Trade Name(s) field
    Examples:
      | testcase |

  Scenario Outline: Validate Previously known as, optional field with Max 100 characters and special characters allowed
    When user is in Entity name & type screen <testcase>
    And clicks on Previously known as field
    And user inputs invalid Name
    And enters details in other fields of Entity name and type screen
    And clicks on other fields
    Then error message should be displayed under Previously known as field
    Examples:
      | testcase |

  Scenario Outline: Validate Legal entity type, mandatory field with Max 100 characters and special characters allowed
    When user is in Entity name & type screen <testcase>
    And enters details in other fields of Entity name and type screen
    And clicks on the Legal entity type field
    And user lands on a new screen with a drop down list and search option
    And inputs a word
    And selects a value
    Then user is displayed with the selected value in Legal entity type field
    And clicks on Continue button
    Examples:
      | testcase |

  Scenario Outline: Validate Previously trading as, optional field with Max 100 characters and special characters allowed
    When user is in Entity name & type screen <testcase>
    And clicks on Previously trading as field
    And user inputs invalid Name
    And enters details in other fields of Entity name and type screen
    And clicks on other fields
    Then error message should be displayed under Previously trading as field
    Examples:
      | testcase |

  Scenario Outline:  Validate Cancel button in Entity name and type screen with click on Yes button
    When user is in Entity name & type screen <testcase>
    And clicks Cancel in New User
    And user will be prompted with a confirmation
    And clicks Yes button
    Then user lands on Dashboard
    Examples:
      | testcase |


  Scenario Outline:  Validate Cancel button in Entity name and type screen with click on No button
    When user is in Entity name & type screen <testcase>
    And clicks Cancel in Entity name & type screen
    And user will be prompted with a confirmation
    And clicks No button
    Then user lands on Entity name and type screen
    Examples:
      | testcase |

  Scenario Outline: Validate Continue button
    When user is in Entity name & type screen <testcase>
    And enters all mandatory fields
    And clicks on Continue Button
    Then user lands on Entity Contact information screen
    Examples:
      | testcase |
