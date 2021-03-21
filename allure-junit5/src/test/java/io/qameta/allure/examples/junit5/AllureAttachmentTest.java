package io.qameta.allure.examples.junit5;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

public class AllureAttachmentTest {

    @Test
    public void annotatedAttachmentTest() {
        textAttachment("Annotated", "hello, world!");
    }

    @Test
    public void dynamicAttachmentTest() {
        Allure.attachment("Dynamic attachment", "attachment content");
    }

    @Attachment(value = "Annotated attachment [{type}]", type = "text/plain", fileExtension = ".txt")
    public byte[] textAttachment(String type, String content) {
        return content.getBytes(StandardCharsets.UTF_8);
    }

}
