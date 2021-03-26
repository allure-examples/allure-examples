import allure


def test_docstring_description():
    """
    This is a test docstring
    It's will be shown as an allure test description
    Scenario:
     - pass
    """
    pass


@allure.description(
    """
This is test description from decorator\n
Scenario:
  - pass
  """)
def test_decorated_description():
    pass


@allure.description_html("""
This is <b>HTML</b> test description
<h2>Scenario:</h2>
<ul>
<li>pass</li>
</ul>
""")
def test_decorated_html_description():
    pass


def test_dynamic_description():
    """
    Initial test description
    """
    allure.dynamic.description(test_dynamic_description.__doc__ +
                               f"\n This is dynamic description part: {2 + 2}")
