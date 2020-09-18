package io.qameta.allure.examples;

import io.qameta.allure.model.Status;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureLambdaStepTest {

    @Test
    public void allureSimpleStepTest() {
        step("Simple step");
        step("Simple step with failed status", Status.FAILED);
        step("Simple step with skipped status", Status.SKIPPED);
        step("Simple step with broken status", Status.BROKEN);
        step("Simple step with passed status", Status.PASSED);
    }

    @Test
    public void allureLambdaStepTest() {
        step("Simple lambda step", () -> {
            step("Simple step inside lambda step");
        });

        step("Lambda step with parameter", (step) -> {
            step.parameter("param", "value");
        });

        step("Old step name", (step) -> {
            step.name("Dynamic step name");
        });
    }

}
