/**
 * Created by J on 5-10-2015.
 */
public abstract class SnelheidsControle extends VerkeersInfo {

    public void getMaxSnelheid() {
        start = verbinding.startPunt.getNaam();
        eind = verbinding.eindPunt.getNaam();
        int maxSpeed = verbinding.getMaxspeed();
        System.out.println("Flitspaal met " + maxSpeed + " als maximum snelheid " +
                "op verbindingsstuk " + verbinding.getNaam() + " tussen " + start + " en " + eind);
    }

}
