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
    private ArrayList<Ontoegankelijk> ontoegankelijk;

    public VerbindingsStuk(Locatie startPunt, Locatie eindPunt, int reistijdInMinuten, int maxspeed, String naam) {
        this.startPunt = startPunt;
        this.eindPunt = eindPunt;
        this.naam = naam;
        this.maxspeed = maxspeed;
        this.reistijd = reistijdInMinuten;
        belemmeringen = new ArrayList<Belemmering>();
        snelheidscontroles = new ArrayList<SnelheidsControle>();
        ontoegankelijk = new ArrayList<Ontoegankelijk>();
    }

    public String getNaam() {
        return this.naam;
    }

    public void addVerkeersinfo(VerkeersInfo informatie) {
        informatie.addTo(this);
        if (informatie instanceof Belemmering) {
            belemmeringen.add((Belemmering) informatie);
        } else if (informatie instanceof SnelheidsControle) {
            snelheidscontroles.add((SnelheidsControle) informatie);
        } else if (informatie instanceof Ontoegankelijk) {
            ontoegankelijk.add((Ontoegankelijk) informatie);
        }

    }

    public int getMaxspeed() {
        return this.maxspeed;
    }

    public void printVerkeersInfo() {
        for (SnelheidsControle s : snelheidscontroles) {
            s.getMaxSnelheid();
        }
        for (Ontoegankelijk ontoegankelijk1 : ontoegankelijk) {
            ontoegankelijk1.printSluitTijden();
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
