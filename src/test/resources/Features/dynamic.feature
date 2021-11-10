@DynamicAppLaunch

Feature: validating dynamic app launch

Scenario Outline: validating dynamic app launch
Given user launch app using dynamic url <testcase>
When  launcing our app
Examples:
| testcase     |
| TestCase_000 |