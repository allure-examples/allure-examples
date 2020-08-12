package io.qameta.allure.examples;

import io.qameta.allure.LabelAnnotation;

import java.lang.annotation.*;

/**
 * @author eroshenkoam (Artem Eroshenko).
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@LabelAnnotation(name = "layer")
public @interface Layer {

    String value();

}
