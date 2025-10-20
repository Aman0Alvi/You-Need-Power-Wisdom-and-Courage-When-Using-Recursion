package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleNumberCalculatorTest {

    private final TriangleNumberCalculator calc = new TriangleNumberCalculator();

    @Test
    void value_basic() {
        assertEquals(0, calc.value(0));
        assertEquals(1, calc.value(1));
        assertEquals(3, calc.value(2));
        assertEquals(6, calc.value(3));
        assertEquals(10, calc.value(4));
    }

    @Test
    void add_basic() {
        assertEquals(2,  calc.add(1, 1));
        assertEquals(9,  calc.add(2, 3));
        assertEquals(13, calc.add(4, 2));
    }

    @Test
    void subtract_basic() {
        assertEquals(0,  calc.subtract(1, 1));
        assertEquals(-3, calc.subtract(2, 3));
        assertEquals(7,  calc.subtract(4, 2));
    }

    @Test
    void value_rejectsNegative() {
        assertThrows(IllegalArgumentException.class, () -> calc.value(-1));
    }
}
