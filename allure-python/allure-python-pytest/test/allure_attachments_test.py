import json
import os

import allure
from allure import attachment_type


def test_attach():
    allure.attach.file(os.path.join("resources", "allure-logo.png"), name="PNG example",
                       attachment_type=attachment_type.PNG)

    allure.attach("<h1>Example html attachment</h1>", name="HTML example", attachment_type=attachment_type.HTML)
    allure.attach("Some text content", name="TXT example", attachment_type=attachment_type.TEXT)
    allure.attach('first,second,third\none,two,three', name="CSV example", attachment_type=attachment_type.CSV)
    allure.attach(json.dumps({"first": 1, "second": 2}, indent=2),
                  name="JSON example", attachment_type=attachment_type.JSON)
    # TODO Screen diff
