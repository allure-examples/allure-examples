*** Settings ***
Library    AllureLibrary

*** Test Cases ***
Documentation test case
    [Documentation]    Some test doc
    No Operation

HTML Documentation test case
    [Documentation]    <h1>Some html doc<h1>
    No Operation

Dynamic documentation test case
    [Documentation]    This is initial doc
    BuiltIn.Set Test Documentation    \n\ndditional documentation string   append=True
