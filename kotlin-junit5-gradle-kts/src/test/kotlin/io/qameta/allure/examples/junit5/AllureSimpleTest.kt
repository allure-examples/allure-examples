package io.qameta.allure.examples.junit5

import io.qameta.allure.Allure.step
import io.qameta.allure.examples.kotlin.AllureHelpers.step
import io.qameta.allure.Step
import io.qameta.allure.model.Status
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class AllureSimpleTest {

    @Test
    @DisplayName("allureSimpleTest displayName")
    fun allureSimpleTest() {
        step("Simple step")
        step("Simple step with status", Status.FAILED)
        step("Simple lambda step") {
            step("Simple step inside lambda step")
        }
        simpleTestMethod("method parameter")
    }

    @Step("Simple test method with step annotation")
    fun simpleTestMethod(param: String) {
        step("Method parameter: $param")
        step("Simple step inside test method")
    }

}