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

    public VerbindingsStuk(Locatie startPunt, Locatie eindPunt, int reistijdInMinuten, String naam) {
        this.startPunt = startPunt;
        this.eindPunt = eindPunt;
        this.naam = naam;
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
        if (informatie instanceof Belemmering) {
            belemmeringen.add((Belemmering) informatie);
        } else if (informatie instanceof SnelheidsControle) {
            snelheidscontroles.add((SnelheidsControle) informatie);
        }

    }

    public int getSnelheidsLimiet() {
        for (SnelheidsControle s : snelheidscontroles) {
            maxspeed = s.getMaxSnelheid();
        }
        return maxspeed;
    }


    public int getReistijd() {
        int werkelijkeReistijd = reistijd;
        for (Belemmering b : belemmeringen) {
            werkelijkeReistijd += b.getVertraging();
//            System.out.println("vertraging = " + b.vertraging);
        }
        return werkelijkeReistijd;
    }
}
