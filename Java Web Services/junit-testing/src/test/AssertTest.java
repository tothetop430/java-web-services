package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertTest {

    @Test
    public void test() {
        assertEquals(2, 2);
    }

    @Test
    public void test2() {
        assertTrue(true);
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[] {2}, new int[] {2});
    }
}
