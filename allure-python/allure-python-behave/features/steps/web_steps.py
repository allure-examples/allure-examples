import random
import time
from behave import when
from behave import then


@when("I open labels page")
def open_labels_page(context):
    maybe_throw_element_not_found_exception()


@when("I open milestones page")
def open_milestones_page(context):
    pass


@when("I create label with title {title}")
def create_label_with_title(context, title):
    maybe_throw_element_not_found_exception()


@when("I create milestone with title {title}")
def create_milestone_with_title(context, title):
    pass


@when("I delete label with title {title}")
def delete_label_with_title(contxt, title):
    maybe_throw_assertion_exception(title)


@then("I should see issue with label title {title}")
def labels_should_contains_note_with_text(context, title):
    maybe_throw_assertion_exception(title)


@then("I should not see note with content {text}")
def notes_should_not_contains_note_with_text(context, text):
    maybe_throw_assertion_exception(text)


@when("I delete milestone with title {title}")
def delete_milestone_with_title(context, title):
    pass


@then("I should see milestone with title {title}")
def should_see_milestone_with_title(context, title):
    pass


@then("I should not see milestone with content {title}")
def should_not_see_milestone_with_content(context, title):
    pass


@then("I should see label with title {text}")
def should_see_label_with_title(context, text):
    pass


@when("I open issue with id {id}")
def open_issue_page(context, id):
    maybe_throw_element_not_found_exception()


@when("I add label with title {text} to issue")
def add_label_to_issue(contxt, text):
    maybe_throw_element_not_found_exception()


@when("I filter issue by label title {title}")
def filter_issue_by_label(context, title):
    maybe_throw_element_not_found_exception()


def maybe_throw_element_not_found_exception():
    if is_time_to_throw_exception():
        raise RuntimeError("Element not found for xpath [//div[@class='something']]")


def maybe_throw_assertion_exception(text):
    time.sleep(1)
    if is_time_to_throw_exception():
        assert text == "another text"


def is_time_to_throw_exception():
    return random.choice([True, False]) and random.choice([True, False])
