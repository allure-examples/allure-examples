package io.qameta.allure.examples;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.suite;

public class AllureSuiteTest {

    @Test
    public void allureSuiteTest() {
        suite("allure suite 1");
    }

    @Test
    public void allureSuite2Test() {
        suite("allure suite 2");
    }

}
