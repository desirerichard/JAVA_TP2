package ex4;

public class Livre {
    // Attributs
    String titre;
    String auteur;
    String categorie;
    String isbn;

    // Constructeur
    public Livre(String titre, String auteur, String categorie, String isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.categorie = categorie;
        this.isbn = isbn;
    }

    // Méthodes
    public void afficher() {
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Catégorie : " + categorie);
        System.out.println("ISBN : " + isbn);
    }

    public String codeLivre() {
        String codeAuteur = auteur.substring(0, 2);
        String codeCategorie = categorie.substring(0, 1);
        String codeISBN = isbn.substring(isbn.length() - 2);

        return codeAuteur + codeCategorie + codeISBN;
    }
}
