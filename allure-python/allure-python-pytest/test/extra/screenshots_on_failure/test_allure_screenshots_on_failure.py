import allure
import pytest
from selenium import webdriver


@pytest.fixture(autouse=True)
def driver(request):
    options = webdriver.ChromeOptions()
    options.headless = True
    chrome_driver = webdriver.Chrome(options=options)
    chrome_driver.get('https://google.com')
    yield chrome_driver
    try:
        if request.node.rep_setup.failed or request.node.rep_call.failed:
            allure.attach(chrome_driver.get_screenshot_as_png(),
                          attachment_type=allure.attachment_type.PNG)
    except AttributeError:
        # rep_setup and rep_call attributes are generated in runtime and can be absent
        pass
    chrome_driver.close()


@pytest.fixture()
def failed_setup():
    pytest.fail("Failed in setup")


def test_failed_setup(failed_setup):
    pass


def test_failed_body():
    pytest.fail("Failed in test body")
