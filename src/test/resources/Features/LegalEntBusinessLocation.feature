@regressionBusinessLocationAndOperations
Feature: Validating Business Location And Operations screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch1

  @1
  Scenario Outline: validating Country in Add A New Location screen, Drop down, Mandatory Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    Then user lands on Add A New Location screen
    And clicks on Country field
    And lands on new screen with the drop down values and search option
    And selects a value
    Then user is displayed with the selected value in Country field
    And fills valid data in Country and Type of operations fields <testcase>
    And click on Confirm button
    And user displayed with Successfull addded snack bar Message
    Then user displayed with edited values in Location of business operations Section
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_156 |
      | TestCase_157 |
      | TestCase_158 |


  @2
  Scenario Outline: validating Type of operations, mandatory Field with Max 100 alphanumeric characters and special characters not allowed
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    And user clicks on Type of operations field <testcase>
    And user input invalid type
    And click on Confirm button
    Then proper error message should display under Type of operations field
    Examples:
      | testcase     |
      | TestCase_165 |
      | TestCase_166 |
      | TestCase_173 |
      | TestCase_174 |
      | TestCase_175 |
      | TestCase_176 |
      | TestCase_177 |
      | TestCase_178 |

  @3
  Scenario Outline: validating Add A New Location Screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    And click on Cancel button
    Then user will prompt to ask about confirmation
    And click on Ok button
    Then user is in Business Location And Operations screen
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_158 |

  @4
  Scenario Outline: validating Add A New Location Screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Cancel button
    Then user remains in Add new Location and Operations screen
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_158 |

  @5
  Scenario Outline: validating Confirm button in Add A New Location screen
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    And fills valid data in Country and Type of operations fields <testcase>
    And click on Confirm button
    Then user lands on Add A New Location screen
    And user displayed with Successfull addded snack bar Message
    Then user displayed with edited values in Location of business operations Section
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_158 |


  @6
  Scenario Outline: validating Country in Add A New Business Market screen, Drop down, Mandatory Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    And clicks on Country field
    And lands on new screen with the drop down values and search option
    And selects a value
    Then user is displayed with the selected value in Country field
    And fills valid data in Country and Proportion of Business fields
    And click on Confirm button
    And user displayed with Successfull addded Market snack bar Message
    Then user displayed with edited values in Business markets Section
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_156 |
      | TestCase_157 |
      | TestCase_158 |

  @a
  Scenario Outline: validating Proportion of Business(%), mandatory Numeric Field with limit 1 to 100
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    And user clicks Proportion of Business field
    And user input invalid number
    And clicks on Confirm button
    Then proper error message should display under proportion field
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_156 |
      | TestCase_157 |
      | TestCase_158 |
      | TestCase_173 |
      | TestCase_174 |
      | TestCase_175 |
      | TestCase_176 |
      | TestCase_177 |
      | TestCase_178 |

  @7
  Scenario Outline: validating Add A New Business Market Screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    And click on Cancel button
    Then user will prompt to ask about confirmation
    And click on Ok button
    Then user is in Business Location And Operations screen
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_158 |

  @8
  Scenario Outline: validating Add A New Business Market Screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Cancel button
    Then user remains in Business Market screen
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_158 |

  @9
  Scenario Outline: validating Confirm button in Add A New Business Market screen
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    And fills valid data in Country and Proportion of Business fields
    And click on Confirm button
    When user is in Business Location And Operations screen
    And user displayed with Successfull addded Market snack bar Message
    Then user displayed with edited values in Business markets Section
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_158 |


  @10
  Scenario Outline: validating Is the country of domicile the same as the country of incorporation?, Mandatory Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks on toggle
    And user displayed with a Country of domicile dropdown field <testcase>
    And lands on new screen with the drop down values and search option
    And selects a value
    Then user is displayed with the selected value in Country of domicile field

    Examples:
      | testcase     |
      | TestCase_012 |
      | TestCase_017 |
      | TestCase_091 |
      | TestCase_092 |

  @11
  Scenario Outline: validating + Add A New Location Button, Mandatory section
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    Then user lands on Add A New Location screen
    Examples:
      | testcase     |
      | TestCase_012 |
      | TestCase_091 |

  @12
  Scenario Outline: validating Edit button in Location of business operations section
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    And clicks Add A New Location button
    Then user lands on Add A New Location screen
    And fills valid data in Country and Type of operations fields <testcase>
    And click on Confirm button
    Then user lands on Add A New Location screen
    And user entered Location is displayed in Location of business operations Section
    And clicks on Edit button
    And user lands on Modification Screen Add A New Location Screen with already given data
    And edits one or more fields in loation screen valid format <testcase>
    And click on Confirm button
    And user displayed with Successfully Edited location snack bar Message
    Then user displayed with edited values in Location of business operations Section
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_156 |
      | TestCase_157 |
      | TestCase_158 |

  @13
  Scenario Outline: validating Delete icon of Location of business operations section with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    Then user lands on Add A New Location screen
    And fills valid data in Country and Type of operations fields <testcase>
    And click on Confirm button
    Then user lands on Add A New Location screen
    And user entered Location is displayed in Location of business operations Section
    And clicks on Delete button
    And user is Displayed with Delete Prompt
    And click on Ok button
    Then Location is removed from the list
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_157 |


  @14
  Scenario Outline: validating Delete icon of Location of business operations section with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Location button
    Then user lands on Add A New Location screen
    And fills valid data in Country and Type of operations fields <testcase>
    And click on Confirm button
    Then user lands on Add A New Location screen
    And user entered Location is displayed in Location of business operations Section
    And clicks on Delete button
    And user is Displayed with Delete Prompt
    And click on Cancel button
    Then Location is not removed from the list
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_157 |


  @15
  Scenario Outline: validating + Add A New Business Market Button, Mandatory section
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    Examples:
      | testcase     |
      | TestCase_012 |

  @16
  Scenario Outline: validating Edit button in Business markets section
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    And fills valid data in Country and Proportion of Business fields
    And click on Confirm button
    When user is in Business Location And Operations screen
    And user entered Business market is displayed in Business market Section
    And clicks on Edit button
    And user lands on Modification Screen Add A New Business market Screen with already given data
    And edits one or more fields in business market screen valid format <testcase>
    And click on Confirm button
    And user displayed with Successfully Edited market snack bar Message
    Then user displayed with edited values in Business markets Section
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_156 |
      | TestCase_157 |
      | TestCase_158 |

  @17
  Scenario Outline: validating Delete icon of Business markets section with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    And fills valid data in Country and Proportion of Business fields
    And click on Confirm button
    When user is in Business Location And Operations screen
    And user entered Business market is displayed in Business market Section
    And clicks on Delete button
    And user is Displayed with Delete Prompt
    And click on Ok button
    Then Business market is removed from the list
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_158 |

  @18
  Scenario Outline: validating Delete icon of Business markets section with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And clicks Add A New Business Markets button
    Then user lands on Add A New Business Markets screen
    And fills valid data in Country and Proportion of Business fields
    And click on Confirm button
    When user is in Business Location And Operations screen
    And user entered Business market is displayed in Business market Section
    And clicks on Delete button
    And user is Displayed with Delete Prompt
    And click on Cancel button
    Then Business market is not removed from the list
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_158 |

  @19
  Scenario Outline: validating Business Location and Operations screen with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Cancel button
    Then user remains in Business Location and Operations screen
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_158 |

  @20
  Scenario Outline: validating Business Location and Operations screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Ok button
    Then user lands on Dashboard
    Examples:
      | testcase     |
      | TestCase_155 |
      | TestCase_158 |

  @21
  Scenario Outline: validating Continue button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Business Location
    When user is in Business Location And Operations screen
    And user fills all mandatory values <testcase>
    And clicks on Application Continue Button
    Then user lands on Industry screen
    Examples:
      | testcase     |
      | TestCase_163 |
      | TestCase_164 |
