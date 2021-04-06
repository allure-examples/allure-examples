*** Test Cases ***
Passed Test
    Should Be Equal    123      123     msg=Do not fail

Failed test
    Fail     msg=Some reason

Broken test
    [Documentation]    Not realized
    Evaluate    1 / 0

Skipped test
    Skip    Skip test for some reason

Skipped for condition test
    Skip If    1 != 2   msg=Skip test for condition
