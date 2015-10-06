/**
 * Created by J on 5-10-2015.
 */
public class Flitspaal extends SnelheidsControle implements StatischeGegevens {

    private VerbindingsStuk verbinding;

    public Flitspaal(VerbindingsStuk vs) {
        this.verbinding = vs;
    }


    @Override
    public int getMaxSnelheid() {
        System.out.println("Flitspaal met " + maxSpeed + " als maximum snelheid op verbindingsstuk " + verbinding.getNaam());
        return super.getMaxSnelheid();
    }


}
