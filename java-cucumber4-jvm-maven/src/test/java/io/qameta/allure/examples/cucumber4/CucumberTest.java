package io.qameta.allure.examples.cucumber4;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {
            "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
            "progress",
            "summary"
        }
)
public class CucumberTest {

}
