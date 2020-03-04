package modeles;


import java.util.ArrayList;
import java.util.List;

public class Composant {
    private String nom;
    private List<Port> servicesPorts =new ArrayList<>();
    private List<ChoixFavori> choixFavori=new ArrayList<>();
    private List<ChoixPreferentiel> choixPreferentiel=new ArrayList<>();

    public Composant(){}

    public Composant(String nom) {
        this.nom = nom;
    }

    public Composant(String nom, List<Port> servicesPorts, List<ChoixFavori> choixFavori, List<ChoixPreferentiel> choixPreferentiel) {
        this.nom = nom;
        this.servicesPorts = servicesPorts;
        this.choixFavori = choixFavori;
        this.choixPreferentiel = choixPreferentiel;
    }

    public List<Port> getServicesPorts() {
        return servicesPorts;
    }

    public void setServicesPorts(List<Port> servicesPorts) {
        this.servicesPorts = servicesPorts;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Composant : "+getNom();
    }
}
