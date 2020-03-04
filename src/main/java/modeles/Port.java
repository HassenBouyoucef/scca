package modeles;

import java.util.List;

public class Port {
    private String nom;
    private Composant composant;
    private List<ChoixFavori> choixFavori;
    private List<ChoixPreferentiel> choixPreferentiel;

    public Port(String nom) {
        this.nom = nom;
    }

    public Port(String nom, Composant composant, List<ChoixFavori> choixFavori, List<ChoixPreferentiel> choixPreferentiel) {
        this.nom = nom;
        this.composant = composant;
        this.choixFavori = choixFavori;
        this.choixPreferentiel = choixPreferentiel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Composant getComposant() {
        return composant;
    }

    public void setComposant(Composant composant) {
        this.composant = composant;
    }

    public List<ChoixFavori> getChoixFavori() {
        return choixFavori;
    }

    public void setChoixFavori(List<ChoixFavori> choixFavori) {
        this.choixFavori = choixFavori;
    }

    public List<ChoixPreferentiel> getChoixPreferentiel() {
        return choixPreferentiel;
    }

    public void setChoixPreferentiel(List<ChoixPreferentiel> choixPreferentiel) {
        this.choixPreferentiel = choixPreferentiel;
    }
}
