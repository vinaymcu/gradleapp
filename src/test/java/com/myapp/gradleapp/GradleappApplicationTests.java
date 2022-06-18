package com.myapp.gradleapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.myapp.gradleapp.service.OrderService;
import com.myapp.gradleapp.service.ProductService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(Suite.class)
@Suite.SuiteClasses({
		OrderServiceTest.class,
		ProductServiceTest.class
})
class GradleappApplicationTests {

//	@Test
//	void contextLoads() {
//	}

//	@Autowired
//	private ProductService productService;
//
//	@Autowired
//	private OrderService orderService;
//
	@Test
	public void testMytest1() {
		System.out.println(" hello test case >>>>>>>>>>>>>>>>");
		//Mockito.when(productService.getProductName()).thenReturn("Mock Product Name");
		String testName = "Mock Product Name";
		Assert.assertEquals("Mock Product Name", testName);
	}
}
