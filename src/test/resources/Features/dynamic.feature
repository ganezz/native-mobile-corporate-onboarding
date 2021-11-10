@DynamicAppLaunch
Scenario Outline: validating dynamic app launch
Given user launch dynamic mobile app with valid capabilities <testcase>
When  launcing our app
Examples:
| testcase |
| TestCase_000|