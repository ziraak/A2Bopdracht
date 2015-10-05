import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public class Route {
    VerbindingsStuk[] verbindingsStukArrayList;
    String beginpunt, eindpunt;

    public Route(String beginpunt, String eindpunt, VerbindingsStuk[] verbindingsStukArrayList) {
        this.eindpunt = eindpunt;
        this.verbindingsStukArrayList = verbindingsStukArrayList;
        this.beginpunt = beginpunt;
    }

    public ArrayList<VerkeersInfo> getVerkeersInfo() {
        return null;
    }
}
