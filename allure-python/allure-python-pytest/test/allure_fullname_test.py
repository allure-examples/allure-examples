import pytest
from allure_commons.reporter import AllureReporter
from allure_pytest.listener import AllureListener


@pytest.fixture()
def allure_reporter(request) -> AllureReporter:
    listener: AllureListener = next(
        filter(
            lambda plugin: (isinstance(plugin, AllureListener)),
            dict(request.config.pluginmanager.list_name_plugin()).values(),
        ),
        None,
    )
    return listener.allure_logger


def test_fullname(allure_reporter):
    assert allure_reporter.get_test(None).fullName == "test.allure_fullname_test#test_fullname"
