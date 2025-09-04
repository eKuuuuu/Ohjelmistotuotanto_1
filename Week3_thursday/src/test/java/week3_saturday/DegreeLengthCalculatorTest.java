package week3_saturday;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DegreeLengthCalculatorTest {

    @Test
    void calculateDegreeLength() {
        assertEquals(4, DegreeLengthCalculator.CalculateDegreeLength(1));
        assertEquals(6, DegreeLengthCalculator.CalculateDegreeLength(2));
        assertEquals(8, DegreeLengthCalculator.CalculateDegreeLength(3));
        assertEquals(-1, DegreeLengthCalculator.CalculateDegreeLength(4));
    }
}