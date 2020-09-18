package io.qameta.allure.examples;

import io.qameta.allure.Attachment;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static io.qameta.allure.Allure.addAttachment;
import static io.qameta.allure.Allure.attachment;

public class AllureAttachmentTest {

    @Test
    public void allureSimpleAttachmentTest() {
        attachment("file1.txt", "Text inside file");
        addAttachment("file2.txt", "Text inside file");
        addAttachment("file3.txt", "text/plain", "Text inside file");
        addAttachment("file4.txt", "text/plain", "Text inside file", "txt");

        InputStream stream = ClassLoader.getSystemResourceAsStream("content.xml");
        attachment("content1.xml", stream);

        stream = ClassLoader.getSystemResourceAsStream("content.xml");
        addAttachment("content2.xml", stream);

        stream = ClassLoader.getSystemResourceAsStream("content.xml");
        addAttachment("content3.xml", "text/xml", stream, "xml");
    }

    @Test
    public void allureAttachmentAnnotationTest() {
        attachFile("test.txt", "text inside file");
        attachFile("index.html", "<h1>text inside html</h1>");
        attachXmlFile();
    }

    @Attachment(value = "Attachment name: {filename}")
    public String attachFile(String filename, String content) {
        return content;
    }

    @Attachment(value = "XML_file", type = "text/xml", fileExtension = "xml")
    public byte[] attachXmlFile() {
        try {
            final InputStream stream = ClassLoader.getSystemResourceAsStream("page.html");
            return IOUtils.toString(stream, StandardCharsets.UTF_8).getBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
