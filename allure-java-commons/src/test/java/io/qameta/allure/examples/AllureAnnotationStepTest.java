package io.qameta.allure.examples;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureAnnotationStepTest {

    @Test
    public void allureStepAnnotationTest() {
        simpleTestMethod();
        parametrizedTestMethod("method parameter");
        parametrizedWithFieldTestMethod("field parameter");
    }

    @Step("Parametrized test method with step annotation'")
    public void parametrizedTestMethod(String param) {
        step("Method parameter: " + param);
    }

    @Step("Parametrized test method with fields: '{param}'")
    public void parametrizedWithFieldTestMethod(String param) {

    }

    @Step("Simple test method with step annotation")
    public void simpleTestMethod() {
        step("Simple step inside test method");
    }

}
