package io.qameta.allure.examples.testng;

import io.qameta.allure.Description;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.parameter;
import static io.qameta.allure.Allure.step;

public class AllureParameterizedTest {

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] { {"First Name"}, {"Second Name"} };
    }

    @Test(description = "allureParameterizedTest displayName", dataProvider = "data-provider")
    @Parameters({"testParam"})
    @Description("allureParameterizedTest description")
    public void allureParameterizedTest(String testParam) {
        //parameter("testParam", testParam);
        step("Step inside parameterized test");
        step("Test parameter: " + testParam);
    }

    @Test
    public void allureFakeParameterizedTest() {
        parameter("fakeParam","fakeValue");
        step("Step inside fake parameterized test");
    }

}
