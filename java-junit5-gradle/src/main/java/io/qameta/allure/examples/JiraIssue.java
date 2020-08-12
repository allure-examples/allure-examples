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
@Repeatable(io.qameta.allure.examples.JiraIssues.class)
@LabelAnnotation(name = "jira")
public @interface JiraIssue {

    String value();

}
