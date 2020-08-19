package io.qameta.allure.examples.cucumber5;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * @author eroshenkoam (Artem Eroshenko).
 */
public class WebSteps {

    @When("^I open labels page$")
    public void openLabelsPage() {
        maybeThrowElementNotFoundException();
    }


    @When("I open milestones page")
    public void openMilestonesPage() {

    }

    @And("I create label with title {string}")
    public void createLabelWithTitle(final String title) {
        maybeThrowElementNotFoundException();
    }

    @And("I create milestone with title {string}")
    public void createMilestoneWithTitle(String title) {

    }

    @And("I delete label with title {string}")
    public void deleteLabelWithTitle(final String title) {
        maybeThrowAssertionException(title);
    }

    @Then("I should see issue with label title {string}")
    public void labelsShouldContainsNoteWithText(final String title) {
        maybeThrowAssertionException(title);
    }

    @Then("I should not see note with content {string}")
    public void notesShouldNotContainsNoteWithText(final String text) {
        maybeThrowAssertionException(text);

    }

    @And("I delete milestone with title {string}")
    public void deleteMilestoneWithTitle(String title) {
    }

    @Then("I should see milestone with title {string}")
    public void shouldSeeMilestoneWithTitle(String title) {

    }

    @Then("I should not see milestone with content {string}")
    public void shouldNotSeeMilestoneWithContent(String title) {

    }

    @Then("I should see label with title {string}")
    public void iShouldSeeLabelWithTitle(String text) {

    }

    @When("I open issue with id {int}")
    public void openIssuePage(final int id) {
        maybeThrowElementNotFoundException();
    }

    @And("I add label with title {string} to issue")
    public void addLabelToIssue(final String text) {
        maybeThrowElementNotFoundException();
    }

    @And("I filter issue by label title {string}")
    public void filterIssueByLabel(final String title) {
        maybeThrowElementNotFoundException();
    }

    private void maybeThrowElementNotFoundException() {
        if (isTimeToThrowException()) {
            throw new RuntimeException("Element not found for xpath [//div[@class='something']]");
        }
    }

    private void maybeThrowAssertionException(String text) {
        try {
            Thread.sleep(1000);
            if (isTimeToThrowException()) {
                assertEquals(text, "another text");
            }
        } catch (InterruptedException e) {
            // do nothing test is dummy
        }
    }

    private boolean isTimeToThrowException() {
        return new Random().nextBoolean() && new Random().nextBoolean();
    }


}
