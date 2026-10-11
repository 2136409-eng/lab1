package laba;

public class Tester {

    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        }
    }

    public void printCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }

    public static void main(String[] args) {

        Tester tester = new Tester(3);

        Circle circle1 = new Circle(new Point(1, 2), 5);
        Circle circle2 = new Circle(new Point(3, 4), 10);

        tester.addCircle(circle1);
        tester.addCircle(circle2);

        tester.printCircles();
    }
}