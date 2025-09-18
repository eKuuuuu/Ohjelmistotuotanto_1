package com.example;

public class  TemperatureConverter {
    public class celsiusToFahrenheit {
        public double convert(double celsius) {
            return (celsius * 9/5) + 32;
        }
    }

    public class fahrenheitToCelsius {
        public double convert(double fahrenheit) {
            return (fahrenheit - 32) * 5/9;
        }
    }
// adding a command
    public class kelvinToCelcius {
        public double convert(double kelvin) {
            return kelvin - 273.15;
        }
    }

    public class isExtremeTemperature {
        public boolean check(double temperature, String scale) {
            if (scale.equalsIgnoreCase("C")) {
                return temperature < -40 || temperature > 50;
            } else {
                throw new IllegalArgumentException("Scale must be 'C'");
            }
        }
    }
}
