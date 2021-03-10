import allure
import pytest
from allure_commons.types import LinkType

pytestmark = [pytest.mark.some_mark, allure.tag("Tag as pytest mark")]


@pytest.mark.allure_label("Allure TestOps", label_type="epic")
@pytest.mark.allure_label("BDD", label_type="feature")
@pytest.mark.allure_label("Marks", label_type="story")
@pytest.mark.allure_link("https://github.com", name="GitHub", link_type=LinkType.LINK)
@pytest.mark.parametrize("param", [
    pytest.param("value", marks=pytest.mark.allure_description("This is description from pytest mark"),
                 id="description"),
    pytest.param("value", marks=pytest.mark.allure_description_html("This is <b>html</b> description from pytest mark"),
                 id="html_description")
])
def test_marks(param):
    pass
