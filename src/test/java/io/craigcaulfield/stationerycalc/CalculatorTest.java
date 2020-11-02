package io.craigcaulfield.stationerycalc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    @Test
    public void testHBBreakdown() {
        Map<Integer, Long> expectedValue = Map.of(
                10, Long.valueOf(1)
        );

        assertEquals(expectedValue, classUnderTest.breakdownBundle("HB24", 10));
    }

    @Test
    public void testPPM3Breakdown() {
        Map<Integer, Long> expectedValue = Map.of(
                6, Long.valueOf(1),
                9, Long.valueOf(1)
        );

        assertEquals(expectedValue, classUnderTest.breakdownBundle("PPM3", 15));
    }

    @Test
    public void testBP19Breakdown() {
        Map<Integer, Long> expectedValue = Map.of(
                3, Long.valueOf(1),
                5, Long.valueOf(2)
        );

        assertEquals(expectedValue, classUnderTest.breakdownBundle("BP19", 13));
    }

    @Test
    public void testOrderProcessing() {

        List<String> orders = Stream.of("HB24 10", "PPM3 15", "BP19 13")
                .collect(Collectors.toList());

        classUnderTest.process(orders);

    }
}
