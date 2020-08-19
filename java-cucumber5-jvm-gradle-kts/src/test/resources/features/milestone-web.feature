#language: en
#@allure.label.layer:web
#@allure.label.owner:baev
#@allure.label.page:/{org}/{repo}/milestones
Feature: Milestones

  @smoke @regress
  #@allure.label.jira:AE-1
  #@allure.label.jira:AE-2
  Scenario: Create new milestone for authorized user
    When I open milestones page
    And I create milestone with title "hello"
    Then I should see milestone with title "hello"

  @regress
  #@allure.label.jira:AE-2
  Scenario: Close existing milestone for authorized user
    When I open milestones page
    And I create milestone with title "hello"
    And I delete milestone with title "hello"
    Then I should not see milestone with content "hello"
