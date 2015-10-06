import java.util.ArrayList;

/**
 * Created by J on 5-10-2015.
 */
public class Route {
    public String beginpunt, eindpunt;
    private ArrayList<VerbindingsStuk> verbindingsStukArrayList;
    private ArrayList<Locatie> tussenLocaties;
    private int totaleReistijd;
    private int maxspeed;

    public Route(String beginpunt, String eindpunt, ArrayList<VerbindingsStuk> verbindingsStukArrayList) {
        this.eindpunt = eindpunt;
        this.verbindingsStukArrayList = verbindingsStukArrayList;
        this.beginpunt = beginpunt;
        tussenLocaties = new ArrayList<Locatie>();
        for (VerbindingsStuk verbindingsStuk : verbindingsStukArrayList) {
            if (verbindingsStuk.eindPunt.getNaam() != eindpunt) {
                tussenLocaties.add(verbindingsStuk.eindPunt);
            }
        }
    }


    public void printInfo() {
        System.out.println("route info:-------------------------------------------");
        System.out.println("van " + beginpunt + " naar " + eindpunt);
        System.out.printf("via ");
        for (Locatie tussenLocatie : tussenLocaties) {
            System.out.printf("%s ", tussenLocatie.getNaam());
        }
        System.out.printf("%n");
        getTotaleReistijd();
        System.out.println("totaleReistijd = " + totaleReistijd + " minuten");

    }

    private void getTotaleReistijd() {
        totaleReistijd = 0;
        for (VerbindingsStuk k : verbindingsStukArrayList) {
            totaleReistijd += k.getReistijd();
            k.printVerkeersInfo();
        }
    }
}
