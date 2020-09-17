package io.qameta.allure.examples;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.description;
import static io.qameta.allure.Allure.descriptionHtml;

public class AllureTestDescriptionTest {

    @Test
    public void allureSimpleDescriptionTest() {
        description("simple test description, \n" + "new line ignored");
    }

    @Test
    public void allureHTMLDescriptionTest() {
        descriptionHtml("<div style='border:1px black solid'><h2>HTML</h2><b>test</b> <i>description</i><br><div style='color:red'>new line</div>");
    }

}
