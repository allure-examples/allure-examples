package io.qameta.allure.examples;

import io.qameta.allure.LabelAnnotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@LabelAnnotation(name = "url")
public @interface UrlPath {

    String value();

}
