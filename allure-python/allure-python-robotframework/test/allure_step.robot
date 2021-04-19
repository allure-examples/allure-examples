*** Test Cases ***
Test case with steps
    Comment     Every keyword is a step
    Some Custom Step

    Comment    Keyword arguments provided as is
    Custom Step With Arg    This message will be printed

    Comment    Inline arguments supports too
    Step Just Print "Hello World" To Output

*** Keywords ***
Some custom step
    Comment    This is nested steps
    No Operation

Custom Step With Arg
    [Arguments]    ${message}
    Comment    Keyword output attached to step
    Log    ${message}

Step Just Print "${message}" To Output
    Comment    This is inline keyword argument
    Log    ${message}
