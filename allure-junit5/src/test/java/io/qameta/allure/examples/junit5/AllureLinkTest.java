package io.qameta.allure.examples.junit5;

import io.qameta.allure.Allure;
import io.qameta.allure.Link;
import io.qameta.allure.Links;
import org.junit.jupiter.api.Test;

public class AllureLinkTest {

    @Test
    @Link(name = "Static link", url = "https://qameta.io")
    public void staticLinkTest() {
    }

    @Test
    @Links({
            @Link(name = "First static link", url = "https://qameta.io"),
            @Link(name = "Second static link", url = "https://qameta.io")
    })
    public void staticLinksTest() {
    }

    @Test
    public void dynamicLinkTest() {
        Allure.link("Dynamic link", "https://qameta.io");
    }

}
