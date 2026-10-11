
package laba;

public class MovableTest {

    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(0, 0, 2, 2);
        MovablePoint bottomRight = new MovablePoint(5, 5, 2, 2);

        MovableRectangle rectangle =
                new MovableRectangle(topLeft, bottomRight);

        System.out.println("До движения:");
        System.out.println(rectangle);

        rectangle.moveRight();
        rectangle.moveDown();

        System.out.println("\nПосле движения вправо и вниз:");
        System.out.println(rectangle);

        System.out.println("\nСкорости совпадают: "
                + rectangle.speedTest());
    }
}

