package laba;

public class TestAuthor {

    public static void main(String[] args) {

        Author author = new Author("Milena", "123456@gmail.com", 'F');

        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());

        author.setEmail("123456@gmail.com");

        System.out.println("Новый email: " + author.getEmail());

        System.out.println(author);
    }
}