package ex5;

public class Triangle {
    // Attributs
    double premiereCote;
    double secondCote;
    double troisiemeCote;

    // Constructeur
    public Triangle(double premiereCote, double secondCote, double troisiemeCote) {
        this.premiereCote = premiereCote;
        this.secondCote = secondCote;
        this.troisiemeCote = troisiemeCote;
    }


    // Méthodes
    public double calculerPerimetre() {
        return (premiereCote + secondCote + troisiemeCote);
    }

    public double calculerAire() {
        double s = calculerPerimetre() / 2;
        return Math.sqrt(s * (s - premiereCote) * (s - secondCote) * (s - troisiemeCote));
    }
    

    public static void main(String[] args) {
        // Création d'objets
        Triangle triangle1 = new Triangle(14, 7, 18);

        //Affichage
        System.out.println(triangle1.calculerPerimetre());
        System.out.println(triangle1.calculerAire());
    }
}
