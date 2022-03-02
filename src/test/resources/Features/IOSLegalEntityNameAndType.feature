@IOSregressionEntityNameAndType
Feature: Validating Entity Name And Type screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch5
#    And user in Login screen TestCase_021
#    When clicks Register Button
#    Then user will landed on Dashboard page
#    And clicks Add A New User button
#    And user will landed on the New User screen
#    And enters all the details in Add A New User screen
#    And clicks on Confirm button
#    And message will be appear on the bottom
#    And clicks on Continue Button


  @1
  Scenario Outline: Validate Entity Legal Name, mandatory field with Max 100 characters and special characters allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select EntityNameType
    When user is in Entity name & type screen <testcase>
    And clicks on Entity Legal Name field <testcase>
    And user inputs invalid Name
    And clicks on other field
    Then error message should be displayed under Entity name & type field
    Examples:
      | testcase     |
      | TestCase_025 |
      | TestCase_026 |
      | TestCase_027 |
      | TestCase_028 |
      | TestCase_029 |
      | TestCase_030 |
      | TestCase_105 |
      | TestCase_106 |
      | TestCase_107 |
      | TestCase_108 |
      | TestCase_109 |
      | TestCase_110 |

  @2
  Scenario Outline: Validate Trade Name(s), optional field with Max 100 characters and special characters allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select EntityNameType
    When user is in Entity name & type screen <testcase>
    And clicks on Trade Name field <testcase>
    And user inputs invalid Name
    And clicks on other field
    Then error message should be displayed under Trade Name field
    Examples:
      | testcase     |
      | TestCase_031 |
      | TestCase_032 |
      | TestCase_033 |
      | TestCase_034 |
      | TestCase_035 |
      | TestCase_036 |
      | TestCase_111 |
      | TestCase_112 |
      | TestCase_113 |
      | TestCase_114 |
      | TestCase_115 |
      | TestCase_116 |

  @3
  Scenario Outline: Validate Previously known as, optional field with Max 100 characters and special characters allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select EntityNameType
    When user is in Entity name & type screen <testcase>
    And enters details in other fields of Entity name and type screen <testcase>
    And clicks on the Legal entity type field <testcase>
    And clicks on Previously known as field <testcase>
    And user inputs invalid Name
    And clicks on other field
    Then error message should be displayed under Previously known as field
    Examples:
      | testcase     |
      | TestCase_037 |
      | TestCase_038 |
      | TestCase_039 |
      | TestCase_040 |
      | TestCase_041 |
      | TestCase_042 |
      | TestCase_117 |
      | TestCase_118 |
      | TestCase_119 |
      | TestCase_120 |
      | TestCase_121 |
      | TestCase_122 |

  @4
  Scenario Outline: Validate Legal entity type, mandatory field with Max 100 characters and special characters allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select EntityNameType
    When user is in Entity name & type screen <testcase>
    And enters details in other fields of Entity name and type screen <testcase>
    And clicks on the Legal entity type field <testcase>
    And inputs a word
    And selects a value
    Then user is displayed with the selected value in Legal entity type field

    Examples:
      | testcase     |
      | TestCase_043 |
      | TestCase_123 |

  @5
  Scenario Outline: Validate Previously trading as, optional field with Max 100 characters and special characters allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select EntityNameType
    When user is in Entity name & type screen <testcase>
    And clicks on Previously trading as field <testcase>
    And user inputs invalid Name
    And clicks on other field
    Then error message should be displayed under Previously trading as field
    Examples:
      | testcase     |
      | TestCase_044 |
      | TestCase_045 |
      | TestCase_046 |
      | TestCase_047 |
      | TestCase_048 |
      | TestCase_049 |
      | TestCase_123 |
      | TestCase_124 |
      | TestCase_125 |

  @6
  Scenario Outline:  Validate Cancel button in Entity name and type screen with click on Yes button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select EntityNameType
    When user is in Entity name & type screen <testcase>
    And clicks Cancel in New User
    Then user will prompt to ask about confirmation
    And clicks Yes button <testcase>
    Then user will land on Dashboard screen <testcase>
    Examples:
      | testcase     |
      | TestCase_002 |
      | TestCase_101 |

  @7
  Scenario Outline:  Validate Cancel button in Entity name and type screen with click on No button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select EntityNameType
    When user is in Entity name & type screen <testcase>
    And clicks Cancel in Entity name & type screen
    Then user will prompt to ask about confirmation
    And clicks No button
    Then user lands on Entity name and type screen
    Examples:
      | testcase     |
      | TestCase_002 |
      | TestCase_101 |

  @8
  Scenario Outline: Validate Continue button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select EntityNameType
    When user is in Entity name & type screen <testcase>
    And enters all mandatory fields <testcase>
    And clicks on Continue Button
    Then user lands on Entity Contact information screen
    Examples:
      | testcase     |
      | TestCase_050 |
