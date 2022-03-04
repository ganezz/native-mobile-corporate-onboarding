@regressionProductSelection
Feature: Validating Product Selection screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch1

  Scenario Outline: validating + Add a new product Button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    Examples:
      | testcase |

  Scenario Outline: validating Trade Finance radio Button
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks on Trade Finance button
    And user clicks confirm
    And Trade Finance is displayed in the Product selection screen
    Examples:
      | testcase |

  Scenario Outline: validating delete icon of Trade Finance with Cancel button
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks on Trade Finance button
    And No data should be displayed down
    And user clicks confirm
    And Trade Finance is displayed in the Product selection screen
    And user clicks on delete button
    Then user prompted with Delete pop up
    And clicks on cancel button
    And user lands on product selection screen with trade finance not being deleted
    Examples:
      | testcase |

  Scenario Outline: validating delete icon of Trade Finance with Ok button
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks on Trade Finance button
    And No data should be displayed down
    And user clicks confirm
    And Trade Finance is displayed in the Product selection screen
    And user clicks on delete button
    Then user prompted with Delete pop up
    And clicks on Ok button
    And user lands on product selection screen with trade finance deleted
    Examples:
      | testcase |

  Scenario Outline: validating Corporate Account radio Button
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And user displayed with multiple unfilled fields
    Examples:
      | testcase |

  Scenario Outline: validating Preferred operating account name field, Mandatory alphanumeric field with Max 100 characters
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And clicks on Preferred operating account name field
    And user inputs invalid Name
    And clicks on other fields
    Then error message should be displayed under Preferred operating account name field
    Examples:
      | testcase |

  Scenario Outline: validating Purpose of account field, Mandatory dropdown field
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And clicks on Purpose of account field
    And selects a value
    Then user is displayed with the selected value in Purpose of account field
    Examples:
      | testcase |

  Scenario Outline: validating Additional details on intended use, Mandatory alphanumeric field with Max 100 characters
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And clicks on Additional details on intended use field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under Additional details on intended use field
    Examples:
      | testcase |

  Scenario Outline: validating Currency field, Mandatory dropdown field
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And user selects Currency field
    And lands on new screen with the drop down values and search option
    And selects a value
    Then user is displayed with the selected value in Currency field
    Examples:
      | testcase |

  Scenario Outline: validating Additional details on intended use, Mandatory alphanumeric field with Max 100 characters
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And clicks on Additional details on intended use field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under Additional details on intended use field
    Examples:
      | testcase |

  Scenario Outline: validating Total anticipated monthly transaction turnover, Mandatory numeric field
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And clicks on Total anticipated monthly transaction turnover field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under Total anticipated monthly transaction turnover field
    Examples:
      | testcase |

  Scenario Outline: validating Country field, Mandatory dropdown field
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And user selects Country field
    And lands on new screen with the drop down values and search option
    And selects a value
    Then user is displayed with the selected value in Code field
    Examples:
      | testcase |

  Scenario Outline: validating Incoming transaction vol. per month, Mandatory numeric field
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And clicks on Incoming transaction vol. per month field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under Incoming transaction vol. per month field
    Examples:
      | testcase |

  Scenario Outline: validating Incoming value per month (USD), Mandatory numeric field
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And clicks on Incoming value per month (USD) field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under Incoming value per month (USD) field
    Examples:
      | testcase |

  Scenario Outline: validating Outgoing transaction vol. per month, Mandatory numeric field
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And clicks on Outgoing transaction vol. per month field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under Outgoing transaction vol. per month field
    Examples:
      | testcase |

  Scenario Outline: validating Outgoing value per month (USD), Mandatory numeric field
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And clicks on Outgoing value per month (USD) field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under OOutgoing value per month (USD) field
    Examples:
      | testcase |

  Scenario Outline: validating + Add another country Button
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And clicks Add another country button
    Then user displayed with another set of country,Incoming transaction vol. per month, Incoming value per month (USD), Outgoing transaction vol. per month, Outgoing value per month (USD) fields with same validations
    Examples:
      | testcase |

  Scenario Outline: validating Add a product Screen Cancel button with Ok button
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Ok button
    Then user redirected to Product Selection screen
    Examples:
      | testcase |

  Scenario Outline: validating Add a product Screen Cancel button with Cancel button
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Cancel button
    Then user remains in the same Add A Product screen
    Examples:
      | testcase |

  Scenario Outline: validating Confirm button with Corporate Account Selection
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And fills valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Product Selection screen
    And user displayed with Successful snack bar Message
    And Product Details entered is displayed in Product selection screen
    Examples:
      | testcase |

  Scenario Outline: validating Edit button in Product List in Product selection screen
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And fills valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Product Selection screen
    And Product Details entered is displayed in Product selection screen
    And clicks on Edit button
    And user lands on Modification Screen i.eAdd a product Screen with already given data
    And edits one or more fields in valid format
    And clicks on Confirm button
    And user displayed with Successfully Edited Floating Message
    Then user displayed with edited values in Product selection screen
    Examples:
      | testcase |

  Scenario Outline: validating Delete button in Product List with Cancel button
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And fills valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Product Selection screen
    And Product Details entered is displayed in Product selection screen
    And clicks on delete icon
    And user is Displayed with Delete Prompt
    And clicks on Cancel button
    Then Product is not removed from the list
    Examples:
      | testcase |

  Scenario Outline: validating Delete button in Product List with Ok button
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And fills valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Product Selection screen
    And Product Details entered is displayed in Product selection screen
    And clicks on delete icon
    And user is Displayed with Delete Prompt
    And clicks on Ok button
    Then Product is removed from the list
    Examples:
      | testcase |

  Scenario Outline: validating Product selection screen Cancel button with Cancel button
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Cancel button
    Then user remains in Product selection screen
    Examples:
      | testcase |

  Scenario Outline: validating Product selection screen Cancel button with Ok button
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks on Cancel Button
    And user is displayed with Cancel Prompt
    And clicks on Ok button
    Then user lands on Dashboard screen
    Examples:
      | testcase |

  Scenario Outline: validating Product selection screen Continue button
    When user is in Dashboard <testcase>
    And clicks on Add a new application button
    Then user lands User contact details
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks on Trade Finance button
    And user clicks confirm
    And Trade Finance is displayed in the Product selection screen
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And fills valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Product Selection screen
    And Product Details entered is displayed in Product selection screen
    And clicks on continue button
    Then user lands on Administration details screen
    Examples:
      | testcase |