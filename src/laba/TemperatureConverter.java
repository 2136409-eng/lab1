
package laba;

public class TemperatureConverter implements Convertable {

    @Override
    public double convert(double celsius) {
        return celsius;
    }

    public double toKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double toFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
