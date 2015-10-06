import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public class Route {
    ArrayList<VerbindingsStuk> verbindingsStukArrayList;
    String beginpunt, eindpunt;
    private int totaleReistijd;
    private int maxspeed;

    public Route(String beginpunt, String eindpunt, ArrayList<VerbindingsStuk> verbindingsStukArrayList) {
        this.eindpunt = eindpunt;
        this.verbindingsStukArrayList = verbindingsStukArrayList;
        this.beginpunt = beginpunt;
    }

    public ArrayList<VerkeersInfo> getVerkeersInfo() {
        return null;
    }

    public void printInfo() {
        System.out.println("route info:-------------------------------------------");
        System.out.println("beginpunt = " + beginpunt);
        System.out.println("eindpunt = " + eindpunt);
        getTotaleReistijd();
        System.out.println("totaleReistijd = " + totaleReistijd + " minuten");

    }

    private void getTotaleReistijd() {
        totaleReistijd = 0;
        for (VerbindingsStuk k : verbindingsStukArrayList) {
            totaleReistijd += k.getReistijd();
            maxspeed = k.getSnelheidsLimiet();
        }
    }
}
