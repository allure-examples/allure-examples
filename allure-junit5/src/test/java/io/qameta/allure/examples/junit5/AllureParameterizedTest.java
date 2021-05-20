package io.qameta.allure.examples.junit5;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.qameta.allure.Allure.parameter;
import static io.qameta.allure.Allure.step;

public class AllureParameterizedTest {

    @ParameterizedTest(name = "{displayName} [{argumentsWithNames}]")
    @ValueSource(strings = {"John", "Mike"})
    @DisplayName("allureParameterizedTest displayName")
    @Description("allureParameterizedTest description")
    public void allureParameterizedTest(String name) {
        parameter("Name", name);
    }

    @Test
    public void allureFakeParameterizedTest() {
        parameter("fakeParam","fakeValue");
        step("Step inside fake parameterized test");
    }

}
