package laba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solution7();
    }

    public static void solution3() {
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double srarifm = sum / numbers.length;

        System.out.println("Сумма:" + sum);
        System.out.println("Среднее арифметическое:" + srarifm);
    }

    public static void solution4() {
        System.out.println("Введите 5 чисел");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        int i = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }

            i++;
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }

    public static void solution5(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void solution6() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%.2f%n", 1.0 / i);
        }

    }
    public static void solution7() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println("Факториал числа " + number + " = " + result);
        }
        public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}


