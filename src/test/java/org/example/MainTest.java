package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testGradeA() {
        assertEquals("A", Main.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", Main.calculateGrade(80));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", Main.calculateGrade(60));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", Main.calculateGrade(40));
    }
}
