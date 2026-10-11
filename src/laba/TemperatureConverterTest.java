
package laba;

public class TemperatureConverterTest {

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double celsius = 25;

        System.out.println("Температура по Цельсию: " + celsius);
        System.out.println("Температура по Кельвину: "
                + converter.toKelvin(celsius));
        System.out.println("Температура по Фаренгейту: "
                + converter.toFahrenheit(celsius));
    }
}
