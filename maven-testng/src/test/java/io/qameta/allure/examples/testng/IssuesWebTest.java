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
@Feature("Issues")
@PagePath("/{org}/{repo}/issues")
public class IssuesWebTest {

    private static final String OWNER = "allure-framework";
    private static final String REPO = "allure2";

    private static final String ISSUE_TITLE = "Some issue title here";

    private final WebSteps steps = new WebSteps();

    @BeforeMethod
    public void startDriver() {
        steps.startDriver();
    }

    @Test
    @Story("Create new issue")
    @JiraIssues({@JiraIssue("AE-2")})
    //@Tags({@Tag("web"), @Tag("critical")})
    @Description("Create new issue authorized user")
    public void shouldCreateIssue() {
        steps.openIssuesPage(OWNER, REPO);
        steps.createIssueWithTitle(ISSUE_TITLE);
        steps.shouldSeeIssueWithTitle(ISSUE_TITLE);
    }

    @Test(description = "Create new issue with labels")
    @Story("Create new issue")
    //@Tags({@Tag("web"), @Tag("regress")})
    @JiraIssues({@JiraIssue("AE-1")})
    public void shouldAddLabelToIssue() {
        steps.openIssuesPage(OWNER, REPO);
        steps.createIssueWithTitle(ISSUE_TITLE);
        steps.shouldSeeIssueWithTitle(ISSUE_TITLE);
    }

    @Test(description = "Close new issue for authorized user")
    @Story("Close existing issue")
    //@Tags({@Tag("web"), @Tag("regress")})
    @JiraIssues({@JiraIssue("AE-1")})
    public void shouldCloseIssue() {
        steps.openIssuesPage(OWNER, REPO);
        steps.createIssueWithTitle(ISSUE_TITLE);
        steps.closeIssueWithTitle(ISSUE_TITLE);
        steps.shouldNotSeeIssueWithTitle(ISSUE_TITLE);
    }

    @AfterMethod
    public void stopDriver() {
        steps.stopDriver();
    }

}