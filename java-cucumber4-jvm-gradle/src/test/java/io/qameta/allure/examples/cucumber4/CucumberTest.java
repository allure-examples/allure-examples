package io.qameta.allure.examples.cucumber4;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {
            "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
            "progress",
            "summary"
        }
)
public class CucumberTest extends AbstractTestNGCucumberTests {

}
