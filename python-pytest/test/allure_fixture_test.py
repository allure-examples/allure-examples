import allure
import pytest


@pytest.fixture(scope="session")
def session_level_fixture(request):
    with allure.step("Step inside session level fixture"):
        pass

    def finalizer():
        with allure.step("Step inside finalizer session level fixture"):
            pass

    request.addfinalizer(finalizer)


@pytest.fixture
def function_level_fixture(request):
    with allure.step("Step inside function level fixture"):
        pass

    def finalizer():
        with allure.step("Step inside finalizer function level fixture"):
            pass

    request.addfinalizer(finalizer)


def test_allure_fixture_test1(session_level_fixture, function_level_fixture):
    with allure.step("Step inside test_allure_fixture_test1"):
        pass


def test_allure_fixture_test2(session_level_fixture, function_level_fixture):
    with allure.step("Step inside test_allure_fixture_test2"):
        pass
