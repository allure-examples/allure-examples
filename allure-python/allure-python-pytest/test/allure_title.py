import allure
import pytest


@allure.title("Some title for test")
def test_with_title():
    pass


@pytest.mark.parametrize("param", ["first", "second"])
def test_with_dynamic_title(param):
    allure.dynamic.title(f"Some title for test based on param {param}")


@allure.title("Fixture title")
@pytest.fixture()
def titled_fixture():
    pass


def test_with_titled_fixture(titled_fixture):
    pass
