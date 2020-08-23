#language: en
#@allure.label.layer:rest
#@allure.label.owner:eroshenkoam
#@allure.label.url:/repos/{owner}/{repo}/labels
Feature: Labels

  @smoke
  Scenario: Create new label via api
    When I create label with title "hello" via api
    Then I should see label with title "hello" via api

  @regress
  #@allure.label.jira:AE-1
  Scenario: Delete existing label via api
    When I create label with title "hello" via api
    And I delete label with title "hello" via api
    Then I should not see label with content "hello" via api
