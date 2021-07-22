Feature: I want to test task
  Scenario: I want to login with correct credentials
    Given : I go to main page
    When :I select task
    And :I login as"tester" with password"123-srx"
    Then :I should see the link to download file