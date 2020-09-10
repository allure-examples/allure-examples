package io.qameta.allure.examples.junit5

import io.qameta.allure.Allure
import io.qameta.allure.Description
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class AllureParameterizedTest {

    @ParameterizedTest(name = "{displayName} [{argumentsWithNames}]")
    @ValueSource(strings = ["First Name", "Second Name"])
    @DisplayName("allureParameterizedTest displayName")
    @Description("allureParameterizedTest description")
    fun allureParameterizedTest(testParam: String) {
        Allure.parameter("testParam", testParam)
        Allure.step("Step inside parameterized test")
        Allure.step("Test parameter: $testParam")
    }

    @Test
    fun allureFakeParameterizedTest() {
        Allure.parameter("fakeParam", "fakeValue")
        Allure.step("Step inside fake parameterized test")
    }

}