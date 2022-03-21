package test;

import learning.MyMath;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyMathTest {

    MyMath math = new MyMath();
    @Test
    public void sumTest_3numbers() {
        assertEquals(10, math.sum(new int[] {1, 2, 3, 4}));
    }

    @Test
    public void sumTest_1numbers() {
        assertEquals(1, math.sum(new int[] {1}));
    }

}
