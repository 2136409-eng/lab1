package laba;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class RandomMathTasks {

        public static void main(String[] args) {
            solution1();
            solution3();
            solution4();
        }

        // Задание 1
        public static void solution1() {
            Random random = new Random();

            double[] numbers1 = new double[5];
            double[] numbers2 = new double[5];

            for (int i = 0; i < numbers1.length; i++) {
                numbers1[i] = Math.random();
                numbers2[i] = random.nextDouble();
            }

            System.out.println("Массив до сортировки (Math.random):");
            System.out.println(Arrays.toString(numbers1));

            Arrays.sort(numbers1);

            System.out.println("Массив после сортировки:");
            System.out.println(Arrays.toString(numbers1));

            System.out.println("Массив до сортировки (Random):");
            System.out.println(Arrays.toString(numbers2));

            Arrays.sort(numbers2);

            System.out.println("Массив после сортировки:");
            System.out.println(Arrays.toString(numbers2));
        }

        // Задание 3
        public static void solution3() {
            Random random = new Random();
            int[] numbers = new int[4];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(90) + 10;
            }

            System.out.println("Массив: " + Arrays.toString(numbers));

            boolean increasing = true;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] >= numbers[i + 1]) {
                    increasing = false;
                    break;
                }
            }

            if (increasing) {
                System.out.println("Массив строго возрастающий");
            } else {
                System.out.println("Массив не является строго возрастающим");
            }
        }

        // Задание 4
        public static void solution4() {
            Scanner scanner = new Scanner(System.in);

            int n;

            do {
                System.out.println("Введите натуральное число больше 0:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Ошибка! Введите целое положительное число:");
                    scanner.next();
                }
                n = scanner.nextInt();

                if (n <= 0) {
                    System.out.println("Число должно быть больше 0");
                }
            } while (n <= 0);

            Random random = new Random();
            int[] numbers = new int[n];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(n + 1);
            }

            System.out.println("Исходный массив: " + Arrays.toString(numbers));

            int count = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    count++;
                }
            }

            int[] evenNumbers = new int[count];
            int j = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    evenNumbers[j] = numbers[i];
                    j++;
                }
            }

            System.out.println("Чётные элементы: " + Arrays.toString(evenNumbers));
        }
    }
