@E2E

Feature: Validating End to End features for andriod
  Background: User should be able launch and login into App
    Given user opens the App batch1

  Scenario Outline:  Validating End to End features
    And user in Login screen <testcase>
    When clicks language dropDown choose language <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And clicks Add A New User button
    And enters all the details in Add A New User screen
    And clicks on Confirm button
    And message will be appear on the bottom
    And clicks on Continue Button
    When user is in Entity name & type screen <testcase>
    And enters all mandatory fields <testcase>
    And clicks on Continue Button
    When user is in Entity Contact Information screen <testcase>
    And clicks on Email Address field
    And clicks on Company Website
    And clicks Add A New Address button
    And fills valid data in AddressType, UnitNo,Building name,street,Area, Country, State, town,city, zip,postalCode, PO Box
    And clicks on Confirm button
    And message will be appear on the bottom
    And clicks on Continue Button
    Then user lands on Business Location screen
    And user displayed with a Country of domicile dropdown field <testcase>
    And clicks Add A New Location button
    And fills valid data in Country and Type of operations fields <testcase>
    And click on Confirm button
    And message will be appear on the bottom
    Then user lands on Add A New Location screen
    And clicks Add A New Business Markets button
    And fills valid data in Country and Proportion of Business fields
    And click on Confirm button
    And message will be appear on the bottom
    And clicks on Application Continue Button
    Then user lands on Industry screen
    And clicks Add A New Industry button
    And fills valid data in Type of Industry, Section, Division, Group, Class <testcase>
    And click on Confirm button
    And message will be appear on the bottom
    And clicks on Continue Button
    And user is in Commercial License screen
    And fills valid data in Commercial licence number, Commercial licence issued by, Business activities,Commercial licence issue date, Commercial licence expiry date <testcase>
    And clicks on Continue Button
    Then user lands on Source of Funds screen
    And user is in Source of Funds screen
    And clicks Add A New Source of funds button
    And fills valid data in Source of funds, Country of origin for source of funds, Please elaborate on source of funds fields
    And clicks on Confirm button
    And message will be appear on the bottom
    And clicks on Continue Button
    Then user lands on Source of wealth screen
    And user is in Source of Wealth screen
    And clicks Add A New Source of Wealth button
    And fills valid data in Source of wealth field and Please elaborate
    And clicks on Confirm button
    And message will be appear on the bottom
    And clicks on Continue Button
    Then user lands on Product user management screen
    And clicks Add a new product button
    And clicks on Trade Finance button
    And user clicks confirm
    And clicks Add a new product button
    And clicks Corporate account radio button
    And fills all product management screen valid data in all the Mandatory fields
    And clicks on Confirm button
    Then user lands on Product Selection screen
    And message will be appear on the bottom
    And clicks on Application Continue Button
    Then user lands on Administration details screen

    Examples:
      | testcase |
      | TestCase_199 |
      | TestCase_200 |