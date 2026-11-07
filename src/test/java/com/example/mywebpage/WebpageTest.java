package com.example.mywebpage;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

class WebpageTest {

    @Test
    void homePageContainsText() throws IOException {
        var resource = new ClassPathResource("static/index.html");
        String html = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
        assertTrue(html.contains("This is my webpage one"));
    }
}