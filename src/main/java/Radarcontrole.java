/**
 * Created by J on 5-10-2015.
 */
public class Radarcontrole extends SnelheidsControle implements DynamischeGegevens {
//TODO CONSTRUCTOR

    private VerbindingsStuk verbinding;

    public Radarcontrole(VerbindingsStuk vs) {
        this.verbinding = vs;
    }


    @Override
    public int getMaxSnelheid() {
        System.out.println("Radarcontrole met " + maxSpeed + " als maximum snelheid op verbindingsstuk " + verbinding.getNaam());
        return super.getMaxSnelheid();
    }


}
