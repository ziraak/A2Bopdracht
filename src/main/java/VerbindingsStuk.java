import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public class VerbindingsStuk {

    private Locatie startPunt, eindPunt;
    private String naam;

    public VerbindingsStuk(Locatie startPunt, Locatie eindPunt, String naam) {
        this.startPunt = startPunt;
        this.eindPunt = eindPunt;
        this.naam = naam;
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
