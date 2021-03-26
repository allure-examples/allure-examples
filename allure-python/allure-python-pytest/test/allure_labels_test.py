import allure
from allure_commons.types import Severity


@allure.epic("Allure TestOps")
@allure.feature("BDD")
@allure.story("Labels")
def test_allure_bdd_labels():
    pass


@allure.parent_suite("Custom parent suite")
@allure.suite("Custom suite")
@allure.sub_suite("Custom sub suite")
def test_allure_suites():
    pass


@allure.label("allure-examples", "allure-pytest")
def test_allure_custom_labels():
    pass


def test_dynamic_labels():
    allure.dynamic.label("test-image", "some-image:latest")


@allure.severity(Severity.CRITICAL)
def test_allure_severity():
    pass


@allure.tag("Tagged test")
def test_allure_tags():
    allure.dynamic.tag("Dynamic tag")


@allure.label("owner", "admin")
def test_owner():
    pass


@allure.id(123)
def test_allure_id():
    pass
