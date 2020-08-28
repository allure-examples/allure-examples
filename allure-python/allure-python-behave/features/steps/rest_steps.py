import allure
from behave import when
from behave import then


@when("I create label with title {title} via api")
def create_label_with_title(context, title):
    with allure.step("POST /repos/:owner/:repo/labels"):
        pass


@when("I delete label with title {title} via api")
def delete_label_with_title(context, title):
    with allure.step("GET /repos/:owner/:repo/labels?text={title}".format(title=title)):
        pass
    with allure.step("DELETE /repos/:owner/:repo/labels/237"):
        pass


@then("I should see label with title {text} via api")
def labels_should_contains_labrl_with_text(context, text):
    with allure.step("GET /repos/:owner/:repo/labels?text={text}".format(text=text)):
        pass
    with allure.step("GET /repos/:owner/:repo/labels/834"):
        pass


@then("I should not see label with content {text} via api")
def labels_should_not_contains_label_with_content(context, text):
    with allure.step("GET /repos/:owner/:repo/labels?text={text}".format(text=text)):
        pass
    with allure.step("GET /repos/:owner/:repo/labels/834"):
        pass
