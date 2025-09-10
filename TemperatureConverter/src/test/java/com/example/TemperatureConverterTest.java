package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private TemperatureConverter temperatureConverter;

    @BeforeEach
    void setUp() {
        temperatureConverter = new TemperatureConverter();
    }
    @Test
    void testFahrenheitToCelsius() {
        TemperatureConverter.fahrenheitToCelsius converter = temperatureConverter.new fahrenheitToCelsius();
        assertEquals(0, converter.convert(32), 0.01);
        assertEquals(100, converter.convert(212), 0.01);
        assertEquals(-40, converter.convert(-40), 0.01);
    }
    @Test
    void testCelsiusToFahrenheit() {
        TemperatureConverter.celsiusToFahrenheit converter = temperatureConverter.new celsiusToFahrenheit();
        assertEquals(32, converter.convert(0), 0.01);
        assertEquals(212, converter.convert(100), 0.01);
        assertEquals(-40, converter.convert(-40), 0.01);
    }
    @Test
    void testIsExtremeTemperature() {
        TemperatureConverter.isExtremeTemperature checker = temperatureConverter.new isExtremeTemperature();
        assertTrue(checker.check(-50, "C"));
        assertTrue(checker.check(60, "C"));
        assertFalse(checker.check(20, "C"));
        assertThrows(IllegalArgumentException.class, () -> checker.check(20, "F"));
    }
}