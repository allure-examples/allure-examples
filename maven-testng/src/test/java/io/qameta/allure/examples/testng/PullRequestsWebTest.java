package io.qameta.allure.examples.testng;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.examples.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

/**
 * @author eroshenkoam (Artem Eroshenko).
 */
@Layer("web")
@Owner("eroshenkoam")
@Feature("Pull Requests")
@PagePath("/{org}/{repo}/pulls")
public class PullRequestsWebTest {

    private static final String OWNER = "allure-framework";
    private static final String REPO = "allure2";

    private static final String BRANCH = "new-feature";

    private final WebSteps steps = new WebSteps();

    @BeforeMethod
    public void startDriver() {
        steps.startDriver();
    }

    @Test
    @Story("Create new pull request")
    //@Tags({@Tag("web"), @Tag("regress"), @Tag("smoke")})
    @JiraIssues({@JiraIssue("AE-1"), @JiraIssue("AE-2")})
    @Description("Create new pull request for authorized user")
    public void shouldCreatePullRequest() {
        steps.openPullRequestsPage(OWNER, REPO);
        steps.createPullRequestFromBranch(BRANCH);
        steps.shouldSeePullRequestForBranch(BRANCH);
    }

    @Test(description = "Close existing pull request for authorized user")
    @JiraIssue("AE-2")
    @Story("Close existing pull request")
    //@Tags({@Tag("web"), @Tag("regress")})
    public void shouldClosePullRequest() {
        steps.openPullRequestsPage(OWNER, REPO);
        steps.createPullRequestFromBranch(BRANCH);
        steps.closePullRequestForBranch(BRANCH);
        steps.shouldNotSeePullRequestForBranch(BRANCH);
    }

    @AfterMethod
    public void stopDriver() {
        steps.stopDriver();
    }

}