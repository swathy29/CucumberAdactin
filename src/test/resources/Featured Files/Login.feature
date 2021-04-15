@Login
Feature: To validate login functionality
  @Sanity @Regression
  Scenario Outline: To validate login functionality with different credentials
    Given user is in facebook login page
    When user enter invalid "<username>" and "<password>"
    And user click login button
    Then user should be in invalid credentials page

    Examples: 
      | username | password     |
      | java     | java@123     |
                                                                  