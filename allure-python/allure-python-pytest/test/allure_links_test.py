import allure
# TODO replace test case link to TestOps


@allure.link("https://github.com/allure-examples/", name="Allure Examples")
@allure.issue("https://github.com/allure-examples/allure-examples/issues/1", name="ISSUE-1")
@allure.testcase("https://github.com/allure-examples/allure-examples/issues/2", name="TESTCASE-2")
def test_allure_links():
    pass


def test_allure_dynamic_links():
    allure.dynamic.link("https://github.com/allure-examples/allure-examples/pull/4",
                        name="Allure Examples pull request 4")
    allure.dynamic.issue("https://github.com/allure-examples/allure-examples/issues/1",
                         name="ISSUE-1")
    allure.dynamic.testcase("https://github.com/allure-examples/allure-examples/issues/2",
                            name="TESTCASE-2")


def pr(pr_id):
    return allure.link(pr_id, name=f"PR {pr_id}", link_type="pr")


@pr("123")
def test_link_templates():
    pass
