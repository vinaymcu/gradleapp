package com.myapp.gradleapp;

//import org.junit.jupiter.api.platform.suite.api.SelectPackages;
//import org.junit.platform.suite.api.Suite;
//import org.junit.platform.suite.api.SuiteDisplayNam
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.platform.runner.JUnitPlatform;
//import org.junit.platform.suite.api.IncludeTags;
//import org.junit.platform.suite.api.SelectClasses;
//import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

//@SelectPackages({"com.howtodoinjava.junit5.examples.packageA"
//        ,"com.howtodoinjava.junit5.examples.packageB"})
//@Suite
//@SuiteDisplayName("A demo Test Suite")
//public class JUnit5TestSuiteExample {
//
//}

//
//@RunWith(Suite.class)
//@Suite.SuiteClasses({
//        OrderServiceTest.class,
//        ProductServiceTest.class
//})
//@RunWith(JUnitPlatform.class)
//@SelectClasses( { AppTest.class, AppTest2.class } )
//@SelectPackages("com.example")
//public class TestSuiteDemo {
//}
public class JunitTestSuite {
    @Test
    public void testOrderServiceHelloMessage() {
        System.out.println("### Inside testSalutationMessage ####");
        String  message = "Hello";
        assertEquals("Hello",message);
    }
}

