import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public class VerbindingsStuk {

    private Locatie startPunt, eindPunt;
    private String naam;
    private int reistijd;
    private ArrayList<Belemmering> belemmeringen;

    public VerbindingsStuk(Locatie startPunt, Locatie eindPunt, int reistijdInMinuten, String naam) {
        this.startPunt = startPunt;
        this.eindPunt = eindPunt;
        this.naam = naam;
        this.reistijd = reistijdInMinuten;
        belemmeringen = new ArrayList<Belemmering>();
    }

    public String getNaam() {
        return this.naam;
    }

    public ArrayList<VerbindingsStuk> getAanliggendeStukken() {
        return null;
    }

    public VerkeersInfo getInfo() {
        return null;
    }

    public void addVerkeersinfo(VerkeersInfo informatie) {

    }


    public int getReistijd() {
        int werkelijkeReistijd = reistijd;
        for (Belemmering b : belemmeringen) {
            werkelijkeReistijd += b.vertraging;
        }
        return werkelijkeReistijd;
    }
}
