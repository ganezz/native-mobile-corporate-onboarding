@sanity_apps

Feature: Validating features for User Contact Details Screen in NM_CO

  Background: User should able to open App
    Given user opens the App batch4


  Scenario Outline:  Validate Add A New Application button
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


  Scenario Outline: Validate + Add A New User Button
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Add A New User button
    And user will landed on the New User screen
    Examples:
      | testcase |
      | TestCase_003 |
      | TestCase_004 |
      | TestCase_005 |


  Scenario Outline: validating User Name field with max 100 characters,No Special characters and numeric allowed except space, Mandatory Field
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Add A New User button
    And user will landed on the New User screen
    And user input invalid Name
    And clicks on some other field
    And clicks on Confirm button
    Then proper error message should display under User Name field
    Examples:
      | testcase |
      | TestCase_003 |
      | TestCase_004 |
      | TestCase_005 |
      | TestCase_006 |

  Scenario Outline: validating Email field with max 80 characters, limited special characters only allowed, Mandatory Field
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Add A New User button
    And user will landed on the New User screen
    And user input invalid Email Address
    And clicks on Confirm button
    Then proper error message should display under email field
    Examples:
      | testcase |
      | TestCase_007 |
      | TestCase_008 |
      | TestCase_009 |
      | TestCase_010 |
      | TestCase_011 |



  Scenario Outline: validating Code field with max 5 characters, Drop down, Mandatory Field
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Add A New User button
    And user will landed on the New User screen
    And enters all details in Add A New User screen
    And user selects Country Code
    And clicks on Confirm button
    Then user will land on User Contact Details
    Examples:
      | testcase |
      | TestCase_012 |
      | TestCase_017 |


  Scenario Outline: validating Mobile field with max 20 characters, Alphabets and Special Characters not allowed, Mandatory Field
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Add A New User button
    And user will landed on the New User screen
    And enters all details in Add A New User screen
    And user input invalid Mobile Number
    And clicks on Confirm button
    Then proper error message should display under mobile field
    Examples:
      | testcase |
      | TestCase_013 |
      | TestCase_014 |
      | TestCase_015 |
      | TestCase_016 |

  Scenario Outline: validating Add A New User Screen Cancel button with Ok button
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Add A New User button
    And user will landed on the New User screen
    And clicks Cancel in New User
    And user will prompt to ask about confirmation
    And clicks Yes button <testcase>
    Then user will land on User Contact Details
    Examples:
      | testcase |
      | TestCase_018 |

  Scenario Outline: validating Add A New User Screen Cancel button with Cancel button
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks Add A New User button
    And user will landed on the New User screen
    And clicks Cancel in New User
    And user will prompt to ask about confirmation
    And clicks No button
    Then user will stay on Add A New User screen
    Examples:
      | testcase |
      | TestCase_020 |


  Scenario Outline: validating Confirm button
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

  Scenario Outline: validating Edit button in User List
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
    And clicks Edit button
    Then user will landed on the New User screen
    And enters all the details in Add A New User screen
    And clicks on Confirm button
    And message will be appear on the bottom
    Then user will land on User Contact Details
    And user given details will display on User Contact Details screen <testcase>
    Examples:
      | testcase |
      | TestCase_021 |

  Scenario Outline: validating Delete icon with Ok button
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


  Scenario Outline: validating Delete icon with Cancel button
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

  Scenario Outline: validating User Contact Details screen Cancel button with Cancel button
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

  Scenario Outline: validating User Contact Details screen Cancel button with Ok button
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


  @2
  Scenario Outline: Validate Search field
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks on search field
    Then user is shown with a editable text field with a cancel button
    And user enters text and clicks on cancel button
    Then search field becomes normal
    Examples:
      | testcase     |
      | TestCase_002 |

  @3
  Scenario Outline:  Validate Search field in Arabic
    And user in Home screen <testcase>
    When clicks Arabic Button
    Then app language change to Arabic
    And clicks on search field
    Then user is shown with a editable text field with a cancel button
    And user enters text and clicks on cancel button
    Then search field becomes normal
    Examples:
      | testcase     |
      | TestCase_023 |

  @a
  Scenario Outline: Validate Gesture in side menu
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And swipes the side menu
    Then user able to do swipe left and right side drawer menu
    Examples:
      | testcase |
      | TestCase_003 |

  @b
  Scenario Outline:  Validate Arabic Gesture in side menu
    And user in Home screen <testcase>
    When clicks Arabic Button
    Then app language change to Arabic
    And swipes the side menu
    Then user able to do swipe left and right side drawer menu
    Examples:
      | testcase     |
      | TestCase_023 |

  Scenario Outline: validating Continue button
    And user in Home screen <testcase>
    When clicks Register Button
    Then user will landed on Legal Entity User Details
    And clicks on Continue Button
    Then user lands on homepage dueto feaure not yet developed <testcase>
    Examples:
      | testcase |
      | TestCase_002 |
