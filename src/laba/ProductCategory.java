package laba;

public enum ProductCategory {
    ELECTRONICS("Электроника"),
    CLOTHING("Одежда"),
    BOOKS("Книги");

    private final String title;

    ProductCategory(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}