import json
import os
from functools import wraps

import allure
from allure import attachment_type


# attach a file of the specified type by a decorator
def attach_pcap(path):
    def outer(func):
        @wraps(func)
        def inner(*args, **kwargs):
            allure.attach.file(path, attachment_type=allure.attachment_type.PCAP)
            return func(*args, **kwargs)

        return inner

    return outer


def test_attach():
    allure.attach.file(os.path.join("resources", "allure-logo.png"), name="PNG example",
                       attachment_type=attachment_type.PNG)

    allure.attach("<h1>Example html attachment</h1>", name="HTML example", attachment_type=attachment_type.HTML)
    allure.attach("Some text content", name="TXT example", attachment_type=attachment_type.TEXT)
    allure.attach('first,second,third\none,two,three', name="CSV example", attachment_type=attachment_type.CSV)
    allure.attach(json.dumps({"first": 1, "second": 2}, indent=2),
                  name="JSON example", attachment_type=attachment_type.JSON)
    allure.attach("\n".join(["https://github.com/allure-framework", "https://github.com/allure-examples"]),
                  name="URI List example", attachment_type=attachment_type.URI_LIST)
    # TODO Screen diff
