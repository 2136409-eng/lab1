package laba;

public class WrapperTasks {

    public static void main(String[] args) {

        // 1. Создаём объект Double с помощью valueOf()
        Double number1 = Double.valueOf(3.14);
        Double number2 = Double.valueOf("5.67");

        System.out.println("Объект 1: " + number1);
        System.out.println("Объект 2: " + number2);

        // 2. Преобразуем String в double
        String text = "12.5";
        double number3 = Double.parseDouble(text);

        System.out.println("Строка в double: " + number3);

        // 3. Преобразуем Double в примитивные числовые типы
        Double number = Double.valueOf(15.75);

        byte byteValue = number.byteValue();
        short shortValue = number.shortValue();
        int intValue = number.intValue();
        long longValue = number.longValue();
        float floatValue = number.floatValue();
        double doubleValue = number.doubleValue();

        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        // 4. Выводим значение Double
        System.out.println("Значение объекта Double: " + number);

        // 5. Преобразуем литерал double в String
        String d = Double.toString(3.14);

        System.out.println("Число в виде строки: " + d);
    }
}