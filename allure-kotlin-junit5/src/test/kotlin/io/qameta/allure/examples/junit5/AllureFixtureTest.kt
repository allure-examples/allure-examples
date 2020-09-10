package io.qameta.allure.examples.junit5

import io.qameta.allure.Allure.step
import org.junit.jupiter.api.*

class AllureFixtureTest {

    companion object {
        @JvmStatic
        @BeforeAll
        fun beforeAll() {
            step("Step inside beforeAll")
        }

        @JvmStatic
        @AfterAll
        fun afterAll() {
            step("Step inside afterAll")
        }
    }

    @BeforeEach
    fun beforeEach() {
        step("Step inside beforeEach")
    }

    @Test
    fun allureFixtureTest() {
        step("Step inside allureFixtureTest")
    }

    @Test
    fun allureFixtureTest2() {
        step("Step inside allureFixtureTest2")
    }

    @AfterEach
    fun afterEach() {
        step("Step inside afterEach")
    }

}