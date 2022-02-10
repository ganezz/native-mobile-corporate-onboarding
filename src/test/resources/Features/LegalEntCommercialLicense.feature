@regressionCommerciallicense
Feature: Validating Commercial License screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch1

  Scenario Outline: Validate Commercial licence number, mandatory field with Max 100 characters and special characters allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Commercial licence
    And user is in Commercial License screen
    And clicks on Commercial license number
    And user inputs invalid value
    And enters details in other fields of Commercial license screen
    And clicks on other field
    Then error message should be displayed under Entity name & type field
    Examples:
      | testcase |

  Scenario Outline: Validate Commercial licence issued by, mandatory field with Max 100 characters and special characters allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Commercial licence
    When user clicks on seventh menu under Entity Details<testcase>
    And user is in Commercial License screen
    And clicks on Commercial licence issued by
    And user inputs invalid value
    And enters details in other fields of Commercial license screen
    And clicks on other field
    Then error message should be displayed under Entity name & type field
    Examples:
      | testcase |

  Scenario Outline: Validate Business activities, mandatory field with Max 100 characters and special characters allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Commercial licence
    When user clicks on seventh menu under Entity Details<testcase>
    And user is in Commercial License screen
    And clicks on Business activities
    And user inputs invalid value
    And enters details in other fields of Commercial license screen
    And clicks on other field
    Then error message should be displayed under Entity name & type field
    Examples:
      | testcase |

  Scenario Outline: Validate Commercial licence issue date, mandatory date field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Commercial licence
    When user clicks on seventh menu under Entity Details<testcase>
    And user is in Commercial License screen
    And clicks on Commercial licence issue date
    Then user is shown with a calendar
    And user selects a past date from the calendar
    Then user selected date should be displayed in the field
    Examples:
      | testcase |

  Scenario Outline: Validate Commercial licence expiry date, mandatory date field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Commercial licence
    When user clicks on seventh menu under Entity Details<testcase>
    And user is in Commercial License screen
    And clicks on Commercial licence expiry date
    Then user is shown with a calendar
    And user selects a future date from the calendar
    Then user selected date should be displayed in the field
    Examples:
      | testcase |

  Scenario Outline: validating Commercial License screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Commercial licence
    When user clicks on seventh menu under Entity Details <testcase>
    And user is in Commercial License Screen
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Cancel button
    Then user remains in Commercial License screen
    Examples:
      | testcase |

  Scenario Outline: validating Commercial License screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Commercial licence
    When user clicks on seventh menu under Entity Details <testcase>
    And user is in Commercial License Screen
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Ok button
    Then user lands on Dashboard screen
    Examples:
      | testcase |

  Scenario Outline: validating Commercial License Continue button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu and select Commercial licence
    When user clicks on seventh menu under Entity Details <testcase>
    And user is in Commercial License Screen
    And fills valid data in Commercial licence number, Commercial licence issued by, Business activities,Commercial licence issue date, Commercial licence expiry date
    And clicks on Continue Button
    Then user lands on Source of Funds screen
    Examples:
      | testcase |
