package Adaptateur;

import modeles.Composant;
import modeles.Port;

import java.util.ArrayList;
import java.util.List;

public class AdaptateurBD {
    private List<Composant> composants=new ArrayList<>();
    private final static  int NOMBRE_COMPOSANT=5;

public AdaptateurBD(){
    intilisation();
}

    public void intilisation(){
        Port s1=new Port("s1");
        Port s2=new Port("s2");
        Port s3=new Port("s3");
        Port s4=new Port("s4");
        Port s5=new Port("s5");
        Port s6=new Port("s6");

        Composant c1 =new Composant("C1");
        c1.getServicesPorts().add(s1);
        c1.getServicesPorts().add(s2);

        Composant c2 =new Composant("C2");
        c2.getServicesPorts().add(s1);
        c2.getServicesPorts().add(s3);

        Composant c3 =new Composant("C3");
        c3.getServicesPorts().add(s2);
        c3.getServicesPorts().add(s3);
        c3.getServicesPorts().add(s4);

        Composant c4=new Composant("C4");
        c4.getServicesPorts().add(s4);
        c4.getServicesPorts().add(s5);

        Composant c5=new Composant("C5");
        c5.getServicesPorts().add(s4);
        c5.getServicesPorts().add(s6);

        composants.add(c1);
        composants.add(c2);
        composants.add(c3);
        composants.add(c4);
        composants.add(c5);
    }

    public List<Composant> getComposants() {
        return composants;
    }


}
