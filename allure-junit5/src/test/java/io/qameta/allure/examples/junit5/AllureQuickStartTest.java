package io.qameta.allure.examples.junit5;

import io.qameta.allure.Step;
import io.qameta.allure.model.Status;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureQuickStartTest {

    @Test
    @DisplayName("allureSimpleTest displayName")
    public void allureSimpleTest() {
        step("Simple step");
        step("Simple step with status", Status.FAILED);
        step("Simple lambda step", () -> {
            step("Simple step inside lambda step");
        });
        simpleTestMethod("method parameter");
    }

    @Step("Simple test method with step annotation")
    public void simpleTestMethod(String param) {
        step("Method parameter: " + param);
        step("Simple step inside test method");
    }

}
