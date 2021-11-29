@sanityUserContactDetails

Feature: Validating features for User Contact Details Screen in NM_CO

  Background: User launches NM_CO application
    Given User selects Register button

  Scenario Outline: Validate + Add A New User Button
    When user lands on Legal Entity User Details
    And clicks Add A New User button
    Then user lands on Add A New User screen
    Examples:
      | testcase |

  Scenario Outline: validating User Name field with max 100 characters,No Special characters and numeric allowed except space, Mandatory Field
    When user is in User Contact Details screen <testcase>
    And clicks on Add new user button
    And lands on Add new user screen
    And user enters invalid data in UserName field
    And clicks on some other field
    And clicks on Confirm button
    Then proper error message should display under User Name field
    Examples:
      | testcase |

  Scenario Outline: validating Email field with max 80 characters, limited special characters only allowed, Mandatory Field
    When user is in User Contact Details Screen <testcase>
    And clicks on Add A New User button
    And user lands on Add A New User Screen
    And enters invalid data in Email field
    And clicks on some other field
    And clicks on Confirm button
    Then proper error message should display under Email field
    Examples:
      | testcase |

  Scenario Outline: validating Code field with max 5 characters, Drop down, Mandatory Field
    When user is in User Contact Details Screen <testcase>
    And clicks on Add A New User button
    And user lands on Add A New User Screen
    And enters valid details in User Name, Email, Mobile fields
    And selects any code from drop down
    And clicks on Confirm button
    Then user lands on User Contact Details screen
    Examples:
      | testcase |

  Scenario Outline: validating Mobile field with max 20 characters, Alphabets and Special Characters not allowed, Mandatory Field
    When user is in User Contact Details Screen <testcase>
    And clicks on Add A New User button
    And user lands on Add A New User Screen
    And enters invalid data in Mobile field
    And clicks on some other field
    And clicks on Confirm button
    Then proper error message should display under Mobile field
    Examples:
      | testcase |

  Scenario Outline: validating Add A New User Screen Cancel button with Ok button
    When user is in User Contact Details Screen <testcase>
    And clicks on Add A New User button
    And user lands on Add A New User Screen
    And clicks on Cancel Button
    And user displayed with Cancel Prompt
    And clicks on Ok button
    Then user redirected to User Contact Details screen
    Examples:
      | testcase |

  Scenario Outline: validating Add A New User Screen Cancel button with Cancel button
    When user is in User Contact Details Screen <testcase>
    And clicks on Add A New User button
    And user lands on Add A New User Screen
    And clicks on Cancel Button
    And user displayed with Cancel Prompt
    And clicks on Cancel button
    Then user redirected to User Contact Details screen
    Examples:
      | testcase |

  Scenario Outline: validating Confirm button
    When user is in User Contact Details Screen <testcase>
    And clicks on Add A New User button
    And user lands on Add A New User Screen
    And fills valid data in UserName, Email, Code, Mobile
    And user displayed with successful Prompt
    And clicks on Ok button
    Then user lands on User Contact Details screen
    And user displayed with Successful Floating Message
    And user Details entered displayed in User Contact Details screen
    Examples:
      | testcase |

  Scenario Outline: validating Edit button in User List
    When user is in User Contact Details Screen <testcase>
    And clicks on Add A New User button
    And user lands on Add A New User Screen
    And fills valid data in UserName, Email, Code, Mobile
    And clicks on Confirm button
    And user lands on User Contact Details screen
    And user Details entered is displayed in User Contact Details screen
    And clicks on Edit button
    And user lands on Modification Screen i.e Add A New User Screen with already given data
    And edits one or more fields in valid format
    And clicks on Confirm button
    And user displayed with Successfully Edited Floating Message
    Then user displayed with edited values in User Contact Details screen
    Examples:
      | testcase |

  Scenario Outline: validating Delete icon with Ok button
    When user is in User Contact Details Screen <testcase>
    And clicks on Add A New User button
    And user lands on Add A New User Screen
    And fills valid data in UserName, Email, Code, Mobile
    And clicks on Confirm button
    And user lands on User Contact Details screen
    And user Details entered is displayed in User list
    And clicks on delete icon
    And user is Displayed with Delete Prompt
    And clicks on Ok button
    Then user is removed from the list
    Examples:
      | testcase |

  Scenario Outline: validating Delete icon with Cancel button
    When user is in User Contact Details Screen <testcase>
    And clicks on Add A New User button
    And user lands on Add A New User Screen
    And fills valid data in UserName, Email, Code, Mobile
    And clicks on Confirm button
    And user lands on User Contact Details screen
    And user Details entered is displayed in User Contact Details screen
    And clicks on delete icon
    And user is Displayed with Delete Prompt
    And user clicks on Cancel button
    Then user is not removed from the list
    Examples:
      | testcase |

  Scenario Outline: validating User Contact Details screen Cancel button with Cancel button
    When user is in User Contact Details Screen <testcase>
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Cancel button
    Then user remains in User Contact Details screen
    Examples:
      | testcase |

  Scenario Outline: validating User Contact Details screen Cancel button with Ok button
    When user is in User Contact Details Screen <testcase>
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Ok button
    Then user lands on Home screen
    Examples:
      | testcase |

  Scenario Outline: validating Continue button
    When user is in User Contact Details Screen <testcase>
    And clicks on Continue Button
    Then user lands on Entity Name & Types screen
    Examples:
      | testcase |

