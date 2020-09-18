package io.qameta.allure.examples;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.*;

public class AllureLinksTest {

    @Link("https://docs.qameta.io") // empty URL
    @Test
    public void allureOneParamLinkTest() {
        link("https://docs.qameta.io"); // empty name
    }

    @Links({@Link(name = "Allure Docs (@Link)", url = "https://docs.qameta.io"), @Link(name = "GitHub (@Link)", url = "https://github.com/allure-examples/")})
    @Test
    public void allureAnnotationLinkTest() {

    }

    @Test
    public void allureLambdaLinkTest() {
        link("Allure Docs (link)", "https://docs.qameta.io");

        // link types: tms issue custom
        link("GitHub Issue (link)", "issue", "https://github.com/allure-examples/allure-examples/issues/12");
        link("GitHub Tms (link)", "tms", "https://github.com/allure-examples/allure-examples/blob/master/allure-java-commons/README.md");
    }

    @Issues(@Issue("https://github.com/allure-examples/allure-examples/issues/12"))
    @Test
    public void allureAnnotationIssueTest() {

    }

    @Test
    public void allureLambdaIssueTest() {
        issue("GitHub Issue (issue)", "https://github.com/allure-examples/allure-examples/issues/12");
    }

    @TmsLinks(@TmsLink("https://github.com/allure-examples/allure-examples/blob/master/allure-java-commons/README.md"))
    @Test
    public void allureAnnotationTMSTest() {

    }

    @Test
    public void allureLambdaTMSTest() {
        tms("GitHub Tms (tms)", "https://github.com/allure-examples/allure-examples/blob/master/allure-java-commons/README.md");
    }

}
