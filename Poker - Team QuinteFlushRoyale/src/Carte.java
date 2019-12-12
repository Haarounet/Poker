import java.util.*;

public class Carte implements Comparable {

    private Valeur valeur;
    private String couleur;

    public Carte(Valeur valeur, String couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public Valeur getValeur() {
        return valeur;
    }

    public void setValeur(Valeur valeur) {
        this.valeur = valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public int compareTo(Object o) {
        final Carte deuxiemeCarte = (Carte) o;
        final Valeur deuxiemeCarteValeur = deuxiemeCarte.getValeur();
        return this.valeur.compareTo(deuxiemeCarteValeur);
    }



    /*public String Associer(Joueur cartesJoueur, Plateau cartesPlateau){
        return;
          //TotalCarteJoueur1 = les  5 plus 2 puissance pour
    }

    public int TrouverCombinaison(){
        return;
    }

    public Joueur ComparerCombinaisons() {
        return;
    }*/
}