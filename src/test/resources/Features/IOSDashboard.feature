@regressionIOSDashboard
Feature: Validating Dashboard screen in NM_CO

  Background: User should be able launch and login into App
    Given user opens the App batch5

  Scenario Outline: validating change password option under overflow menu
    And user in Home screen <testcase>
    When clicks Register Button
    Then user lands on Dashboard
#    And clicks on overflow menu
#    And clicks on change password
    Examples:
      | testcase     |
      | TestCase_167|
      | TestCase_168 |

  Scenario Outline: validating logout option under overflow menu with Ok button
    And user in Home screen <testcase>
    When clicks Register Button
    Then user lands on Dashboard
#    And clicks on overflow menu
#    And clicks on logout
#    Then user is displayed with logout dialog box
#    And clicks on Ok button
#    Then user is displayed with login screen
    Examples:
      | testcase     |
      | TestCase_167|
      | TestCase_168 |

  Scenario Outline: validating logout option under overflow menu with Cancel button
    And user in Home screen <testcase>
    When clicks Register Button
    Then user lands on Dashboard
#    And clicks on overflow menu
#    And clicks on logout
#    Then user is displayed with logout dialog box
#    And clicks on Cancel button
#    Then user is displayed with Dashboard screen
    Examples:
      | testcase     |
      | TestCase_167|
      | TestCase_168 |

  @myapp
  Scenario Outline: validating My Applications section
    And user in Home screen <testcase>
    When clicks Register Button
    Then user lands on Dashboard
    And clicks on My Applications menu
    Then user is displayed with acquired 10 applications
    Examples:
      | testcase     |
      | TestCase_167|
      | TestCase_168 |

  @un
  Scenario Outline: validating Unclaimed Applications section
    And user in Home screen <testcase>
    When clicks Register Button
    Then user lands on Dashboard
    And clicks on Unclaimed Applications menu
    Then user is displayed with Unclaimed 10 applications
    Examples:
      | testcase     |
      | TestCase_167|
      | TestCase_168 |

  @com
  Scenario Outline: validating Completed Applications section
    And user in Home screen <testcase>
    When clicks Register Button
    Then user lands on Dashboard
    And clicks on Completed Applications menu
    Then user is displayed with Completed 10 applications
    Examples:
      | testcase     |
      | TestCase_167|
      | TestCase_168 |

  @ac
  Scenario Outline: validating Active Applications section
    And user in Home screen <testcase>
    When clicks Register Button
    Then user lands on Dashboard
    And clicks on Active Applications menu
    Then user is displayed with Active 10 applications
    Examples:
      | testcase     |
      | TestCase_167|
      | TestCase_168 |

  Scenario Outline: validating Date filter under Applications section
    And user in Home screen <testcase>
    When clicks Register Button
    Then user lands on Dashboard
    And clicks on Active Applications menu
#    And clicks on Calendar icon next to date
#    And enters valid date
#    And clicks Ok
#    Then user is displayed with respective applications
    Examples:
      | testcase     |
      | TestCase_167|
      | TestCase_168 |

  @se
  Scenario Outline: validating search option, accepts Alphanumeric
    And user in Home screen <testcase>
    When clicks Register Button
    Then user lands on Dashboard
    And clicks on My Applications menu
    And clicks on search
    And type a valid input
    Then user is displayed with respective applications
    Examples:
      | testcase     |
      | TestCase_167|
      | TestCase_168 |

  Scenario Outline: validating Release option under My Applications section
    And user in Home screen <testcase>
    When clicks Register Button
    Then user lands on Dashboard
    And clicks on My Applications menu
    Then user is displayed with 10 applications
#    And clicks on Release icon for a particular record
#    And clicks on Unclaimed Applications
#    Then user displayed with released record
    Examples:
      | testcase     |
      | TestCase_167|
      | TestCase_168 |

  Scenario Outline: validating Acquire option under Unclaimed Applications section
    And user in Home screen <testcase>
    When clicks Register Button
    Then user lands on Dashboard
    And clicks on Unclaimed Applications menu
    Then user is displayed with Unclaimed 10 applications
#    And clicks on Acquire icon for a particular record
#    And clicks on My Applications
#    Then user displayed with released record
    Examples:
      | testcase     |
      | TestCase_167|
      | TestCase_168 |

  Scenario Outline: validating Add New Application button
    And user in Home screen <testcase>
    When clicks Register Button
    Then user lands on Dashboard
    And clicks on Add New Application button
    When user is in Entity Contact Information screen <testcase>
    Examples:
      | testcase     |
      | TestCase_167|
      | TestCase_168 |

