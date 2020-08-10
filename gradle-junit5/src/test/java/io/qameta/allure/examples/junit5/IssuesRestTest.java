package io.qameta.allure.examples.junit5;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.examples.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.qameta.allure.Allure.parameter;

@Layer("rest")
@Owner("baev")
@Feature("Issues")
@UrlPath("/repos/{owner}/{repo}/issues")
public class IssuesRestTest {

    private static final String OWNER = "allure-framework";
    private static final String REPO = "allure2";

    private final RestSteps steps = new RestSteps();

    @Story("Create new issue")
    @Tags({@Tag("api"), @Tag("smoke")})
    @ParameterizedTest(name = "Create issue via api")
    @ValueSource(strings = {"First Note", "Second Note"})
    public void shouldCreateUserNote(String title) {
        parameter("owner", OWNER);
        parameter("repo", REPO);
        parameter("title", title);

        steps.createIssueWithTitle(OWNER, REPO, title);
        steps.shouldSeeIssueWithTitle(OWNER, REPO, title);
    }

    @Story("Close existing issue")
    @Tags({@Tag("web"), @Tag("regress")})
    @JiraIssues({@JiraIssue("AE-1")})
    @ParameterizedTest(name = "Close issue via api")
    @ValueSource(strings = {"First Note", "Second Note"})
    public void shouldDeleteUserNote(String title) {
        parameter("owner", OWNER);
        parameter("repo", REPO);
        parameter("title", title);

        steps.createIssueWithTitle(OWNER, REPO, title);
        steps.closeIssueWithTitle(OWNER, REPO, title);
    }


}
