

public class Main {

    public static void main(String[] args){


    //Cartes de la main du Joueur 1
    Carte carte1J1 = new Carte(Valeur.ROI, "Coeur");
    Carte carte2J1 = new Carte(Valeur.DAME, "Coeur");
    Joueur J1 = new Joueur(carte1J1, carte2J1);



    //Cartes de la main du Joueur 2
    Carte carte1J2 = new Carte (Valeur.DEUX, "Pique");
    Carte carte2J2 = new Carte (Valeur.QUATRE, "Trefle");
    Joueur J2 = new Joueur(carte1J2, carte2J2);

    //Carte sur le plateau
    Carte carte1Plateau = new Carte (Valeur.VALET, "Coeur");
    Carte carte2Plateau = new Carte (Valeur.CINQ, "Trefle");
    Carte carte3Plateau = new Carte (Valeur.DIX, "Coeur");
    Carte carte4Plateau = new Carte (Valeur.AS, "Coeur");
    Carte carte5Plateau = new Carte (Valeur.NEUF, "Carreau");

    Plateau plateau1 = new Plateau(carte1Plateau,carte2Plateau, carte3Plateau, carte4Plateau,carte5Plateau);

    System.out.println(carte1J1.compareTo(carte2J1));

    }
}
