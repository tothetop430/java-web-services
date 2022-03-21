package test;

import org.junit.jupiter.api.*;

public class AnnotationsTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After ALl");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After Each");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

}
