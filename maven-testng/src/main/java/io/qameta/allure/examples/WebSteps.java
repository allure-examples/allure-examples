package io.qameta.allure.examples;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author eroshenkoam (Artem Eroshenko).
 */
public class WebSteps {

    @Step("Starting web driver")
    public void startDriver() {
        maybeThrowSeleniumTimeoutException();
    }

    @Step("Stopping web driver")
    public void stopDriver() {
        maybeThrowSeleniumTimeoutException();
    }

    @Step("Open issues page `{owner}/{repo}`")
    public void openIssuesPage(final String owner, final String repo) {
        attachPageSource();
        maybeThrowElementNotFoundException();
    }

    @Step("Open pull requests page `{owner}/{repo}`")
    public void openPullRequestsPage(final String owner, final String repo) {
        attachPageSource();
        maybeThrowElementNotFoundException();
    }

    @Step("Create pull request from branch `{branch}`")
    public void createPullRequestFromBranch(final String branch) {
        maybeThrowElementNotFoundException();
    }

    @Step("Create issue with title `{title}`")
    public void createIssueWithTitle(String title) {
        maybeThrowAssertionException(title);
    }

    @Step("Close pull request for branch `{branch}`")
    public void closePullRequestForBranch(final String branch) {
        maybeThrowAssertionException(branch);
    }

    @Step("Close issue with title `{title}`")
    public void closeIssueWithTitle(final String title) {
        maybeThrowAssertionException(title);
    }

    @Step("Check pull request for branch `{branch}` exists")
    public void shouldSeePullRequestForBranch(final String branch) {
        maybeThrowAssertionException(branch);
    }

    @Step("Check issue with title `{title}` exists")
    public void shouldSeeIssueWithTitle(final String title) {
        maybeThrowAssertionException(title);
    }

    @Step("Check pull request for branch `{branch}` not exists")
    public void shouldNotSeePullRequestForBranch(final String branch) {
        maybeThrowAssertionException(branch);
    }

    @Step("Check issue with title `{title}` not exists")
    public void shouldNotSeeIssueWithTitle(final String title) {
        maybeThrowAssertionException(title);
    }

    @Attachment(value = "Page", type = "text/html", fileExtension = "html")
    public byte[] attachPageSource() {
        try {
            final InputStream stream = ClassLoader.getSystemResourceAsStream("index.html");
            return IOUtils.toString(stream, Charset.forName("UTF-8")).getBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void maybeThrowSeleniumTimeoutException() {
        if (isTimeToThrowException()) {
            throw new RuntimeException("Selenium timeout: selenium unavailable now");
        }
    }

    private void maybeThrowElementNotFoundException() {
        try {
            Thread.sleep(1000);
            if (isTimeToThrowException()) {
                throw new RuntimeException("Element not found for xpath [//div[@class='something']]");
            }
        } catch (InterruptedException e) {
            //do nothing, it's dummy test
        }
    }

    private void maybeThrowAssertionException(String text) {
        if (isTimeToThrowException()) {
            assertEquals(text, "another text");
        }
    }

    private boolean isTimeToThrowException() {
        return new Random().nextBoolean()
                && new Random().nextBoolean()
                && new Random().nextBoolean()
                && new Random().nextBoolean();
    }
}
