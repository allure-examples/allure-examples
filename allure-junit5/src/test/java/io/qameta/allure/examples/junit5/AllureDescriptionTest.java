package io.qameta.allure.examples.junit5;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

public class AllureDescriptionTest {

    @Test
    @Description("Static description")
    public void annotationDescriptionTest() {
    }

    /**
     * JavaDoc description
     */
    @Test
    @Description(useJavaDoc = true)
    public void javadocDescriptionTest() {
    }

    @Test
    public void dynamicDescriptionTest() {
        Allure.description("Dynamic description");
    }

}
