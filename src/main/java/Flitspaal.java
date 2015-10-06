import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public class Flitspaal extends SnelheidsControle implements StatischeGegevens {

    public Flitspaal(VerbindingsStuk vs) {
        this.verbinding = vs;
    }


    @Override
    public int getMaxSnelheid() {
        Wegennet wn = Wegennet.getInstance();
        locs = wn.getAanliggendeLocaties(verbinding);
        start = locs.get(0);
        eind = locs.get(1);
        System.out.println("Flitspaal met " + maxSpeed + " als maximum snelheid op verbindingsstuk " + verbinding.getNaam() + " tussen " + start + " en " + eind);


        return super.getMaxSnelheid();
    }


}
