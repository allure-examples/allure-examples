import allure
import pytest


@pytest.fixture(autouse=True)
def add_allure(doctest_namespace):
    doctest_namespace["allure"] = allure


def doctest_func():
    """
    >>> with allure.step("Step in doctest body"):
    ...    doctest_func()
    True
    """
    return True
