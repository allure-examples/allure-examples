package io.qameta.allure.examples.junit4;

import org.junit.*;

import static io.qameta.allure.Allure.step;

public class AllureFixtureTest {

    @BeforeClass
    public static void beforeClass() {
        step("Step inside beforeClass");
    }

    @Before
    public void before() {
        step("Step inside before");
    }

    @Test
    public void allureFixtureTest() {
        step("Step inside allureFixtureTest");
    }

    @Test
    public void allureFixtureTest2() {
        step("Step inside allureFixtureTest2");
    }

    @After
    public void after() {
        step("Step inside after");
    }

    @AfterClass
    public static void afterClass() {
        step("Step inside afterClass");
    }

}
