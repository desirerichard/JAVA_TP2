//Afficher une chaîne de caractères saisies par l’utilisateur en minuscules puis en majuscules
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String word;
        Scanner value = new Scanner(System.in);
        System.out.print("Please, enter a word : ");

        word = value.next();

        System.out.println("Lower case : " + word.toLowerCase());
        System.out.println("Upper case : " + word.toUpperCase());
        
    }
}
