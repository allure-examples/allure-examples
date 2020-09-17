package io.qameta.allure.examples;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.label;
import static io.qameta.allure.Allure.step;

public class AllureLabelsTest {

    @Test
    public void allureLabelTest() {
        label("label 1", "label 1 value");
        step("step with label", () -> {
            label("label 2", "label 2 value");
        });
    }

}
