package laba;

public class Bookshelf {

    private Book[] books;
    private int count;

    public Bookshelf(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        }
    }

    public Book getEarliestBook() {
        if (count == 0) {
            return null;
        }

        Book earliest = books[0];

        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < earliest.getYear()) {
                earliest = books[i];
            }
        }

        return earliest;
    }

    public Book getLatestBook() {
        if (count == 0) {
            return null;
        }

        Book latest = books[0];

        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i];
            }
        }

        return latest;
    }

    public void sortByYear() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {

                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public void printBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {

        Bookshelf shelf = new Bookshelf(5);

        shelf.addBook(new Book("Джоан Роулинг", "Гарри Поттер", 1997));
        shelf.addBook(new Book("Толкин", "Властелин колец", 1954));
        shelf.addBook(new Book("Оруэлл", "1984", 1949));

        System.out.println("Самая ранняя книга:");
        System.out.println(shelf.getEarliestBook());

        System.out.println("Самая поздняя книга:");
        System.out.println(shelf.getLatestBook());

        System.out.println("До сортировки:");
        shelf.printBooks();

        shelf.sortByYear();

        System.out.println("После сортировки:");
        shelf.printBooks();
    }
}