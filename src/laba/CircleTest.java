package laba;

public class CircleTest {

    public static void main(String[] args) {

        Circle6 circle1 = new Circle6(5);
        Circle6 circle2 = new Circle6(10);

        System.out.println("Радиус первой окружности: " + circle1.getRadius());
        System.out.println("Площадь первой окружности: " + circle1.getArea());
        System.out.println("Длина первой окружности: " + circle1.getCircumference());

        System.out.println("Радиус второй окружности: " + circle2.getRadius());
        System.out.println("Площадь второй окружности: " + circle2.getArea());
        System.out.println("Длина второй окружности: " + circle2.getCircumference());

        circle1.compare(circle2);
    }
}