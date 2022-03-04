Feature: Validating End to End features for andriod

  Scenario Outline:  Validate Login Credenials
    Given user opens the App batch1
    And user in Login screen <testcase>
    When enter username and password <testcase>
    And click login button
    Then user lands on Dashboard
    Then click add New Application
    And clicks Add A New User button
    And enters all the details in Add A New User screen
    And clicks on Confirm button
    And user will land on User Contact Details
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
    And user lands on Entity Contact information screen
    And clicks on Continue Button
    Then user lands on Business Location screen
    And clicks Add A New Location button
    And fills valid data in Country and Type of operations fields <testcase>
    And click on Confirm button
    Then user lands on Add A New Location screen
    And clicks Add A New Business Markets button
    And fills valid data in Country and Proportion of Business fields
    And click on Confirm button
    When user is in Business Location And Operations screen
    And clicks on Application Continue Button
    Then user lands on Industry screen
    And clicks Add A New Industry button
    And fills valid data in Type of Industry, Section, Division, Group, Class <testcase>
    And click on Confirm button
    And user lands on Industry screen
    And clicks on Continue Button
    And user is in Commercial License screen
    And fills valid data in Commercial licence number, Commercial licence issued by, Business activities,Commercial licence issue date, Commercial licence expiry date <testcase>
    And clicks on Continue Button
    Then user lands on Source of Funds screen
    And user is in Source of Funds screen
    And clicks Add A New Source of funds button
    And fills valid data in Source of funds, Country of origin for source of funds, Please elaborate on source of funds fields
    And clicks on Confirm button
    And clicks on Continue Button
    Then user lands on Source of wealth screen
    And user is in Source of Wealth screen
    Then user lands on Add A New Source of Wealth screen
    And fills valid data in Source of wealth field and Please elaborate
    And clicks on Confirm button
    Then user lands on Source of wealth screen
    And clicks on Continue Button
    Then user lands on Product user management screen

    Examples:
      | testcase |
      | TestCase_197 |
      | TestCase_198 |