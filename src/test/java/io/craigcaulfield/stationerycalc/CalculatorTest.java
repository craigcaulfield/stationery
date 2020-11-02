package io.craigcaulfield.stationerycalc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator classUnderTest;

    @BeforeEach
    public void init()  {
        classUnderTest = new Calculator();
    }

    @Test
    public void testHB24MinimumBundle() {
        int[] hb24 = {5,10};
        int minimum = classUnderTest.minimumBundles(hb24, 10, new int[10]);
        assertEquals(1, minimum);
    }

    @Test
    public void testPPM3MinimumBundle() {
        int[] ppm3 = {3,6,9};
        int minimum = classUnderTest.minimumBundles(ppm3, 15, new int[15]);
        assertEquals(2, minimum);
    }

    @Test
    public void testBP19MinimumBundle() {
        int[] bp19 = {3,5,9};
        int minimum = classUnderTest.minimumBundles(bp19, 13, new int[13]);
        assertEquals(3, minimum);
    }
}
