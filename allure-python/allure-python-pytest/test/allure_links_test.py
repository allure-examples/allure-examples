import allure
# TODO replace test case link to TestOps


@allure.link("https://github.com/allure-examples/", name="Allure Examples")
@allure.issue("https://github.com/allure-examples/allure-examples/issues/1", name="ISSUE-1")
@allure.testcase("https://github.com/allure-examples/allure-examples/issues/2", name="TESTCASE-2")
def test_allure_links():
    pass


def test_allure_dynamic_links():
    allure.dynamic.link(f"https://github.com/allure-examples/allure-examples/pull/4",
                        name=f"Allure Examples pull request 4")
    allure.dynamic.issue(f"https://github.com/allure-examples/allure-examples/issues/1",
                         name=f"ISSUE-1")
    allure.dynamic.testcase(f"https://github.com/allure-examples/allure-examples/issues/2",
                            name=f"TESTCASE-2")
