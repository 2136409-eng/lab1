package laba;

public class Circle6 {

    private double radius;

    public Circle6(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void compare(Circle6 circle) {
        if (this.radius > circle.radius) {
            System.out.println("Первая окружность больше");
        } else if (this.radius < circle.radius) {
            System.out.println("Вторая окружность больше");
        } else {
            System.out.println("Окружности равны");
        }
    }

    @Override
    public String toString() {
        return "Circle6{" +
                "radius=" + radius +
                '}';
    }
}