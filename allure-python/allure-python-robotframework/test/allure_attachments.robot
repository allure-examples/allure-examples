*** Settings ***
Library     AllureLibrary

*** Test Cases ***
Data Attach
    Attach File    resources${/}allure-logo.png     name=PNG Example

    Attach     Some text content
    ...                 name=TEXT Example
    ...                 extension=txt

    Attach     <h1>Some HTML example<h1>
    ...                 name=HTML Example
    ...                 extension=html

    Attach     first,second,third\none,two,three
    ...                 name=CSV Example
    ...                 extension=csv

    ${json}     Evaluate    json.dumps({"first": 123, "second": 321}, indent=2)
    ...                     modules=json

    Attach    ${json}
    ...       name=JSON Example
    ...       extension=json

    Attach    https://github.com/allure-framework \nhttps://github.com/allure-examples
    ...       name=URI List Example
    ...       attachment_type=URI_LIST
