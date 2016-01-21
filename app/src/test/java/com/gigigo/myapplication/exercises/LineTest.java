package com.gigigo.myapplication.exercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LineTest {

//    @Test
    public void testGetScope() throws Exception {
        Line line = new Line(4, 5, 3, 1);

        assertEquals(4, line.getSlope(), 0.0001);
    }

//    @Test
    public void testGetScope2() throws Exception {
        Line line = new Line(-3, -4, 2, 6);

        assertEquals(2, line.getSlope(), 0.0001);
    }

//    @Test(expected = ArithmeticException.class)
    public void testGetScopeFails() throws Exception {
        Line line = new Line(3, 2, 3, 4);

        line.getSlope();
    }

//    @Test
    public void testDistance() throws Exception {
        Line line = new Line(5, 4, 3, 4);

        assertEquals(2, line.getDistance(), 0.0001);
    }

//    @Test
    public void testDistance2() throws Exception {
        Line line = new Line(3, 5, 7, 2);

        assertEquals(5, line.getDistance(), 0.0001);
    }

//    @Test
    public void testParallel() throws Exception {
        Line line = new Line(2, 3, 6, 7);
        Line line1 = new Line(7, 6, 4, 3);

        assertTrue(line.parallelTo(line1));
    }

//    @Test
    public void testNotParallel() throws Exception {
        Line line = new Line(200, 3, 6, 7);
        Line line1 = new Line(-7, -6, 4, 3);

        assertFalse(line.parallelTo(line1));
    }
}
