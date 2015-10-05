import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public class Locatie {

    private double hoogteGraad, breedteGraad;
    private String naam;

    public Locatie(double hoogteGraad, double breedteGraad, String naam) {
        this.hoogteGraad = hoogteGraad;
        this.breedteGraad = breedteGraad;
        this.naam = naam;
    }


    public String getNaam() {
        return this.naam;
    }

    public ArrayList<VerbindingsStuk> getVerbindingsStukkenToLocation() {
        return null;
    }

    public ArrayList<VerbindingsStuk> getVerbindingsStukkenFromLocation() {
        return null;
    }


}
