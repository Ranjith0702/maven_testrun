Feature: Table
@first
  Scenario: student table
    Given I have the following student details
      | Name   | Age |
      | Subin  | 23  |
      | Lokesh | 22  |
      | Tharun | 21  |
    When I search for a student with age 22
    Then I find 1 student