import allure

pytestmark = [allure.epic("My first epic"), allure.feature("Quick start feature")]


@allure.id(1)
@allure.story("Simple story")
@allure.title("test_allure_simple_test displayName")
def test_allure_simple_test():
    with allure.step("Simple step"):
        pass

    with allure.step("Simple parent step"):
        with allure.step("Simple child step"):
            pass

    simple_step_func("function parameter")


@allure.step("Simple function with step decorator")
def simple_step_func(param):
    with allure.step(f"function parameter: {param}"):
        pass
    with allure.step("Simple step inside test function"):
        pass
