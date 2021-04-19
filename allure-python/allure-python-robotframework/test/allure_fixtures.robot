*** Settings ***
Suite Setup       Suite preconditions
Suite Teardown    Suite postconditions
Test Setup        Test preconditions
Test Teardown     Test postconditions

*** Test Cases ***
First Case
    No Operation

Second Case
    No Operation

*** Keywords ***
Suite preconditions
    Log    Suite ${SUITE NAME} started

Suite postconditions
    Log    Suite ${SUITE NAME} ended

Test preconditions
    Log    Test ${TEST NAME} started

Test postconditions
    Log    Test ${TEST NAME} ended
