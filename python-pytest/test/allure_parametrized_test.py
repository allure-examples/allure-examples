import allure
import pytest


@pytest.mark.parametrize("test_param", ["First name", "Second name"], ids=["first", "second"])
@allure.title("test_allure_parametrized_test [{test_param}]")
def test_allure_parametrized_test(test_param):
    with allure.step("Step inside parametrized test"):
        pass
    with allure.step("Test parameter: {parameter}".format(parameter=test_param)):
        pass