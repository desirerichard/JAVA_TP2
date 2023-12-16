//Dans une chaîne de caractères, remplacer un caractère sur 2 par *
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        String word;
        Scanner value = new Scanner(System.in);
        System.out.print("Please, enter a word : ");

        word = value.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                result.append("*");
            } else {
                result.append(word.charAt(i));
            }
        }

        System.out.println(result.toString());

    }
}