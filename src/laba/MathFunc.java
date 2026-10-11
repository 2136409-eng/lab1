
package laba;

public class MathFunc implements MathCalculable {

    @Override
    public double power(double number, int exponent) {
        return Math.pow(number, exponent);
    }

    @Override
    public double complexModule(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
}

