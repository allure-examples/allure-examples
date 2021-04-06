*** Settings ***
Force Tags    allure.epic:My first epic     allure.feature:Quick start feature

*** Test Cases ***
Simple test case
    [Tags]    allure.id:1    allure.story:Simple story
    Simple Step

*** Keywords ***
Simple step
    No Operation