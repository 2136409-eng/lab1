package laba;

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book("Джоан Роулинг", "Гарри Поттер", 1997);

        System.out.println(book);

        book.setYear(1998);

        System.out.println("Изменённая книга: " + book);
    }
}