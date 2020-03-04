package services;

import Adaptateur.AdaptateurBD;
import modeles.Composant;

import java.util.List;

public class Scan {
    private AdaptateurBD adaptateurBD = new AdaptateurBD();

    public List<Composant> scanEnvironement() {
        return adaptateurBD.getComposants();
    }
}
