package laba;

public class TestBall {

    public static void main(String[] args) {

        Ball ball = new Ball(10, 20, 5, 2, 3);

        System.out.println(ball);

        ball.move();
        System.out.println("После движения: " + ball);

        ball.reflectHorizontal();
        ball.move();
        System.out.println("После отражения по горизонтали: " + ball);

        ball.reflectVertical();
        ball.move();
        System.out.println("После отражения по вертикали: " + ball);
    }
}