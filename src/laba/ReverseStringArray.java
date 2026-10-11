package laba;

public class ReverseStringArray {

    public static void main(String[] args) {

        String[] words = {"one", "two", "three", "four", "five"};

        for (int i = 0; i < words.length / 2; i++) {

            String temp = words[i];

            words[i] = words[words.length - 1 - i];

            words[words.length - 1 - i] = temp;
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
