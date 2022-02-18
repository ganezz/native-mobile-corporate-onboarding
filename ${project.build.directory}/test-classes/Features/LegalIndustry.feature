@regressionIndustry
Feature: Validating Industry screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch1

  @1
  Scenario Outline: Validate + Add A New Industry Button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And clicks Add A New Industry button
    Then user lands on Add A New Industry screen
    Examples:
      | testcase     |
      | TestCase_169 |
      | TestCase_170 |

  @2
  Scenario Outline: Validate Type of Industry, Drop down, Mandatory Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And clicks Add A New Industry button
    Then user lands on Add A New Industry screen
    And clicks on Type of Industry field
    And user clicks on any one of the values <testcase>
    And user is displayed with the selected value in Type of Industry field

    Examples:
      | testcase     |
      | TestCase_169 |
      | TestCase_170 |

  @3
  Scenario Outline: Validate Section, Drop down, Mandatory Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And clicks Add A New Industry button
    Then user lands on Add A New Industry screen
    And selects value from Type of Industry field <testcase>
    And clicks on Section field and choose values <testcase>
    And user is displayed with the selected value in Section field

    Examples:
      | testcase     |
      | TestCase_169 |
      | TestCase_170 |


  @4
  Scenario Outline: Validate Division, Drop down, Mandatory Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And clicks Add A New Industry button
    Then user lands on Add A New Industry screen
    And selects value from Type of Industry field <testcase>
    And selects value from Type of Section field <testcase>
    And clicks on Division field and choose the values <testcase>
    And user is displayed with the selected value in Division field

    Examples:
      | testcase     |
      | TestCase_169 |
      | TestCase_170 |

  @group
  Scenario Outline: Validate Group, Drop down, Mandatory Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And clicks Add A New Industry button
    Then user lands on Add A New Industry screen
    And selects value from Type of Industry field <testcase>
    And selects value from Type of Section field <testcase>
    And selects value from Division field <testcase>
    And clicks on Group field and choose the values <testcase>
    And user is displayed with the selected value in Group field

    Examples:
      | testcase     |
      | TestCase_169 |
      | TestCase_170 |

  @class
  Scenario Outline: Validate Class, Drop down, Mandatory Field
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And clicks Add A New Industry button
    Then user lands on Add A New Industry screen
    And selects value from Type of Industry field <testcase>
    And selects value from Type of Section field <testcase>
    And selects value from Division field <testcase>
    And selects value from Group field <testcase>
    And clicks on Class field and choose value <testcase>
    And user is displayed with the selected value in Class field
    And user fills other fields
    And click on Confirm button
    Then user lands on Industry screen
    Examples:
      | testcase     |
      | TestCase_169 |
      | TestCase_170 |

  Scenario Outline: validating Add A New Industry Screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And clicks Add A New Industry button
    Then user lands on Add A New Industry screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Ok button
    Then user redirected to Industry screen
    Examples:
      | testcase     |
      | TestCase_169 |
      | TestCase_170 |

  Scenario Outline: validating Add A New Industry Screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And clicks Add A New Industry button
    Then user lands on Add A New Industry screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Cancel button
    Then user remains in Add A New Industry screen
    Examples:
      | testcase     |
      | TestCase_169 |
      | TestCase_170 |

  Scenario Outline: validating Confirm button in Add A New Industry screen
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And clicks Add A New Industry button
    Then user lands on Add A New Industry screen
    And selects value from Type of Industry field <testcase>
    And selects value from Type of Section field <testcase>
    And selects value from Division field <testcase>
    And selects value from Group field <testcase>
    And selects value from Class field <testcase>
    And click on Confirm button
    Then user lands on Industry screen
    Examples:
      | testcase     |
      | TestCase_169 |
      | TestCase_170 |

  @edit
  Scenario Outline: validating Edit button in Industry List
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And clicks Add A New Industry button
    Then user lands on Add A New Industry screen
    And fills valid data in Type of Industry, Section, Division, Group, Class <testcase>
    And click on Confirm button
    And user lands on Industry screen
    And user entered Industry is displayed in Industry details tab
    And clicks Edit button
    And user lands on Modification Screen Add A New Industry Screen with already given data
    And edits one or more industry fields in valid data <testcase>
    And click on Confirm button
    And user displayed with Successfully Edited Industry snack bar Message
    Then user displayed with edited values in Industry details screen
    Examples:
      | testcase     |
      | TestCase_171 |
      | TestCase_172 |

  @d1
  Scenario Outline: validating Delete icon with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen Screen <testcase>
    And clicks Add A New Industry button
    Then user lands on Add A New Industry screen
    And fills valid data in Type of Industry, Section, Division, Group, Class <testcase>
    And click on Confirm button
    And user lands on Industry screen
    And user entered Industry is displayed in Industry details tab
    And clicks Delete button
    And user is Displayed with Delete Prompt
    And click on Ok button
    Then Industry is removed from the list
    Examples:
      | testcase     |
      | TestCase_171 |
      | TestCase_172 |

  @d2
  Scenario Outline: validating Delete icon with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And clicks Add A New Industry button
    Then user lands on Add A New Industry screen
    And fills valid data in Type of Industry, Section, Division, Group, Class <testcase>
    And click on Confirm button
    And user lands on Industry screen
    And user entered Industry is displayed in Industry details tab
    And clicks Delete button
    And user is Displayed with Delete Prompt
    And click on Cancel button
    Then Industry is not removed from the list
    Examples:
      | testcase     |
      | TestCase_171 |
      | TestCase_172 |


  @c1
  Scenario Outline: validating Industry screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Cancel button
    Then user remains in Industry screen
    Examples:
      | testcase     |
      | TestCase_171 |
      | TestCase_172 |

  @c2
  Scenario Outline: validating Industry screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Ok button
    Then user lands on Dashboard
    Examples:
      | testcase     |
      | TestCase_171 |
      | TestCase_172 |

  Scenario Outline: validating Continue button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes the side menu and select Industry
    When user is in Industry screen <testcase>
    And clicks on Continue Button
    Then user lands on Incorporation screen
    Examples:
      | testcase     |
      | TestCase_171 |
      | TestCase_172 |