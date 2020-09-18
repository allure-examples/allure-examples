package io.qameta.allure.examples;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.label;

public class AllureLabelsTest {

    /**
     * Feature of Allure EE and Allure 3
     */
    @Test
    public void allureLabelTest() {
        //Custom Fields
        label("microservice", "Report");
        label("env", "Stage");

        //Test Layer
        label("layer", "Selenium");
        label("layer", "API");

        //Members
        label("author", "eroshenkoam");
        label("author", "simple-elf");
    }

}
