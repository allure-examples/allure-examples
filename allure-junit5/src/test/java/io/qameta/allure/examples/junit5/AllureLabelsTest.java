package io.qameta.allure.examples.junit5;

import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.LabelAnnotation;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AllureLabelsTest {

    @Test
    @Epic("static epic")
    @Feature("static feature")
    @Story("static story")
    @Owner("static owner")
    public void commonStaticLabelTest() {
    }

    @Test
    public void commonDynamicLabelTest() {
        Allure.epic("dynamic epic");
        Allure.epic("dynamic feature");
        Allure.epic("dynamic story");
        Allure.epic("dynamic owner");
    }

    @Test
    @CustomLabel("static value")
    public void customStaticLabelTest() {
    }

    @Test
    public void customDynamicLabelTest() {
        Allure.label("custom", "dynamic value");
    }

    @Documented
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.TYPE})
    @LabelAnnotation(name = "custom")
    public @interface CustomLabel {

        String value();

    }


}
