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
      | testcase     |
      | TestCase_199 |
      | TestCase_200 |


@tf
  Scenario Outline: validating Trade Finance radio Button
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
    And clicks on Trade Finance button
    And user clicks confirm
    And Trade Finance is displayed in the Product selection screen <testcase>
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |


    @Delete
  Scenario Outline: validating delete icon of Trade Finance with Cancel button
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
    And clicks on Trade Finance button
    And user clicks confirm
    And Trade Finance is displayed in the Product selection screen <testcase>
    And user clicks on delete button
    Then user prompted with Trade Delete pop up
    And clicks on cancel button
    And user lands on product selection screen with trade finance not being deleted
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |

      @del2
  Scenario Outline: validating delete icon of Trade Finance with Ok button
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
    And clicks on Trade Finance button
     And user clicks confirm
    And Trade Finance is displayed in the Product selection screen <testcase>
    And user clicks on delete button
    Then user prompted with Trade Delete pop up
    And clicks on Ok button
    And user lands on product selection screen with trade finance deleted
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |

  Scenario Outline: validating Corporate Account radio Button
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
    And clicks Corporate account radio button
    And user displayed with multiple unfilled fields
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |

  Scenario Outline: validating Preferred operating account name field, Mandatory alphanumeric field with Max 100 characters
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
    And clicks Corporate account radio button
    And clicks on Preferred operating account name field <testcase>
    And user inputs invalid Name
    And clicks on other fields
    Then error message should be displayed under Preferred operating account name field
    Examples:
      | testcase |
      | TestCase_201 |
      | TestCase_202 |
      | TestCase_203 |
      | TestCase_204 |
      | TestCase_205 |
      | TestCase_206 |
      | TestCase_207 |

  Scenario Outline: validating Purpose of account field, Mandatory dropdown field
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
    And clicks Corporate account radio button
    And clicks on Purpose of account field <testcase>
    And selects a value
    Then user is displayed with the selected value in Purpose of account field
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |
      | TestCase_201 |
      | TestCase_202 |
      | TestCase_203 |
      | TestCase_205 |
      | TestCase_206 |
      | TestCase_207 |

  Scenario Outline: validating Additional details on intended use, Mandatory alphanumeric field with Max 100 characters
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
    And clicks Corporate account radio button
    And clicks on Additional details on intended use field
    And user inputs invalid value
    Then error message should be displayed under Additional details on intended use field
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |
      | TestCase_201 |
      | TestCase_202 |
      | TestCase_203 |
      | TestCase_205 |
      | TestCase_206 |
      | TestCase_207 |

  Scenario Outline: validating Currency field, Mandatory dropdown field
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
    And clicks Corporate account radio button
    And user selects Currency field <testcase>
    Then user is displayed with the selected value in Currency field
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |

#  Scenario Outline: validating Additional details on intended use, Mandatory alphanumeric field with Max 100 characters
#    And user in Login screen <testcase>
#    When clicks language dropDown choose language <testcase>
#    When enter username and password <testcase>
#    And click login button
#    Then user lands on Dashboard
#    Then click add New Application
#    And swipes side menu and selects Product and User Management
#    Then user lands on Product Selection screen
#    And clicks Add a new product button
#    Then user lands on Add A Product screen
#    And clicks Corporate account radio button
#    And clicks on Additional details on intended use field
#    And user inputs invalid value
#    And clicks on other fields
#    Then error message should be displayed under Additional details on intended use field
#    Examples:
#      | testcase |

  Scenario Outline: validating Total anticipated monthly transaction turnover, Mandatory numeric field
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
    And clicks Corporate account radio button
    And clicks on Total anticipated monthly transaction turnover field <testcase>
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under Total anticipated monthly transaction turnover field
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |
      | TestCase_201 |
      | TestCase_205 |

  Scenario Outline: validating Country field, Mandatory dropdown field
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
    And clicks Corporate account radio button
    And user selects Country field
    Then user is displayed with the selected value in Code field
    Examples:
      | testcase |
      | TestCase_012 |
      | TestCase_017 |
      | TestCase_091 |
      | TestCase_092 |

  Scenario Outline: validating Incoming transaction vol. per month, Mandatory numeric field
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
    And clicks Corporate account radio button
    And clicks on Incoming transaction value per month field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under Incoming transaction value per month field
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |
      | TestCase_201 |
      | TestCase_205 |
