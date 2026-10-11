package laba;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double rubToUsd = 0.011;
        double rubToEur = 0.010;

        System.out.println("Введите сумму в рублях:");
        double rubles = scanner.nextDouble();

        double dollars = rubles * rubToUsd;
        double euros = rubles * rubToEur;

        NumberFormat rubFormat =
                NumberFormat.getCurrencyInstance(new Locale("ru", "RU"));

        NumberFormat usdFormat =
                NumberFormat.getCurrencyInstance(Locale.US);

        NumberFormat eurFormat =
                NumberFormat.getCurrencyInstance(Locale.GERMANY);

        System.out.println("Исходная сумма: " + rubFormat.format(rubles));
        System.out.printf("В долларах: %s%n", usdFormat.format(dollars));
        System.out.printf("В евро: %s%n", eurFormat.format(euros));
    }
}