@regression_apps  @regressionUserDetailsScreen
Feature: Validating User Contact Details screen in NM_CO

  Background: User should able to launch App
    Given user opens the App batch1


  @a
  Scenario Outline: Validate Gesture in side menu
    And user in Login screen <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu
    Then user able to do swipe left and right side drawer menu
    Examples:
      | testcase     |
      | TestCase_003 |

  @b
  Scenario Outline:  Validate Arabic Gesture in side menu
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu
    Then user able to do swipe left and right side drawer menu
    Examples:
      | testcase      |
      | TestCase_0001 |

  @c
  Scenario Outline: Validate Name, mandatory Field with Max 100 characters and special characters are not allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And clicks Add A New User button
    And user will landed on the New User screen
    And user input invalid Name
    And clicks on some other field
    And clicks on Confirm button
    Then proper error message should display under User Name field
    Examples:
      | testcase     |
      | TestCase_003 |
      | TestCase_004 |
      | TestCase_005 |
      | TestCase_006 |
      | TestCase_082 |
      | TestCase_083 |
      | TestCase_084 |
      | TestCase_085 |


  @email
  Scenario Outline: Validate Email Address, mandatory Field with Max 100 characters and special characters not allowed and Case insensitive
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And clicks Add A New User button
    And user will landed on the New User screen
    And user input invalid Email Address
    And clicks on Confirm button
    Then proper error message should display under email field
    Examples:
      | testcase     |
      | TestCase_007 |
      | TestCase_008 |
      | TestCase_009 |
      | TestCase_010 |
      | TestCase_011 |
      | TestCase_086 |
      | TestCase_087 |
      | TestCase_088 |
      | TestCase_089 |
      | TestCase_090 |


  @country
  Scenario Outline: Validate Country Code, mandatory field with Drop Down
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And clicks Add A New User button
    And user will landed on the New User screen
    And enters all details in Add A New User screen
    And user selects Country Code
    Then user is displayed with the selected value in Code field
    And clicks on Confirm button
    Then user will land on User Contact Details
    Examples:
      | testcase     |
      | TestCase_012 |
      | TestCase_017 |
      | TestCase_091 |
      | TestCase_092 |


  @mob
  Scenario Outline: Validate Mobile Number, mandatory Field with Max and Min are with respect to Country Code
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And clicks Add A New User button
    And user will landed on the New User screen
    And enters all details in Add A New User screen
    And user input invalid Mobile Number
    And clicks on Confirm button
    Then proper error message should display under mobile field
    Examples:
      | testcase     |
      | TestCase_013 |
      | TestCase_014 |
      | TestCase_015 |
      | TestCase_016 |
      | TestCase_093 |
      | TestCase_094 |
      | TestCase_095 |
      | TestCase_096 |

  @yes
  Scenario Outline:  Validate Cancel button in Add A New User screen and click Yes button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And clicks Add A New User button
    And user will landed on the New User screen
    And clicks Cancel in New User
    And user will prompt to ask about confirmation
    And clicks Yes button <testcase>
    Then user will land on User Contact Details
    Examples:
      | testcase     |
      | TestCase_018 |
      | TestCase_019 |
      | TestCase_097 |
      | TestCase_098 |


  Scenario Outline:  Validate Cancel button in Add A New User screen and click No button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And clicks Add A New User button
    And user will landed on the New User screen
    And clicks Cancel in New User
    And user will prompt to ask about confirmation
    And clicks No button
    Then user will stay on Add A New User screen
    Examples:
      | testcase     |
      | TestCase_020 |
      | TestCase_099 |


  Scenario Outline: validate Confirm button in Add A New User screen
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
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
      | TestCase_100 |


  @1
  Scenario Outline: Validate + Add A New User Button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
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
    Then user lands on Dashboard
    Then click add New Application
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
    Then user lands on Dashboard
    Then click add New Application
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
    Then user lands on Dashboard
    Then click add New Application
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
    Then user lands on Dashboard
    Then click add New Application
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
    Then user lands on Dashboard
    Then click add New Application
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
    Then user lands on Dashboard
    Then click add New Application
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
    Then user lands on Dashboard
    Then click add New Application
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
    Then user lands on Dashboard
    Then click add New Application
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
    Then user lands on Dashboard
    Then click add New Application
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
    Then user lands on Dashboard
    Then click add New Application
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

    @lable
  Scenario Outline: Modify User and check the modified user is listed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And clicks Add A New User button
    And check the lable name present in the data field
      Examples:
      | testcase     |
      | TestCase_022 |


