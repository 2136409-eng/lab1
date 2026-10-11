
package laba;

public class ProcessStringsTest {

    public static void main(String[] args) {
        ProcessStrings processor = new ProcessStrings();

        String text = "abcdefgh";

        System.out.println("Исходная строка: " + text);
        System.out.println("Количество символов: "
                + processor.countCharacters(text));
        System.out.println("Символы на позициях 1, 3, 5...: "
                + processor.oddPositionCharacters(text));
        System.out.println("Перевёрнутая строка: "
                + processor.reverse(text));
    }
}
