import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public class VerbindingsStuk {

    private Locatie startPunt, eindPunt;
    private String naam;
    private int reistijd;

    public VerbindingsStuk(Locatie startPunt, Locatie eindPunt, int reistijdInMinuten, String naam) {
        this.startPunt = startPunt;
        this.eindPunt = eindPunt;
        this.naam = naam;
        this.reistijd = reistijdInMinuten;
    }


    public ArrayList<VerbindingsStuk> getAanliggendeStukken() {
        return null;
    }

    public VerkeersInfo getInfo() {
        return null;
    }

    public void addVerkeersinfo(VerkeersInfo informatie) {

    }


}
