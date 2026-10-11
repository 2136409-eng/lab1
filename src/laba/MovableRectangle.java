
package laba;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft,
                            MovablePoint bottomRight) {
        if (!topLeft.sameSpeed(bottomRight)) {
            throw new IllegalArgumentException(
                    "Скорости точек должны совпадать");
        }

        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public boolean speedTest() {
        return topLeft.sameSpeed(bottomRight);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "Верхняя левая точка: " + topLeft
                + "\nНижняя правая точка: " + bottomRight;
    }
}

