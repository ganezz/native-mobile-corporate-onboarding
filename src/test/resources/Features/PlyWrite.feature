
@ply
Feature: plyWrite poc

#without plyWright
  Scenario Outline: for practice purpose launching random page
    Given launch webapp <testcase>

    Examples:
      | testcase     |
      | TestCase_002 |

#with plyWright
    @chromium
  Scenario Outline: for practice purpose launching random page using plyWrite launcher
    Given  using plyWrite launch webapp<testcase>

    Examples:
      | testcase     |
      | TestCase_002 |


#with plyWright
    @chrome
  Scenario Outline: for practice purpose launching random page using plyWrite chrome
    Given using plyWrite chrome launch <testcase>

    Examples:
      | testcase     |
      | TestCase_002 |
