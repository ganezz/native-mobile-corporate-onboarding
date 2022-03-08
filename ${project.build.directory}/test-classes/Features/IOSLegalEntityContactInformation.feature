@regressionIOSEntityContactInformation
Feature: Validating Entity Contact Information screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch5


  @1
  Scenario Outline: Validate Email Address, optional Field with Max 100 characters and should follow email regex and Case insensitive
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
    When user is in Entity Contact Information screen <testcase>
    And clicks on Email Address field
    And user inputs invalid data
    And clicks on other field
    Then error message should be displayed under Email Address field
    Examples:
      | testcase     |
      | TestCase_007 |
      | TestCase_008 |
#      | TestCase_009 |
#      | TestCase_010 |
#      | TestCase_011 |
#      | TestCase_086 |
      | TestCase_087 |
      | TestCase_088 |
      | TestCase_089 |
      | TestCase_090 |


  @2
  Scenario Outline: Validate Company Website, optional Field with Max 100 characters and should follow url regex and Case insensitive
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
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
#      | TestCase_055 |
#      | TestCase_056 |
#      | TestCase_127 |
#      | TestCase_128 |
      | TestCase_129 |
      | TestCase_130 |
      | TestCase_131 |
      | TestCase_132 |

  @3
  Scenario Outline: Validate + Add A New Address Button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
    When user is in Entity Contact Information screen <testcase>
    And clicks Add A New Address button
    Then user lands on Add A New Address screen
    Examples:
      | testcase     |
      | TestCase_056 |
      | TestCase_127 |

  @4
  Scenario Outline: Validate Unit no/Building, optional Field with Max 100 characters and should follow url regex and Case insensitive
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
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
#      | TestCase_060 |
#      | TestCase_061 |
#      | TestCase_133 |
#      | TestCase_134 |
      | TestCase_135 |
      | TestCase_136 |
      | TestCase_137 |
      | TestCase_138 |


  @5
  Scenario Outline: Validate Street/Area optional Field with Max 100 characters and should follow url regex and Case insensitive
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
    When user is in Entity Contact Information screen <testcase>
    And clicks Add A New Address button
    And clicks on Street field
    And user inputs invalid data
    Then error message should be displayed under field
    Examples:
      | testcase     |
      | TestCase_063 |
      | TestCase_064 |
#      | TestCase_065 |
#      | TestCase_066 |
#      | TestCase_067 |
#      | TestCase_068 |
      | TestCase_139 |
      | TestCase_140 |
      | TestCase_141 |
      | TestCase_142 |
#
  @6
  Scenario Outline: Validate state,City and Post box optional Field with Max 100 characters and should follow url regex and Case insensitive
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
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
#      | TestCase_073 |
#      | TestCase_074 |
      | TestCase_143 |
      | TestCase_144 |
      | TestCase_145 |
#      | TestCase_146 |
#      | TestCase_147 |
#      | TestCase_148 |

  @7
  Scenario Outline: Validate zip code optional Field with Max 100 characters and should follow url regex and Case insensitive
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
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
#      | TestCase_078 |
#      | TestCase_079 |
#      | TestCase_080 |
      | TestCase_149 |
      | TestCase_150 |
      | TestCase_151 |

  @8
  Scenario Outline: Validate country Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
    When user is in Entity Contact Information screen <testcase>
    And clicks Add A New Address button
    And clicks on County
    And lands on new screen with the drop down values and search option
    And selects a value
    Then user is displayed with the selected value in Code field
    Examples:
      | testcase     |
      | TestCase_012 |
#      | TestCase_017 |
#      | TestCase_152 |
      | TestCase_153 |

  @9
  Scenario Outline: validating Edit button in Address List
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
    When user is in Entity Contact Information screen <testcase>
    And clicks Add A New Address button
    Then user lands on Add A New Address screen
    And fills valid data in AddressType, UnitNo,Building name,street,Area, Country, State, town,city, zip,postalCode, PO Box
    And clicks on Confirm button
    And user lands on Entity Contact information screen
    And user entered address is displayed in address details tab
    And clicks Edit button in EntityName Screen
    And user lands on Modification Screen Add A New Address Screen with already given data
    And edits one or more fields in valid format
    And clicks on Confirm button
    And user displayed with Successfully Edited snack bar Message
    Then user displayed with edited values in address details screen
    Examples:
      | testcase     |
      | TestCase_197 |
      | TestCase_198 |

  @10
  Scenario Outline: validating Delete icon with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
    When user is in Entity Contact Information screen <testcase>
    And clicks Add A New Address button
    Then user lands on Add A New Address screen
    And fills valid data in AddressType, UnitNo,Building name,street,Area, Country, State, town,city, zip,postalCode, PO Box
    And clicks on Confirm button
    And user lands on Entity Contact information screen
    And user entered address is displayed in address details tab
    And clicks Delete button in EntityName Screen
    Then user will prompt to ask about Delete confirmation
    And clicks Yes button <testcase>
    Then address is removed from the list
    Examples:
      | testcase     |
      | TestCase_197 |
      | TestCase_198 |

  @11
  Scenario Outline: validating Delete icon with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
    When user is in Entity Contact Information screen <testcase>
    And clicks Add A New Address button
    Then user lands on Add A New Address screen
    And fills valid data in AddressType, UnitNo,Building name,street,Area, Country, State, town,city, zip,postalCode, PO Box
    And clicks on Confirm button
    And user lands on Entity Contact information screen
    And user entered address is displayed in address details tab
    And clicks Delete button in EntityName Screen
    Then user will prompt to ask about Delete confirmation
    And clicks No button
    And user given details will display on Entity Contact Details screen
    Examples:
      | testcase     |
      | TestCase_197 |
      | TestCase_198 |

  @12
  Scenario Outline: validating User Contact Information screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
    When user is in Entity Contact Information screen <testcase>
    And clicks Cancel button
    Then user will prompt to ask about confirmation
    And clicks No button
    Then user remains in User Contact Information screen <testcase>
    Examples:
      | testcase     |
      | TestCase_081 |
      | TestCase_154 |

  @13
  Scenario Outline: validating User Contact Information screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
    When user is in Entity Contact Information screen <testcase>
    And clicks Cancel button
    Then user will prompt to ask about confirmation
    And clicks Yes button <testcase>
    Then user will land on Dashboard screen <testcase>
    Examples:
      | testcase     |
      | TestCase_081 |
      | TestCase_154 |

  @14
  Scenario Outline: validating Continue button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Entity contact
    When user is in Entity Contact Information screen <testcase>
    And clicks on Continue Button
    Then user lands on Business Location screen
    Examples:
      | testcase     |
      | TestCase_081 |
      | TestCase_154 |