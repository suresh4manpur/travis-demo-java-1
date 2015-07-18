package org.markjszy.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mark on 12/11/14.
 */
public class MathTest {
    // Does this thing add stuff correctly?
    @Test
    public void testAddsPositiveNumbers() {
        assertEquals(Math.addNums(1, 2), 3);
        assertEquals(Math.addNums(0, 0), 0);
        assertEquals(Math.addNums(1234, 5000), 6234);
    }

    @Test
    public void testAddsNegativeNumbers() {
        assertEquals(Math.addNums(-1, -2), -3);
        assertEquals(Math.addNums(-2, 0), -2);
        assertEquals(Math.addNums(-1000, -2233), -3233);
    }

    @Test
    public void testAddsMixedSigns() {
        assertEquals(Math.addNums(1, -10), -9);
        assertEquals(Math.addNums(-40, 60), 20);
    }
}
