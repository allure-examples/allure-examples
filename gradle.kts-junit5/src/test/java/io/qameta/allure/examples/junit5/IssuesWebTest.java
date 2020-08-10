package io.qameta.allure.examples.junit5;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.examples.*;
import org.junit.jupiter.api.*;

/**
 * @author eroshenkoam (Artem Eroshenko).
 */
@Layer("web")
@Owner("eroshenkoam")
@Feature("Issues")
@PagePath("/{org}/{repo}/issues")
public class IssuesWebTest {

    private static final String OWNER = "allure-framework";
    private static final String REPO = "allure2";

    private static final String ISSUE_TITLE = "Some issue title here";

    private final WebSteps steps = new WebSteps();

    @BeforeEach
    public void startDriver() {
        steps.startDriver();
    }

    @Test
    @Story("Create new issue")
    @JiraIssues({@JiraIssue("AE-2")})
    @Tags({@Tag("web"), @Tag("critical")})
    @DisplayName("Create new issue authorized user")
    public void shouldCreateIssue() {
        steps.openIssuesPage(OWNER, REPO);
        steps.createIssueWithTitle(ISSUE_TITLE);
        steps.shouldSeeIssueWithTitle(ISSUE_TITLE);
    }

    @Test
    @Story("Create new issue")
    @Tags({@Tag("web"), @Tag("regress")})
    @JiraIssues({@JiraIssue("AE-1")})
    @DisplayName("Create new issue with labels")
    public void shouldAddLabelToIssue() {
        steps.openIssuesPage(OWNER, REPO);
        steps.createIssueWithTitle(ISSUE_TITLE);
        steps.shouldSeeIssueWithTitle(ISSUE_TITLE);
    }

    @Test
    @Story("Close existing issue")
    @Tags({@Tag("web"), @Tag("regress")})
    @JiraIssues({@JiraIssue("AE-1")})
    @DisplayName("Close new issue for authorized user")
    public void shouldCloseIssue() {
        steps.openIssuesPage(OWNER, REPO);
        steps.createIssueWithTitle(ISSUE_TITLE);
        steps.closeIssueWithTitle(ISSUE_TITLE);
        steps.shouldNotSeeIssueWithTitle(ISSUE_TITLE);
    }

    @AfterEach
    public void stopDriver() {
        steps.stopDriver();
    }

}