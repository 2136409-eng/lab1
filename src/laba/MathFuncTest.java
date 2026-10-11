
package laba;

public class MathFuncTest {

    public static void main(String[] args) {
        MathCalculable math = new MathFunc();

        System.out.println("2 в степени 3: "
                + math.power(2, 3));

        System.out.println("Модуль комплексного числа 3 + 4i: "
                + math.complexModule(3, 4));

        MathFunc functions = new MathFunc();

        System.out.println("Длина окружности радиуса 5: "
                + functions.circleLength(5));
    }
}
