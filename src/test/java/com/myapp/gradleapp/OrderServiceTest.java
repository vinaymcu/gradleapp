package com.myapp.gradleapp;

import com.myapp.gradleapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testOrderServiceHelloMessage() {
        System.out.println("### Inside testSalutationMessage ####");
      String  message = "Hello";
        assertEquals("Hello",message);
    }
}
