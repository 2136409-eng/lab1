package laba;

public class SeasonTest {

    public static void main(String[] args) {

        Season favoriteSeason = Season.SUMMER;

        System.out.println("Любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: "
                + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: "
                + favoriteSeason.getDescription());

        printLove(Season.WINTER);
        printLove(Season.SPRING);
        printLove(Season.SUMMER);
        printLove(Season.AUTUMN);

        System.out.println("\nВсе времена года:");

        for (Season season : Season.values()) {
            System.out.println(
                    season + ": "
                            + season.getAverageTemperature() + " °C, "
                            + season.getDescription()
            );
        }
    }

    public static void printLove(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}
