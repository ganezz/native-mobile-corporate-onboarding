@regressionEntityContactInformation
Feature: Validating Entity Contact Information screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch1
    And user in Home screen TestCase_021
    When clicks Register Button
    Then user will landed on Legal Entity User Details
#    And clicks Add A New User button
#    And user will landed on the New User screen
#    And enters all the details in Add A New User screen
#    And clicks on Confirm button
#    And message will be appear on the bottom
    And clicks on Continue Button
    And clicks on Continue Button

  @1
  Scenario Outline: Validate Email Address, optional Field with Max 100 characters and should follow email regex and Case insensitive
    When user is in Entity Contact Information screen <testcase>
    And clicks on Email Address field
    And user inputs invalid data
    And clicks on other field
    Then error message should be displayed under Email Address field
    Examples:
      | testcase     |
      | TestCase_007 |
      | TestCase_008 |
      | TestCase_009 |
      | TestCase_010 |
      | TestCase_011 |


  @2
  Scenario Outline: Validate Company Website, optional Field with Max 100 characters and should follow url regex and Case insensitive
    When user is in Entity Contact Information screen <testcase>
    And clicks on Company Website
    And user inputs invalid data
    And clicks on other field
    Then error message should be displayed under Company Website field
    Examples:
      | testcase     |
      | TestCase_051 |
      | TestCase_052 |
      | TestCase_053 |
      | TestCase_054 |
      | TestCase_055 |
      | TestCase_056 |

@3
  Scenario Outline: Validate + Add A New Address Button
    When user is in Entity Contact Information screen <testcase>
    And clicks Add A New Address button
    Then user lands on Add A New Address screen
    Examples:
      | testcase |
      | TestCase_056 |

  @4
  Scenario Outline: Validate Unit no/Building, optional Field with Max 100 characters and should follow url regex and Case insensitive
    When user is in Entity Contact Information screen <testcase>
    And clicks Add A New Address button
    And clicks on Unit no
    And user inputs invalid data
    Then error message should be displayed under field
    Examples:
      | testcase     |
      | TestCase_057 |
      | TestCase_058 |
      | TestCase_059 |
      | TestCase_060 |
      | TestCase_061 |
      | TestCase_062 |

@5
  Scenario Outline: Validate Street/Area optional Field with Max 100 characters and should follow url regex and Case insensitive
    When user is in Entity Contact Information screen <testcase>
    And clicks Add A New Address button
    And clicks on Street field
    And user inputs invalid data
    Then error message should be displayed under field
    Examples:
      | testcase     |
      | TestCase_063 |
      | TestCase_064 |
      | TestCase_065 |
      | TestCase_066 |
      | TestCase_067 |
      | TestCase_068 |

  @6
  Scenario Outline: Validate state,City and Post box optional Field with Max 100 characters and should follow url regex and Case insensitive
    When user is in Entity Contact Information screen <testcase>
    And clicks Add A New Address button
    And clicks on city and post box
    And user inputs invalid data
    Then error message should be displayed under field
    Examples:
      | testcase     |
      | TestCase_069 |
      | TestCase_070 |
      | TestCase_071 |
      | TestCase_072 |
      | TestCase_073 |
      | TestCase_074 |
  @7
  Scenario Outline: Validate zip code optional Field with Max 100 characters and should follow url regex and Case insensitive
    When user is in Entity Contact Information screen <testcase>
    And clicks Add A New Address button
    And clicks on zipcode
    And user inputs invalid data
    Then error message should be displayed under field
    Examples:
      | testcase     |
      | TestCase_075 |
      | TestCase_076 |
      | TestCase_077 |
      | TestCase_078 |
      | TestCase_079 |
      | TestCase_080 |

  @8
  Scenario Outline: Validate country Field
    When user is in Entity Contact Information screen <testcase>
    And clicks Add A New Address button
    And clicks on County
    And lands on new screen with the drop down values and search option
    And selects a value
    Then user is displayed with the selected value in Code field
    Examples:
      | testcase     |
      | TestCase_012 |
      | TestCase_017 |
@9
  Scenario Outline: validating Edit button in Address List
    When user is in Entity Contact Information screen <testcase>
    And clicks Add A New Address button
    Then user lands on Add A New Address screen
    And fills valid data in AddressType, UnitNo,Building name,street,Area, Country, State, town,city, zip,postalCode, PO Box
    And clicks on Confirm button
    And user lands on Entity Contact information screen
    And user entered address is displayed in address details tab
    And clicks Edit button
    And user lands on Modification Screen Add A New Address Screen with already given data
    And edits one or more fields in valid format
    And clicks on Confirm button
    And user displayed with Successfully Edited snack bar Message
    Then user displayed with edited values in address details screen
    Examples:
      | testcase     |
      | TestCase_081 |


  Scenario Outline: validating Delete icon with Ok button
    When user is in Entity Contact Information screen Screen <testcase>
    And clicks on Add A New Address button
    And user lands on Add A New Address Screen
    And fills valid data in AddressType, UnitNo. / Building name, street / Area, Country, State, town / city,zip / postalCode, P.O Box
    And clicks on Confirm button
    And user lands on Entity Contact Information screen
    And user entered address is displayed in address details tab
    And clicks on delete icon
    And user is Displayed with Delete Prompt
    And clicks on Ok button
    Then address is removed from the list
    Examples:
      | testcase |

  Scenario Outline: validating Delete icon with Cancel button
    When user is in Entity Contact Information screen Screen <testcase>
    And clicks on Add A New Address button
    And user lands on Add A New Address Screen
    And fills valid data in AddressType, UnitNo. / Building name, street / Area, Country, State, town / city,zip / postalCode, P.O Box
    And clicks on Confirm button
    And user lands on Entity Contact Information screen
    And user entered address is displayed in address details tab
    And clicks on delete icon
    And user is Displayed with Delete Prompt
    And clicks on Cancel button
    Then address is not removed from the list
    Examples:
      | testcase |

  Scenario Outline: validating User Contact Information screen Cancel button with Cancel button
    When user is in User Contact Information Screen <testcase>
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Cancel button
    Then user remains in User Contact Information screen
    Examples:
      | testcase |

  Scenario Outline: validating User Contact Information screen Cancel button with Ok button
    When user is in User Contact Information Screen <testcase>
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Ok button
    Then user lands on Home screen
    Examples:
      | testcase |

  Scenario Outline: validating Continue button
    When user is in User Contact Details Screen <testcase>
    And clicks on Continue Button
    Then user lands on Business Location screen
    Examples:
      | testcase |