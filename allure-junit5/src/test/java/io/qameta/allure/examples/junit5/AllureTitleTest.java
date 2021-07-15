package io.qameta.allure.examples.junit5;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AllureTitleTest {

    @Test
    @DisplayName("Static name")
    public void annotationTitleTest() {
    }

    @Test
    public void dynamicTitleTest() {
        final String dynamicPart = "dynamic parameter";
        final String dynamicName = String.format("Test with parameter [%s]", dynamicPart);
        Allure.getLifecycle().updateTestCase(result -> result.setName(dynamicName));
    }

}
