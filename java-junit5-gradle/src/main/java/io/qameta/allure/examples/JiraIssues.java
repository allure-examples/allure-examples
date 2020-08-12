package io.qameta.allure.examples;

import java.lang.annotation.*;

/**
 * @author eroshenkoam (Artem Eroshenko).
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface JiraIssues {

    JiraIssue[] value();

}
