package io.qameta.allure.examples.cucumber5;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.qameta.allure.Allure.step;

public class RestSteps {

    @When("I create label with title {string} via api")
    public void createLabelWithTitle(final String title) {
        step("POST /repos/:owner/:repo/labels");
    }

    @When("I delete label with title {string} via api")
    public void deleteLabelWithTitle(final String title) {
        step("GET /repos/:owner/:repo/labels?text=" + title);
        step("DELETE /repos/:owner/:repo/labels/237");

    }

    @Then("I should see label with title {string} via api")
    public void labelsShouldContainsNoteWithText(final String text) {
        step("GET /repos/:owner/:repo/labels?text=" + text);
        step("GET /repos/:owner/:repo/labels/834");
    }

    @Then("I should not see label with content {string} via api")
    public void labelsShouldNotContainsNoteWithText(final String text) {
        step("GET /repos/:owner/:repo/labels?text=" + text);
        step("GET /repos/:owner/:repo/labels/834");
    }

}
