package io.qameta.allure.examples;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.*;

@Epics(@Epic("Epic from class annotation"))
@Features(@Feature("Feature from class annotation"))
@Stories({@Story("Story from class annotation"), @Story("Story2 from class annotation")})
public class AllureBehaviorsMappingTest {

    @Test
    public void allureLambdaSuiteTest() {
        suite("Suite from lambda annotation");
    }

    @Epic("Epic from test annotation")
    @Feature("Feature from test annotation")
    @Story("Story from test annotation")
    @Test
    public void allureBehaviorsMappingTest() {

    }

    @Test
    public void allureLambdaBehaviorsMappingTest() {
        epic("Epic from lambda method");
        feature("Feature from lambda method");
        story("Story from lambda method");
    }

    @Epic("Epic2 from test annotation")
    @Test
    public void allureEpicMappingTest() {
        epic("Epic2 from lambda method");
    }

    @Feature("Feature2 from test annotation")
    @Test
    public void allureFeatureMappingTest() {
        feature("Feature2 from lambda method");
    }

    @Story("Story2 from test annotation")
    @Test
    public void allureStoryMappingTest() {
        story("Story2 from lambda method");
    }

}