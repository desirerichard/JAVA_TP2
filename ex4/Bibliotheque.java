package ex4;

public class Bibliotheque {
    public static void main(String[] args) {
        // Création d'objets
        Livre livre1 = new Livre("L'essentiel, et rien d'autre", "Fumio Sasaki", "Famille et bien-être", "978-2813215659");
        Livre livre2 = new Livre("Réussir (sa vie) grâce au minimalisme digital", "Cal Newport", "Famille et bien-être", "978-2379350481");

        // Affichage
        System.out.println("Livre 1 :");
        livre1.afficher();
        System.out.println("Code Livre 1: " + livre1.codeLivre());
        
        System.out.println();

        System.out.println("Livre 2 :");
        livre2.afficher();
        System.out.println("Code Livre 2: " + livre2.codeLivre());
    }
}

