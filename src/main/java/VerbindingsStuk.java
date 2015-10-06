import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public class VerbindingsStuk {

    public Locatie startPunt, eindPunt;
    private String naam;
    private int reistijd;
    private int maxspeed;
    private ArrayList<Belemmering> belemmeringen;
    private ArrayList<SnelheidsControle> snelheidscontroles;

    public VerbindingsStuk(Locatie startPunt, Locatie eindPunt, int reistijdInMinuten, int maxspeed, String naam) {
        this.startPunt = startPunt;
        this.eindPunt = eindPunt;
        this.naam = naam;
        this.maxspeed = maxspeed;
        this.reistijd = reistijdInMinuten;
        belemmeringen = new ArrayList<Belemmering>();
        snelheidscontroles = new ArrayList<SnelheidsControle>();
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
        informatie.addTo(this);
        if (informatie instanceof Belemmering) {
            belemmeringen.add((Belemmering) informatie);
        } else if (informatie instanceof SnelheidsControle) {
            snelheidscontroles.add((SnelheidsControle) informatie);
        }

    }

    public int getMaxspeed() {
        return this.maxspeed;
    }

    public void getSnelheidsControle() {
        for (SnelheidsControle s : snelheidscontroles) {
            s.getMaxSnelheid();
        }
    }


    public int getReistijd() {
        int werkelijkeReistijd = reistijd;
        for (Belemmering b : belemmeringen) {
            werkelijkeReistijd += b.getVertraging();
        }
        return werkelijkeReistijd;
    }
}
