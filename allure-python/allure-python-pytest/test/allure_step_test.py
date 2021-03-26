import allure


@allure.step
def step_function_with_args(arg1, arg2):
    pass


@allure.step("Step with param '{param}'")
def step_with_placeholder(param):
    pass


@allure.step("Custom step title")
def step_function_with_title():
    pass


def test_step():
    with allure.step("First step"):
        step_with_placeholder("Param value")
        with allure.step("Nested step"):
            step_function_with_args("value1", "value2")
    step_function_with_title()
