*** Settings ***
Force Tags    allure.epic:TestOps

*** Test Cases ***
BDD Test case
    [Tags]    allure.story:Labels   allure.feature:BDD
    No Operation

Suites
    [Tags]    allure.parentSuite:Custom parent suite
    ...       allure.suite:Custom suite
    ...       allure.subSuite:Custom sub suite
    No Operation

Custom label
    [Tags]      allure.label.repo:allure-examples
    No Operation

Severity
    [Tags]      allure.severity:critical
    No Operation

Owner
    [Tags]      allure.label.owner:admin
    No Operation

Allure ID
    [Tags]      allure.id:123
    No Operation

Tags
    [Tags]      just-tag
    No Operation