@incomeV
  Scenario Outline: validating Incoming value per month (USD), Mandatory numeric field
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
    And clicks Corporate account radio button
    And clicks on Incoming value per month field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under Incoming value per month field
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |
      | TestCase_201 |
      | TestCase_205 |

  Scenario Outline: validating Outgoing transaction vol. per month, Mandatory numeric field
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
    And clicks Corporate account radio button
    And clicks on Outgoing transaction value per month field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under Outgoing transaction value per month field
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |
      | TestCase_201 |
      | TestCase_205 |

  Scenario Outline: validating Outgoing value per month (USD), Mandatory numeric field
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
    And clicks Corporate account radio button
    And clicks on Outgoing value per month field
    And user inputs invalid value
    And clicks on other fields
    Then error message should be displayed under OOutgoing value per month field
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |
      | TestCase_201 |
      | TestCase_205 |

  Scenario Outline: validating + Add another country Button
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
    And clicks Corporate account radio button
    And clicks Add another country button
    Then user displayed with another set of country,Incoming transaction volume per month, Incoming value per month,Outgoing transaction volume per month, Outgoing value per month fields with same validations
    Examples:
      | testcase |
      | TestCase_012 |
      | TestCase_017 |
      | TestCase_091 |
      | TestCase_092 |

  Scenario Outline: validating Add a product Screen Cancel button with Ok button
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
    And click on Cancel button
    Then user will prompt to ask about confirmation
    And click on Ok button
    Then user redirected to Product Selection screen
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |

  Scenario Outline: validating Add a product Screen Cancel button with Cancel button
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
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Cancel button
    Then user remains in the same Add A Product screen
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |

  Scenario Outline: validating Confirm button with Corporate Account Selection
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
    And clicks Corporate account radio button
    And fills all product management screen valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Product Selection screen
    And user displayed with Successful product added snack bar Message
    And Product Details entered is displayed in Product selection screen
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |

    @edit
  Scenario Outline: validating Edit button in Product List in Product selection screen
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
    And clicks Corporate account radio button
    And fills all product management screen valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Product Selection screen
    And Product Details entered is displayed in Product selection screen
    And clicks on Product Edit button
    And user lands on Modification Screen Add a product Screen with already given data
    And edits one or more fields product details in valid format
    And clicks on Confirm button
    And user displayed with Successfully Edited Floating Message
    Then user displayed with edited values in Product selection screen
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |

  Scenario Outline: validating Delete button in Product List with Cancel button
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
    And clicks Corporate account radio button
    And fills all product management screen valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Product Selection screen
    And Product Details entered is displayed in Product selection screen
    And user clicks on delete button
    And user is Displayed with product Delete Prompt
    And click on Cancel button
    Then Product is not removed from the list
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |


  Scenario Outline: validating Delete button in Product List with Ok button
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
    And clicks Corporate account radio button
    And fills all product management screen valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Product Selection screen
    And Product Details entered is displayed in Product selection screen
    And user clicks on delete button
    And user is Displayed with Delete Prompt
    And clicks on Ok button
    Then Product is removed from the list
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |

  Scenario Outline: validating Product selection screen Cancel button with Cancel button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And click on Cancel button
    Then user remains in Product selection screen
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |

  Scenario Outline: validating Product selection screen Cancel button with Ok button
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And swipes side menu and selects Product and User Management
    Then user lands on Product Selection screen
    And click Application Cancel button
    Then user will prompt to ask about confirmation
    And clicks on Ok button
    Then user lands on Dashboard
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |

  Scenario Outline: validating Product selection screen Continue button
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
    And clicks on Trade Finance button
    And user clicks confirm
    And Trade Finance is displayed in the Product selection screen <testcase>
    And clicks Add a new product button
    Then user lands on Add A Product screen
    And clicks Corporate account radio button
    And fills all product management screen valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Product Selection screen
    And Product Details entered is displayed in Product selection screen
    And clicks on Application Continue Button
    Then user lands on Administration details screen
    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |