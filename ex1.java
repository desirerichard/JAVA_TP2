
//Compter le nombre de chaque lettre d’une chaîne de caractères saisis par l’utilisateur
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        String word;
        Scanner value = new Scanner(System.in);
        System.out.print("Please, enter a word : ");

        word = value.next();

        System.out.println(word.length());

    }
}