package io.qameta.allure.examples.junit4;

import io.qameta.allure.Description;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static io.qameta.allure.Allure.parameter;
import static io.qameta.allure.Allure.step;

@RunWith(Parameterized.class)
public class AllureParameterizedTest {

    @Parameters(name = "{0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"First Name"}, {"Second Name"}
        });
    }

    @Parameter
    public String testParam;

    @Test
    @Description("allureParameterizedTest description")
    public void allureParameterizedTest() {
        parameter("testParam", testParam);
        step("Step inside parameterized test");
        step("Test parameter: " + testParam);
    }

}
