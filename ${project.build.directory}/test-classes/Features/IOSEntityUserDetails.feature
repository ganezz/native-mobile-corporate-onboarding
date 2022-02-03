@regression_apps  @regressionUserDetailsScreen
Feature: Validating User Contact Details screen in NM_CO

  Background: User should able to launch App
    Given user opens the App batch5

@1
  Scenario Outline: Validate + Add A New User Button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And clicks Add A New User button
    Then user will landed on the New User screen
    Examples:
      | testcase     |
      | TestCase_002 |
      | TestCase_101 |

  @2
  Scenario Outline: Validate Search field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And clicks on search field
    Then user is shown with a editable text field with a cancel button
    And user enters text and clicks on cancel button
    Then search field becomes normal
    Examples:
      | testcase     |
      | TestCase_002 |
      | TestCase_101 |

  @3
  Scenario Outline:  Validate Search field in Arabic
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And clicks on search field
    Then user is shown with a editable text field with a cancel button
    And user enters text and clicks on cancel button
    Then search field becomes normal
    Examples:
      | testcase     |
      | TestCase_023 |

  Scenario Outline: Validate Gesture in side menu
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And swipes the side menu
    Then user able to do swipe left and right side drawer menu
    Examples:
      | testcase     |
      | TestCase_003 |
      | TestCase_102 |

@e
  Scenario Outline: Validate Edit button in User List
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And clicks Add A New User button
    And enters all the details in Add A New User screen
    And clicks on Confirm button
    And user will land on User Contact Details
    And clicks Edit button
    Then user will landed on the New User screen
    Examples:
      | testcase     |
      | TestCase_021 |
      | TestCase_103 |

  @f
  Scenario Outline: Validate Delete button in User List and click Yes button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And clicks Add A New User button
    And enters all the details in Add A New User screen
    And clicks on Confirm button
    And user will land on User Contact Details
    And clicks Delete button
    Then user will prompt to ask about confirmation
    And clicks Yes button <testcase>
    And user will be deleted and removed from the list <testcase>
    Examples:
      | testcase     |
      | TestCase_021 |
      | TestCase_103 |

@g
  Scenario Outline: Validate Delete button in User List and click No button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And clicks Add A New User button
    And enters all the details in Add A New User screen
    And clicks on Confirm button
    And user will land on User Contact Details
    And clicks Delete button
    Then user will prompt to ask about confirmation
    And clicks No button
    And user given details will display on User Contact Details screen <testcase>
    Examples:
      | testcase     |
      | TestCase_021 |
      | TestCase_103 |

  Scenario Outline:  Validate Cancel button in Contact screen and click Yes button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And clicks Cancel button
    Then user will prompt to ask about confirmation
    And clicks Yes button <testcase>
    Then user will land on Dashboard screen <testcase>
    Examples:
      | testcase     |
      | TestCase_002 |
      | TestCase_101 |


  Scenario Outline:  Validate Cancel button in Contact screen and click No button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And clicks Cancel button
    Then user will prompt to ask about confirmation
    And clicks No button
    Then user will stay on User Contact Details screen
    Examples:
      | testcase     |
      | TestCase_002 |
      | TestCase_101 |

  @aa
  Scenario Outline: Add New User and check the user is listed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
    And clicks Add A New User button
    And user will landed on the New User screen
    And enters all the details in Add A New User screen
    And clicks on Confirm button
    And message will be appear on the bottom
    Then user will land on User Contact Details
    And user given details will display on User Contact Details screen <testcase>
    Examples:
      | testcase     |
      | TestCase_021 |
      | TestCase_103 |

  @bb
  Scenario Outline: Modify User and check the modified user is listed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user will landed on Dashboard page
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
      | testcase     |
      | TestCase_022 |
      | TestCase_104 |

