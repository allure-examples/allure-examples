import allure
import pytest


@allure.title("Some title for test")
def test_with_title():
    pass


@allure.title("Test title with param {param}")
@pytest.mark.parametrize("param", ["first", "second"])
def test_with_dynamic_title(param):
    pass


@allure.title("Fixture title")
@pytest.fixture()
def titled_fixture():
    pass


def test_with_titled_fixture(titled_fixture):
    pass
