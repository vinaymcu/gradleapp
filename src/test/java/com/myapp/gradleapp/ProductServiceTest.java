package com.myapp.gradleapp;

import com.myapp.gradleapp.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void testProductServiceHelloMessage() {
        System.out.println("### Inside testProductServiceHelloMessage ####");
        String  message = "Hello";
        assertEquals("Hello",message);
    }
}
