package laba;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShop {

    private static final Scanner scanner = new Scanner(System.in);

    private static final ArrayList<Product> products = new ArrayList<>();
    private static final ArrayList<Product> cart = new ArrayList<>();

    public static void main(String[] args) {

        fillProducts();

        if (!authenticate()) {
            System.out.println("Вход не выполнен.");
            return;
        }

        boolean running = true;

        while (running) {
            System.out.println("\n=== ИНТЕРНЕТ-МАГАЗИН ===");
            System.out.println("1. Каталоги товаров");
            System.out.println("2. Просмотреть товары каталога");
            System.out.println("3. Добавить товар в корзину");
            System.out.println("4. Посмотреть корзину");
            System.out.println("5. Купить товары");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    showCategories();
                    break;
                case "2":
                    showProductsByCategory();
                    break;
                case "3":
                    addToCart();
                    break;
                case "4":
                    showCart();
                    break;
                case "5":
                    buyProducts();
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("Нет такого пункта меню.");
            }
        }

        System.out.println("До свидания!");
    }

    private static void fillProducts() {
        products.add(new Product(
                1, "Наушники", 2500, ProductCategory.ELECTRONICS));
        products.add(new Product(
                2, "Мышь", 1200, ProductCategory.ELECTRONICS));
        products.add(new Product(
                3, "Футболка", 1500, ProductCategory.CLOTHING));
        products.add(new Product(
                4, "Джинсы", 3500, ProductCategory.CLOTHING));
        products.add(new Product(
                5, "Java для начинающих", 900, ProductCategory.BOOKS));
    }

    private static boolean authenticate() {
        System.out.println("=== ВХОД ===");
        System.out.print("Логин: ");
        String login = scanner.nextLine();

        System.out.print("Пароль: ");
        String password = scanner.nextLine();

        if (login.equals("student") && password.equals("1234")) {
            System.out.println("Вход выполнен!");
            return true;
        }

        System.out.println("Неверный логин или пароль.");
        return false;
    }

    private static void showCategories() {
        System.out.println("\nКаталоги:");

        for (ProductCategory category : ProductCategory.values()) {
            System.out.println(category.getTitle());
        }
    }

    private static void showProductsByCategory() {
        showCategories();

        System.out.print("Введите название категории (ELECTRONICS, CLOTHING, BOOKS): ");
        String input = scanner.nextLine();

        ProductCategory selectedCategory;

        try {
            selectedCategory = ProductCategory.valueOf(
                    input.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Такой категории нет.");
            return;
        }

        boolean found = false;

        for (Product product : products) {
            if (product.getCategory() == selectedCategory) {
                System.out.println(product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("В этой категории пока нет товаров.");
        }
    }

    private static void addToCart() {
        System.out.println("\nВсе товары:");

        for (Product product : products) {
            System.out.println(product);
        }

        System.out.print("Введите номер товара: ");
        int id;

        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Нужно ввести целое число.");
            return;
        }

        for (Product product : products) {
            if (product.getId() == id) {
                cart.add(product);
                System.out.println("Добавлено в корзину: "
                        + product.getName());
                return;
            }
        }

        System.out.println("Товар с таким номером не найден.");
    }

    private static void showCart() {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }

        double total = 0;

        System.out.println("\nВаша корзина:");

        for (Product product : cart) {
            System.out.println(product);
            total += product.getPrice();
        }

        System.out.printf("Итого: %.2f руб.%n", total);
    }

    private static void buyProducts() {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста. Нечего покупать.");
            return;
        }

        showCart();

        System.out.print("Подтвердить покупку? (да/нет): ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("да")) {
            cart.clear();
            System.out.println("Покупка оформлена!");
        } else {
            System.out.println("Покупка отменена.");
        }
    }
}
